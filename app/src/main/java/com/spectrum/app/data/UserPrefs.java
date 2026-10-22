package com.spectrum.app.data;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: UserPrefs.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002¢\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015J\u001e\u0010 \u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005J\u000e\u0010#\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010$\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010%\u001a\u00020&2\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010'\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010(\u001a\u00020&J\u000e\u0010)\u001a\u00020*2\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010+\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010,\u001a\u00020*J\u000e\u0010-\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010.\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u0018J\u000e\u00100\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u00101\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0005J\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020\u0005032\u0006\u0010\u0014\u001a\u00020\u0015J\u001c\u00104\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000503J\u000e\u00106\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u00107\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u00108\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u00109\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010:\u001a\u00020\u0005J\u000e\u0010;\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010<\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010=\u001a\u00020\u0005J\u000e\u0010>\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/spectrum/app/data/UserPrefs;", "", "<init>", "()V", "FILE", "", "KEY_WELCOME", "KEY_MODE", "KEY_TRUST_NAME", "KEY_TRUST_PHONE", "KEY_SUPPORT", "KEY_COMM", "KEY_CALM", "KEY_PERSON", "KEY_CIDS", "KEY_BOARD_LANG", "KEY_THEME", "p", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "welcomeDone", "", "setWelcomeDone", "", "mode", "Lcom/spectrum/app/data/UseMode;", "setMode", "trustName", "trustPhone", "setTrusted", "name", "phone", "isChild", "isSimple", "support", "Lcom/spectrum/app/data/SupportLevel;", "setSupport", "level", UserPrefs.KEY_COMM, "Lcom/spectrum/app/data/Communication;", "setCommunication", "c", "calmScreen", "setCalmScreen", DebugKt.DEBUG_PROPERTY_VALUE_ON, "personName", "setPersonName", UserPrefs.KEY_CIDS, "", "setCids", "codes", "isNonverbalUi", "supportLabel", "boardLang", "setBoardLang", "lang", "visualTheme", "setVisualTheme", "id", "communicationLabel", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class UserPrefs {
    public static final int $stable = 0;
    private static final String FILE = "spectrum_user";
    public static final UserPrefs INSTANCE = new UserPrefs();
    private static final String KEY_BOARD_LANG = "board_lang";
    private static final String KEY_CALM = "calm_screen";
    private static final String KEY_CIDS = "cids";
    private static final String KEY_COMM = "communication";
    private static final String KEY_MODE = "use_mode";
    private static final String KEY_PERSON = "person_name";
    private static final String KEY_SUPPORT = "support_level";
    private static final String KEY_THEME = "visual_theme";
    private static final String KEY_TRUST_NAME = "trust_name";
    private static final String KEY_TRUST_PHONE = "trust_phone";
    private static final String KEY_WELCOME = "welcome_done";

    /* JADX INFO: compiled from: UserPrefs.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SupportLevel.values().length];
            try {
                iArr[SupportLevel.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[SupportLevel.A1.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[SupportLevel.A2.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[SupportLevel.A3.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Communication.values().length];
            try {
                iArr2[Communication.SPEAKS.ordinal()] = 1;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr2[Communication.FEW_WORDS.ordinal()] = 2;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr2[Communication.AAC.ordinal()] = 3;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr2[Communication.NONVERBAL.ordinal()] = 4;
            } catch (NoSuchFieldError e8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private UserPrefs() {
    }

    private final SharedPreferences p(Context context) {
        return context.getSharedPreferences(FILE, 0);
    }

    public final boolean welcomeDone(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return p(context).getBoolean(KEY_WELCOME, false);
    }

    public final void setWelcomeDone(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        p(context).edit().putBoolean(KEY_WELCOME, true).apply();
    }

    public final UseMode mode(Context context) {
        Object objM1543constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            UserPrefs $this$mode_u24lambda_u240 = this;
            String string = $this$mode_u24lambda_u240.p(context).getString(KEY_MODE, "ADULT");
            Intrinsics.checkNotNull(string);
            objM1543constructorimpl = Result.m1543constructorimpl(UseMode.valueOf(string));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM1543constructorimpl = Result.m1543constructorimpl(ResultKt.createFailure(th));
        }
        UseMode useMode = UseMode.ADULT;
        if (Result.m1549isFailureimpl(objM1543constructorimpl)) {
            objM1543constructorimpl = useMode;
        }
        return (UseMode) objM1543constructorimpl;
    }

    public final void setMode(Context context, UseMode mode) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mode, "mode");
        p(context).edit().putString(KEY_MODE, mode.name()).apply();
    }

    public final String trustName(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = p(context).getString(KEY_TRUST_NAME, "");
        return string == null ? "" : string;
    }

    public final String trustPhone(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = p(context).getString(KEY_TRUST_PHONE, "");
        return string == null ? "" : string;
    }

    public final void setTrusted(Context context, String name, String phone) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(phone, "phone");
        p(context).edit().putString(KEY_TRUST_NAME, StringsKt.trim((CharSequence) name).toString()).putString(KEY_TRUST_PHONE, StringsKt.trim((CharSequence) phone).toString()).apply();
    }

    public final boolean isChild(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return mode(context) == UseMode.CHILD;
    }

    public final boolean isSimple(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return mode(context) == UseMode.SIMPLE || mode(context) == UseMode.CHILD;
    }

    public final SupportLevel support(Context context) {
        Object objM1543constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            UserPrefs $this$support_u24lambda_u241 = this;
            String string = $this$support_u24lambda_u241.p(context).getString(KEY_SUPPORT, "NONE");
            Intrinsics.checkNotNull(string);
            objM1543constructorimpl = Result.m1543constructorimpl(SupportLevel.valueOf(string));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM1543constructorimpl = Result.m1543constructorimpl(ResultKt.createFailure(th));
        }
        SupportLevel supportLevel = SupportLevel.NONE;
        if (Result.m1549isFailureimpl(objM1543constructorimpl)) {
            objM1543constructorimpl = supportLevel;
        }
        return (SupportLevel) objM1543constructorimpl;
    }

    public final void setSupport(Context context, SupportLevel level) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(level, "level");
        p(context).edit().putString(KEY_SUPPORT, level.name()).apply();
    }

    public final Communication communication(Context context) {
        Object objM1543constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            UserPrefs $this$communication_u24lambda_u242 = this;
            String string = $this$communication_u24lambda_u242.p(context).getString(KEY_COMM, "SPEAKS");
            Intrinsics.checkNotNull(string);
            objM1543constructorimpl = Result.m1543constructorimpl(Communication.valueOf(string));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM1543constructorimpl = Result.m1543constructorimpl(ResultKt.createFailure(th));
        }
        Communication communication = Communication.SPEAKS;
        if (Result.m1549isFailureimpl(objM1543constructorimpl)) {
            objM1543constructorimpl = communication;
        }
        return (Communication) objM1543constructorimpl;
    }

    public final void setCommunication(Context context, Communication c) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(c, "c");
        p(context).edit().putString(KEY_COMM, c.name()).apply();
    }

    public final boolean calmScreen(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return p(context).getBoolean(KEY_CALM, false);
    }

    public final void setCalmScreen(Context context, boolean on) {
        Intrinsics.checkNotNullParameter(context, "context");
        p(context).edit().putBoolean(KEY_CALM, on).apply();
    }

    public final String personName(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = p(context).getString(KEY_PERSON, "");
        return string == null ? "" : string;
    }

    public final void setPersonName(Context context, String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        p(context).edit().putString(KEY_PERSON, StringsKt.trim((CharSequence) name).toString()).apply();
    }

    public final Set<String> cids(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        CidCatalog cidCatalog = CidCatalog.INSTANCE;
        String string = p(context).getString(KEY_CIDS, "");
        return cidCatalog.normalize(string != null ? string : "");
    }

    public final void setCids(Context context, Set<String> codes) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(codes, "codes");
        p(context).edit().putString(KEY_CIDS, CollectionsKt.joinToString$default(codes, ",", null, null, 0, null, null, 62, null)).apply();
    }

    public final boolean isNonverbalUi(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return CidAdapt.INSTANCE.flags(context).getAacBoard();
    }

    public final String supportLabel(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        switch (WhenMappings.$EnumSwitchMapping$0[support(context).ordinal()]) {
            case 1:
                return "não informado";
            case 2:
                return "apoio 1 · pouco apoio no cotidiano";
            case 3:
                return "apoio 2 · apoio frequente";
            case 4:
                return "apoio 3 · apoio intenso / comunicação";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final String boardLang(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = p(context).getString(KEY_BOARD_LANG, "system");
        return string == null ? "system" : string;
    }

    public final void setBoardLang(Context context, String lang) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lang, "lang");
        p(context).edit().putString(KEY_BOARD_LANG, lang).apply();
    }

    public final String visualTheme(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = p(context).getString(KEY_THEME, "sage");
        return string == null ? "sage" : string;
    }

    public final void setVisualTheme(Context context, String id) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(id, "id");
        p(context).edit().putString(KEY_THEME, id).apply();
    }

    public final String communicationLabel(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        switch (WhenMappings.$EnumSwitchMapping$1[communication(context).ordinal()]) {
            case 1:
                return "fala frases";
            case 2:
                return "poucas palavras";
            case 3:
                return "prancha / gestos / CAA";
            case 4:
                return "principalmente toque e imagem";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
