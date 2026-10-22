package com.spectrum.app.ui;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spectrum.app.data.UseMode;
import com.spectrum.app.data.UserPrefs;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CareCopy.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005¨\u0006\n"}, d2 = {"Lcom/spectrum/app/ui/CareCopy;", "", "<init>", "()V", "greeting", "", "context", "Landroid/content/Context;", "afterQuick", "kind", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class CareCopy {
    public static final int $stable = 0;
    public static final CareCopy INSTANCE = new CareCopy();

    /* JADX INFO: compiled from: CareCopy.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UseMode.values().length];
            try {
                iArr[UseMode.CHILD.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[UseMode.SIMPLE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[UseMode.ADULT.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private CareCopy() {
    }

    public final String greeting(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int h = Calendar.getInstance().get(11);
        switch (WhenMappings.$EnumSwitchMapping$0[UserPrefs.INSTANCE.mode(context).ordinal()]) {
            case 1:
                if (5 <= h && h < 12) {
                    return "Bom dia. Um toque já está bom.";
                }
                if (12 <= h && h < 18) {
                    return "Oi. Pode só dizer como está o corpo.";
                }
                return 18 <= h && h < 23 ? "Boa noite. Pode descansar." : "Está tarde. Sem pressa.";
            case 2:
                if (5 <= h && h < 12) {
                    return "Bom dia. Só um toque.";
                }
                if (12 <= h && h < 18) {
                    return "Oi. Sem prova agora.";
                }
                return 18 <= h && h < 23 ? "Boa noite. Pode parar por hoje." : "Tarde. Um toque, se quiser.";
            case 3:
                if (5 <= h && h < 12) {
                    return "Bom dia. Você já está aqui — isso conta.";
                }
                if (12 <= h && h < 18) {
                    return "Oi. Não precisa render hoje. Só notar já é cuidado.";
                }
                return 18 <= h && h < 23 ? "Boa noite. Dá para encerrar o dia com gentileza." : "Está tarde. Se puder, um toque só. Sem pressão.";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String afterQuick(Context context, String kind) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(kind, "kind");
        boolean child = UserPrefs.INSTANCE.isChild(context);
        switch (kind.hashCode()) {
            case 3412756:
                if (kind.equals("okay")) {
                    return child ? "Ok. Está bem assim." : "Bom. ‘Ok o suficiente’ também é um estado.";
                }
                break;
            case 106440182:
                if (kind.equals("pause")) {
                    return child ? "Pausa anotada. Pode parar um pouco." : "Pausa anotada. Você pode só existir um pouco.";
                }
                break;
            case 107947572:
                if (kind.equals("quiet")) {
                    return child ? "Pediu silêncio. Tudo bem." : "Pedido de silêncio registrado. Menos estímulo é válido.";
                }
                break;
            case 2023666210:
                if (kind.equals("battery_low")) {
                    return child ? "Energia baixa. Pode ir mais devagar." : "Bateria baixa anotada. Isso não é preguiça.";
                }
                break;
        }
        return child ? "Anotado." : "Anotado. Obrigado por cuidar de você.";
    }
}
