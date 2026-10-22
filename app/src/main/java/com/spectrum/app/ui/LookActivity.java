package com.spectrum.app.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spectrum.app.R;
import com.spectrum.app.data.UserPrefs;
import kotlin.Metadata;

/* JADX INFO: compiled from: LookActivity.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b"}, d2 = {"Lcom/spectrum/app/ui/LookActivity;", "Lcom/spectrum/app/ui/SoftActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class LookActivity extends SoftActivity {
    public static final int $stable = 0;

    @Override // com.spectrum.app.ui.SoftActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_look);
        ((Button) findViewById(R.id.themeSage)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.LookActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LookActivity.onCreate$pick(this.f$0, "sage");
            }
        });
        ((Button) findViewById(R.id.themeForest)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.LookActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LookActivity.onCreate$pick(this.f$0, "forest");
            }
        });
        ((Button) findViewById(R.id.themeMist)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.LookActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LookActivity.onCreate$pick(this.f$0, "mist");
            }
        });
        ((Button) findViewById(R.id.themeLinen)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.LookActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LookActivity.onCreate$pick(this.f$0, "linen");
            }
        });
        ((Button) findViewById(R.id.themeDusk)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.LookActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LookActivity.onCreate$pick(this.f$0, "dusk");
            }
        });
        ((Button) findViewById(R.id.themeClay)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.LookActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LookActivity.onCreate$pick(this.f$0, "clay");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$pick(LookActivity this$0, String id) {
        UserPrefs.INSTANCE.setVisualTheme(this$0, id);
        this$0.startActivity(new Intent(this$0, (Class<?>) MainActivity.class).addFlags(335544320));
        this$0.finish();
    }
}
