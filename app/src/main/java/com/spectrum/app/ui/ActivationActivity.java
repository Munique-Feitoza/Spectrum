package com.spectrum.app.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.spectrum.app.R;
import com.spectrum.app.data.ActivityLog;
import com.spectrum.app.data.ActivityLogRepository;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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

/* JADX INFO: compiled from: ActivationActivity.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0013H\u0002J\b\u0010\u001e\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/spectrum/app/ui/ActivationActivity;", "Lcom/spectrum/app/ui/SoftActivity;", "<init>", "()V", "atividade", "Landroid/widget/EditText;", "nota", "prazer", "Landroid/widget/SeekBar;", "dominio", "activLog", "Landroid/widget/TextView;", "fmt", "Ljava/text/SimpleDateFormat;", "getFmt", "()Ljava/text/SimpleDateFormat;", "fmt$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "bindSeek", "seek", "label", "prefix", "", "initial", "", "save", "refresh", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ActivationActivity extends SoftActivity {
    public static final int $stable = 8;
    private TextView activLog;
    private EditText atividade;
    private SeekBar dominio;

    /* JADX INFO: renamed from: fmt$delegate, reason: from kotlin metadata */
    private final Lazy fmt = LazyKt.lazy(new Function0() { // from class: com.spectrum.app.ui.ActivationActivity$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ActivationActivity.fmt_delegate$lambda$0();
        }
    });
    private EditText nota;
    private SeekBar prazer;

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
        setContentView(R.layout.activity_activation);
        this.atividade = (EditText) findViewById(R.id.atividade);
        this.nota = (EditText) findViewById(R.id.nota);
        this.prazer = (SeekBar) findViewById(R.id.prazer);
        this.dominio = (SeekBar) findViewById(R.id.dominio);
        this.activLog = (TextView) findViewById(R.id.activLog);
        SeekBar seekBar = this.prazer;
        SeekBar seekBar2 = null;
        if (seekBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prazer");
            seekBar = null;
        }
        View viewFindViewById = findViewById(R.id.prazerVal);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        bindSeek(seekBar, (TextView) viewFindViewById, "Prazer (quão prazeroso, 0-10)", 5);
        SeekBar seekBar3 = this.dominio;
        if (seekBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dominio");
        } else {
            seekBar2 = seekBar3;
        }
        View viewFindViewById2 = findViewById(R.id.dominioVal);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        bindSeek(seekBar2, (TextView) viewFindViewById2, "Domínio (sensação de realização, 0-10)", 5);
        ((Button) findViewById(R.id.salvarAtividade)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.ActivationActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.save();
            }
        });
        refresh();
    }

    private final void bindSeek(SeekBar seek, final TextView label, final String prefix, int initial) {
        seek.setProgress(initial);
        label.setText(prefix + ": " + initial);
        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.spectrum.app.ui.ActivationActivity.bindSeek.1
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar sb, int progress, boolean fromUser) {
                Intrinsics.checkNotNullParameter(sb, "sb");
                label.setText(prefix + ": " + progress);
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar sb) {
                Intrinsics.checkNotNullParameter(sb, "sb");
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar sb) {
                Intrinsics.checkNotNullParameter(sb, "sb");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void save() {
        EditText editText = this.atividade;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("atividade");
            editText = null;
        }
        String nome = StringsKt.trim((CharSequence) editText.getText().toString()).toString();
        if (nome.length() == 0) {
            Toast.makeText(this, "Escreva qual foi a atividade.", 0).show();
            return;
        }
        SeekBar seekBar = this.prazer;
        if (seekBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prazer");
            seekBar = null;
        }
        int progress = seekBar.getProgress();
        SeekBar seekBar2 = this.dominio;
        if (seekBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dominio");
            seekBar2 = null;
        }
        int progress2 = seekBar2.getProgress();
        EditText editText2 = this.nota;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nota");
            editText2 = null;
        }
        ActivityLog log = new ActivityLog(nome, progress, progress2, StringsKt.trim((CharSequence) editText2.getText().toString()).toString(), null, 0L, 0L, 112, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C01781(log, null), 3, null);
    }

    /* JADX INFO: renamed from: com.spectrum.app.ui.ActivationActivity$save$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ActivationActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.spectrum.app.ui.ActivationActivity$save$1", f = "ActivationActivity.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    static final class C01781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ActivityLog $log;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01781(ActivityLog activityLog, Continuation<? super C01781> continuation) {
            super(2, continuation);
            this.$log = activityLog;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ActivationActivity.this.new C01781(this.$log, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C01781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (ActivityLogRepository.INSTANCE.save(ActivationActivity.this, this.$log, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            EditText editText = ActivationActivity.this.atividade;
            SeekBar seekBar = null;
            if (editText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("atividade");
                editText = null;
            }
            editText.setText("");
            EditText editText2 = ActivationActivity.this.nota;
            if (editText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nota");
                editText2 = null;
            }
            editText2.setText("");
            SeekBar seekBar2 = ActivationActivity.this.prazer;
            if (seekBar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("prazer");
                seekBar2 = null;
            }
            seekBar2.setProgress(5);
            SeekBar seekBar3 = ActivationActivity.this.dominio;
            if (seekBar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dominio");
            } else {
                seekBar = seekBar3;
            }
            seekBar.setProgress(5);
            Toast.makeText(ActivationActivity.this, "Atividade registrada.", 0).show();
            ActivationActivity.this.refresh();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.spectrum.app.ui.ActivationActivity$refresh$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ActivationActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.spectrum.app.ui.ActivationActivity$refresh$1", f = "ActivationActivity.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    static final class C01771 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C01771(Continuation<? super C01771> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ActivationActivity.this.new C01771(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C01771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object $result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    Object objRecent = ActivityLogRepository.INSTANCE.recent(ActivationActivity.this, this);
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
            TextView textView = ActivationActivity.this.activLog;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activLog");
                textView = null;
            }
            ActivationActivity activationActivity = ActivationActivity.this;
            StringBuilder $this$invokeSuspend_u24lambda_u241 = new StringBuilder();
            $this$invokeSuspend_u24lambda_u241.append("Atividades registradas: " + recent.size()).append('\n');
            $this$invokeSuspend_u24lambda_u241.append('\n');
            List $this$forEach$iv = recent;
            Iterator it = $this$forEach$iv.iterator();
            while (it.hasNext()) {
                Object element$iv = it.next();
                ActivityLog a = (ActivityLog) element$iv;
                Iterator it2 = it;
                $this$invokeSuspend_u24lambda_u241.append(activationActivity.getFmt().format(new Date(a.getTs())) + " — " + a.getAtividade() + "  (P " + a.getPrazer() + " / D " + a.getDominio() + ")").append('\n');
                it = it2;
            }
            textView.setText($this$invokeSuspend_u24lambda_u241.toString());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refresh() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C01771(null), 3, null);
    }
}
