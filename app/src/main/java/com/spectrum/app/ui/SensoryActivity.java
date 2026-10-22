package com.spectrum.app.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.spectrum.app.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: SensoryActivity.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/spectrum/app/ui/SensoryActivity;", "Lcom/spectrum/app/ui/SoftActivity;", "<init>", "()V", "options", "", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class SensoryActivity extends SoftActivity {
    public static final int $stable = 8;
    private final List<String> options = CollectionsKt.listOf((Object[]) new String[]{"barulho", "luz", "cheiro", "textura", "gente perto", "fome", "dor", "calor", "imprevisto", "tela demais"});

    @Override // com.spectrum.app.ui.SoftActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensory);
        final ChipGroup group = (ChipGroup) findViewById(R.id.sensoryChips);
        Iterable $this$forEach$iv = this.options;
        for (Object element$iv : $this$forEach$iv) {
            String label = (String) element$iv;
            Chip $this$onCreate_u24lambda_u241_u24lambda_u240 = new Chip(this);
            $this$onCreate_u24lambda_u241_u24lambda_u240.setText(label);
            $this$onCreate_u24lambda_u241_u24lambda_u240.setCheckable(true);
            group.addView($this$onCreate_u24lambda_u241_u24lambda_u240);
        }
        final SeekBar bar = (SeekBar) findViewById(R.id.intensity);
        final TextView barLabel = (TextView) findViewById(R.id.intensityLabel);
        bar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.spectrum.app.ui.SensoryActivity.onCreate.2
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar s, int p, boolean fromUser) {
                barLabel.setText(String.valueOf(p));
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar s) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar s) {
            }
        });
        ((Button) findViewById(R.id.salvar)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.SensoryActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SensoryActivity.onCreate$lambda$2(group, this, bar, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(ChipGroup $group, SensoryActivity this$0, SeekBar $bar, View it) {
        List picked = new ArrayList();
        int childCount = $group.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = $group.getChildAt(i);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
            Chip chip = (Chip) childAt;
            if (chip.isChecked()) {
                picked.add(chip.getText().toString());
            }
        }
        String label = picked.isEmpty() ? "sensorial" : CollectionsKt.joinToString$default(picked, ", ", null, null, 0, null, null, 62, null);
        String notes = StringsKt.trim((CharSequence) ((EditText) this$0.findViewById(R.id.notes)).getText().toString()).toString();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new SensoryActivity$onCreate$3$1(this$0, label, $bar, notes, null), 3, null);
    }
}
