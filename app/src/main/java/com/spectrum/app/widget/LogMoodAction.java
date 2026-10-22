package com.spectrum.app.widget;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.glance.GlanceId;
import androidx.glance.action.ActionParameters;
import androidx.glance.appwidget.action.ActionCallback;
import com.spectrum.app.data.MoodRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: LogMoodAction.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/spectrum/app/widget/LogMoodAction;", "Landroidx/glance/appwidget/action/ActionCallback;", "<init>", "()V", "onAction", "", "context", "Landroid/content/Context;", "glanceId", "Landroidx/glance/GlanceId;", "parameters", "Landroidx/glance/action/ActionParameters;", "(Landroid/content/Context;Landroidx/glance/GlanceId;Landroidx/glance/action/ActionParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class LogMoodAction implements ActionCallback {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ActionParameters.Key<Float> valenceKey = new ActionParameters.Key<>("valence");
    private static final ActionParameters.Key<Float> arousalKey = new ActionParameters.Key<>("arousal");
    private static final ActionParameters.Key<String> labelKey = new ActionParameters.Key<>("label");

    /* JADX INFO: renamed from: com.spectrum.app.widget.LogMoodAction$onAction$1, reason: invalid class name */
    /* JADX INFO: compiled from: LogMoodAction.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.spectrum.app.widget.LogMoodAction", f = "LogMoodAction.kt", i = {0, 0}, l = {22, ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS}, m = "onAction", n = {"context", "glanceId"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LogMoodAction.this.onAction(null, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.glance.appwidget.action.ActionCallback
    public Object onAction(Context context, GlanceId glanceId, ActionParameters parameters, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        Context context2;
        GlanceId glanceId2;
        QuickLogWidget quickLogWidget;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object $result = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (anonymousClass1.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                MoodRepository moodRepository = MoodRepository.INSTANCE;
                Float f = (Float) parameters.get(valenceKey);
                float fFloatValue = f != null ? f.floatValue() : 0.0f;
                Float f2 = (Float) parameters.get(arousalKey);
                float fFloatValue2 = f2 != null ? f2.floatValue() : 0.0f;
                String str = (String) parameters.get(labelKey);
                anonymousClass1.L$0 = context;
                anonymousClass1.L$1 = glanceId;
                anonymousClass1.label = 1;
                if (moodRepository.log(context, fFloatValue, fFloatValue2, str, "widget", anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                context2 = context;
                glanceId2 = glanceId;
                quickLogWidget = new QuickLogWidget();
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 2;
                if (quickLogWidget.update(context2, glanceId2, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 1:
                glanceId2 = (GlanceId) anonymousClass1.L$1;
                context2 = (Context) anonymousClass1.L$0;
                ResultKt.throwOnFailure($result);
                quickLogWidget = new QuickLogWidget();
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 2;
                if (quickLogWidget.update(context2, glanceId2, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 2:
                ResultKt.throwOnFailure($result);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: compiled from: LogMoodAction.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/spectrum/app/widget/LogMoodAction$Companion;", "", "<init>", "()V", "valenceKey", "Landroidx/glance/action/ActionParameters$Key;", "", "getValenceKey", "()Landroidx/glance/action/ActionParameters$Key;", "arousalKey", "getArousalKey", "labelKey", "", "getLabelKey", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ActionParameters.Key<Float> getValenceKey() {
            return LogMoodAction.valenceKey;
        }

        public final ActionParameters.Key<Float> getArousalKey() {
            return LogMoodAction.arousalKey;
        }

        public final ActionParameters.Key<String> getLabelKey() {
            return LogMoodAction.labelKey;
        }
    }
}
