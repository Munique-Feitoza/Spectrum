package com.spectrum.app.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.spectrum.app.R;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: OverloadPlanActivity.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b"}, d2 = {"Lcom/spectrum/app/ui/OverloadPlanActivity;", "Lcom/spectrum/app/ui/SoftActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class OverloadPlanActivity extends SoftActivity {
    public static final int $stable = 0;

    @Override // com.spectrum.app.ui.SoftActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overload_plan);
        final EditText sinais = (EditText) findViewById(R.id.sinais);
        final EditText umMinuto = (EditText) findViewById(R.id.umMinuto);
        final EditText evitar = (EditText) findViewById(R.id.evitar);
        final EditText frase = (EditText) findViewById(R.id.frase);
        final EditText ancora = (EditText) findViewById(R.id.ancora);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(sinais, umMinuto, evitar, frase, ancora, null), 3, null);
        ((Button) findViewById(R.id.salvarPlano)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.OverloadPlanActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OverloadPlanActivity.onCreate$lambda$0(this.f$0, sinais, umMinuto, evitar, frase, ancora, view);
            }
        });
    }

    /* JADX INFO: renamed from: com.spectrum.app.ui.OverloadPlanActivity$onCreate$1, reason: invalid class name */
    /* JADX INFO: compiled from: OverloadPlanActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.spectrum.app.ui.OverloadPlanActivity$onCreate$1", f = "OverloadPlanActivity.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ EditText $ancora;
        final /* synthetic */ EditText $evitar;
        final /* synthetic */ EditText $frase;
        final /* synthetic */ EditText $sinais;
        final /* synthetic */ EditText $umMinuto;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$sinais = editText;
            this.$umMinuto = editText2;
            this.$evitar = editText3;
            this.$frase = editText4;
            this.$ancora = editText5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OverloadPlanActivity.this.new AnonymousClass1(this.$sinais, this.$umMinuto, this.$evitar, this.$frase, this.$ancora, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object obj = OverloadPlanRepository.INSTANCE.get(OverloadPlanActivity.this, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = obj;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            OverloadPlan plan = (OverloadPlan) $result;
            if (plan == null) {
                plan = new OverloadPlan(0, null, null, null, null, null, 0L, WorkQueueKt.MASK, null);
            }
            this.$sinais.setText(plan.getSinais());
            this.$umMinuto.setText(plan.getUmMinuto());
            this.$evitar.setText(plan.getEvitar());
            EditText editText = this.$frase;
            String frase = plan.getFrase();
            if (frase.length() == 0) {
                frase = "Preciso de um tempo sozinha. Volto depois.";
            }
            editText.setText(frase);
            this.$ancora.setText(plan.getAncora());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(OverloadPlanActivity this$0, EditText $sinais, EditText $umMinuto, EditText $evitar, EditText $frase, EditText $ancora, View it) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new OverloadPlanActivity$onCreate$2$1(this$0, $sinais, $umMinuto, $evitar, $frase, $ancora, null), 3, null);
    }
}
