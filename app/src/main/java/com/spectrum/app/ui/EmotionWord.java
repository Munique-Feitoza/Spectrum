package com.spectrum.app.ui;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Emotions.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/spectrum/app/ui/EmotionWord;", "", "name", "", "valence", "", "arousal", "<init>", "(Ljava/lang/String;FF)V", "getName", "()Ljava/lang/String;", "getValence", "()F", "getArousal", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class EmotionWord {
    public static final int $stable = 0;
    private final float arousal;
    private final String name;
    private final float valence;

    public static /* synthetic */ EmotionWord copy$default(EmotionWord emotionWord, String str, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emotionWord.name;
        }
        if ((i & 2) != 0) {
            f = emotionWord.valence;
        }
        if ((i & 4) != 0) {
            f2 = emotionWord.arousal;
        }
        return emotionWord.copy(str, f, f2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getValence() {
        return this.valence;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getArousal() {
        return this.arousal;
    }

    public final EmotionWord copy(String name, float valence, float arousal) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new EmotionWord(name, valence, arousal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmotionWord)) {
            return false;
        }
        EmotionWord emotionWord = (EmotionWord) other;
        return Intrinsics.areEqual(this.name, emotionWord.name) && Float.compare(this.valence, emotionWord.valence) == 0 && Float.compare(this.arousal, emotionWord.arousal) == 0;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + Float.hashCode(this.valence)) * 31) + Float.hashCode(this.arousal);
    }

    public String toString() {
        return "EmotionWord(name=" + this.name + ", valence=" + this.valence + ", arousal=" + this.arousal + ")";
    }

    public EmotionWord(String name, float valence, float arousal) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.valence = valence;
        this.arousal = arousal;
    }

    public final float getArousal() {
        return this.arousal;
    }

    public final String getName() {
        return this.name;
    }

    public final float getValence() {
        return this.valence;
    }
}
