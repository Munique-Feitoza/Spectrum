package com.spectrum.app.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spectrum.app.R;
import com.spectrum.app.data.AdaptFlags;
import com.spectrum.app.data.CidAdapt;
import com.spectrum.app.data.UserPrefs;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: ToolsActivity.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\u0014\u0010\b\u001a\u00020\u00052\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u000e"}, d2 = {"Lcom/spectrum/app/ui/ToolsActivity;", "Lcom/spectrum/app/ui/SoftActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "open", "target", "Ljava/lang/Class;", "openScale", "code", "", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ToolsActivity extends SoftActivity {
    public static final int $stable = 0;

    @Override // com.spectrum.app.ui.SoftActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools);
        ((Button) findViewById(R.id.toolSensory)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.ToolsActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.open(SensoryActivity.class);
            }
        });
        ((Button) findViewById(R.id.toolBattery)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.ToolsActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.open(BatteryActivity.class);
            }
        });
        ((Button) findViewById(R.id.toolOverload)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.ToolsActivity$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.open(OverloadPlanActivity.class);
            }
        });
        ((Button) findViewById(R.id.toolRpd)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.ToolsActivity$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.open(RpdActivity.class);
            }
        });
        ((Button) findViewById(R.id.toolActivation)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.ToolsActivity$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.open(ActivationActivity.class);
            }
        });
        ((Button) findViewById(R.id.toolAbc)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.ToolsActivity$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.open(AbcActivity.class);
            }
        });
        ((Button) findViewById(R.id.toolPhq9)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.ToolsActivity$$ExternalSyntheticLambda10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.openScale("PHQ9");
            }
        });
        ((Button) findViewById(R.id.toolGad7)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.ToolsActivity$$ExternalSyntheticLambda11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.openScale("GAD7");
            }
        });
        ((Button) findViewById(R.id.toolSafety)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.ToolsActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.open(SafetyPlanActivity.class);
            }
        });
        ((Button) findViewById(R.id.toolWelcome)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.ToolsActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToolsActivity.onCreate$lambda$9(this.f$0, view);
            }
        });
        ((Button) findViewById(R.id.toolLook)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.ToolsActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.open(LookActivity.class);
            }
        });
        ((Button) findViewById(R.id.toolFamily)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.ToolsActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToolsActivity.onCreate$lambda$11(this.f$0, view);
            }
        });
        AdaptFlags flags = CidAdapt.INSTANCE.flags(this);
        if (UserPrefs.INSTANCE.isChild(this) || flags.getHideScales()) {
            Iterable $this$forEach$iv = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.id.toolRpd), Integer.valueOf(R.id.toolPhq9), Integer.valueOf(R.id.toolGad7)});
            for (Object element$iv : $this$forEach$iv) {
                int id = ((Number) element$iv).intValue();
                ((Button) findViewById(id)).setVisibility(8);
            }
        }
        if (flags.getSensoryFirst()) {
            ((Button) findViewById(R.id.toolSensory)).setText("Sensorial (primeiro)");
        }
        if (flags.getActivationHint()) {
            ((Button) findViewById(R.id.toolActivation)).setText("O que deu para fazer hoje");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$9(ToolsActivity this$0, View it) {
        this$0.startActivity(new Intent(this$0, (Class<?>) WelcomeActivity.class).putExtra(WelcomeActivity.EXTRA_EDIT, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$11(ToolsActivity this$0, View it) {
        this$0.startActivity(new Intent(this$0, (Class<?>) FamilySummaryActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void open(Class<?> target) {
        startActivity(new Intent(this, target));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openScale(String code) {
        startActivity(new Intent(this, (Class<?>) ScaleActivity.class).putExtra(ScaleActivity.EXTRA_SCALE, code));
    }
}
