package com.spectrum.app.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.spectrum.app.R;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: BatteryActivity.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¨\u0006\f"}, d2 = {"Lcom/spectrum/app/ui/BatteryActivity;", "Lcom/spectrum/app/ui/SoftActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "bind", "barId", "", "labelId", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class BatteryActivity extends SoftActivity {
    public static final int $stable = 0;

    @Override // com.spectrum.app.ui.SoftActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battery);
        bind(R.id.social, R.id.socialLabel);
        bind(R.id.body, R.id.bodyLabel);
        ((Button) findViewById(R.id.salvar)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.BatteryActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BatteryActivity.onCreate$lambda$0(this.f$0, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(BatteryActivity this$0, View it) {
        int social = ((SeekBar) this$0.findViewById(R.id.social)).getProgress();
        int body = ((SeekBar) this$0.findViewById(R.id.body)).getProgress();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new BatteryActivity$onCreate$1$1(this$0, social, body, null), 3, null);
    }

    private final void bind(int barId, int labelId) {
        SeekBar bar = (SeekBar) findViewById(barId);
        final TextView label = (TextView) findViewById(labelId);
        bar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.spectrum.app.ui.BatteryActivity.bind.1
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar s, int p, boolean fromUser) {
                label.setText(p + " / 10");
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar s) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar s) {
            }
        });
    }
}
