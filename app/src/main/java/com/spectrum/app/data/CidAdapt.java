package com.spectrum.app.data;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: CidCatalog.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\n"}, d2 = {"Lcom/spectrum/app/data/CidAdapt;", "", "<init>", "()V", "flags", "Lcom/spectrum/app/data/AdaptFlags;", "context", "Landroid/content/Context;", "line", "", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class CidAdapt {
    public static final int $stable = 0;
    public static final CidAdapt INSTANCE = new CidAdapt();

    private CidAdapt() {
    }

    public final AdaptFlags flags(Context context) {
        boolean tea;
        boolean lang;
        boolean adhd;
        boolean anxiety;
        boolean depression;
        Intrinsics.checkNotNullParameter(context, "context");
        Iterable iterableCids = UserPrefs.INSTANCE.cids(context);
        Iterable $this$any$iv = iterableCids;
        if (!($this$any$iv instanceof Collection) || !((Collection) $this$any$iv).isEmpty()) {
            Iterator it = $this$any$iv.iterator();
            while (true) {
                if (it.hasNext()) {
                    Object element$iv = it.next();
                    String it2 = (String) element$iv;
                    if (StringsKt.startsWith$default(it2, "F84", false, 2, (Object) null)) {
                        tea = true;
                        break;
                    }
                } else {
                    tea = false;
                    break;
                }
            }
        } else {
            tea = false;
        }
        Iterable $this$any$iv2 = iterableCids;
        if (!($this$any$iv2 instanceof Collection) || !((Collection) $this$any$iv2).isEmpty()) {
            Iterator it3 = $this$any$iv2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    Object element$iv2 = it3.next();
                    String it4 = (String) element$iv2;
                    if (StringsKt.startsWith$default(it4, "F80", false, 2, (Object) null)) {
                        lang = true;
                        break;
                    }
                } else {
                    lang = false;
                    break;
                }
            }
        } else {
            lang = false;
        }
        Iterable $this$any$iv3 = iterableCids;
        if (!($this$any$iv3 instanceof Collection) || !((Collection) $this$any$iv3).isEmpty()) {
            Iterator it5 = $this$any$iv3.iterator();
            while (true) {
                if (it5.hasNext()) {
                    Object element$iv3 = it5.next();
                    String it6 = (String) element$iv3;
                    if (StringsKt.startsWith$default(it6, "F90", false, 2, (Object) null)) {
                        adhd = true;
                        break;
                    }
                } else {
                    adhd = false;
                    break;
                }
            }
        } else {
            adhd = false;
        }
        Iterable $this$any$iv4 = iterableCids;
        if (!($this$any$iv4 instanceof Collection) || !((Collection) $this$any$iv4).isEmpty()) {
            Iterator it7 = $this$any$iv4.iterator();
            while (true) {
                if (it7.hasNext()) {
                    Object element$iv4 = it7.next();
                    String it8 = (String) element$iv4;
                    if (StringsKt.startsWith$default(it8, "F41", false, 2, (Object) null)) {
                        anxiety = true;
                        break;
                    }
                } else {
                    anxiety = false;
                    break;
                }
            }
        } else {
            anxiety = false;
        }
        Iterable $this$any$iv5 = iterableCids;
        if (!($this$any$iv5 instanceof Collection) || !((Collection) $this$any$iv5).isEmpty()) {
            Iterator it9 = $this$any$iv5.iterator();
            while (true) {
                if (it9.hasNext()) {
                    Object element$iv5 = it9.next();
                    String it10 = (String) element$iv5;
                    if (StringsKt.startsWith$default(it10, "F32", false, 2, (Object) null) || StringsKt.startsWith$default(it10, "F33", false, 2, (Object) null)) {
                        depression = true;
                        break;
                    }
                } else {
                    depression = false;
                    break;
                }
            }
        } else {
            depression = false;
        }
        SupportLevel support = UserPrefs.INSTANCE.support(context);
        Communication comm = UserPrefs.INSTANCE.communication(context);
        boolean child = UserPrefs.INSTANCE.isChild(context);
        boolean needsBoard = comm == Communication.NONVERBAL || comm == Communication.AAC || comm == Communication.FEW_WORDS || support == SupportLevel.A3 || lang || child;
        boolean intense = support == SupportLevel.A3 || comm == Communication.NONVERBAL;
        return new AdaptFlags(needsBoard, intense || child || lang, child || intense, adhd || intense || anxiety, tea || anxiety || intense, depression, child || intense || lang || comm != Communication.SPEAKS);
    }

    public final String line(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Set<String> setCids = UserPrefs.INSTANCE.cids(context);
        if (setCids.isEmpty()) {
            return "CIDs: não informados (opcional)";
        }
        return "CIDs informados pela pessoa/família: " + CollectionsKt.joinToString$default(CollectionsKt.sorted(setCids), ", ", null, null, 0, null, null, 62, null);
    }
}
