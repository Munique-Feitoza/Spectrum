package com.spectrum.app.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.spectrum.app.R;
import com.spectrum.app.data.CidAdapt;
import com.spectrum.app.data.CidCatalog;
import com.spectrum.app.data.CidItem;
import com.spectrum.app.data.Communication;
import com.spectrum.app.data.SupportLevel;
import com.spectrum.app.data.UseMode;
import com.spectrum.app.data.UserPrefs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: WelcomeActivity.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\t"}, d2 = {"Lcom/spectrum/app/ui/WelcomeActivity;", "Lcom/spectrum/app/ui/SoftActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class WelcomeActivity extends SoftActivity {
    public static final int $stable = 0;
    public static final String EXTRA_EDIT = "edit";

    /* JADX INFO: compiled from: WelcomeActivity.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[UseMode.values().length];
            try {
                iArr[UseMode.ADULT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[UseMode.SIMPLE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[UseMode.CHILD.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Communication.values().length];
            try {
                iArr2[Communication.FEW_WORDS.ordinal()] = 1;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr2[Communication.AAC.ordinal()] = 2;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr2[Communication.NONVERBAL.ordinal()] = 3;
            } catch (NoSuchFieldError e6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[SupportLevel.values().length];
            try {
                iArr3[SupportLevel.A1.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr3[SupportLevel.A2.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr3[SupportLevel.A3.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @Override // com.spectrum.app.ui.SoftActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        int i;
        int i2;
        Iterable savedCids;
        Iterable $this$filter$iv;
        boolean z;
        Iterable $this$forEach$iv;
        boolean z2;
        super.onCreate(savedInstanceState);
        boolean z3 = true;
        if (UserPrefs.INSTANCE.welcomeDone(this)) {
            Intent intent = getIntent();
            if (!(intent != null && intent.getBooleanExtra(EXTRA_EDIT, false))) {
                startActivity(new Intent(this, (Class<?>) MainActivity.class));
                finish();
                return;
            }
        }
        setContentView(R.layout.activity_welcome);
        switch (WhenMappings.$EnumSwitchMapping$0[UserPrefs.INSTANCE.mode(this).ordinal()]) {
            case 1:
                ((RadioGroup) findViewById(R.id.who)).check(R.id.whoAdult);
                break;
            case 2:
                ((RadioGroup) findViewById(R.id.who)).check(R.id.whoSimple);
                break;
            case 3:
                ((RadioGroup) findViewById(R.id.who)).check(R.id.whoChild);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        ((EditText) findViewById(R.id.trustName)).setText(UserPrefs.INSTANCE.trustName(this));
        ((EditText) findViewById(R.id.trustPhone)).setText(UserPrefs.INSTANCE.trustPhone(this));
        ((EditText) findViewById(R.id.personName)).setText(UserPrefs.INSTANCE.personName(this));
        Iterable savedCids2 = UserPrefs.INSTANCE.cids(this);
        ChipGroup cidGroup = (ChipGroup) findViewById(R.id.cidChips);
        Iterable $this$forEach$iv2 = CidCatalog.INSTANCE.getCommon();
        for (Object element$iv : $this$forEach$iv2) {
            CidItem item = (CidItem) element$iv;
            Chip $this$onCreate_u24lambda_u242_u24lambda_u241 = new Chip(this);
            $this$onCreate_u24lambda_u242_u24lambda_u241.setText(item.getCode() + " · " + item.getLabel());
            $this$onCreate_u24lambda_u242_u24lambda_u241.setCheckable(z3);
            Iterable $this$any$iv = savedCids2;
            if (($this$any$iv instanceof Collection) && ((Collection) $this$any$iv).isEmpty()) {
                $this$forEach$iv = $this$forEach$iv2;
                z2 = false;
            } else {
                Iterator it = $this$any$iv.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        $this$forEach$iv = $this$forEach$iv2;
                        z2 = false;
                        break;
                    }
                    Object element$iv2 = it.next();
                    String it2 = (String) element$iv2;
                    Iterable $this$any$iv2 = $this$any$iv;
                    $this$forEach$iv = $this$forEach$iv2;
                    if (StringsKt.equals(it2, item.getCode(), true)) {
                        z2 = true;
                        break;
                    } else {
                        $this$any$iv = $this$any$iv2;
                        $this$forEach$iv2 = $this$forEach$iv;
                    }
                }
            }
            $this$onCreate_u24lambda_u242_u24lambda_u241.setChecked(z2);
            $this$onCreate_u24lambda_u242_u24lambda_u241.setMinHeight(48);
            cidGroup.addView($this$onCreate_u24lambda_u242_u24lambda_u241);
            $this$forEach$iv2 = $this$forEach$iv;
            z3 = true;
        }
        Iterable $this$filter$iv2 = savedCids2;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv2) {
            String code = (String) element$iv$iv;
            Iterable $this$none$iv = CidCatalog.INSTANCE.getCommon();
            if (($this$none$iv instanceof Collection) && ((Collection) $this$none$iv).isEmpty()) {
                savedCids = savedCids2;
                $this$filter$iv = $this$filter$iv2;
                z = true;
            } else {
                Iterator it3 = $this$none$iv.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        Object element$iv3 = it3.next();
                        CidItem it4 = (CidItem) element$iv3;
                        savedCids = savedCids2;
                        $this$filter$iv = $this$filter$iv2;
                        if (StringsKt.equals(it4.getCode(), code, true)) {
                            z = false;
                        } else {
                            savedCids2 = savedCids;
                            $this$filter$iv2 = $this$filter$iv;
                        }
                    } else {
                        savedCids = savedCids2;
                        $this$filter$iv = $this$filter$iv2;
                        z = true;
                    }
                }
            }
            if (z) {
                destination$iv$iv.add(element$iv$iv);
            }
            savedCids2 = savedCids;
            $this$filter$iv2 = $this$filter$iv;
        }
        List extras = (List) destination$iv$iv;
        ((EditText) findViewById(R.id.cidExtra)).setText(CollectionsKt.joinToString$default(extras, ", ", null, null, 0, null, null, 62, null));
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.comm);
        switch (WhenMappings.$EnumSwitchMapping$1[UserPrefs.INSTANCE.communication(this).ordinal()]) {
            case 1:
                i = R.id.commFew;
                break;
            case 2:
                i = R.id.commAac;
                break;
            case 3:
                i = R.id.commNon;
                break;
            default:
                i = R.id.commSpeaks;
                break;
        }
        radioGroup.check(i);
        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.support);
        switch (WhenMappings.$EnumSwitchMapping$2[UserPrefs.INSTANCE.support(this).ordinal()]) {
            case 1:
                i2 = R.id.sup1;
                break;
            case 2:
                i2 = R.id.sup2;
                break;
            case 3:
                i2 = R.id.sup3;
                break;
            default:
                i2 = R.id.supNone;
                break;
        }
        radioGroup2.check(i2);
        ((Button) findViewById(R.id.continuar)).setOnClickListener(new View.OnClickListener() { // from class: com.spectrum.app.ui.WelcomeActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WelcomeActivity.onCreate$lambda$5(this.f$0, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$5(WelcomeActivity this$0, View it) {
        UseMode mode;
        Communication comm;
        SupportLevel support;
        int checkedRadioButtonId = ((RadioGroup) this$0.findViewById(R.id.who)).getCheckedRadioButtonId();
        if (checkedRadioButtonId == R.id.whoSimple) {
            mode = UseMode.SIMPLE;
        } else {
            mode = checkedRadioButtonId == R.id.whoChild ? UseMode.CHILD : UseMode.ADULT;
        }
        int checkedRadioButtonId2 = ((RadioGroup) this$0.findViewById(R.id.comm)).getCheckedRadioButtonId();
        if (checkedRadioButtonId2 == R.id.commFew) {
            comm = Communication.FEW_WORDS;
        } else if (checkedRadioButtonId2 == R.id.commAac) {
            comm = Communication.AAC;
        } else {
            comm = checkedRadioButtonId2 == R.id.commNon ? Communication.NONVERBAL : Communication.SPEAKS;
        }
        int checkedRadioButtonId3 = ((RadioGroup) this$0.findViewById(R.id.support)).getCheckedRadioButtonId();
        if (checkedRadioButtonId3 == R.id.sup1) {
            support = SupportLevel.A1;
        } else if (checkedRadioButtonId3 == R.id.sup2) {
            support = SupportLevel.A2;
        } else {
            support = checkedRadioButtonId3 == R.id.sup3 ? SupportLevel.A3 : SupportLevel.NONE;
        }
        UserPrefs.INSTANCE.setMode(this$0, mode);
        UserPrefs.INSTANCE.setCommunication(this$0, comm);
        UserPrefs.INSTANCE.setSupport(this$0, support);
        UserPrefs.INSTANCE.setPersonName(this$0, ((EditText) this$0.findViewById(R.id.personName)).getText().toString());
        LinkedHashSet picked = new LinkedHashSet();
        ChipGroup group = (ChipGroup) this$0.findViewById(R.id.cidChips);
        int childCount = group.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = group.getChildAt(i);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
            Chip chip = (Chip) childAt;
            if (chip.isChecked()) {
                String code = StringsKt.trim((CharSequence) StringsKt.substringBefore$default(chip.getText().toString(), " ·", (String) null, 2, (Object) null)).toString();
                picked.add(code);
            }
        }
        CollectionsKt.addAll(picked, CidCatalog.INSTANCE.normalize(((EditText) this$0.findViewById(R.id.cidExtra)).getText().toString()));
        UserPrefs.INSTANCE.setCids(this$0, picked);
        if (CidAdapt.INSTANCE.flags(this$0).getPreferCalm()) {
            UserPrefs.INSTANCE.setCalmScreen(this$0, true);
        }
        UserPrefs.INSTANCE.setTrusted(this$0, ((EditText) this$0.findViewById(R.id.trustName)).getText().toString(), ((EditText) this$0.findViewById(R.id.trustPhone)).getText().toString());
        UserPrefs.INSTANCE.setWelcomeDone(this$0);
        this$0.startActivity(new Intent(this$0, (Class<?>) MainActivity.class).addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL));
        this$0.finish();
    }
}
