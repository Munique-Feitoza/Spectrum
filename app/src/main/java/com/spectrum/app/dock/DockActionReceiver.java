package com.spectrum.app.dock;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spectrum.app.data.MoodEvent;
import com.spectrum.app.data.MoodRepository;
import com.spectrum.app.data.RegulationRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: DockActionReceiver.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0082@¢\u0006\u0002\u0010\u000bJ6\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/spectrum/app/dock/DockActionReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "logSame", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logQuick", "kind", "", "label", "valence", "", "arousal", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;FFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class DockActionReceiver extends BroadcastReceiver {
    public static final int $stable = 0;
    public static final String OKAY = "com.spectrum.app.dock.OKAY";
    public static final String PAUSE = "com.spectrum.app.dock.PAUSE";
    public static final String SAME = "com.spectrum.app.dock.SAME";

    /* JADX INFO: renamed from: com.spectrum.app.dock.DockActionReceiver$logQuick$1, reason: invalid class name */
    /* JADX INFO: compiled from: DockActionReceiver.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.spectrum.app.dock.DockActionReceiver", f = "DockActionReceiver.kt", i = {0, 0, 0, 0}, l = {52, 53}, m = "logQuick", n = {"context", "label", "valence", "arousal"}, s = {"L$0", "L$1", "F$0", "F$1"})
    static final class AnonymousClass1 extends ContinuationImpl {
        float F$0;
        float F$1;
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
            return DockActionReceiver.this.logQuick(null, null, null, 0.0f, 0.0f, this);
        }
    }

    /* JADX INFO: renamed from: com.spectrum.app.dock.DockActionReceiver$logSame$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: DockActionReceiver.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.spectrum.app.dock.DockActionReceiver", f = "DockActionReceiver.kt", i = {0}, l = {36, 38, 42}, m = "logSame", n = {"context"}, s = {"L$0"})
    static final class C01741 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C01741(Continuation<? super C01741> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DockActionReceiver.this.logSame(null, this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        BroadcastReceiver.PendingResult pending = goAsync();
        Context app = context.getApplicationContext();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C01751(intent, this, app, pending, null), 3, null);
    }

    /* JADX INFO: renamed from: com.spectrum.app.dock.DockActionReceiver$onReceive$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: DockActionReceiver.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.spectrum.app.dock.DockActionReceiver$onReceive$1", f = "DockActionReceiver.kt", i = {}, l = {24, 25, 26}, m = "invokeSuspend", n = {}, s = {})
    static final class C01751 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $app;
        final /* synthetic */ Intent $intent;
        final /* synthetic */ BroadcastReceiver.PendingResult $pending;
        int label;
        final /* synthetic */ DockActionReceiver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01751(Intent intent, DockActionReceiver dockActionReceiver, Context context, BroadcastReceiver.PendingResult pendingResult, Continuation<? super C01751> continuation) {
            super(2, continuation);
            this.$intent = intent;
            this.this$0 = dockActionReceiver;
            this.$app = context;
            this.$pending = pendingResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C01751(this.$intent, this.this$0, this.$app, this.$pending, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C01751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        String action = this.$intent.getAction();
                        if (action != null) {
                            switch (action.hashCode()) {
                                case 1581554194:
                                    if (action.equals(DockActionReceiver.OKAY)) {
                                        DockActionReceiver dockActionReceiver = this.this$0;
                                        Context context = this.$app;
                                        Intrinsics.checkNotNull(context);
                                        this.label = 3;
                                        if (dockActionReceiver.logQuick(context, "okay", "Ok o suficiente", 0.2f, 0.3f, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                    break;
                                case 1581664100:
                                    if (action.equals(DockActionReceiver.SAME)) {
                                        DockActionReceiver dockActionReceiver2 = this.this$0;
                                        Context context2 = this.$app;
                                        Intrinsics.checkNotNull(context2);
                                        this.label = 1;
                                        if (dockActionReceiver2.logSame(context2, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                    break;
                                case 1784184472:
                                    if (action.equals(DockActionReceiver.PAUSE)) {
                                        DockActionReceiver dockActionReceiver3 = this.this$0;
                                        Context context3 = this.$app;
                                        Intrinsics.checkNotNull(context3);
                                        this.label = 2;
                                        if (dockActionReceiver3.logQuick(context3, "pause", "Pausa", -0.2f, 0.2f, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                        DockNotifier dockNotifier = DockNotifier.INSTANCE;
                        Context context4 = this.$app;
                        Intrinsics.checkNotNull(context4);
                        dockNotifier.refreshAsync(context4);
                        this.$pending.finish();
                        return Unit.INSTANCE;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        DockNotifier dockNotifier2 = DockNotifier.INSTANCE;
                        Context context5 = this.$app;
                        Intrinsics.checkNotNull(context5);
                        dockNotifier2.refreshAsync(context5);
                        this.$pending.finish();
                        return Unit.INSTANCE;
                    case 2:
                        ResultKt.throwOnFailure($result);
                        DockNotifier dockNotifier3 = DockNotifier.INSTANCE;
                        Context context6 = this.$app;
                        Intrinsics.checkNotNull(context6);
                        dockNotifier3.refreshAsync(context6);
                        this.$pending.finish();
                        return Unit.INSTANCE;
                    case 3:
                        ResultKt.throwOnFailure($result);
                        DockNotifier dockNotifier4 = DockNotifier.INSTANCE;
                        Context context7 = this.$app;
                        Intrinsics.checkNotNull(context7);
                        dockNotifier4.refreshAsync(context7);
                        this.$pending.finish();
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th) {
                this.$pending.finish();
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:22:0x0071 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object logSame(Context context, Continuation<? super Unit> continuation) {
        C01741 c01741;
        Object objLatest;
        MoodEvent last;
        String it;
        String label;
        MoodRepository moodRepository;
        float valence;
        float arousal;
        MoodRepository moodRepository2;
        if (continuation instanceof C01741) {
            c01741 = (C01741) continuation;
            if ((c01741.label & Integer.MIN_VALUE) != 0) {
                c01741.label -= Integer.MIN_VALUE;
            } else {
                c01741 = new C01741(continuation);
            }
        } else {
            c01741 = new C01741(continuation);
        }
        Object $result = c01741.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c01741.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                MoodRepository moodRepository3 = MoodRepository.INSTANCE;
                c01741.L$0 = context;
                c01741.label = 1;
                objLatest = moodRepository3.latest(context, c01741);
                if (objLatest == coroutine_suspended) {
                    return coroutine_suspended;
                }
                last = (MoodEvent) objLatest;
                if (last == null) {
                    moodRepository2 = MoodRepository.INSTANCE;
                    c01741.L$0 = null;
                    c01741.label = 2;
                    if (moodRepository2.log(context, 0.0f, 0.3f, "Continua", "dock-igual", c01741) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                it = last.getLabel();
                if (it == null) {
                    label = "igual";
                } else {
                    if (!StringsKt.startsWith$default(it, "igual · ", false, 2, (Object) null)) {
                        it = "igual · " + it;
                    }
                    if (it == null) {
                        label = "igual";
                    } else {
                        label = it;
                    }
                }
                moodRepository = MoodRepository.INSTANCE;
                valence = last.getValence();
                arousal = last.getArousal();
                c01741.L$0 = null;
                c01741.label = 3;
                if (moodRepository.log(context, valence, arousal, label, "dock-igual", c01741) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 1:
                context = (Context) c01741.L$0;
                ResultKt.throwOnFailure($result);
                objLatest = $result;
                last = (MoodEvent) objLatest;
                if (last == null) {
                    moodRepository2 = MoodRepository.INSTANCE;
                    c01741.L$0 = null;
                    c01741.label = 2;
                    if (moodRepository2.log(context, 0.0f, 0.3f, "Continua", "dock-igual", c01741) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                it = last.getLabel();
                if (it == null) {
                    label = "igual";
                } else {
                    if (!StringsKt.startsWith$default(it, "igual · ", false, 2, (Object) null)) {
                        it = "igual · " + it;
                    }
                    if (it == null) {
                        label = "igual";
                    } else {
                        label = it;
                    }
                }
                moodRepository = MoodRepository.INSTANCE;
                valence = last.getValence();
                arousal = last.getArousal();
                c01741.L$0 = null;
                c01741.label = 3;
                if (moodRepository.log(context, valence, arousal, label, "dock-igual", c01741) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 2:
                ResultKt.throwOnFailure($result);
                return Unit.INSTANCE;
            case 3:
                ResultKt.throwOnFailure($result);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x00ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final Object logQuick(Context context, String kind, String label, float valence, float arousal, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        float arousal2;
        String label2;
        Context context2;
        float valence2;
        Object obj;
        MoodRepository moodRepository;
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
                RegulationRepository regulationRepository = RegulationRepository.INSTANCE;
                anonymousClass1.L$0 = context;
                anonymousClass1.L$1 = label;
                anonymousClass1.F$0 = valence;
                anonymousClass1.F$1 = arousal;
                anonymousClass1.label = 1;
                arousal2 = arousal;
                label2 = label;
                context2 = context;
                valence2 = valence;
                obj = coroutine_suspended;
                if (regulationRepository.log(context, kind, label, (200 & 8) != 0 ? 0 : 0, (200 & 16) != 0 ? -1 : 0, (200 & 32) != 0 ? -1 : 0, (200 & 64) != 0 ? "" : null, (200 & 128) != 0 ? "app" : "dock", anonymousClass1) == obj) {
                    return obj;
                }
                moodRepository = MoodRepository.INSTANCE;
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 2;
                if (moodRepository.log(context2, valence2, arousal2, label2, "dock", anonymousClass1) == obj) {
                    return obj;
                }
                return Unit.INSTANCE;
            case 1:
                float arousal3 = anonymousClass1.F$1;
                float valence3 = anonymousClass1.F$0;
                String label3 = (String) anonymousClass1.L$1;
                Context context3 = (Context) anonymousClass1.L$0;
                ResultKt.throwOnFailure($result);
                arousal2 = arousal3;
                valence2 = valence3;
                label2 = label3;
                context2 = context3;
                obj = coroutine_suspended;
                moodRepository = MoodRepository.INSTANCE;
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 2;
                if (moodRepository.log(context2, valence2, arousal2, label2, "dock", anonymousClass1) == obj) {
                    return obj;
                }
                return Unit.INSTANCE;
            case 2:
                ResultKt.throwOnFailure($result);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
