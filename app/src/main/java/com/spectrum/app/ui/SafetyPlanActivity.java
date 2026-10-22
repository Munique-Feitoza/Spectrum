package com.spectrum.app.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.spectrum.app.R;
import com.spectrum.app.data.SafetyPlan;
import com.spectrum.app.data.SafetyPlanRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: SafetyPlanActivity.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/spectrum/app/ui/SafetyPlanActivity;", "Lcom/spectrum/app/ui/SoftActivity;", "<init>", "()V", "sinaisAlerta", "Landroid/widget/EditText;", "estrategias", "pessoasDistracao", "pessoasAjuda", "profissionais", "ambienteSeguro", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "load", "save", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class SafetyPlanActivity extends SoftActivity {
    public static final int $stable = 8;
    private EditText ambienteSeguro;
    private EditText estrategias;
    private EditText pessoasAjuda;
    private EditText pessoasDistracao;
    private EditText profissionais;
    private EditText sinaisAlerta;

    @Override // com.spectrum.app.ui.SoftActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safety_plan);
        this.sinaisAlerta = (EditText) findViewById(R.id.sinaisAlerta);
        this.estrategias = (EditText) findViewById(R.id.estrategias);
        this.pessoasDistracao = (EditText) findViewById(R.id.pessoasDistracao);
        this.pessoasAjuda = (EditText) findViewById(R.id.pessoasAjuda);
        this.profissionais = (EditText) findViewById(R.id.profissionais);
        this.ambienteSeguro = (EditText) findViewById(R.id.ambienteSeguro);
        ((Button) findViewById(R.id.salvarPlano)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.SafetyPlanActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.save();
            }
        });
        load();
    }

    /* JADX INFO: renamed from: com.spectrum.app.ui.SafetyPlanActivity$load$1, reason: invalid class name */
    /* JADX INFO: compiled from: SafetyPlanActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.spectrum.app.ui.SafetyPlanActivity$load$1", f = "SafetyPlanActivity.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SafetyPlanActivity.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object $result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    Object obj2 = SafetyPlanRepository.INSTANCE.get(SafetyPlanActivity.this, this);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = obj2;
                    break;
                    break;
                case 1:
                    $result = obj;
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SafetyPlan plan = (SafetyPlan) $result;
            if (plan == null) {
                plan = new SafetyPlan(0, null, null, null, null, null, null, 0L, 255, null);
            }
            EditText editText = SafetyPlanActivity.this.sinaisAlerta;
            EditText editText2 = null;
            if (editText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sinaisAlerta");
                editText = null;
            }
            editText.setText(plan.getSinaisAlerta());
            EditText editText3 = SafetyPlanActivity.this.estrategias;
            if (editText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("estrategias");
                editText3 = null;
            }
            editText3.setText(plan.getEstrategias());
            EditText editText4 = SafetyPlanActivity.this.pessoasDistracao;
            if (editText4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pessoasDistracao");
                editText4 = null;
            }
            editText4.setText(plan.getPessoasDistracao());
            EditText editText5 = SafetyPlanActivity.this.pessoasAjuda;
            if (editText5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pessoasAjuda");
                editText5 = null;
            }
            editText5.setText(plan.getPessoasAjuda());
            EditText editText6 = SafetyPlanActivity.this.ambienteSeguro;
            if (editText6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ambienteSeguro");
                editText6 = null;
            }
            editText6.setText(plan.getAmbienteSeguro());
            EditText editText7 = SafetyPlanActivity.this.profissionais;
            if (editText7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("profissionais");
            } else {
                editText2 = editText7;
            }
            String profissionais = plan.getProfissionais();
            if (profissionais.length() == 0) {
                profissionais = "CVV — 188 (24h, gratuito e sigiloso)\nSAMU — 192 (emergência)\nMinha terapeuta: ";
            }
            editText2.setText(profissionais);
            return Unit.INSTANCE;
        }
    }

    private final void load() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void save() {
        EditText editText = this.sinaisAlerta;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sinaisAlerta");
            editText = null;
        }
        String string = StringsKt.trim((CharSequence) editText.getText().toString()).toString();
        EditText editText2 = this.estrategias;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("estrategias");
            editText2 = null;
        }
        String string2 = StringsKt.trim((CharSequence) editText2.getText().toString()).toString();
        EditText editText3 = this.pessoasDistracao;
        if (editText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pessoasDistracao");
            editText3 = null;
        }
        String string3 = StringsKt.trim((CharSequence) editText3.getText().toString()).toString();
        EditText editText4 = this.pessoasAjuda;
        if (editText4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pessoasAjuda");
            editText4 = null;
        }
        String string4 = StringsKt.trim((CharSequence) editText4.getText().toString()).toString();
        EditText editText5 = this.profissionais;
        if (editText5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("profissionais");
            editText5 = null;
        }
        String string5 = StringsKt.trim((CharSequence) editText5.getText().toString()).toString();
        EditText editText6 = this.ambienteSeguro;
        if (editText6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ambienteSeguro");
            editText6 = null;
        }
        SafetyPlan plan = new SafetyPlan(1, string, string2, string3, string4, string5, StringsKt.trim((CharSequence) editText6.getText().toString()).toString(), 0L, 128, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C01841(plan, null), 3, null);
    }

    /* JADX INFO: renamed from: com.spectrum.app.ui.SafetyPlanActivity$save$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SafetyPlanActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.spectrum.app.ui.SafetyPlanActivity$save$1", f = "SafetyPlanActivity.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    static final class C01841 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SafetyPlan $plan;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01841(SafetyPlan safetyPlan, Continuation<? super C01841> continuation) {
            super(2, continuation);
            this.$plan = safetyPlan;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SafetyPlanActivity.this.new C01841(this.$plan, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C01841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (SafetyPlanRepository.INSTANCE.save(SafetyPlanActivity.this, this.$plan, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Toast.makeText(SafetyPlanActivity.this, "Plano de segurança salvo.", 0).show();
            return Unit.INSTANCE;
        }
    }
}
