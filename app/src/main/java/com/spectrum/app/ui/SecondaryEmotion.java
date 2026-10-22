package com.spectrum.app.ui;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Emotions.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/spectrum/app/ui/SecondaryEmotion;", "", "name", "", "tertiaries", "", "Lcom/spectrum/app/ui/EmotionWord;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getTertiaries", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class SecondaryEmotion {
    public static final int $stable = 8;
    private final String name;
    private final List<EmotionWord> tertiaries;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SecondaryEmotion copy$default(SecondaryEmotion secondaryEmotion, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = secondaryEmotion.name;
        }
        if ((i & 2) != 0) {
            list = secondaryEmotion.tertiaries;
        }
        return secondaryEmotion.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<EmotionWord> component2() {
        return this.tertiaries;
    }

    public final SecondaryEmotion copy(String name, List<EmotionWord> tertiaries) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tertiaries, "tertiaries");
        return new SecondaryEmotion(name, tertiaries);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SecondaryEmotion)) {
            return false;
        }
        SecondaryEmotion secondaryEmotion = (SecondaryEmotion) other;
        return Intrinsics.areEqual(this.name, secondaryEmotion.name) && Intrinsics.areEqual(this.tertiaries, secondaryEmotion.tertiaries);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.tertiaries.hashCode();
    }

    public String toString() {
        return "SecondaryEmotion(name=" + this.name + ", tertiaries=" + this.tertiaries + ")";
    }

    public SecondaryEmotion(String name, List<EmotionWord> tertiaries) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(tertiaries, "tertiaries");
        this.name = name;
        this.tertiaries = tertiaries;
    }

    public final String getName() {
        return this.name;
    }

    public final List<EmotionWord> getTertiaries() {
        return this.tertiaries;
    }
}
