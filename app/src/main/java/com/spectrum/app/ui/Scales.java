package com.spectrum.app.ui;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Scales.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/spectrum/app/ui/Scales;", "", "<init>", "()V", "OPTIONS", "", "", "getOPTIONS", "()Ljava/util/List;", "INSTRUCTION", "PHQ9", "Lcom/spectrum/app/ui/ScaleSpec;", "getPHQ9", "()Lcom/spectrum/app/ui/ScaleSpec;", "GAD7", "getGAD7", "byCode", "code", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class Scales {
    public static final Scales INSTANCE = new Scales();
    private static final List<String> OPTIONS = CollectionsKt.listOf((Object[]) new String[]{"Nenhuma vez", "Vários dias", "Mais da metade dos dias", "Quase todos os dias"});
    private static final String INSTRUCTION = "Durante as últimas 2 semanas, com que frequência você foi incomodada pelos problemas abaixo?";
    private static final ScaleSpec PHQ9 = new ScaleSpec("PHQ9", "PHQ-9 — Depressão", INSTRUCTION, CollectionsKt.listOf((Object[]) new String[]{"Pouco interesse ou pouco prazer em fazer as coisas", "Se sentir \"para baixo\", deprimida ou sem perspectiva", "Dificuldade para pegar no sono, permanecer dormindo, ou dormir mais do que de costume", "Se sentir cansada ou com pouca energia", "Falta de apetite ou comer demais", "Se sentir mal consigo mesma — ou achar que é um fracasso ou que decepcionou a família ou a si mesma", "Dificuldade para se concentrar nas coisas, como ler ou ver televisão", "Lentidão para se mover ou falar (a ponto de outras pessoas notarem) — ou o oposto, estar tão agitada que fica andando de um lado para o outro muito mais que o normal", "Pensar em se ferir de alguma maneira ou que seria melhor estar morta"}), 8, new Function1() { // from class: com.spectrum.app.ui.Scales$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Scales.PHQ9$lambda$0(((Integer) obj).intValue());
        }
    });
    private static final ScaleSpec GAD7 = new ScaleSpec("GAD7", "GAD-7 — Ansiedade", INSTRUCTION, CollectionsKt.listOf((Object[]) new String[]{"Sentir-se nervosa, ansiosa ou muito tensa", "Não conseguir parar ou controlar as preocupações", "Preocupar-se muito com diversas coisas", "Dificuldade para relaxar", "Ficar tão agitada que se torna difícil permanecer parada", "Ficar facilmente aborrecida ou irritada", "Sentir medo, como se algo terrível fosse acontecer"}), null, new Function1() { // from class: com.spectrum.app.ui.Scales$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Scales.GAD7$lambda$1(((Integer) obj).intValue());
        }
    });
    public static final int $stable = 8;

    private Scales() {
    }

    public final List<String> getOPTIONS() {
        return OPTIONS;
    }

    public final ScaleSpec getPHQ9() {
        return PHQ9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String PHQ9$lambda$0(int s) {
        if (s <= 4) {
            return "Mínima";
        }
        if (s <= 9) {
            return "Leve";
        }
        if (s <= 14) {
            return "Moderada";
        }
        return s <= 19 ? "Moderadamente grave" : "Grave";
    }

    public final ScaleSpec getGAD7() {
        return GAD7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String GAD7$lambda$1(int s) {
        if (s <= 4) {
            return "Mínima";
        }
        if (s <= 9) {
            return "Leve";
        }
        return s <= 14 ? "Moderada" : "Grave";
    }

    public final ScaleSpec byCode(String code) {
        return Intrinsics.areEqual(code, GAD7.getCode()) ? GAD7 : PHQ9;
    }
}
