package com.spectrum.app.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.spectrum.app.R;
import com.spectrum.app.data.AbcRecord;
import com.spectrum.app.data.AbcRecordRepository;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: AbcActivity.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\f\u0010\u0015\u001a\u00020\u0016*\u00020\u0005H\u0002J\b\u0010\u0017\u001a\u00020\u0012H\u0002J\b\u0010\u0018\u001a\u00020\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/spectrum/app/ui/AbcActivity;", "Lcom/spectrum/app/ui/SoftActivity;", "<init>", "()V", "antecedente", "Landroid/widget/EditText;", "comportamento", "consequencia", "contexto", "abcLog", "Landroid/widget/TextView;", "fmt", "Ljava/text/SimpleDateFormat;", "getFmt", "()Ljava/text/SimpleDateFormat;", "fmt$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "trimmed", "", "save", "refresh", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class AbcActivity extends SoftActivity {
    public static final int $stable = 8;
    private TextView abcLog;
    private EditText antecedente;
    private EditText comportamento;
    private EditText consequencia;
    private EditText contexto;

    /* JADX INFO: renamed from: fmt$delegate, reason: from kotlin metadata */
    private final Lazy fmt = LazyKt.lazy(new Function0() { // from class: com.spectrum.app.ui.AbcActivity$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbcActivity.fmt_delegate$lambda$0();
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
        setContentView(R.layout.activity_abc);
        this.antecedente = (EditText) findViewById(R.id.antecedente);
        this.comportamento = (EditText) findViewById(R.id.comportamento);
        this.consequencia = (EditText) findViewById(R.id.consequencia);
        this.contexto = (EditText) findViewById(R.id.contexto);
        this.abcLog = (TextView) findViewById(R.id.abcLog);
        ((Button) findViewById(R.id.salvarAbc)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.AbcActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.save();
            }
        });
        refresh();
    }

    private final String trimmed(EditText $this$trimmed) {
        return StringsKt.trim((CharSequence) $this$trimmed.getText().toString()).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void save() {
        EditText editText = this.antecedente;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("antecedente");
            editText = null;
        }
        String a = trimmed(editText);
        EditText editText2 = this.comportamento;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("comportamento");
            editText2 = null;
        }
        String b = trimmed(editText2);
        if (!(a.length() == 0)) {
            if (!(b.length() == 0)) {
                EditText editText3 = this.consequencia;
                if (editText3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("consequencia");
                    editText3 = null;
                }
                String strTrimmed = trimmed(editText3);
                EditText editText4 = this.contexto;
                if (editText4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("contexto");
                    editText4 = null;
                }
                AbcRecord record = new AbcRecord(a, b, strTrimmed, trimmed(editText4), null, 0L, 0L, 112, null);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C01761(record, null), 3, null);
                return;
            }
        }
        Toast.makeText(this, "Preencha ao menos o antecedente (A) e o comportamento (B).", 0).show();
    }

    /* JADX INFO: renamed from: com.spectrum.app.ui.AbcActivity$save$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AbcActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.spectrum.app.ui.AbcActivity$save$1", f = "AbcActivity.kt", i = {}, l = {LockFreeTaskQueueCore.FROZEN_SHIFT}, m = "invokeSuspend", n = {}, s = {})
    static final class C01761 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AbcRecord $record;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01761(AbcRecord abcRecord, Continuation<? super C01761> continuation) {
            super(2, continuation);
            this.$record = abcRecord;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AbcActivity.this.new C01761(this.$record, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C01761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (AbcRecordRepository.INSTANCE.save(AbcActivity.this, this.$record, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            EditText[] editTextArr = new EditText[4];
            EditText editText = AbcActivity.this.antecedente;
            EditText editText2 = null;
            if (editText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("antecedente");
                editText = null;
            }
            editTextArr[0] = editText;
            EditText editText3 = AbcActivity.this.comportamento;
            if (editText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("comportamento");
                editText3 = null;
            }
            editTextArr[1] = editText3;
            EditText editText4 = AbcActivity.this.consequencia;
            if (editText4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("consequencia");
                editText4 = null;
            }
            editTextArr[2] = editText4;
            EditText editText5 = AbcActivity.this.contexto;
            if (editText5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contexto");
            } else {
                editText2 = editText5;
            }
            editTextArr[3] = editText2;
            Iterable $this$forEach$iv = CollectionsKt.listOf((Object[]) editTextArr);
            for (Object element$iv : $this$forEach$iv) {
                EditText it = (EditText) element$iv;
                it.setText("");
            }
            Toast.makeText(AbcActivity.this, "Registro ABC salvo.", 0).show();
            AbcActivity.this.refresh();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.spectrum.app.ui.AbcActivity$refresh$1, reason: invalid class name */
    /* JADX INFO: compiled from: AbcActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.spectrum.app.ui.AbcActivity$refresh$1", f = "AbcActivity.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AbcActivity.this.new AnonymousClass1(continuation);
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
                    Object objRecent = AbcRecordRepository.INSTANCE.recent(AbcActivity.this, this);
                    if (objRecent == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = objRecent;
                    break;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List recent = (List) $result;
            TextView textView = AbcActivity.this.abcLog;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("abcLog");
                textView = null;
            }
            AbcActivity abcActivity = AbcActivity.this;
            StringBuilder $this$invokeSuspend_u24lambda_u241 = new StringBuilder();
            $this$invokeSuspend_u24lambda_u241.append("Registros ABC: " + recent.size()).append('\n');
            $this$invokeSuspend_u24lambda_u241.append('\n');
            List $this$forEach$iv = recent;
            for (Object element$iv : $this$forEach$iv) {
                AbcRecord r = (AbcRecord) element$iv;
                $this$invokeSuspend_u24lambda_u241.append(abcActivity.getFmt().format(new Date(r.getTs()))).append('\n');
                $this$invokeSuspend_u24lambda_u241.append("A: " + r.getAntecedente()).append('\n');
                $this$invokeSuspend_u24lambda_u241.append("B: " + r.getComportamento()).append('\n');
                if (!StringsKt.isBlank(r.getConsequencia())) {
                    $this$invokeSuspend_u24lambda_u241.append("C: " + r.getConsequencia()).append('\n');
                }
                $this$invokeSuspend_u24lambda_u241.append('\n');
            }
            textView.setText($this$invokeSuspend_u24lambda_u241.toString());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refresh() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(null), 3, null);
    }
}
