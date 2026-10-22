package com.spectrum.app.data;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MoodEvent.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006&"}, d2 = {"Lcom/spectrum/app/data/MoodEvent;", "", "id", "", "ts", "", "createdAt", "valence", "", "arousal", "label", "source", "<init>", "(Ljava/lang/String;JJFFLjava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTs", "()J", "getCreatedAt", "getValence", "()F", "getArousal", "getLabel", "getSource", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class MoodEvent {
    public static final int $stable = 0;
    private final float arousal;
    private final long createdAt;
    private final String id;
    private final String label;
    private final String source;
    private final long ts;
    private final float valence;

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTs() {
        return this.ts;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getValence() {
        return this.valence;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getArousal() {
        return this.arousal;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final MoodEvent copy(String id, long ts, long createdAt, float valence, float arousal, String label, String source) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(source, "source");
        return new MoodEvent(id, ts, createdAt, valence, arousal, label, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MoodEvent)) {
            return false;
        }
        MoodEvent moodEvent = (MoodEvent) other;
        return Intrinsics.areEqual(this.id, moodEvent.id) && this.ts == moodEvent.ts && this.createdAt == moodEvent.createdAt && Float.compare(this.valence, moodEvent.valence) == 0 && Float.compare(this.arousal, moodEvent.arousal) == 0 && Intrinsics.areEqual(this.label, moodEvent.label) && Intrinsics.areEqual(this.source, moodEvent.source);
    }

    public int hashCode() {
        return (((((((((((this.id.hashCode() * 31) + Long.hashCode(this.ts)) * 31) + Long.hashCode(this.createdAt)) * 31) + Float.hashCode(this.valence)) * 31) + Float.hashCode(this.arousal)) * 31) + (this.label == null ? 0 : this.label.hashCode())) * 31) + this.source.hashCode();
    }

    public String toString() {
        return "MoodEvent(id=" + this.id + ", ts=" + this.ts + ", createdAt=" + this.createdAt + ", valence=" + this.valence + ", arousal=" + this.arousal + ", label=" + this.label + ", source=" + this.source + ")";
    }

    public MoodEvent(String id, long ts, long createdAt, float valence, float arousal, String label, String source) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(source, "source");
        this.id = id;
        this.ts = ts;
        this.createdAt = createdAt;
        this.valence = valence;
        this.arousal = arousal;
        this.label = label;
        this.source = source;
    }

    public final String getId() {
        return this.id;
    }

    public final long getTs() {
        return this.ts;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final float getValence() {
        return this.valence;
    }

    public final float getArousal() {
        return this.arousal;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getSource() {
        return this.source;
    }
}
