package com.spectrum.app.ui;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Emotions.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/spectrum/app/ui/CoreEmotion;", "", "name", "", "color", "", "secondaries", "", "Lcom/spectrum/app/ui/SecondaryEmotion;", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "getName", "()Ljava/lang/String;", "getColor", "()I", "getSecondaries", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class CoreEmotion {
    public static final int $stable = 8;
    private final int color;
    private final String name;
    private final List<SecondaryEmotion> secondaries;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CoreEmotion copy$default(CoreEmotion coreEmotion, String str, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = coreEmotion.name;
        }
        if ((i2 & 2) != 0) {
            i = coreEmotion.color;
        }
        if ((i2 & 4) != 0) {
            list = coreEmotion.secondaries;
        }
        return coreEmotion.copy(str, i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    public final List<SecondaryEmotion> component3() {
        return this.secondaries;
    }

    public final CoreEmotion copy(String name, int color, List<SecondaryEmotion> secondaries) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(secondaries, "secondaries");
        return new CoreEmotion(name, color, secondaries);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoreEmotion)) {
            return false;
        }
        CoreEmotion coreEmotion = (CoreEmotion) other;
        return Intrinsics.areEqual(this.name, coreEmotion.name) && this.color == coreEmotion.color && Intrinsics.areEqual(this.secondaries, coreEmotion.secondaries);
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + Integer.hashCode(this.color)) * 31) + this.secondaries.hashCode();
    }

    public String toString() {
        return "CoreEmotion(name=" + this.name + ", color=" + this.color + ", secondaries=" + this.secondaries + ")";
    }

    public CoreEmotion(String name, int color, List<SecondaryEmotion> secondaries) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(secondaries, "secondaries");
        this.name = name;
        this.color = color;
        this.secondaries = secondaries;
    }

    public final int getColor() {
        return this.color;
    }

    public final String getName() {
        return this.name;
    }

    public final List<SecondaryEmotion> getSecondaries() {
        return this.secondaries;
    }
}
