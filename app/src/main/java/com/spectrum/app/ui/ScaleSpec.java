package com.spectrum.app.ui;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Scales.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0015\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J^\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\tHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lcom/spectrum/app/ui/ScaleSpec;", "", "code", "", "title", "instruction", "items", "", "crisisItem", "", "band", "Lkotlin/Function1;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "getCode", "()Ljava/lang/String;", "getTitle", "getInstruction", "getItems", "()Ljava/util/List;", "getCrisisItem", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBand", "()Lkotlin/jvm/functions/Function1;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)Lcom/spectrum/app/ui/ScaleSpec;", "equals", "", "other", "hashCode", "toString", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ScaleSpec {
    public static final int $stable = 8;
    private final Function1<Integer, String> band;
    private final String code;
    private final Integer crisisItem;
    private final String instruction;
    private final List<String> items;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ScaleSpec copy$default(ScaleSpec scaleSpec, String str, String str2, String str3, List list, Integer num, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scaleSpec.code;
        }
        if ((i & 2) != 0) {
            str2 = scaleSpec.title;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = scaleSpec.instruction;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            list = scaleSpec.items;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            num = scaleSpec.crisisItem;
        }
        Integer num2 = num;
        if ((i & 32) != 0) {
            function1 = scaleSpec.band;
        }
        return scaleSpec.copy(str, str4, str5, list2, num2, function1);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getInstruction() {
        return this.instruction;
    }

    public final List<String> component4() {
        return this.items;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getCrisisItem() {
        return this.crisisItem;
    }

    public final Function1<Integer, String> component6() {
        return this.band;
    }

    public final ScaleSpec copy(String code, String title, String instruction, List<String> items, Integer crisisItem, Function1<? super Integer, String> band) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(instruction, "instruction");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(band, "band");
        return new ScaleSpec(code, title, instruction, items, crisisItem, band);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScaleSpec)) {
            return false;
        }
        ScaleSpec scaleSpec = (ScaleSpec) other;
        return Intrinsics.areEqual(this.code, scaleSpec.code) && Intrinsics.areEqual(this.title, scaleSpec.title) && Intrinsics.areEqual(this.instruction, scaleSpec.instruction) && Intrinsics.areEqual(this.items, scaleSpec.items) && Intrinsics.areEqual(this.crisisItem, scaleSpec.crisisItem) && Intrinsics.areEqual(this.band, scaleSpec.band);
    }

    public int hashCode() {
        return (((((((((this.code.hashCode() * 31) + this.title.hashCode()) * 31) + this.instruction.hashCode()) * 31) + this.items.hashCode()) * 31) + (this.crisisItem == null ? 0 : this.crisisItem.hashCode())) * 31) + this.band.hashCode();
    }

    public String toString() {
        return "ScaleSpec(code=" + this.code + ", title=" + this.title + ", instruction=" + this.instruction + ", items=" + this.items + ", crisisItem=" + this.crisisItem + ", band=" + this.band + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ScaleSpec(String code, String title, String instruction, List<String> items, Integer crisisItem, Function1<? super Integer, String> band) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(instruction, "instruction");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(band, "band");
        this.code = code;
        this.title = title;
        this.instruction = instruction;
        this.items = items;
        this.crisisItem = crisisItem;
        this.band = band;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getInstruction() {
        return this.instruction;
    }

    public final List<String> getItems() {
        return this.items;
    }

    public final Integer getCrisisItem() {
        return this.crisisItem;
    }

    public final Function1<Integer, String> getBand() {
        return this.band;
    }
}
