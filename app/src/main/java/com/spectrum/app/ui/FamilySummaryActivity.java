package com.spectrum.app.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.spectrum.app.R;
import com.spectrum.app.data.CidAdapt;
import com.spectrum.app.data.MoodEvent;
import com.spectrum.app.data.MoodFilter;
import com.spectrum.app.data.MoodRepository;
import com.spectrum.app.data.RegulationEvent;
import com.spectrum.app.data.RegulationRepository;
import com.spectrum.app.data.UserPrefs;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: FamilySummaryActivity.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\u000e\u0010\b\u001a\u00020\tH\u0082@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/spectrum/app/ui/FamilySummaryActivity;", "Lcom/spectrum/app/ui/SoftActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "build", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class FamilySummaryActivity extends SoftActivity {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: com.spectrum.app.ui.FamilySummaryActivity$build$1, reason: invalid class name */
    /* JADX INFO: compiled from: FamilySummaryActivity.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.spectrum.app.ui.FamilySummaryActivity", f = "FamilySummaryActivity.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {42, 43}, m = "build", n = {"this", "name", "fmt", "this", "name", "fmt", "moods"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FamilySummaryActivity.this.build(this);
        }
    }

    @Override // com.spectrum.app.ui.SoftActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        TextView view = (TextView) findViewById(R.id.summary);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C01791(view, null), 3, null);
    }

    /* JADX INFO: renamed from: com.spectrum.app.ui.FamilySummaryActivity$onCreate$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FamilySummaryActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.spectrum.app.ui.FamilySummaryActivity$onCreate$1", f = "FamilySummaryActivity.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS}, m = "invokeSuspend", n = {}, s = {})
    static final class C01791 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TextView $view;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01791(TextView textView, Continuation<? super C01791> continuation) {
            super(2, continuation);
            this.$view = textView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FamilySummaryActivity.this.new C01791(this.$view, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C01791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objBuild = FamilySummaryActivity.this.build(this);
                    if (objBuild == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = objBuild;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final String text = (String) $result;
            this.$view.setText(text);
            Button button = (Button) FamilySummaryActivity.this.findViewById(R.id.copiar);
            final FamilySummaryActivity familySummaryActivity = FamilySummaryActivity.this;
            button.setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.FamilySummaryActivity$onCreate$1$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FamilySummaryActivity.C01791.invokeSuspend$lambda$0(familySummaryActivity, text, view);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(FamilySummaryActivity this$0, String $text, View it) {
            Object systemService = this$0.getSystemService("clipboard");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ClipboardManager cm = (ClipboardManager) systemService;
            cm.setPrimaryClip(ClipData.newPlainText("Spectrum", $text));
            Toast.makeText(this$0, "Copiado.", 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:27:0x0171  */
    /* JADX WARN: Code duplicated, block: B:31:0x0192  */
    /* JADX WARN: Code duplicated, block: B:33:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:37:0x0216  */
    /* JADX WARN: Code duplicated, block: B:41:0x022b A[LOOP:1: B:39:0x0225->B:41:0x022b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final Object build(Continuation<? super String> continuation) {
        AnonymousClass1 anonymousClass1;
        String name;
        Object objHistory;
        FamilySummaryActivity familySummaryActivity;
        SimpleDateFormat fmt;
        List moods;
        Object objRecent;
        List moods2;
        List regs;
        StringBuilder $this$build_u24lambda_u243;
        String lang;
        int $i$f$forEach;
        String label;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object $result = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (anonymousClass1.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                String strPersonName = UserPrefs.INSTANCE.personName(this);
                if (StringsKt.isBlank(strPersonName)) {
                    strPersonName = "Pessoa";
                }
                name = strPersonName;
                SimpleDateFormat fmt2 = new SimpleDateFormat("dd/MM HH:mm", new Locale("pt", "BR"));
                MoodFilter moodFilter = MoodFilter.ALL;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = name;
                anonymousClass1.L$2 = fmt2;
                anonymousClass1.label = 1;
                objHistory = MoodRepository.INSTANCE.history(this, moodFilter, anonymousClass1);
                if (objHistory == coroutine_suspended) {
                    return coroutine_suspended;
                }
                familySummaryActivity = this;
                fmt = fmt2;
                moods = CollectionsKt.take((Iterable) objHistory, 20);
                anonymousClass1.L$0 = familySummaryActivity;
                anonymousClass1.L$1 = name;
                anonymousClass1.L$2 = fmt;
                anonymousClass1.L$3 = moods;
                anonymousClass1.label = 2;
                objRecent = RegulationRepository.INSTANCE.recent(familySummaryActivity, 20, anonymousClass1);
                if (objRecent == coroutine_suspended) {
                    return coroutine_suspended;
                }
                moods2 = moods;
                regs = (List) objRecent;
                $this$build_u24lambda_u243 = new StringBuilder();
                $this$build_u24lambda_u243.append("SPECTRUM — resumo para família / especialista").append('\n');
                $this$build_u24lambda_u243.append("Isto não é diagnóstico nem laudo.").append('\n');
                $this$build_u24lambda_u243.append('\n');
                $this$build_u24lambda_u243.append("Quem: " + name).append('\n');
                $this$build_u24lambda_u243.append("Comunicação: " + UserPrefs.INSTANCE.communicationLabel(familySummaryActivity)).append('\n');
                $this$build_u24lambda_u243.append("Apoio no cotidiano: " + UserPrefs.INSTANCE.supportLabel(familySummaryActivity)).append('\n');
                $this$build_u24lambda_u243.append(CidAdapt.INSTANCE.line(familySummaryActivity)).append('\n');
                $this$build_u24lambda_u243.append("CIDs informados por quem já tem diagnóstico. O Spectrum não emite laudo.").append('\n');
                $this$build_u24lambda_u243.append('\n');
                $this$build_u24lambda_u243.append("Últimos toques (humor / estado):").append('\n');
                if (moods2.isEmpty()) {
                    $this$build_u24lambda_u243.append("— ainda sem registro").append('\n');
                }
                lang = AacBoard.INSTANCE.resolveLang(familySummaryActivity);
                List $this$forEach$iv = moods2;
                for (Object element$iv : $this$forEach$iv) {
                    MoodEvent e = (MoodEvent) element$iv;
                    label = e.getLabel();
                    if (label == null) {
                        label = "registro";
                    }
                    String raw = label;
                    AnonymousClass1 anonymousClass2 = anonymousClass1;
                    String str = fmt.format(new Date(e.getTs()));
                    String strBilingual = AacBoard.INSTANCE.bilingual(raw, lang);
                    String raw2 = e.getSource();
                    $this$build_u24lambda_u243.append("• " + str + " — " + strBilingual + " (" + raw2 + ")").append('\n');
                    anonymousClass1 = anonymousClass2;
                    $result = $result;
                }
                $this$build_u24lambda_u243.append('\n');
                $this$build_u24lambda_u243.append("Regulação / necessidades (pausa, dor, ajuda…):").append('\n');
                if (regs.isEmpty()) {
                    $this$build_u24lambda_u243.append("— ainda sem registro").append('\n');
                }
                List $this$forEach$iv2 = regs;
                $i$f$forEach = 0;
                for (Object element$iv2 : $this$forEach$iv2) {
                    RegulationEvent e2 = (RegulationEvent) element$iv2;
                    String shown = AacBoard.INSTANCE.bilingual(e2.getLabel(), lang);
                    $this$build_u24lambda_u243.append("• " + fmt.format(new Date(e2.getTs())) + " — " + shown + " [" + e2.getKind() + "]").append('\n');
                    $i$f$forEach = $i$f$forEach;
                }
                String lines = $this$build_u24lambda_u243.toString();
                return StringsKt.trim((CharSequence) lines).toString();
            case 1:
                fmt = (SimpleDateFormat) anonymousClass1.L$2;
                name = (String) anonymousClass1.L$1;
                familySummaryActivity = (FamilySummaryActivity) anonymousClass1.L$0;
                ResultKt.throwOnFailure($result);
                objHistory = $result;
                moods = CollectionsKt.take((Iterable) objHistory, 20);
                anonymousClass1.L$0 = familySummaryActivity;
                anonymousClass1.L$1 = name;
                anonymousClass1.L$2 = fmt;
                anonymousClass1.L$3 = moods;
                anonymousClass1.label = 2;
                objRecent = RegulationRepository.INSTANCE.recent(familySummaryActivity, 20, anonymousClass1);
                if (objRecent == coroutine_suspended) {
                    return coroutine_suspended;
                }
                moods2 = moods;
                regs = (List) objRecent;
                $this$build_u24lambda_u243 = new StringBuilder();
                $this$build_u24lambda_u243.append("SPECTRUM — resumo para família / especialista").append('\n');
                $this$build_u24lambda_u243.append("Isto não é diagnóstico nem laudo.").append('\n');
                $this$build_u24lambda_u243.append('\n');
                $this$build_u24lambda_u243.append("Quem: " + name).append('\n');
                $this$build_u24lambda_u243.append("Comunicação: " + UserPrefs.INSTANCE.communicationLabel(familySummaryActivity)).append('\n');
                $this$build_u24lambda_u243.append("Apoio no cotidiano: " + UserPrefs.INSTANCE.supportLabel(familySummaryActivity)).append('\n');
                $this$build_u24lambda_u243.append(CidAdapt.INSTANCE.line(familySummaryActivity)).append('\n');
                $this$build_u24lambda_u243.append("CIDs informados por quem já tem diagnóstico. O Spectrum não emite laudo.").append('\n');
                $this$build_u24lambda_u243.append('\n');
                $this$build_u24lambda_u243.append("Últimos toques (humor / estado):").append('\n');
                if (moods2.isEmpty()) {
                    $this$build_u24lambda_u243.append("— ainda sem registro").append('\n');
                }
                lang = AacBoard.INSTANCE.resolveLang(familySummaryActivity);
                List $this$forEach$iv3 = moods2;
                while (r14.hasNext()) {
                    MoodEvent e3 = (MoodEvent) element$iv;
                    label = e3.getLabel();
                    if (label == null) {
                        label = "registro";
                    }
                    String raw3 = label;
                    AnonymousClass1 anonymousClass3 = anonymousClass1;
                    String str2 = fmt.format(new Date(e3.getTs()));
                    String strBilingual2 = AacBoard.INSTANCE.bilingual(raw3, lang);
                    String raw4 = e3.getSource();
                    $this$build_u24lambda_u243.append("• " + str2 + " — " + strBilingual2 + " (" + raw4 + ")").append('\n');
                    anonymousClass1 = anonymousClass3;
                    $result = $result;
                }
                $this$build_u24lambda_u243.append('\n');
                $this$build_u24lambda_u243.append("Regulação / necessidades (pausa, dor, ajuda…):").append('\n');
                if (regs.isEmpty()) {
                    $this$build_u24lambda_u243.append("— ainda sem registro").append('\n');
                }
                List $this$forEach$iv4 = regs;
                $i$f$forEach = 0;
                while (r2.hasNext()) {
                    RegulationEvent e4 = (RegulationEvent) element$iv2;
                    String shown2 = AacBoard.INSTANCE.bilingual(e4.getLabel(), lang);
                    $this$build_u24lambda_u243.append("• " + fmt.format(new Date(e4.getTs())) + " — " + shown2 + " [" + e4.getKind() + "]").append('\n');
                    $i$f$forEach = $i$f$forEach;
                }
                String lines2 = $this$build_u24lambda_u243.toString();
                return StringsKt.trim((CharSequence) lines2).toString();
            case 2:
                moods2 = (List) anonymousClass1.L$3;
                fmt = (SimpleDateFormat) anonymousClass1.L$2;
                name = (String) anonymousClass1.L$1;
                familySummaryActivity = (FamilySummaryActivity) anonymousClass1.L$0;
                ResultKt.throwOnFailure($result);
                objRecent = $result;
                regs = (List) objRecent;
                $this$build_u24lambda_u243 = new StringBuilder();
                $this$build_u24lambda_u243.append("SPECTRUM — resumo para família / especialista").append('\n');
                $this$build_u24lambda_u243.append("Isto não é diagnóstico nem laudo.").append('\n');
                $this$build_u24lambda_u243.append('\n');
                $this$build_u24lambda_u243.append("Quem: " + name).append('\n');
                $this$build_u24lambda_u243.append("Comunicação: " + UserPrefs.INSTANCE.communicationLabel(familySummaryActivity)).append('\n');
                $this$build_u24lambda_u243.append("Apoio no cotidiano: " + UserPrefs.INSTANCE.supportLabel(familySummaryActivity)).append('\n');
                $this$build_u24lambda_u243.append(CidAdapt.INSTANCE.line(familySummaryActivity)).append('\n');
                $this$build_u24lambda_u243.append("CIDs informados por quem já tem diagnóstico. O Spectrum não emite laudo.").append('\n');
                $this$build_u24lambda_u243.append('\n');
                $this$build_u24lambda_u243.append("Últimos toques (humor / estado):").append('\n');
                if (moods2.isEmpty()) {
                    $this$build_u24lambda_u243.append("— ainda sem registro").append('\n');
                }
                lang = AacBoard.INSTANCE.resolveLang(familySummaryActivity);
                List $this$forEach$iv5 = moods2;
                while (r14.hasNext()) {
                    MoodEvent e5 = (MoodEvent) element$iv;
                    label = e5.getLabel();
                    if (label == null) {
                        label = "registro";
                    }
                    String raw5 = label;
                    AnonymousClass1 anonymousClass4 = anonymousClass1;
                    String str3 = fmt.format(new Date(e5.getTs()));
                    String strBilingual3 = AacBoard.INSTANCE.bilingual(raw5, lang);
                    String raw6 = e5.getSource();
                    $this$build_u24lambda_u243.append("• " + str3 + " — " + strBilingual3 + " (" + raw6 + ")").append('\n');
                    anonymousClass1 = anonymousClass4;
                    $result = $result;
                }
                $this$build_u24lambda_u243.append('\n');
                $this$build_u24lambda_u243.append("Regulação / necessidades (pausa, dor, ajuda…):").append('\n');
                if (regs.isEmpty()) {
                    $this$build_u24lambda_u243.append("— ainda sem registro").append('\n');
                }
                List $this$forEach$iv6 = regs;
                $i$f$forEach = 0;
                while (r2.hasNext()) {
                    RegulationEvent e6 = (RegulationEvent) element$iv2;
                    String shown3 = AacBoard.INSTANCE.bilingual(e6.getLabel(), lang);
                    $this$build_u24lambda_u243.append("• " + fmt.format(new Date(e6.getTs())) + " — " + shown3 + " [" + e6.getKind() + "]").append('\n');
                    $i$f$forEach = $i$f$forEach;
                }
                String lines3 = $this$build_u24lambda_u243.toString();
                return StringsKt.trim((CharSequence) lines3).toString();
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
