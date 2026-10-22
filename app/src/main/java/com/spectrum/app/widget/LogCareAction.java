package com.spectrum.app.widget;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.glance.GlanceId;
import androidx.glance.action.ActionParameters;
import androidx.glance.appwidget.action.ActionCallback;
import com.spectrum.app.data.MoodRepository;
import com.spectrum.app.data.RegulationRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: LogCareAction.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/spectrum/app/widget/LogCareAction;", "Landroidx/glance/appwidget/action/ActionCallback;", "<init>", "()V", "onAction", "", "context", "Landroid/content/Context;", "glanceId", "Landroidx/glance/GlanceId;", "parameters", "Landroidx/glance/action/ActionParameters;", "(Landroid/content/Context;Landroidx/glance/GlanceId;Landroidx/glance/action/ActionParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class LogCareAction implements ActionCallback {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ActionParameters.Key<String> kindKey = new ActionParameters.Key<>("care_kind");
    private static final ActionParameters.Key<String> labelKey = new ActionParameters.Key<>("care_label");
    private static final ActionParameters.Key<Float> valenceKey = new ActionParameters.Key<>("care_valence");
    private static final ActionParameters.Key<Float> arousalKey = new ActionParameters.Key<>("care_arousal");

    /* JADX INFO: renamed from: com.spectrum.app.widget.LogCareAction$onAction$1, reason: invalid class name */
    /* JADX INFO: compiled from: LogCareAction.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.spectrum.app.widget.LogCareAction", f = "LogCareAction.kt", i = {0, 0, 0, 0, 0, 1, 1}, l = {21, 22, 23}, m = "onAction", n = {"context", "glanceId", "label", "valence", "arousal", "context", "glanceId"}, s = {"L$0", "L$1", "L$2", "F$0", "F$1", "L$0", "L$1"})
    static final class AnonymousClass1 extends ContinuationImpl {
        float F$0;
        float F$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LogCareAction.this.onAction(null, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x010b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x010c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0120 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // androidx.glance.appwidget.action.ActionCallback
    public Object onAction(Context context, GlanceId glanceId, ActionParameters parameters, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        float arousal;
        float valence;
        String label;
        Object obj;
        Context context2;
        GlanceId glanceId2;
        MoodRepository moodRepository;
        Object obj2;
        GlanceId glanceId3;
        Context context3;
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
                String str = (String) parameters.get(kindKey);
                if (str == null) {
                    str = "pause";
                }
                String kind = str;
                String str2 = (String) parameters.get(labelKey);
                if (str2 == null) {
                    str2 = "Pausa";
                }
                String label2 = str2;
                Float f = (Float) parameters.get(valenceKey);
                float valence2 = f != null ? f.floatValue() : -0.2f;
                Float f2 = (Float) parameters.get(arousalKey);
                float arousal2 = f2 != null ? f2.floatValue() : 0.2f;
                RegulationRepository regulationRepository = RegulationRepository.INSTANCE;
                anonymousClass1.L$0 = context;
                anonymousClass1.L$1 = glanceId;
                anonymousClass1.L$2 = label2;
                anonymousClass1.F$0 = valence2;
                anonymousClass1.F$1 = arousal2;
                anonymousClass1.label = 1;
                arousal = arousal2;
                valence = valence2;
                label = label2;
                obj = coroutine_suspended;
                if (regulationRepository.log(context, kind, label2, (200 & 8) != 0 ? 0 : 0, (200 & 16) != 0 ? -1 : 0, (200 & 32) != 0 ? -1 : 0, (200 & 64) != 0 ? "" : null, (200 & 128) != 0 ? "app" : "widget", anonymousClass1) == obj) {
                    return obj;
                }
                context2 = context;
                glanceId2 = glanceId;
                moodRepository = MoodRepository.INSTANCE;
                anonymousClass1.L$0 = context2;
                anonymousClass1.L$1 = glanceId2;
                obj2 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.label = 2;
                if (moodRepository.log(context2, valence, arousal, label, "widget", anonymousClass1) == obj) {
                    return obj;
                }
                glanceId3 = glanceId2;
                context3 = context2;
                quickLogWidget = new QuickLogWidget();
                anonymousClass1.L$0 = obj2;
                anonymousClass1.L$1 = obj2;
                anonymousClass1.label = 3;
                if (quickLogWidget.update(context3, glanceId3, anonymousClass1) == obj) {
                    return obj;
                }
                return Unit.INSTANCE;
            case 1:
                float arousal3 = anonymousClass1.F$1;
                float valence3 = anonymousClass1.F$0;
                String label3 = (String) anonymousClass1.L$2;
                GlanceId glanceId4 = (GlanceId) anonymousClass1.L$1;
                Context context4 = (Context) anonymousClass1.L$0;
                ResultKt.throwOnFailure($result);
                arousal = arousal3;
                valence = valence3;
                label = label3;
                glanceId2 = glanceId4;
                context2 = context4;
                obj = coroutine_suspended;
                moodRepository = MoodRepository.INSTANCE;
                anonymousClass1.L$0 = context2;
                anonymousClass1.L$1 = glanceId2;
                obj2 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.label = 2;
                if (moodRepository.log(context2, valence, arousal, label, "widget", anonymousClass1) == obj) {
                    return obj;
                }
                glanceId3 = glanceId2;
                context3 = context2;
                quickLogWidget = new QuickLogWidget();
                anonymousClass1.L$0 = obj2;
                anonymousClass1.L$1 = obj2;
                anonymousClass1.label = 3;
                if (quickLogWidget.update(context3, glanceId3, anonymousClass1) == obj) {
                    return obj;
                }
                return Unit.INSTANCE;
            case 2:
                glanceId3 = (GlanceId) anonymousClass1.L$1;
                context3 = (Context) anonymousClass1.L$0;
                ResultKt.throwOnFailure($result);
                obj2 = null;
                obj = coroutine_suspended;
                quickLogWidget = new QuickLogWidget();
                anonymousClass1.L$0 = obj2;
                anonymousClass1.L$1 = obj2;
                anonymousClass1.label = 3;
                if (quickLogWidget.update(context3, glanceId3, anonymousClass1) == obj) {
                    return obj;
                }
                return Unit.INSTANCE;
            case 3:
                ResultKt.throwOnFailure($result);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: compiled from: LogCareAction.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/spectrum/app/widget/LogCareAction$Companion;", "", "<init>", "()V", "kindKey", "Landroidx/glance/action/ActionParameters$Key;", "", "getKindKey", "()Landroidx/glance/action/ActionParameters$Key;", "labelKey", "getLabelKey", "valenceKey", "", "getValenceKey", "arousalKey", "getArousalKey", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ActionParameters.Key<String> getKindKey() {
            return LogCareAction.kindKey;
        }

        public final ActionParameters.Key<String> getLabelKey() {
            return LogCareAction.labelKey;
        }

        public final ActionParameters.Key<Float> getValenceKey() {
            return LogCareAction.valenceKey;
        }

        public final ActionParameters.Key<Float> getArousalKey() {
            return LogCareAction.arousalKey;
        }
    }
}
