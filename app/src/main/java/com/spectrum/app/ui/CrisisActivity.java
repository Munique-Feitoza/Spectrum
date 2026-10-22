package com.spectrum.app.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.spectrum.app.R;
import com.spectrum.app.data.SafetyPlan;
import com.spectrum.app.data.SafetyPlanRepository;
import com.spectrum.app.data.UserPrefs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: CrisisActivity.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\n\u001a\u00020\u0007H\u0014J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u0007H\u0002J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/spectrum/app/ui/CrisisActivity;", "Lcom/spectrum/app/ui/SoftActivity;", "<init>", "()V", "planoText", "Landroid/widget/TextView;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "dial", "number", "", "loadPlan", "format", "p", "Lcom/spectrum/app/data/SafetyPlan;", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class CrisisActivity extends SoftActivity {
    public static final int $stable = 8;
    private TextView planoText;

    @Override // com.spectrum.app.ui.SoftActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crisis);
        this.planoText = (TextView) findViewById(R.id.planoText);
        ((Button) findViewById(R.id.btnCvv)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.CrisisActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.dial("188");
            }
        });
        ((Button) findViewById(R.id.btnSamu)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.CrisisActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.dial("192");
            }
        });
        String trustName = UserPrefs.INSTANCE.trustName(this);
        final String trustPhone = UserPrefs.INSTANCE.trustPhone(this);
        Button trusted = (Button) findViewById(R.id.btnTrusted);
        if (!StringsKt.isBlank(trustName) || !StringsKt.isBlank(trustPhone)) {
            trusted.setVisibility(0);
            trusted.setText(StringsKt.isBlank(trustName) ? "Ligar para pessoa de confiança" : "Falar com " + trustName);
            trusted.setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.CrisisActivity$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CrisisActivity.onCreate$lambda$2(trustPhone, this, view);
                }
            });
        }
        ((Button) findViewById(R.id.btnPlano)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.CrisisActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CrisisActivity.onCreate$lambda$3(this.f$0, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(String $trustPhone, CrisisActivity this$0, View it) {
        if (StringsKt.isBlank($trustPhone)) {
            this$0.startActivity(new Intent(this$0, (Class<?>) WelcomeActivity.class).putExtra(WelcomeActivity.EXTRA_EDIT, true));
        } else {
            this$0.dial($trustPhone);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$3(CrisisActivity this$0, View it) {
        this$0.startActivity(new Intent(this$0, (Class<?>) SafetyPlanActivity.class));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        loadPlan();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dial(String number) {
        startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + number)));
    }

    /* JADX INFO: renamed from: com.spectrum.app.ui.CrisisActivity$loadPlan$1, reason: invalid class name */
    /* JADX INFO: compiled from: CrisisActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.spectrum.app.ui.CrisisActivity$loadPlan$1", f = "CrisisActivity.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CrisisActivity.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object obj = SafetyPlanRepository.INSTANCE.get(CrisisActivity.this, this);
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
            SafetyPlan plan = (SafetyPlan) $result;
            TextView textView = CrisisActivity.this.planoText;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("planoText");
                textView = null;
            }
            textView.setText((plan == null || (str = CrisisActivity.this.format(plan)) == null) ? "Você ainda não montou seu plano de segurança. Toque abaixo para montá-lo — de preferência junto com sua terapeuta." : str);
            return Unit.INSTANCE;
        }
    }

    private final void loadPlan() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String format(SafetyPlan p) {
        Iterable $this$filter$iv = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("Sinais de alerta", p.getSinaisAlerta()), TuplesKt.to("O que me acalma", p.getEstrategias()), TuplesKt.to("Pessoas e lugares que me distraem", p.getPessoasDistracao()), TuplesKt.to("Pessoas a quem pedir ajuda", p.getPessoasAjuda()), TuplesKt.to("Profissionais e serviços", p.getProfissionais()), TuplesKt.to("Deixar meu ambiente seguro", p.getAmbienteSeguro())});
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            Pair it = (Pair) element$iv$iv;
            if (!StringsKt.isBlank((CharSequence) it.getSecond())) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        List sections = (List) destination$iv$iv;
        return sections.isEmpty() ? "Seu plano ainda está vazio. Toque abaixo para preenchê-lo." : CollectionsKt.joinToString$default(sections, "\n\n", null, null, 0, null, new Function1() { // from class: com.spectrum.app.ui.CrisisActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CrisisActivity.format$lambda$5((Pair) obj);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence format$lambda$5(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        String titulo = (String) pair.component1();
        String conteudo = (String) pair.component2();
        return "• " + titulo + ":\n" + conteudo;
    }
}
