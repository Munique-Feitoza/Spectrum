package com.spectrum.app.ui;

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

/* JADX INFO: compiled from: BatteryActivity.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.spectrum.app.ui.BatteryActivity$onCreate$1$1", f = "BatteryActivity.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
final class BatteryActivity$onCreate$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $body;
    final /* synthetic */ int $social;
    int label;
    final /* synthetic */ BatteryActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BatteryActivity$onCreate$1$1(BatteryActivity batteryActivity, int i, int i2, Continuation<? super BatteryActivity$onCreate$1$1> continuation) {
        super(2, continuation);
        this.this$0 = batteryActivity;
        this.$social = i;
        this.$body = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BatteryActivity$onCreate$1$1(this.this$0, this.$social, this.$body, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BatteryActivity$onCreate$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        String msg;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                RegulationRepository regulationRepository = RegulationRepository.INSTANCE;
                BatteryActivity batteryActivity = this.this$0;
                String str = "social " + this.$social + " · corpo " + this.$body;
                int i = this.$social;
                int i2 = this.$body;
                this.label = 1;
                if (regulationRepository.log(batteryActivity, "battery", str, (200 & 8) != 0 ? 0 : 0, (200 & 16) != 0 ? -1 : i, (200 & 32) != 0 ? -1 : i2, (200 & 64) != 0 ? "" : null, (200 & 128) != 0 ? "app" : null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (this.$social <= 3) {
            msg = "Bateria social baixa. Tá tudo bem reduzir gente hoje.";
        } else {
            msg = this.$body <= 3 ? "Corpo pedindo descanso. Isso é informação, não falha." : "Registrado. Obrigada por olhar para você.";
        }
        Toast.makeText(this.this$0, msg, 0).show();
        this.this$0.finish();
        return Unit.INSTANCE;
    }
}
