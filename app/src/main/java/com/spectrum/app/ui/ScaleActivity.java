package com.spectrum.app.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.spectrum.app.R;
import com.spectrum.app.data.ScaleResult;
import com.spectrum.app.data.ScaleResultRepository;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: ScaleActivity.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0002J\b\u0010\u0019\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/spectrum/app/ui/ScaleActivity;", "Lcom/spectrum/app/ui/SoftActivity;", "<init>", "()V", "spec", "Lcom/spectrum/app/ui/ScaleSpec;", "groups", "", "Landroid/widget/RadioGroup;", "resultado", "Landroid/widget/TextView;", "anteriores", "fmt", "Ljava/text/SimpleDateFormat;", "getFmt", "()Ljava/text/SimpleDateFormat;", "fmt$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "buildItems", "calcular", "showCrisisDialog", "refreshAnteriores", "Companion", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ScaleActivity extends SoftActivity {
    public static final String EXTRA_SCALE = "scale";
    private TextView anteriores;
    private TextView resultado;
    private ScaleSpec spec;
    public static final int $stable = 8;
    private final List<RadioGroup> groups = new ArrayList();

    /* JADX INFO: renamed from: fmt$delegate, reason: from kotlin metadata */
    private final Lazy fmt = LazyKt.lazy(new Function0() { // from class: com.spectrum.app.ui.ScaleActivity$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ScaleActivity.fmt_delegate$lambda$0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleDateFormat fmt_delegate$lambda$0() {
        return new SimpleDateFormat("dd/MM HH:mm", new Locale("pt", "BR"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SimpleDateFormat getFmt() {
        return (SimpleDateFormat) this.fmt.getValue();
    }

    @Override // com.spectrum.app.ui.SoftActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale);
        this.spec = Scales.INSTANCE.byCode(getIntent().getStringExtra(EXTRA_SCALE));
        TextView textView = (TextView) findViewById(R.id.title);
        ScaleSpec scaleSpec = this.spec;
        ScaleSpec scaleSpec2 = null;
        if (scaleSpec == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spec");
            scaleSpec = null;
        }
        textView.setText(scaleSpec.getTitle());
        TextView textView2 = (TextView) findViewById(R.id.instruction);
        ScaleSpec scaleSpec3 = this.spec;
        if (scaleSpec3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spec");
        } else {
            scaleSpec2 = scaleSpec3;
        }
        textView2.setText(scaleSpec2.getInstruction());
        TextView textView3 = (TextView) findViewById(R.id.legend);
        Iterable $this$mapIndexed$iv = Scales.INSTANCE.getOPTIONS();
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$mapIndexed$iv, 10));
        int index$iv$iv = 0;
        for (Object item$iv$iv : $this$mapIndexed$iv) {
            int index$iv$iv2 = index$iv$iv + 1;
            if (index$iv$iv < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String o = (String) item$iv$iv;
            destination$iv$iv.add(index$iv$iv + " = " + o);
            index$iv$iv = index$iv$iv2;
        }
        textView3.setText(CollectionsKt.joinToString$default((List) destination$iv$iv, "   ·   ", null, null, 0, null, null, 62, null));
        this.resultado = (TextView) findViewById(R.id.resultado);
        this.anteriores = (TextView) findViewById(R.id.anteriores);
        buildItems();
        ((Button) findViewById(R.id.calcular)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.ScaleActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.calcular();
            }
        });
        refreshAnteriores();
    }

    private final void buildItems() {
        LinearLayout container = (LinearLayout) findViewById(R.id.itemsContainer);
        ScaleSpec scaleSpec = this.spec;
        if (scaleSpec == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spec");
            scaleSpec = null;
        }
        Iterable $this$forEachIndexed$iv = scaleSpec.getItems();
        int $i$f$forEachIndexed = 0;
        int index = 0;
        for (Object item$iv : $this$forEachIndexed$iv) {
            int index$iv = index + 1;
            if (index < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String itemText = (String) item$iv;
            LinearLayout block = new LinearLayout(this);
            block.setOrientation(1);
            block.setPadding(0, 24, 0, 0);
            TextView $this$buildItems_u24lambda_u247_u24lambda_u244 = new TextView(this);
            $this$buildItems_u24lambda_u247_u24lambda_u244.setText((index + 1) + ". " + itemText);
            $this$buildItems_u24lambda_u247_u24lambda_u244.setTextSize(15.0f);
            block.addView($this$buildItems_u24lambda_u247_u24lambda_u244);
            RadioGroup rg = new RadioGroup(this);
            rg.setOrientation(0);
            int value = 0;
            while (value < 4) {
                RadioButton $this$buildItems_u24lambda_u247_u24lambda_u246 = new RadioButton(this);
                $this$buildItems_u24lambda_u247_u24lambda_u246.setText(String.valueOf(value));
                rg.addView($this$buildItems_u24lambda_u247_u24lambda_u246, new RadioGroup.LayoutParams(0, -2, 1.0f));
                value++;
                $i$f$forEachIndexed = $i$f$forEachIndexed;
                $this$forEachIndexed$iv = $this$forEachIndexed$iv;
            }
            this.groups.add(rg);
            block.addView(rg);
            container.addView(block);
            index = index$iv;
            $this$forEachIndexed$iv = $this$forEachIndexed$iv;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void calcular() {
        int[] answers = new int[this.groups.size()];
        int size = this.groups.size();
        for (int i = 0; i < size; i++) {
            int checkedId = this.groups.get(i).getCheckedRadioButtonId();
            if (checkedId == -1) {
                Toast.makeText(this, "Responda todos os itens (falta o " + (i + 1) + ").", 0).show();
                return;
            }
            answers[i] = this.groups.get(i).indexOfChild(this.groups.get(i).findViewById(checkedId));
        }
        int total = ArraysKt.sum(answers);
        ScaleSpec scaleSpec = this.spec;
        ScaleSpec scaleSpec2 = null;
        if (scaleSpec == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spec");
            scaleSpec = null;
        }
        String band = scaleSpec.getBand().invoke(Integer.valueOf(total));
        ScaleSpec scaleSpec3 = this.spec;
        if (scaleSpec3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spec");
        } else {
            scaleSpec2 = scaleSpec3;
        }
        int maxScore = scaleSpec2.getItems().size() * 3;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(total, band, answers, maxScore, null), 3, null);
    }

    /* JADX INFO: renamed from: com.spectrum.app.ui.ScaleActivity$calcular$1, reason: invalid class name */
    /* JADX INFO: compiled from: ScaleActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.spectrum.app.ui.ScaleActivity$calcular$1", f = "ScaleActivity.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int[] $answers;
        final /* synthetic */ String $band;
        final /* synthetic */ int $maxScore;
        final /* synthetic */ int $total;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i, String str, int[] iArr, int i2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$total = i;
            this.$band = str;
            this.$answers = iArr;
            this.$maxScore = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScaleActivity.this.new AnonymousClass1(this.$total, this.$band, this.$answers, this.$maxScore, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            ScaleSpec scaleSpec;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    ScaleResultRepository scaleResultRepository = ScaleResultRepository.INSTANCE;
                    ScaleActivity scaleActivity = ScaleActivity.this;
                    ScaleSpec scaleSpec2 = ScaleActivity.this.spec;
                    if (scaleSpec2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("spec");
                        scaleSpec2 = null;
                    }
                    this.label = 1;
                    if (scaleResultRepository.save(scaleActivity, new ScaleResult(scaleSpec2.getCode(), this.$total, this.$band, ArraysKt.joinToString$default(this.$answers, (CharSequence) ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), null, 0L, 0L, 112, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            TextView textView = ScaleActivity.this.resultado;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("resultado");
                textView = null;
            }
            textView.setText("Escore: " + this.$total + " de " + this.$maxScore + "  —  Faixa: " + this.$band);
            ScaleActivity.this.refreshAnteriores();
            ScaleSpec scaleSpec3 = ScaleActivity.this.spec;
            if (scaleSpec3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("spec");
                scaleSpec = null;
            } else {
                scaleSpec = scaleSpec3;
            }
            Integer crisisItem = scaleSpec.getCrisisItem();
            if (crisisItem != null && this.$answers[crisisItem.intValue()] > 0) {
                ScaleActivity.this.showCrisisDialog();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCrisisDialog() {
        new AlertDialog.Builder(this).setTitle("Você não está sozinha").setMessage("Você marcou que teve pensamentos de se ferir ou de que seria melhor estar morta. Isso merece cuidado agora. Quer abrir a ajuda? O CVV atende no 188, 24h, de graça e em sigilo.").setPositiveButton("Abrir ajuda agora", new DialogInterface.OnClickListener() { // from class: com.spectrum.app.ui.ScaleActivity$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ScaleActivity.showCrisisDialog$lambda$8(this.f$0, dialogInterface, i);
            }
        }).setNegativeButton("Agora não", (DialogInterface.OnClickListener) null).setCancelable(false).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCrisisDialog$lambda$8(ScaleActivity this$0, DialogInterface dialogInterface, int i) {
        this$0.startActivity(new Intent(this$0, (Class<?>) CrisisActivity.class));
    }

    /* JADX INFO: renamed from: com.spectrum.app.ui.ScaleActivity$refreshAnteriores$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ScaleActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.spectrum.app.ui.ScaleActivity$refreshAnteriores$1", f = "ScaleActivity.kt", i = {}, l = {WorkQueueKt.MASK}, m = "invokeSuspend", n = {}, s = {})
    static final class C01851 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C01851(Continuation<? super C01851> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ScaleActivity.this.new C01851(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C01851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object $result;
            String string;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            TextView textView = null;
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    ScaleResultRepository scaleResultRepository = ScaleResultRepository.INSTANCE;
                    ScaleActivity scaleActivity = ScaleActivity.this;
                    ScaleSpec scaleSpec = ScaleActivity.this.spec;
                    if (scaleSpec == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("spec");
                        scaleSpec = null;
                    }
                    this.label = 1;
                    Object objRecent = scaleResultRepository.recent(scaleActivity, scaleSpec.getCode(), this);
                    if (objRecent == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = objRecent;
                    break;
                    break;
                case 1:
                    $result = obj;
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List recent = (List) $result;
            TextView textView2 = ScaleActivity.this.anteriores;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("anteriores");
            } else {
                textView = textView2;
            }
            if (!recent.isEmpty()) {
                ScaleActivity scaleActivity2 = ScaleActivity.this;
                StringBuilder $this$invokeSuspend_u24lambda_u241 = new StringBuilder();
                $this$invokeSuspend_u24lambda_u241.append("Resultados anteriores (mais recente primeiro):").append('\n');
                List $this$forEach$iv = recent;
                Iterator it = $this$forEach$iv.iterator();
                while (it.hasNext()) {
                    Object element$iv = it.next();
                    ScaleResult r = (ScaleResult) element$iv;
                    Iterator it2 = it;
                    $this$invokeSuspend_u24lambda_u241.append(scaleActivity2.getFmt().format(new Date(r.getTs())) + " — escore " + r.getTotal() + " (" + r.getBand() + ")").append('\n');
                    it = it2;
                }
                string = $this$invokeSuspend_u24lambda_u241.toString();
            }
            textView.setText(string);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshAnteriores() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C01851(null), 3, null);
    }
}
