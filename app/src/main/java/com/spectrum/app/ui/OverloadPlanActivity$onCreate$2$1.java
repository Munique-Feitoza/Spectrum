package com.spectrum.app.ui;

import android.widget.EditText;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spectrum.app.data.OverloadPlan;
import com.spectrum.app.data.OverloadPlanRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: OverloadPlanActivity.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.spectrum.app.ui.OverloadPlanActivity$onCreate$2$1", f = "OverloadPlanActivity.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
final class OverloadPlanActivity$onCreate$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EditText $ancora;
    final /* synthetic */ EditText $evitar;
    final /* synthetic */ EditText $frase;
    final /* synthetic */ EditText $sinais;
    final /* synthetic */ EditText $umMinuto;
    int label;
    final /* synthetic */ OverloadPlanActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OverloadPlanActivity$onCreate$2$1(OverloadPlanActivity overloadPlanActivity, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, Continuation<? super OverloadPlanActivity$onCreate$2$1> continuation) {
        super(2, continuation);
        this.this$0 = overloadPlanActivity;
        this.$sinais = editText;
        this.$umMinuto = editText2;
        this.$evitar = editText3;
        this.$frase = editText4;
        this.$ancora = editText5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OverloadPlanActivity$onCreate$2$1(this.this$0, this.$sinais, this.$umMinuto, this.$evitar, this.$frase, this.$ancora, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OverloadPlanActivity$onCreate$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                if (OverloadPlanRepository.INSTANCE.save(this.this$0, new OverloadPlan(0, StringsKt.trim((CharSequence) this.$sinais.getText().toString()).toString(), StringsKt.trim((CharSequence) this.$umMinuto.getText().toString()).toString(), StringsKt.trim((CharSequence) this.$evitar.getText().toString()).toString(), StringsKt.trim((CharSequence) this.$frase.getText().toString()).toString(), StringsKt.trim((CharSequence) this.$ancora.getText().toString()).toString(), 0L, 65, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Toast.makeText(this.this$0, "Plano guardado. Ele fica aqui quando você precisar.", 0).show();
        return Unit.INSTANCE;
    }
}
