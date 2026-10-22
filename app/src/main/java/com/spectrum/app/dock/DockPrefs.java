package com.spectrum.app.dock;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: DockPrefs.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/spectrum/app/dock/DockPrefs;", "", "<init>", "()V", "FILE", "", "KEY_ON", "isEnabled", "", "context", "Landroid/content/Context;", "setEnabled", "", DebugKt.DEBUG_PROPERTY_VALUE_ON, "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class DockPrefs {
    public static final int $stable = 0;
    private static final String FILE = "spectrum_dock";
    public static final DockPrefs INSTANCE = new DockPrefs();
    private static final String KEY_ON = "enabled";

    private DockPrefs() {
    }

    public final boolean isEnabled(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences("spectrum_dock", 0).getBoolean(KEY_ON, false);
    }

    public final void setEnabled(Context context, boolean on) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences("spectrum_dock", 0).edit().putBoolean(KEY_ON, on).apply();
    }
}
