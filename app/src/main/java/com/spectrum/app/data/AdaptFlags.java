package com.spectrum.app.data;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* JADX INFO: compiled from: CidCatalog.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\""}, d2 = {"Lcom/spectrum/app/data/AdaptFlags;", "", "aacBoard", "", "hideWheel", "hideScales", "preferCalm", "sensoryFirst", "activationHint", "shortWords", "<init>", "(ZZZZZZZ)V", "getAacBoard", "()Z", "getHideWheel", "getHideScales", "getPreferCalm", "getSensoryFirst", "getActivationHint", "getShortWords", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class AdaptFlags {
    public static final int $stable = 0;
    private final boolean aacBoard;
    private final boolean activationHint;
    private final boolean hideScales;
    private final boolean hideWheel;
    private final boolean preferCalm;
    private final boolean sensoryFirst;
    private final boolean shortWords;

    public static /* synthetic */ AdaptFlags copy$default(AdaptFlags adaptFlags, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, Object obj) {
        if ((i & 1) != 0) {
            z = adaptFlags.aacBoard;
        }
        if ((i & 2) != 0) {
            z2 = adaptFlags.hideWheel;
        }
        boolean z8 = z2;
        if ((i & 4) != 0) {
            z3 = adaptFlags.hideScales;
        }
        boolean z9 = z3;
        if ((i & 8) != 0) {
            z4 = adaptFlags.preferCalm;
        }
        boolean z10 = z4;
        if ((i & 16) != 0) {
            z5 = adaptFlags.sensoryFirst;
        }
        boolean z11 = z5;
        if ((i & 32) != 0) {
            z6 = adaptFlags.activationHint;
        }
        boolean z12 = z6;
        if ((i & 64) != 0) {
            z7 = adaptFlags.shortWords;
        }
        return adaptFlags.copy(z, z8, z9, z10, z11, z12, z7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getAacBoard() {
        return this.aacBoard;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHideWheel() {
        return this.hideWheel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHideScales() {
        return this.hideScales;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getPreferCalm() {
        return this.preferCalm;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getSensoryFirst() {
        return this.sensoryFirst;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getActivationHint() {
        return this.activationHint;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getShortWords() {
        return this.shortWords;
    }

    public final AdaptFlags copy(boolean aacBoard, boolean hideWheel, boolean hideScales, boolean preferCalm, boolean sensoryFirst, boolean activationHint, boolean shortWords) {
        return new AdaptFlags(aacBoard, hideWheel, hideScales, preferCalm, sensoryFirst, activationHint, shortWords);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdaptFlags)) {
            return false;
        }
        AdaptFlags adaptFlags = (AdaptFlags) other;
        return this.aacBoard == adaptFlags.aacBoard && this.hideWheel == adaptFlags.hideWheel && this.hideScales == adaptFlags.hideScales && this.preferCalm == adaptFlags.preferCalm && this.sensoryFirst == adaptFlags.sensoryFirst && this.activationHint == adaptFlags.activationHint && this.shortWords == adaptFlags.shortWords;
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.aacBoard) * 31) + Boolean.hashCode(this.hideWheel)) * 31) + Boolean.hashCode(this.hideScales)) * 31) + Boolean.hashCode(this.preferCalm)) * 31) + Boolean.hashCode(this.sensoryFirst)) * 31) + Boolean.hashCode(this.activationHint)) * 31) + Boolean.hashCode(this.shortWords);
    }

    public String toString() {
        return "AdaptFlags(aacBoard=" + this.aacBoard + ", hideWheel=" + this.hideWheel + ", hideScales=" + this.hideScales + ", preferCalm=" + this.preferCalm + ", sensoryFirst=" + this.sensoryFirst + ", activationHint=" + this.activationHint + ", shortWords=" + this.shortWords + ")";
    }

    public AdaptFlags(boolean aacBoard, boolean hideWheel, boolean hideScales, boolean preferCalm, boolean sensoryFirst, boolean activationHint, boolean shortWords) {
        this.aacBoard = aacBoard;
        this.hideWheel = hideWheel;
        this.hideScales = hideScales;
        this.preferCalm = preferCalm;
        this.sensoryFirst = sensoryFirst;
        this.activationHint = activationHint;
        this.shortWords = shortWords;
    }

    public final boolean getAacBoard() {
        return this.aacBoard;
    }

    public final boolean getHideWheel() {
        return this.hideWheel;
    }

    public final boolean getHideScales() {
        return this.hideScales;
    }

    public final boolean getPreferCalm() {
        return this.preferCalm;
    }

    public final boolean getSensoryFirst() {
        return this.sensoryFirst;
    }

    public final boolean getActivationHint() {
        return this.activationHint;
    }

    public final boolean getShortWords() {
        return this.shortWords;
    }
}
