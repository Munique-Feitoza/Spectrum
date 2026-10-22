package com.spectrum.app.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: EmotionWheelView.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0012\u001a\u00020\fJ\u0018\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0014J\u0010\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\"H\u0014J\u0010\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0007H\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020&H\u0016R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/spectrum/app/ui/EmotionWheelView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onSelectCore", "Lkotlin/Function1;", "", "getOnSelectCore", "()Lkotlin/jvm/functions/Function1;", "setOnSelectCore", "(Lkotlin/jvm/functions/Function1;)V", "selected", "reset", "cores", "", "Lcom/spectrum/app/ui/CoreEmotion;", "wedge", "Landroid/graphics/Paint;", "ring", "hub", "hubStroke", "labelPaint", "hubText", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "washOut", "c", "onTouchEvent", "", NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "performClick", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class EmotionWheelView extends View {
    public static final int $stable = 8;
    private final List<CoreEmotion> cores;
    private final Paint hub;
    private final Paint hubStroke;
    private final Paint hubText;
    private final Paint labelPaint;
    private Function1<? super Integer, Unit> onSelectCore;
    private final Paint ring;
    private int selected;
    private final Paint wedge;

    public /* synthetic */ EmotionWheelView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmotionWheelView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmotionWheelView(Context context, AttributeSet attrs) {
        this(context, attrs, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmotionWheelView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Intrinsics.checkNotNullParameter(context, "context");
        this.selected = -1;
        this.cores = EmotionWheel.INSTANCE.getCores();
        Paint $this$wedge_u24lambda_u240 = new Paint(1);
        $this$wedge_u24lambda_u240.setStyle(Paint.Style.FILL);
        this.wedge = $this$wedge_u24lambda_u240;
        Paint $this$ring_u24lambda_u241 = new Paint(1);
        $this$ring_u24lambda_u241.setStyle(Paint.Style.STROKE);
        $this$ring_u24lambda_u241.setStrokeWidth(10.0f);
        $this$ring_u24lambda_u241.setColor(Color.parseColor("#333333"));
        this.ring = $this$ring_u24lambda_u241;
        Paint $this$hub_u24lambda_u242 = new Paint(1);
        $this$hub_u24lambda_u242.setStyle(Paint.Style.FILL);
        $this$hub_u24lambda_u242.setColor(-1);
        this.hub = $this$hub_u24lambda_u242;
        Paint $this$hubStroke_u24lambda_u243 = new Paint(1);
        $this$hubStroke_u24lambda_u243.setStyle(Paint.Style.STROKE);
        $this$hubStroke_u24lambda_u243.setStrokeWidth(3.0f);
        $this$hubStroke_u24lambda_u243.setColor(Color.parseColor("#33000000"));
        this.hubStroke = $this$hubStroke_u24lambda_u243;
        Paint $this$labelPaint_u24lambda_u244 = new Paint(1);
        $this$labelPaint_u24lambda_u244.setColor(Color.parseColor("#222222"));
        $this$labelPaint_u24lambda_u244.setTextSize(33.0f);
        $this$labelPaint_u24lambda_u244.setTextAlign(Paint.Align.CENTER);
        $this$labelPaint_u24lambda_u244.setFakeBoldText(true);
        this.labelPaint = $this$labelPaint_u24lambda_u244;
        Paint $this$hubText_u24lambda_u245 = new Paint(1);
        $this$hubText_u24lambda_u245.setColor(Color.parseColor("#777777"));
        $this$hubText_u24lambda_u245.setTextSize(30.0f);
        $this$hubText_u24lambda_u245.setTextAlign(Paint.Align.CENTER);
        this.hubText = $this$hubText_u24lambda_u245;
    }

    public final Function1<Integer, Unit> getOnSelectCore() {
        return this.onSelectCore;
    }

    public final void setOnSelectCore(Function1<? super Integer, Unit> function1) {
        this.onSelectCore = function1;
    }

    public final void reset() {
        this.selected = -1;
        invalidate();
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        setMeasuredDimension(size, size);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float f = 2.0f;
        float cx = getWidth() / 2.0f;
        float cy = getHeight() / 2.0f;
        float r = (Math.min(getWidth(), getHeight()) / 2.0f) - 8.0f;
        RectF oval = new RectF(cx - r, cy - r, cx + r, cy + r);
        float sweep = 360.0f / this.cores.size();
        int size = this.cores.size();
        int i = 0;
        while (i < size) {
            float start = (i * sweep) - 90.0f;
            this.wedge.setColor((this.selected == -1 || this.selected == i) ? this.cores.get(i).getColor() : washOut(this.cores.get(i).getColor()));
            canvas.drawArc(oval, start, sweep, true, this.wedge);
            if (this.selected == i) {
                canvas.drawArc(oval, start, sweep, true, this.ring);
            }
            double mid = Math.toRadians(start + (sweep / f));
            double d = 0.62f;
            float lx = ((float) (Math.cos(mid) * ((double) r) * d)) + cx;
            float ly = ((float) (Math.sin(mid) * ((double) r) * d)) + cy + 12.0f;
            int i2 = i;
            canvas.drawText(this.cores.get(i2).getName(), lx, ly, this.labelPaint);
            i = i2 + 1;
            cx = cx;
            f = 2.0f;
        }
        float cx2 = cx;
        canvas.drawCircle(cx2, cy, r * 0.24f, this.hub);
        canvas.drawCircle(cx2, cy, 0.24f * r, this.hubStroke);
        canvas.drawText("toque", cx2, 10.0f + cy, this.hubText);
    }

    private final int washOut(int c) {
        return Color.rgb((Color.red(c) + 255) / 2, (Color.green(c) + 255) / 2, (Color.blue(c) + 255) / 2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 1) {
            float cx = getWidth() / 2.0f;
            float cy = getHeight() / 2.0f;
            float r = (Math.min(getWidth(), getHeight()) / 2.0f) - 8.0f;
            double dx = event.getX() - cx;
            double dy = event.getY() - cy;
            if (Math.hypot(dx, dy) <= r) {
                double deg = Math.toDegrees(Math.atan2(dy, dx));
                double a = (90.0d + deg) % 360.0d;
                if (a < 0.0d) {
                    a += 360.0d;
                }
                int idx = RangesKt.coerceIn((int) (a / (360.0d / ((double) this.cores.size()))), 0, this.cores.size() - 1);
                this.selected = idx;
                invalidate();
                Function1<? super Integer, Unit> function1 = this.onSelectCore;
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(idx));
                }
            }
            performClick();
            return true;
        }
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return true;
    }
}
