package com.spectrum.app.data;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: CidCatalog.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/spectrum/app/data/CidCatalog;", "", "<init>", "()V", "common", "", "Lcom/spectrum/app/data/CidItem;", "getCommon", "()Ljava/util/List;", "normalize", "", "", "raw", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class CidCatalog {
    public static final CidCatalog INSTANCE = new CidCatalog();
    private static final List<CidItem> common = CollectionsKt.listOf((Object[]) new CidItem[]{new CidItem("F84.0", "TEA / autismo infantil"), new CidItem("F84.1", "Autismo atípico"), new CidItem("F84.5", "Síndrome de Asperger (CID-10)"), new CidItem("F84.9", "TGD não especificado"), new CidItem("F80.1", "Transtorno de linguagem expressiva"), new CidItem("F80.2", "Transtorno de linguagem receptiva"), new CidItem("F90.0", "TDAH"), new CidItem("F41.1", "Ansiedade generalizada"), new CidItem("F41.0", "Pânico"), new CidItem("F32", "Episódio depressivo"), new CidItem("F33", "Depressão recorrente"), new CidItem("F95", "Tiques"), new CidItem("G40", "Epilepsia")});
    public static final int $stable = 8;

    private CidCatalog() {
    }

    public final List<CidItem> getCommon() {
        return common;
    }

    public final Set<String> normalize(String raw) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        Iterable $this$map$iv = StringsKt.split$default((CharSequence) raw, new char[]{',', ';', '\n', ' '}, false, 0, 6, (Object) null);
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            String it = (String) item$iv$iv;
            String upperCase = StringsKt.trim((CharSequence) it).toString().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            String it2 = StringsKt.replace$default(upperCase, ' ', '.', false, 4, (Object) null);
            destination$iv$iv.add(it2);
        }
        Iterable $this$map$iv2 = (List) destination$iv$iv;
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv2, 10));
        for (Object item$iv$iv2 : $this$map$iv2) {
            String it3 = (String) item$iv$iv2;
            destination$iv$iv2.add(StringsKt.trim(it3, '.'));
        }
        Iterable $this$filter$iv = (List) destination$iv$iv2;
        Collection destination$iv$iv3 = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            String it4 = (String) element$iv$iv;
            if (!StringsKt.isBlank(it4)) {
                destination$iv$iv3.add(element$iv$iv);
            }
        }
        return CollectionsKt.toSet((List) destination$iv$iv3);
    }
}
