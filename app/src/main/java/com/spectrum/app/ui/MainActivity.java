package com.spectrum.app.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.spectrum.app.R;
import com.spectrum.app.data.AdaptFlags;
import com.spectrum.app.data.CidAdapt;
import com.spectrum.app.data.MoodEvent;
import com.spectrum.app.data.MoodFilter;
import com.spectrum.app.data.MoodRepository;
import com.spectrum.app.data.RegulationRepository;
import com.spectrum.app.data.UserPrefs;
import com.spectrum.app.dock.DockNotifier;
import com.spectrum.app.dock.DockPrefs;
import com.spectrum.app.dock.DockService;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: MainActivity.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u001aH\u0014J-\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u00132\u000e\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020$H\u0016¢\u0006\u0002\u0010%J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u0013H\u0002J\b\u0010(\u001a\u00020\u001aH\u0002J\b\u0010)\u001a\u00020\u001aH\u0002J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0013H\u0002J\b\u0010-\u001a\u00020\u001aH\u0002J(\u0010.\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u00020\"2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000202H\u0002J\b\u00104\u001a\u00020\u001aH\u0002J\b\u00105\u001a\u00020\u001aH\u0002J\u0010\u00106\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\"H\u0002J\u0010\u00108\u001a\u00020\u001a2\u0006\u00109\u001a\u00020\u0007H\u0002J\u0016\u0010:\u001a\u00020\u001a2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<H\u0002J\b\u0010>\u001a\u00020\u001aH\u0002J\b\u0010?\u001a\u00020@H\u0002J\u0010\u0010A\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020\u0015H\u0002J\b\u0010C\u001a\u00020\u001aH\u0002J\b\u0010D\u001a\u00020\u001aH\u0002J\u0010\u0010E\u001a\u00020\"2\u0006\u0010F\u001a\u00020GH\u0002J\u0010\u0010H\u001a\u00020\u00132\u0006\u00101\u001a\u000202H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lcom/spectrum/app/ui/MainActivity;", "Lcom/spectrum/app/ui/SoftActivity;", "<init>", "()V", "wheel", "Lcom/spectrum/app/ui/EmotionWheelView;", "detail", "Landroid/widget/LinearLayout;", "selectedSummary", "Landroid/widget/TextView;", "registrar", "Landroid/widget/Button;", "historyContainer", "historyCount", "selected", "Ljava/util/LinkedHashSet;", "Lcom/spectrum/app/ui/EmotionWord;", "Lkotlin/collections/LinkedHashSet;", "coreIndex", "", "filter", "Lcom/spectrum/app/data/MoodFilter;", "ptBr", "Ljava/util/Locale;", "ink", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "openCore", "index", "backToWheel", "renderFocus", "chipColors", "Landroid/content/res/ColorStateList;", "base", "updateSummary", "quick", "kind", "label", "valence", "", "arousal", "register", "applyAudience", "setBoardLang", "lang", "paintAac", "board", "paintWeek", "items", "", "Lcom/spectrum/app/data/MoodEvent;", "bindDockSwitch", "ensureNotificationPermission", "", "applyFilter", "f", "confirmClear", "refresh", "relativeTime", "ts", "", "dotColor", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class MainActivity extends SoftActivity {
    public static final int $stable = 8;
    private LinearLayout detail;
    private LinearLayout historyContainer;
    private TextView historyCount;
    private Button registrar;
    private TextView selectedSummary;
    private EmotionWheelView wheel;
    private final LinkedHashSet<EmotionWord> selected = new LinkedHashSet<>();
    private int coreIndex = -1;
    private MoodFilter filter = MoodFilter.ALL;
    private final Locale ptBr = new Locale("pt", "BR");
    private final int ink = Color.parseColor("#2A2833");

    @Override // com.spectrum.app.ui.SoftActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!UserPrefs.INSTANCE.welcomeDone(this)) {
            startActivity(new Intent(this, (Class<?>) WelcomeActivity.class));
            finish();
            return;
        }
        setContentView(R.layout.activity_main);
        this.wheel = (EmotionWheelView) findViewById(R.id.wheel);
        this.detail = (LinearLayout) findViewById(R.id.detail);
        this.selectedSummary = (TextView) findViewById(R.id.selectedSummary);
        this.registrar = (Button) findViewById(R.id.registrar);
        this.historyContainer = (LinearLayout) findViewById(R.id.historyContainer);
        this.historyCount = (TextView) findViewById(R.id.historyCount);
        EmotionWheelView emotionWheelView = this.wheel;
        Button button = null;
        if (emotionWheelView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("wheel");
            emotionWheelView = null;
        }
        emotionWheelView.setOnSelectCore(new Function1() { // from class: com.spectrum.app.ui.MainActivity$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainActivity.onCreate$lambda$0(this.f$0, ((Integer) obj).intValue());
            }
        });
        Button button2 = this.registrar;
        if (button2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("registrar");
        } else {
            button = button2;
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.MainActivity$$ExternalSyntheticLambda23
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.register();
            }
        });
        ((TextView) findViewById(R.id.greeting)).setText(CareCopy.INSTANCE.greeting(this));
        applyAudience();
        ((Button) findViewById(R.id.sosButton)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.MainActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.onCreate$lambda$2(this.f$0, view);
            }
        });
        ((Button) findViewById(R.id.toolsButton)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.MainActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.onCreate$lambda$3(this.f$0, view);
            }
        });
        ((Button) findViewById(R.id.quickPause)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.MainActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.quick("pause", "Pausa", -0.2f, 0.2f);
            }
        });
        ((Button) findViewById(R.id.quickQuiet)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.MainActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.quick("quiet", "Silêncio", -0.1f, 0.15f);
            }
        });
        ((Button) findViewById(R.id.quickBattery)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.MainActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.quick("battery_low", "Bateria baixa", -0.25f, 0.25f);
            }
        });
        ((Button) findViewById(R.id.quickOkay)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.MainActivity$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.quick("okay", "Ok o suficiente", 0.2f, 0.3f);
            }
        });
        ((Chip) findViewById(R.id.chipTodos)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.MainActivity$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.onCreate$lambda$8(this.f$0, view);
            }
        });
        ((Chip) findViewById(R.id.chipFelizes)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.MainActivity$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.onCreate$lambda$9(this.f$0, view);
            }
        });
        ((Chip) findViewById(R.id.chipTristes)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.MainActivity$$ExternalSyntheticLambda21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.onCreate$lambda$10(this.f$0, view);
            }
        });
        ((Button) findViewById(R.id.limpar)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.MainActivity$$ExternalSyntheticLambda22
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.confirmClear();
            }
        });
        bindDockSwitch();
        updateSummary();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(MainActivity this$0, int it) {
        this$0.openCore(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(MainActivity this$0, View it) {
        this$0.startActivity(new Intent(this$0, (Class<?>) CrisisActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$3(MainActivity this$0, View it) {
        this$0.startActivity(new Intent(this$0, (Class<?>) ToolsActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$8(MainActivity this$0, View it) {
        this$0.applyFilter(MoodFilter.ALL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$9(MainActivity this$0, View it) {
        this$0.applyFilter(MoodFilter.POSITIVE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$10(MainActivity this$0, View it) {
        this$0.applyFilter(MoodFilter.NEGATIVE);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        refresh();
        ((MaterialSwitch) findViewById(R.id.dockSwitch)).setChecked(DockPrefs.INSTANCE.isEnabled(this));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode != 41) {
            return;
        }
        boolean ok = !(grantResults.length == 0) && grantResults[0] == 0;
        MaterialSwitch dock = (MaterialSwitch) findViewById(R.id.dockSwitch);
        if (ok) {
            dock.setChecked(true);
            DockService.INSTANCE.start(this);
        } else {
            dock.setChecked(false);
            Toast.makeText(this, "Sem permissão a notificação não aparece. Tudo bem ligar depois.", 0).show();
        }
    }

    private final void openCore(int index) {
        this.coreIndex = index;
        EmotionWheelView emotionWheelView = this.wheel;
        if (emotionWheelView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("wheel");
            emotionWheelView = null;
        }
        emotionWheelView.setVisibility(8);
        renderFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void backToWheel() {
        this.coreIndex = -1;
        LinearLayout linearLayout = this.detail;
        EmotionWheelView emotionWheelView = null;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("detail");
            linearLayout = null;
        }
        linearLayout.removeAllViews();
        EmotionWheelView emotionWheelView2 = this.wheel;
        if (emotionWheelView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("wheel");
            emotionWheelView2 = null;
        }
        emotionWheelView2.reset();
        EmotionWheelView emotionWheelView3 = this.wheel;
        if (emotionWheelView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("wheel");
        } else {
            emotionWheelView = emotionWheelView3;
        }
        emotionWheelView.setVisibility(0);
    }

    private final void renderFocus() {
        LinearLayout linearLayout = this.detail;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("detail");
            linearLayout = null;
        }
        linearLayout.removeAllViews();
        CoreEmotion core = EmotionWheel.INSTANCE.getCores().get(this.coreIndex);
        LinearLayout linearLayout2 = this.detail;
        if (linearLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("detail");
            linearLayout2 = null;
        }
        Chip $this$renderFocus_u24lambda_u2413 = new Chip(this);
        $this$renderFocus_u24lambda_u2413.setText("‹ voltar para a roda");
        $this$renderFocus_u24lambda_u2413.setCheckable(false);
        $this$renderFocus_u24lambda_u2413.setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.MainActivity$$ExternalSyntheticLambda12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.backToWheel();
            }
        });
        linearLayout2.addView($this$renderFocus_u24lambda_u2413);
        LinearLayout linearLayout3 = this.detail;
        if (linearLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("detail");
            linearLayout3 = null;
        }
        TextView $this$renderFocus_u24lambda_u2414 = new TextView(this);
        $this$renderFocus_u24lambda_u2414.setText(core.getName());
        int i = 1;
        $this$renderFocus_u24lambda_u2414.setTypeface($this$renderFocus_u24lambda_u2414.getTypeface(), 1);
        $this$renderFocus_u24lambda_u2414.setTextSize(22.0f);
        int i2 = 2;
        $this$renderFocus_u24lambda_u2414.setPadding(0, 12, 0, 2);
        linearLayout3.addView($this$renderFocus_u24lambda_u2414);
        LinearLayout linearLayout4 = this.detail;
        if (linearLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("detail");
            linearLayout4 = null;
        }
        TextView $this$renderFocus_u24lambda_u2415 = new TextView(this);
        $this$renderFocus_u24lambda_u2415.setText("Marque as palavras que combinam (pode escolher várias):");
        $this$renderFocus_u24lambda_u2415.setTextSize(13.0f);
        $this$renderFocus_u24lambda_u2415.setPadding(0, 0, 0, 4);
        linearLayout4.addView($this$renderFocus_u24lambda_u2415);
        ColorStateList chipColors = chipColors(core.getColor());
        Iterable $this$forEach$iv = core.getSecondaries();
        for (Object element$iv : $this$forEach$iv) {
            SecondaryEmotion sec = (SecondaryEmotion) element$iv;
            LinearLayout linearLayout5 = this.detail;
            if (linearLayout5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("detail");
                linearLayout5 = null;
            }
            TextView $this$renderFocus_u24lambda_u2420_u24lambda_u2416 = new TextView(this);
            $this$renderFocus_u24lambda_u2420_u24lambda_u2416.setText(sec.getName());
            $this$renderFocus_u24lambda_u2420_u24lambda_u2416.setTypeface($this$renderFocus_u24lambda_u2420_u24lambda_u2416.getTypeface(), i);
            $this$renderFocus_u24lambda_u2420_u24lambda_u2416.setTextSize(15.0f);
            $this$renderFocus_u24lambda_u2420_u24lambda_u2416.setPadding(0, 16, 0, i2);
            linearLayout5.addView($this$renderFocus_u24lambda_u2420_u24lambda_u2416);
            ChipGroup group = new ChipGroup(this);
            for (Object element$iv2 : sec.getTertiaries()) {
                final EmotionWord word = (EmotionWord) element$iv2;
                Chip $this$renderFocus_u24lambda_u2420_u24lambda_u2419_u24lambda_u2418 = new Chip(this);
                $this$renderFocus_u24lambda_u2420_u24lambda_u2419_u24lambda_u2418.setText(word.getName());
                $this$renderFocus_u24lambda_u2420_u24lambda_u2419_u24lambda_u2418.setCheckable(true);
                $this$renderFocus_u24lambda_u2420_u24lambda_u2419_u24lambda_u2418.setChecked(this.selected.contains(word));
                $this$renderFocus_u24lambda_u2420_u24lambda_u2419_u24lambda_u2418.setChipBackgroundColor(chipColors);
                $this$renderFocus_u24lambda_u2420_u24lambda_u2419_u24lambda_u2418.setTextColor(this.ink);
                $this$renderFocus_u24lambda_u2420_u24lambda_u2419_u24lambda_u2418.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.spectrum.app.ui.MainActivity$$ExternalSyntheticLambda13
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        MainActivity.renderFocus$lambda$20$lambda$19$lambda$18$lambda$17(this.f$0, word, compoundButton, z);
                    }
                });
                group.addView($this$renderFocus_u24lambda_u2420_u24lambda_u2419_u24lambda_u2418);
                core = core;
                $this$forEach$iv = $this$forEach$iv;
            }
            CoreEmotion core2 = core;
            Iterable $this$forEach$iv2 = $this$forEach$iv;
            LinearLayout linearLayout6 = this.detail;
            if (linearLayout6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("detail");
                linearLayout6 = null;
            }
            linearLayout6.addView(group);
            core = core2;
            $this$forEach$iv = $this$forEach$iv2;
            i = 1;
            i2 = 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderFocus$lambda$20$lambda$19$lambda$18$lambda$17(MainActivity this$0, EmotionWord $word, CompoundButton compoundButton, boolean on) {
        LinkedHashSet<EmotionWord> linkedHashSet = this$0.selected;
        if (on) {
            linkedHashSet.add($word);
        } else {
            linkedHashSet.remove($word);
        }
        this$0.updateSummary();
    }

    private final ColorStateList chipColors(int base) {
        int light = Color.argb(56, Color.red(base), Color.green(base), Color.blue(base));
        return new ColorStateList(new int[][]{new int[]{android.R.attr.state_checked}, new int[0]}, new int[]{base, light});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSummary() {
        Button button = null;
        if (this.selected.isEmpty()) {
            TextView textView = this.selectedSummary;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("selectedSummary");
                textView = null;
            }
            textView.setText("");
            Button button2 = this.registrar;
            if (button2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("registrar");
            } else {
                button = button2;
            }
            button.setVisibility(8);
            return;
        }
        TextView textView2 = this.selectedSummary;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectedSummary");
            textView2 = null;
        }
        textView2.setText("Selecionadas: " + CollectionsKt.joinToString$default(this.selected, ", ", null, null, 0, null, new Function1() { // from class: com.spectrum.app.ui.MainActivity$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainActivity.updateSummary$lambda$21((EmotionWord) obj);
            }
        }, 30, null));
        Button button3 = this.registrar;
        if (button3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("registrar");
            button3 = null;
        }
        button3.setText("Registrar (" + this.selected.size() + ")");
        Button button4 = this.registrar;
        if (button4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("registrar");
        } else {
            button = button4;
        }
        button.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence updateSummary$lambda$21(EmotionWord it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getName();
    }

    /* JADX INFO: renamed from: com.spectrum.app.ui.MainActivity$quick$1, reason: invalid class name */
    /* JADX INFO: compiled from: MainActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.spectrum.app.ui.MainActivity$quick$1", f = "MainActivity.kt", i = {}, l = {ComposerKt.reuseKey, 214}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ float $arousal;
        final /* synthetic */ String $kind;
        final /* synthetic */ String $label;
        final /* synthetic */ float $valence;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, String str2, float f, float f2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$kind = str;
            this.$label = str2;
            this.$valence = f;
            this.$arousal = f2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MainActivity.this.new AnonymousClass1(this.$kind, this.$label, this.$valence, this.$arousal, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0083 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:16:0x00af  */
        /* JADX WARN: Code duplicated, block: B:19:0x00c2  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    String str = UserPrefs.INSTANCE.communicationLabel(MainActivity.this) + " · " + UserPrefs.INSTANCE.supportLabel(MainActivity.this);
                    this.label = 1;
                    if (RegulationRepository.INSTANCE.log(MainActivity.this, this.$kind, this.$label, (200 & 8) != 0 ? 0 : 0, (200 & 16) != 0 ? -1 : 0, (200 & 32) != 0 ? -1 : 0, (200 & 64) != 0 ? "" : str, (200 & 128) != 0 ? "app" : "app", this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.label = 2;
                    if (MoodRepository.INSTANCE.log(MainActivity.this, this.$valence, this.$arousal, this.$label, "app", this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Toast.makeText(MainActivity.this, CareCopy.INSTANCE.afterQuick(MainActivity.this, this.$kind), 0).show();
                    MainActivity.this.refresh();
                    if (DockPrefs.INSTANCE.isEnabled(MainActivity.this)) {
                        DockNotifier.INSTANCE.refreshAsync(MainActivity.this);
                    }
                    if (Intrinsics.areEqual(this.$kind, "help")) {
                        MainActivity.this.startActivity(new Intent(MainActivity.this, (Class<?>) CrisisActivity.class));
                    }
                    return Unit.INSTANCE;
                case 1:
                    ResultKt.throwOnFailure($result);
                    this.label = 2;
                    if (MoodRepository.INSTANCE.log(MainActivity.this, this.$valence, this.$arousal, this.$label, "app", this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Toast.makeText(MainActivity.this, CareCopy.INSTANCE.afterQuick(MainActivity.this, this.$kind), 0).show();
                    MainActivity.this.refresh();
                    if (DockPrefs.INSTANCE.isEnabled(MainActivity.this)) {
                        DockNotifier.INSTANCE.refreshAsync(MainActivity.this);
                    }
                    if (Intrinsics.areEqual(this.$kind, "help")) {
                        MainActivity.this.startActivity(new Intent(MainActivity.this, (Class<?>) CrisisActivity.class));
                    }
                    return Unit.INSTANCE;
                case 2:
                    ResultKt.throwOnFailure($result);
                    Toast.makeText(MainActivity.this, CareCopy.INSTANCE.afterQuick(MainActivity.this, this.$kind), 0).show();
                    MainActivity.this.refresh();
                    if (DockPrefs.INSTANCE.isEnabled(MainActivity.this)) {
                        DockNotifier.INSTANCE.refreshAsync(MainActivity.this);
                    }
                    if (Intrinsics.areEqual(this.$kind, "help")) {
                        MainActivity.this.startActivity(new Intent(MainActivity.this, (Class<?>) CrisisActivity.class));
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void quick(String kind, String label, float valence, float arousal) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(kind, label, valence, arousal, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void register() {
        if (this.selected.isEmpty()) {
            return;
        }
        Iterable words = CollectionsKt.toList(this.selected);
        Iterable $this$map$iv = words;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            EmotionWord it = (EmotionWord) item$iv$iv;
            destination$iv$iv.add(Float.valueOf(it.getValence()));
        }
        float valence = (float) CollectionsKt.averageOfFloat((List) destination$iv$iv);
        Iterable $this$map$iv2 = words;
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv2, 10));
        for (Object item$iv$iv2 : $this$map$iv2) {
            EmotionWord it2 = (EmotionWord) item$iv$iv2;
            destination$iv$iv2.add(Float.valueOf(it2.getArousal()));
        }
        float arousal = (float) CollectionsKt.averageOfFloat((List) destination$iv$iv2);
        String label = CollectionsKt.joinToString$default(words, ", ", null, null, 0, null, new Function1() { // from class: com.spectrum.app.ui.MainActivity$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainActivity.register$lambda$24((EmotionWord) obj);
            }
        }, 30, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C01811(valence, arousal, label, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence register$lambda$24(EmotionWord it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getName();
    }

    /* JADX INFO: renamed from: com.spectrum.app.ui.MainActivity$register$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: MainActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.spectrum.app.ui.MainActivity$register$1", f = "MainActivity.kt", i = {}, l = {230}, m = "invokeSuspend", n = {}, s = {})
    static final class C01811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ float $arousal;
        final /* synthetic */ String $label;
        final /* synthetic */ float $valence;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01811(float f, float f2, String str, Continuation<? super C01811> continuation) {
            super(2, continuation);
            this.$valence = f;
            this.$arousal = f2;
            this.$label = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MainActivity.this.new C01811(this.$valence, this.$arousal, this.$label, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C01811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (MoodRepository.INSTANCE.log(MainActivity.this, this.$valence, this.$arousal, this.$label, "app", this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MainActivity.this.selected.clear();
            MainActivity.this.backToWheel();
            MainActivity.this.updateSummary();
            Toast.makeText(MainActivity.this, "Registrado: " + this.$label, 0).show();
            MainActivity.this.refresh();
            if (DockPrefs.INSTANCE.isEnabled(MainActivity.this)) {
                DockNotifier.INSTANCE.refreshAsync(MainActivity.this);
            }
            return Unit.INSTANCE;
        }
    }

    private final void applyAudience() {
        int extra;
        String strTitle;
        AdaptFlags flags = CidAdapt.INSTANCE.flags(this);
        boolean child = UserPrefs.INSTANCE.isChild(this);
        boolean nonverbal = true;
        boolean simple = UserPrefs.INSTANCE.isSimple(this) || flags.getShortWords();
        if (!UserPrefs.INSTANCE.isNonverbalUi(this) && !flags.getAacBoard()) {
            nonverbal = false;
        }
        boolean calm = UserPrefs.INSTANCE.calmScreen(this);
        findViewById(R.id.kidFeelTitle).setVisibility((!simple || nonverbal) ? 8 : 0);
        ChipGroup group = (ChipGroup) findViewById(R.id.kidFeelings);
        group.setVisibility((!simple || nonverbal) ? 8 : 0);
        if (!simple || nonverbal || group.getChildCount() != 0) {
            extra = 0;
        } else {
            Iterable $this$forEach$iv = KidFeelings.INSTANCE.getAll();
            int $i$f$forEach = 0;
            for (Object element$iv : $this$forEach$iv) {
                final KidFeelings.Feeling feel = (KidFeelings.Feeling) element$iv;
                Chip $this$applyAudience_u24lambda_u2427_u24lambda_u2426 = new Chip(this);
                $this$applyAudience_u24lambda_u2427_u24lambda_u2426.setText(feel.getEmoji() + " " + feel.getName());
                $this$applyAudience_u24lambda_u2427_u24lambda_u2426.setCheckable(false);
                $this$applyAudience_u24lambda_u2427_u24lambda_u2426.setMinHeight(48);
                $this$applyAudience_u24lambda_u2427_u24lambda_u2426.setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.MainActivity$$ExternalSyntheticLambda11
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MainActivity.applyAudience$lambda$27$lambda$26$lambda$25(this.f$0, feel, view);
                    }
                });
                group.addView($this$applyAudience_u24lambda_u2427_u24lambda_u2426);
                $this$forEach$iv = $this$forEach$iv;
                $i$f$forEach = $i$f$forEach;
            }
            extra = 0;
        }
        LinearLayout board = (LinearLayout) findViewById(R.id.aacBoard);
        View langRow = findViewById(R.id.boardLangRow);
        board.setVisibility(nonverbal ? extra : 8);
        langRow.setVisibility(nonverbal ? extra : 8);
        if (nonverbal) {
            Intrinsics.checkNotNull(board);
            paintAac(board);
            ((Button) findViewById(R.id.langPt)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.MainActivity$$ExternalSyntheticLambda16
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.setBoardLang("pt");
                }
            });
            ((Button) findViewById(R.id.langEn)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.MainActivity$$ExternalSyntheticLambda17
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.setBoardLang("en");
                }
            });
            ((Button) findViewById(R.id.langEs)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.MainActivity$$ExternalSyntheticLambda18
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.setBoardLang("es");
                }
            });
        }
        TextView $this$applyAudience_u24lambda_u2431 = (TextView) findViewById(R.id.kidFeelTitle);
        $this$applyAudience_u24lambda_u2431.setVisibility((nonverbal || simple) ? extra : 8);
        if (nonverbal) {
            strTitle = AacBoard.INSTANCE.title(AacBoard.INSTANCE.resolveLang(this));
        }
        $this$applyAudience_u24lambda_u2431.setText(strTitle);
        findViewById(R.id.wheelCard).setVisibility((child || nonverbal || calm || flags.getHideWheel()) ? 8 : extra);
        ((Button) findViewById(R.id.sosButton)).setText((child || nonverbal) ? "Ajuda agora" : "Preciso de ajuda agora");
        ((Button) findViewById(R.id.quickBattery)).setText((child || nonverbal) ? "Pouca energia" : "Bateria baixa");
        ((Button) findViewById(R.id.quickOkay)).setText((child || nonverbal) ? "Estou ok" : "Ok o suficiente");
        if (calm) {
            extra = 8;
        }
        findViewById(R.id.weekTitle).setVisibility(extra);
        findViewById(R.id.weekStrip).setVisibility(extra);
        findViewById(R.id.filterChips).setVisibility(extra);
        findViewById(R.id.historyCount).setVisibility(extra);
        findViewById(R.id.historyContainer).setVisibility(extra);
        findViewById(R.id.limpar).setVisibility(extra);
        MaterialSwitch calmSwitch = (MaterialSwitch) findViewById(R.id.calmSwitch);
        calmSwitch.setOnCheckedChangeListener(null);
        calmSwitch.setChecked(calm);
        calmSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.spectrum.app.ui.MainActivity$$ExternalSyntheticLambda19
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MainActivity.applyAudience$lambda$32(this.f$0, compoundButton, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyAudience$lambda$27$lambda$26$lambda$25(MainActivity this$0, KidFeelings.Feeling $feel, View it) {
        this$0.quick("feel", $feel.getName(), $feel.getValence(), $feel.getArousal());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyAudience$lambda$32(MainActivity this$0, CompoundButton compoundButton, boolean on) {
        UserPrefs.INSTANCE.setCalmScreen(this$0, on);
        this$0.applyAudience();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBoardLang(String lang) {
        UserPrefs.INSTANCE.setBoardLang(this, lang);
        applyAudience();
    }

    private final void paintAac(LinearLayout board) {
        board.removeAllViews();
        String lang = AacBoard.INSTANCE.resolveLang(this);
        List<AacBoard.Tile> tiles = AacBoard.INSTANCE.getTiles();
        int i = 0;
        while (i < tiles.size()) {
            LinearLayout row = new LinearLayout(this);
            row.setOrientation(0);
            row.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            int i2 = 0;
            while (i2 < 2) {
                if (i < tiles.size()) {
                    int i3 = i + 1;
                    final AacBoard.Tile tile = tiles.get(i);
                    String shown = AacBoard.INSTANCE.label(tile.getKey(), lang);
                    Button $this$paintAac_u24lambda_u2437_u24lambda_u2436 = new Button(this);
                    $this$paintAac_u24lambda_u2437_u24lambda_u2436.setText(tile.getEmoji() + "\n" + shown);
                    $this$paintAac_u24lambda_u2437_u24lambda_u2436.setTextSize(16.0f);
                    $this$paintAac_u24lambda_u2437_u24lambda_u2436.setMinHeight((int) (96 * $this$paintAac_u24lambda_u2437_u24lambda_u2436.getResources().getDisplayMetrics().density));
                    $this$paintAac_u24lambda_u2437_u24lambda_u2436.setBackgroundResource(R.drawable.tile_bg);
                    $this$paintAac_u24lambda_u2437_u24lambda_u2436.setTextColor(Color.parseColor("#1A1C18"));
                    LinearLayout.LayoutParams $this$paintAac_u24lambda_u2437_u24lambda_u2436_u24lambda_u2434 = new LinearLayout.LayoutParams(0, -2, 1.0f);
                    $this$paintAac_u24lambda_u2437_u24lambda_u2436_u24lambda_u2434.setMargins(6, 6, 6, 6);
                    $this$paintAac_u24lambda_u2437_u24lambda_u2436.setLayoutParams($this$paintAac_u24lambda_u2437_u24lambda_u2436_u24lambda_u2434);
                    $this$paintAac_u24lambda_u2437_u24lambda_u2436.setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.MainActivity$$ExternalSyntheticLambda0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            MainActivity.paintAac$lambda$37$lambda$36$lambda$35(this.f$0, tile, view);
                        }
                    });
                    $this$paintAac_u24lambda_u2437_u24lambda_u2436.setContentDescription(AacBoard.INSTANCE.bilingual(tile.getKey(), lang));
                    row.addView($this$paintAac_u24lambda_u2437_u24lambda_u2436);
                    i = i3;
                }
                i2++;
                tiles = tiles;
            }
            board.addView(row);
            tiles = tiles;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void paintAac$lambda$37$lambda$36$lambda$35(MainActivity this$0, AacBoard.Tile $tile, View it) {
        this$0.quick($tile.getKind(), $tile.getKey(), $tile.getValence(), $tile.getArousal());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void paintWeek(List<MoodEvent> items) {
        LinearLayout strip = (LinearLayout) findViewById(R.id.weekStrip);
        strip.removeAllViews();
        int i = 1;
        int i2 = 6;
        String[] days = {"D", "S", "T", "Q", "Q", "S", "S"};
        Calendar cal = Calendar.getInstance();
        cal.get(6);
        cal.get(1);
        List<MoodEvent> $this$map$iv = items;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            MoodEvent it = (MoodEvent) item$iv$iv;
            Calendar $this$paintWeek_u24lambda_u2439_u24lambda_u2438 = Calendar.getInstance();
            $this$paintWeek_u24lambda_u2439_u24lambda_u2438.setTimeInMillis(it.getTs());
            destination$iv$iv.add(TuplesKt.to(Integer.valueOf($this$paintWeek_u24lambda_u2439_u24lambda_u2438.get(1)), Integer.valueOf($this$paintWeek_u24lambda_u2439_u24lambda_u2438.get(6))));
            days = days;
        }
        String[] days2 = days;
        Set daysAgoWithLog = CollectionsKt.toSet((List) destination$iv$iv);
        int ago = 6;
        while (-1 < ago) {
            Calendar c = Calendar.getInstance();
            c.add(i2, -ago);
            Pair key = TuplesKt.to(Integer.valueOf(c.get(i)), Integer.valueOf(c.get(i2)));
            boolean filled = daysAgoWithLog.contains(key);
            LinearLayout $this$paintWeek_u24lambda_u2441 = new LinearLayout(this);
            $this$paintWeek_u24lambda_u2441.setOrientation(i);
            $this$paintWeek_u24lambda_u2441.setGravity(i);
            Set daysAgoWithLog2 = daysAgoWithLog;
            $this$paintWeek_u24lambda_u2441.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            View $this$paintWeek_u24lambda_u2443 = new View(this);
            int size = (int) (14 * $this$paintWeek_u24lambda_u2443.getResources().getDisplayMetrics().density);
            LinearLayout.LayoutParams $this$paintWeek_u24lambda_u2443_u24lambda_u2442 = new LinearLayout.LayoutParams(size, size);
            Calendar cal2 = cal;
            $this$paintWeek_u24lambda_u2443_u24lambda_u2442.gravity = 1;
            $this$paintWeek_u24lambda_u2443.setLayoutParams($this$paintWeek_u24lambda_u2443_u24lambda_u2442);
            $this$paintWeek_u24lambda_u2443.setBackgroundResource(R.drawable.dot_circle);
            $this$paintWeek_u24lambda_u2443.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(filled ? "#3E8E6E" : "#D5DDD0")));
            TextView $this$paintWeek_u24lambda_u2444 = new TextView(this);
            $this$paintWeek_u24lambda_u2444.setText(days2[c.get(7) - 1]);
            $this$paintWeek_u24lambda_u2444.setTextSize(11.0f);
            $this$paintWeek_u24lambda_u2444.setGravity(17);
            $this$paintWeek_u24lambda_u2444.setTextColor(Color.parseColor("#43483E"));
            $this$paintWeek_u24lambda_u2441.addView($this$paintWeek_u24lambda_u2443);
            $this$paintWeek_u24lambda_u2441.addView($this$paintWeek_u24lambda_u2444);
            strip.addView($this$paintWeek_u24lambda_u2441);
            ago--;
            i = 1;
            daysAgoWithLog = daysAgoWithLog2;
            cal = cal2;
            i2 = 6;
        }
    }

    private final void bindDockSwitch() {
        final MaterialSwitch dock = (MaterialSwitch) findViewById(R.id.dockSwitch);
        dock.setChecked(DockPrefs.INSTANCE.isEnabled(this));
        dock.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.spectrum.app.ui.MainActivity$$ExternalSyntheticLambda14
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MainActivity.bindDockSwitch$lambda$45(this.f$0, dock, compoundButton, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindDockSwitch$lambda$45(MainActivity this$0, MaterialSwitch $dock, CompoundButton compoundButton, boolean on) {
        if (on) {
            if (!this$0.ensureNotificationPermission()) {
                $dock.setChecked(false);
                return;
            } else {
                DockService.INSTANCE.start(this$0);
                Toast.makeText(this$0, "Atalho quieto ligado. Sem pergunta periódica.", 0).show();
                return;
            }
        }
        DockService.INSTANCE.stop(this$0);
    }

    private final boolean ensureNotificationPermission() {
        if (Build.VERSION.SDK_INT < 33) {
            return true;
        }
        boolean granted = ContextCompat.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") == 0;
        if (!granted) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.POST_NOTIFICATIONS"}, 41);
        }
        return granted;
    }

    private final void applyFilter(MoodFilter f) {
        this.filter = f;
        refresh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void confirmClear() {
        new AlertDialog.Builder(this).setTitle("Apagar tudo?").setMessage("Isso apaga todos os registros. Não dá para desfazer.").setPositiveButton("Apagar", new DialogInterface.OnClickListener() { // from class: com.spectrum.app.ui.MainActivity$$ExternalSyntheticLambda9
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.confirmClear$lambda$46(this.f$0, dialogInterface, i);
            }
        }).setNegativeButton("Cancelar", (DialogInterface.OnClickListener) null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void confirmClear$lambda$46(MainActivity this$0, DialogInterface dialogInterface, int i) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new MainActivity$confirmClear$1$1(this$0, null), 3, null);
    }

    /* JADX INFO: renamed from: com.spectrum.app.ui.MainActivity$refresh$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: MainActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.spectrum.app.ui.MainActivity$refresh$1", f = "MainActivity.kt", i = {}, l = {437}, m = "invokeSuspend", n = {}, s = {})
    static final class C01801 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C01801(Continuation<? super C01801> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MainActivity.this.new C01801(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C01801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:49:0x013d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objHistory = MoodRepository.INSTANCE.history(MainActivity.this, MainActivity.this.filter, this);
                    if (objHistory == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = objHistory;
                    break;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List items = (List) $result;
            MainActivity.this.paintWeek(items);
            TextView textView = MainActivity.this.historyCount;
            LinearLayout linearLayout = null;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("historyCount");
                textView = null;
            }
            textView.setText(items.size() + " registro(s)");
            LinearLayout linearLayout2 = MainActivity.this.historyContainer;
            if (linearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("historyContainer");
                linearLayout2 = null;
            }
            linearLayout2.removeAllViews();
            if (items.isEmpty()) {
                LinearLayout linearLayout3 = MainActivity.this.historyContainer;
                if (linearLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("historyContainer");
                } else {
                    linearLayout = linearLayout3;
                }
                TextView $this$invokeSuspend_u24lambda_u240 = new TextView(MainActivity.this);
                $this$invokeSuspend_u24lambda_u240.setText("Nada aqui ainda. Um toque acima já conta 💛");
                $this$invokeSuspend_u24lambda_u240.setPadding(0, 8, 0, 8);
                linearLayout.addView($this$invokeSuspend_u24lambda_u240);
            } else {
                LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
                List $this$forEach$iv = items;
                MainActivity mainActivity = MainActivity.this;
                for (Object element$iv : $this$forEach$iv) {
                    MoodEvent e = (MoodEvent) element$iv;
                    int i = R.layout.item_history;
                    LinearLayout linearLayout4 = mainActivity.historyContainer;
                    if (linearLayout4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("historyContainer");
                        linearLayout4 = null;
                    }
                    View card = inflater.inflate(i, (ViewGroup) linearLayout4, false);
                    TextView textView2 = (TextView) card.findViewById(R.id.emotion);
                    String label = e.getLabel();
                    if (label == null) {
                        label = "—";
                    }
                    textView2.setText(label);
                    ((TextView) card.findViewById(R.id.time)).setText(mainActivity.relativeTime(e.getTs()));
                    TextView textView3 = (TextView) card.findViewById(R.id.sourceTag);
                    switch (e.getSource()) {
                        case "widget":
                            str = "widget";
                            break;
                        case "dock":
                            str = "atalho";
                            break;
                        case "dock-igual":
                            str = "igual";
                            break;
                        default:
                            str = "";
                            break;
                    }
                    textView3.setText(str);
                    card.findViewById(R.id.dot).setBackgroundTintList(ColorStateList.valueOf(mainActivity.dotColor(e.getValence())));
                    LinearLayout linearLayout5 = mainActivity.historyContainer;
                    if (linearLayout5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("historyContainer");
                        linearLayout5 = null;
                    }
                    linearLayout5.addView(card);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refresh() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C01801(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String relativeTime(long ts) {
        String hm = new SimpleDateFormat("HH:mm", this.ptBr).format(new Date(ts));
        Calendar now = Calendar.getInstance();
        Calendar then = Calendar.getInstance();
        then.setTimeInMillis(ts);
        Intrinsics.checkNotNull(now);
        Intrinsics.checkNotNull(then);
        if (relativeTime$sameDay(now, then)) {
            return "hoje " + hm;
        }
        now.add(6, -1);
        if (relativeTime$sameDay(now, then)) {
            return "ontem " + hm;
        }
        String str = new SimpleDateFormat("dd/MM HH:mm", this.ptBr).format(new Date(ts));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private static final boolean relativeTime$sameDay(Calendar a, Calendar b) {
        return a.get(1) == b.get(1) && a.get(6) == b.get(6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dotColor(float valence) {
        if (valence > 0.15f) {
            return Color.parseColor("#2F9E8C");
        }
        return valence < -0.15f ? Color.parseColor("#7E9CE0") : Color.parseColor("#B7B4C4");
    }
}
