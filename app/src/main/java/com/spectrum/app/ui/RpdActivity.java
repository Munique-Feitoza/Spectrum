package com.spectrum.app.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.spectrum.app.R;
import com.spectrum.app.data.ThoughtRecord;
import com.spectrum.app.data.ThoughtRecordRepository;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: RpdActivity.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J(\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020'H\u0002J\f\u0010(\u001a\u00020\u0006*\u00020\u000bH\u0002J\b\u0010)\u001a\u00020\u001fH\u0002J\b\u0010*\u001a\u00020\u001fH\u0002J\b\u0010+\u001a\u00020\u001fH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b¨\u0006,"}, d2 = {"Lcom/spectrum/app/ui/RpdActivity;", "Lcom/spectrum/app/ui/SoftActivity;", "<init>", "()V", "distortionNames", "", "", "distortionChecks", "", "Lcom/google/android/material/chip/Chip;", "situacao", "Landroid/widget/EditText;", "emocao", "pensamento", "evFavor", "evContra", "alternativo", "intAntes", "Landroid/widget/SeekBar;", "intDepois", "crencaAntes", "crencaDepois", "rpdLog", "Landroid/widget/TextView;", "fmt", "Ljava/text/SimpleDateFormat;", "getFmt", "()Ljava/text/SimpleDateFormat;", "fmt$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "bindSeek", "seek", "label", "prefix", "initial", "", "trimmed", "save", "clearForm", "refreshLog", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class RpdActivity extends SoftActivity {
    public static final int $stable = 8;
    private EditText alternativo;
    private SeekBar crencaAntes;
    private SeekBar crencaDepois;
    private EditText emocao;
    private EditText evContra;
    private EditText evFavor;
    private SeekBar intAntes;
    private SeekBar intDepois;
    private EditText pensamento;
    private TextView rpdLog;
    private EditText situacao;
    private final List<String> distortionNames = CollectionsKt.listOf((Object[]) new String[]{"Tudo ou nada (8 ou 80)", "Catastrofização", "Supergeneralização", "Filtro mental (só o negativo)", "Leitura mental", "Raciocínio emocional", "Tirania dos \"deverias\"", "Rotulação", "Desqualificar o positivo", "Personalização", "Adivinhação do futuro", "Culpar a si mesma"});
    private final List<Chip> distortionChecks = new ArrayList();

    /* JADX INFO: renamed from: fmt$delegate, reason: from kotlin metadata */
    private final Lazy fmt = LazyKt.lazy(new Function0() { // from class: com.spectrum.app.ui.RpdActivity$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RpdActivity.fmt_delegate$lambda$0();
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
        setContentView(R.layout.activity_rpd);
        this.situacao = (EditText) findViewById(R.id.situacao);
        this.emocao = (EditText) findViewById(R.id.emocao);
        this.pensamento = (EditText) findViewById(R.id.pensamento);
        this.evFavor = (EditText) findViewById(R.id.evFavor);
        this.evContra = (EditText) findViewById(R.id.evContra);
        this.alternativo = (EditText) findViewById(R.id.alternativo);
        this.intAntes = (SeekBar) findViewById(R.id.intAntes);
        this.intDepois = (SeekBar) findViewById(R.id.intDepois);
        this.crencaAntes = (SeekBar) findViewById(R.id.crencaAntes);
        this.crencaDepois = (SeekBar) findViewById(R.id.crencaDepois);
        this.rpdLog = (TextView) findViewById(R.id.rpdLog);
        SeekBar seekBar = this.intAntes;
        SeekBar seekBar2 = null;
        if (seekBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("intAntes");
            seekBar = null;
        }
        View viewFindViewById = findViewById(R.id.intAntesVal);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        bindSeek(seekBar, (TextView) viewFindViewById, "Intensidade da emoção", 60);
        SeekBar seekBar3 = this.intDepois;
        if (seekBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("intDepois");
            seekBar3 = null;
        }
        View viewFindViewById2 = findViewById(R.id.intDepoisVal);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        bindSeek(seekBar3, (TextView) viewFindViewById2, "Intensidade da emoção agora", 40);
        SeekBar seekBar4 = this.crencaAntes;
        if (seekBar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("crencaAntes");
            seekBar4 = null;
        }
        View viewFindViewById3 = findViewById(R.id.crencaAntesVal);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        bindSeek(seekBar4, (TextView) viewFindViewById3, "Quanto eu acredito no pensamento", 70);
        SeekBar seekBar5 = this.crencaDepois;
        if (seekBar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("crencaDepois");
        } else {
            seekBar2 = seekBar5;
        }
        View viewFindViewById4 = findViewById(R.id.crencaDepoisVal);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        bindSeek(seekBar2, (TextView) viewFindViewById4, "Quanto eu acredito nele agora", 40);
        LinearLayout container = (LinearLayout) findViewById(R.id.distortions);
        ChipGroup group = new ChipGroup(this);
        Iterable $this$forEach$iv = this.distortionNames;
        for (Object element$iv : $this$forEach$iv) {
            String name = (String) element$iv;
            Chip chip = new Chip(this);
            chip.setText(name);
            chip.setCheckable(true);
            this.distortionChecks.add(chip);
            group.addView(chip);
        }
        container.addView(group);
        ((Button) findViewById(R.id.salvar)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.RpdActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.save();
            }
        });
        refreshLog();
    }

    private final void bindSeek(SeekBar seek, final TextView label, final String prefix, int initial) {
        seek.setProgress(initial);
        label.setText(prefix + ": " + initial);
        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.spectrum.app.ui.RpdActivity.bindSeek.1
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

    private final String trimmed(EditText $this$trimmed) {
        return StringsKt.trim((CharSequence) $this$trimmed.getText().toString()).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void save() {
        EditText editText = this.situacao;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("situacao");
            editText = null;
        }
        String situacaoText = trimmed(editText);
        EditText editText2 = this.pensamento;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pensamento");
            editText2 = null;
        }
        String pensamentoText = trimmed(editText2);
        if (!(situacaoText.length() == 0)) {
            if (!(pensamentoText.length() == 0)) {
                Iterable $this$filter$iv = this.distortionChecks;
                Collection destination$iv$iv = new ArrayList();
                for (Object element$iv$iv : $this$filter$iv) {
                    Chip it = (Chip) element$iv$iv;
                    if (it.isChecked()) {
                        destination$iv$iv.add(element$iv$iv);
                    }
                }
                String distorcoes = CollectionsKt.joinToString$default((List) destination$iv$iv, ", ", null, null, 0, null, new Function1() { // from class: com.spectrum.app.ui.RpdActivity$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RpdActivity.save$lambda$5((Chip) obj);
                    }
                }, 30, null);
                EditText editText3 = this.emocao;
                if (editText3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("emocao");
                    editText3 = null;
                }
                String strTrimmed = trimmed(editText3);
                SeekBar seekBar = this.intAntes;
                if (seekBar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("intAntes");
                    seekBar = null;
                }
                int progress = seekBar.getProgress();
                EditText editText4 = this.evFavor;
                if (editText4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("evFavor");
                    editText4 = null;
                }
                String strTrimmed2 = trimmed(editText4);
                EditText editText5 = this.evContra;
                if (editText5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("evContra");
                    editText5 = null;
                }
                String strTrimmed3 = trimmed(editText5);
                EditText editText6 = this.alternativo;
                if (editText6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("alternativo");
                    editText6 = null;
                }
                String strTrimmed4 = trimmed(editText6);
                SeekBar seekBar2 = this.intDepois;
                if (seekBar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("intDepois");
                    seekBar2 = null;
                }
                int progress2 = seekBar2.getProgress();
                SeekBar seekBar3 = this.crencaAntes;
                if (seekBar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("crencaAntes");
                    seekBar3 = null;
                }
                int progress3 = seekBar3.getProgress();
                SeekBar seekBar4 = this.crencaDepois;
                if (seekBar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("crencaDepois");
                    seekBar4 = null;
                }
                ThoughtRecord record = new ThoughtRecord(situacaoText, strTrimmed, progress, pensamentoText, distorcoes, strTrimmed2, strTrimmed3, strTrimmed4, progress2, progress3, seekBar4.getProgress(), null, 0L, 0L, 14336, null);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C01831(record, null), 3, null);
                return;
            }
        }
        Toast.makeText(this, "Preencha ao menos a situação e o pensamento.", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence save$lambda$5(Chip it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CharSequence text = it.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return text;
    }

    /* JADX INFO: renamed from: com.spectrum.app.ui.RpdActivity$save$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: RpdActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.spectrum.app.ui.RpdActivity$save$1", f = "RpdActivity.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
    static final class C01831 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ThoughtRecord $record;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01831(ThoughtRecord thoughtRecord, Continuation<? super C01831> continuation) {
            super(2, continuation);
            this.$record = thoughtRecord;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RpdActivity.this.new C01831(this.$record, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C01831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (ThoughtRecordRepository.INSTANCE.save(RpdActivity.this, this.$record, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Toast.makeText(RpdActivity.this, "Registro de pensamento salvo.", 0).show();
            RpdActivity.this.clearForm();
            RpdActivity.this.refreshLog();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearForm() {
        EditText[] editTextArr = new EditText[6];
        EditText editText = this.situacao;
        SeekBar seekBar = null;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("situacao");
            editText = null;
        }
        editTextArr[0] = editText;
        EditText editText2 = this.emocao;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("emocao");
            editText2 = null;
        }
        editTextArr[1] = editText2;
        EditText editText3 = this.pensamento;
        if (editText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pensamento");
            editText3 = null;
        }
        editTextArr[2] = editText3;
        EditText editText4 = this.evFavor;
        if (editText4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("evFavor");
            editText4 = null;
        }
        editTextArr[3] = editText4;
        EditText editText5 = this.evContra;
        if (editText5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("evContra");
            editText5 = null;
        }
        editTextArr[4] = editText5;
        EditText editText6 = this.alternativo;
        if (editText6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("alternativo");
            editText6 = null;
        }
        editTextArr[5] = editText6;
        Iterable $this$forEach$iv = CollectionsKt.listOf((Object[]) editTextArr);
        for (Object element$iv : $this$forEach$iv) {
            EditText it = (EditText) element$iv;
            it.setText("");
        }
        Iterable $this$forEach$iv2 = this.distortionChecks;
        for (Object element$iv2 : $this$forEach$iv2) {
            Chip it2 = (Chip) element$iv2;
            it2.setChecked(false);
        }
        SeekBar seekBar2 = this.intAntes;
        if (seekBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("intAntes");
            seekBar2 = null;
        }
        seekBar2.setProgress(60);
        SeekBar seekBar3 = this.intDepois;
        if (seekBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("intDepois");
            seekBar3 = null;
        }
        seekBar3.setProgress(40);
        SeekBar seekBar4 = this.crencaAntes;
        if (seekBar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("crencaAntes");
            seekBar4 = null;
        }
        seekBar4.setProgress(70);
        SeekBar seekBar5 = this.crencaDepois;
        if (seekBar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("crencaDepois");
        } else {
            seekBar = seekBar5;
        }
        seekBar.setProgress(40);
    }

    /* JADX INFO: renamed from: com.spectrum.app.ui.RpdActivity$refreshLog$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: RpdActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.spectrum.app.ui.RpdActivity$refreshLog$1", f = "RpdActivity.kt", i = {1}, l = {151, 152}, m = "invokeSuspend", n = {"count"}, s = {"I$0"})
    static final class C01821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int I$0;
        int label;

        C01821(Continuation<? super C01821> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RpdActivity.this.new C01821(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C01821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0056 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x0057  */
        /* JADX WARN: Code duplicated, block: B:17:0x0062  */
        /* JADX WARN: Code duplicated, block: B:21:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:23:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:24:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:26:0x00d3  */
        /* JADX WARN: Code duplicated, block: B:32:0x00d7 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objCount;
            int count;
            Object objRecent;
            Object $result2;
            TextView textView;
            RpdActivity rpdActivity;
            StringBuilder $this$invokeSuspend_u24lambda_u242;
            int $i$f$forEach;
            String emocao;
            boolean z;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    objCount = ThoughtRecordRepository.INSTANCE.count(RpdActivity.this, this);
                    if (objCount == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    count = ((Number) objCount).intValue();
                    this.I$0 = count;
                    this.label = 2;
                    objRecent = ThoughtRecordRepository.INSTANCE.recent(RpdActivity.this, this);
                    if (objRecent == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result2 = objRecent;
                    List recent = (List) $result2;
                    textView = RpdActivity.this.rpdLog;
                    if (textView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rpdLog");
                        textView = null;
                    }
                    rpdActivity = RpdActivity.this;
                    $this$invokeSuspend_u24lambda_u242 = new StringBuilder();
                    $this$invokeSuspend_u24lambda_u242.append("Registros de pensamento: " + count).append('\n');
                    $this$invokeSuspend_u24lambda_u242.append('\n');
                    Iterable $this$forEach$iv = CollectionsKt.take(recent, 10);
                    $i$f$forEach = 0;
                    for (Object element$iv : $this$forEach$iv) {
                        ThoughtRecord r = (ThoughtRecord) element$iv;
                        int $i$f$forEach2 = $i$f$forEach;
                        $this$invokeSuspend_u24lambda_u242.append(rpdActivity.getFmt().format(new Date(r.getTs())));
                        emocao = r.getEmocao();
                        if (emocao.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            emocao = "—";
                        }
                        $this$invokeSuspend_u24lambda_u242.append("  " + ((Object) emocao));
                        $this$invokeSuspend_u24lambda_u242.append("  intensidade " + r.getIntensidadeAntes() + "→" + r.getIntensidadeDepois() + ", crença " + r.getCrencaAntes() + "→" + r.getCrencaDepois()).append('\n');
                        $i$f$forEach = $i$f$forEach2;
                    }
                    textView.setText($this$invokeSuspend_u24lambda_u242.toString());
                    return Unit.INSTANCE;
                case 1:
                    ResultKt.throwOnFailure($result);
                    objCount = $result;
                    count = ((Number) objCount).intValue();
                    this.I$0 = count;
                    this.label = 2;
                    objRecent = ThoughtRecordRepository.INSTANCE.recent(RpdActivity.this, this);
                    if (objRecent == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result2 = objRecent;
                    List recent2 = (List) $result2;
                    textView = RpdActivity.this.rpdLog;
                    if (textView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rpdLog");
                        textView = null;
                    }
                    rpdActivity = RpdActivity.this;
                    $this$invokeSuspend_u24lambda_u242 = new StringBuilder();
                    $this$invokeSuspend_u24lambda_u242.append("Registros de pensamento: " + count).append('\n');
                    $this$invokeSuspend_u24lambda_u242.append('\n');
                    Iterable $this$forEach$iv2 = CollectionsKt.take(recent2, 10);
                    $i$f$forEach = 0;
                    while (r10.hasNext()) {
                        ThoughtRecord r2 = (ThoughtRecord) element$iv;
                        int $i$f$forEach3 = $i$f$forEach;
                        $this$invokeSuspend_u24lambda_u242.append(rpdActivity.getFmt().format(new Date(r2.getTs())));
                        emocao = r2.getEmocao();
                        if (emocao.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            emocao = "—";
                        }
                        $this$invokeSuspend_u24lambda_u242.append("  " + ((Object) emocao));
                        $this$invokeSuspend_u24lambda_u242.append("  intensidade " + r2.getIntensidadeAntes() + "→" + r2.getIntensidadeDepois() + ", crença " + r2.getCrencaAntes() + "→" + r2.getCrencaDepois()).append('\n');
                        $i$f$forEach = $i$f$forEach3;
                    }
                    textView.setText($this$invokeSuspend_u24lambda_u242.toString());
                    return Unit.INSTANCE;
                case 2:
                    $result2 = $result;
                    int count2 = this.I$0;
                    ResultKt.throwOnFailure($result2);
                    count = count2;
                    List recent3 = (List) $result2;
                    textView = RpdActivity.this.rpdLog;
                    if (textView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rpdLog");
                        textView = null;
                    }
                    rpdActivity = RpdActivity.this;
                    $this$invokeSuspend_u24lambda_u242 = new StringBuilder();
                    $this$invokeSuspend_u24lambda_u242.append("Registros de pensamento: " + count).append('\n');
                    $this$invokeSuspend_u24lambda_u242.append('\n');
                    Iterable $this$forEach$iv3 = CollectionsKt.take(recent3, 10);
                    $i$f$forEach = 0;
                    while (r10.hasNext()) {
                        ThoughtRecord r3 = (ThoughtRecord) element$iv;
                        int $i$f$forEach4 = $i$f$forEach;
                        $this$invokeSuspend_u24lambda_u242.append(rpdActivity.getFmt().format(new Date(r3.getTs())));
                        emocao = r3.getEmocao();
                        if (emocao.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            emocao = "—";
                        }
                        $this$invokeSuspend_u24lambda_u242.append("  " + ((Object) emocao));
                        $this$invokeSuspend_u24lambda_u242.append("  intensidade " + r3.getIntensidadeAntes() + "→" + r3.getIntensidadeDepois() + ", crença " + r3.getCrencaAntes() + "→" + r3.getCrencaDepois()).append('\n');
                        $i$f$forEach = $i$f$forEach4;
                    }
                    textView.setText($this$invokeSuspend_u24lambda_u242.toString());
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshLog() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C01821(null), 3, null);
    }
}
