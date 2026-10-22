package com.spectrum.app.ui;

import android.widget.SeekBar;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spectrum.app.data.RegulationRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: SensoryActivity.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.spectrum.app.ui.SensoryActivity$onCreate$3$1", f = "SensoryActivity.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
final class SensoryActivity$onCreate$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SeekBar $bar;
    final /* synthetic */ String $label;
    final /* synthetic */ String $notes;
    int label;
    final /* synthetic */ SensoryActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SensoryActivity$onCreate$3$1(SensoryActivity sensoryActivity, String str, SeekBar seekBar, String str2, Continuation<? super SensoryActivity$onCreate$3$1> continuation) {
        super(2, continuation);
        this.this$0 = sensoryActivity;
        this.$label = str;
        this.$bar = seekBar;
        this.$notes = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SensoryActivity$onCreate$3$1(this.this$0, this.$label, this.$bar, this.$notes, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SensoryActivity$onCreate$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                RegulationRepository regulationRepository = RegulationRepository.INSTANCE;
                SensoryActivity sensoryActivity = this.this$0;
                String str = this.$label;
                int progress = this.$bar.getProgress();
                String str2 = this.$notes;
                this.label = 1;
                if (regulationRepository.log(sensoryActivity, "sensory", str, (200 & 8) != 0 ? 0 : progress, (200 & 16) != 0 ? -1 : 0, (200 & 32) != 0 ? -1 : 0, (200 & 64) != 0 ? "" : str2, (200 & 128) != 0 ? "app" : null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Toast.makeText(this.this$0, "Anotado. Você mapeou o ambiente.", 0).show();
        this.this$0.finish();
        return Unit.INSTANCE;
    }
}
