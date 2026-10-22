package com.spectrum.app.widget;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.glance.appwidget.GlanceAppWidget;
import androidx.glance.appwidget.GlanceAppWidgetReceiver;
import kotlin.Metadata;

/* JADX INFO: compiled from: QuickLogWidgetReceiver.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spectrum/app/widget/QuickLogWidgetReceiver;", "Landroidx/glance/appwidget/GlanceAppWidgetReceiver;", "<init>", "()V", "glanceAppWidget", "Landroidx/glance/appwidget/GlanceAppWidget;", "getGlanceAppWidget", "()Landroidx/glance/appwidget/GlanceAppWidget;", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class QuickLogWidgetReceiver extends GlanceAppWidgetReceiver {
    public static final int $stable = GlanceAppWidget.$stable;
    private final GlanceAppWidget glanceAppWidget = new QuickLogWidget();

    @Override // androidx.glance.appwidget.GlanceAppWidgetReceiver
    public GlanceAppWidget getGlanceAppWidget() {
        return this.glanceAppWidget;
    }
}
