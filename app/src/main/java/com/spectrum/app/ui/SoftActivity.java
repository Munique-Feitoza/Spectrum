package com.spectrum.app.ui;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spectrum.app.R;
import com.spectrum.app.data.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SoftActivity.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\t"}, d2 = {"Lcom/spectrum/app/ui/SoftActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public class SoftActivity extends AppCompatActivity {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(INSTANCE.themeRes(UserPrefs.INSTANCE.visualTheme(this)));
        super.onCreate(savedInstanceState);
    }

    /* JADX INFO: compiled from: SoftActivity.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/spectrum/app/ui/SoftActivity$Companion;", "", "<init>", "()V", "themeRes", "", "id", "", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final int themeRes(String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            switch (id.hashCode()) {
                case -1268786147:
                    if (id.equals("forest")) {
                        return R.style.Theme_Spectrum_Forest;
                    }
                    break;
                case 3056225:
                    if (id.equals("clay")) {
                        return R.style.Theme_Spectrum_Clay;
                    }
                    break;
                case 3095209:
                    if (id.equals("dusk")) {
                        return R.style.Theme_Spectrum_Dusk;
                    }
                    break;
                case 3351805:
                    if (id.equals("mist")) {
                        return R.style.Theme_Spectrum_Mist;
                    }
                    break;
                case 102977274:
                    if (id.equals("linen")) {
                        return R.style.Theme_Spectrum_Linen;
                    }
                    break;
            }
            return R.style.Theme_Spectrum;
        }
    }
}
