package com.spectrum.app.data;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RegulationEvent.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003Jm\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\nHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u0006."}, d2 = {"Lcom/spectrum/app/data/RegulationEvent;", "", "id", "", "ts", "", "createdAt", "kind", "label", "intensity", "", "socialBattery", "bodyEnergy", "notes", "source", "<init>", "(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTs", "()J", "getCreatedAt", "getKind", "getLabel", "getIntensity", "()I", "getSocialBattery", "getBodyEnergy", "getNotes", "getSource", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class RegulationEvent {
    public static final int $stable = 0;
    private final int bodyEnergy;
    private final long createdAt;
    private final String id;
    private final int intensity;
    private final String kind;
    private final String label;
    private final String notes;
    private final int socialBattery;
    private final String source;
    private final long ts;

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSource() {
        return this.source;
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
    public final String getKind() {
        return this.kind;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getIntensity() {
        return this.intensity;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getSocialBattery() {
        return this.socialBattery;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getBodyEnergy() {
        return this.bodyEnergy;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    public final RegulationEvent copy(String id, long ts, long createdAt, String kind, String label, int intensity, int socialBattery, int bodyEnergy, String notes, String source) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(notes, "notes");
        Intrinsics.checkNotNullParameter(source, "source");
        return new RegulationEvent(id, ts, createdAt, kind, label, intensity, socialBattery, bodyEnergy, notes, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegulationEvent)) {
            return false;
        }
        RegulationEvent regulationEvent = (RegulationEvent) other;
        return Intrinsics.areEqual(this.id, regulationEvent.id) && this.ts == regulationEvent.ts && this.createdAt == regulationEvent.createdAt && Intrinsics.areEqual(this.kind, regulationEvent.kind) && Intrinsics.areEqual(this.label, regulationEvent.label) && this.intensity == regulationEvent.intensity && this.socialBattery == regulationEvent.socialBattery && this.bodyEnergy == regulationEvent.bodyEnergy && Intrinsics.areEqual(this.notes, regulationEvent.notes) && Intrinsics.areEqual(this.source, regulationEvent.source);
    }

    public int hashCode() {
        return (((((((((((((((((this.id.hashCode() * 31) + Long.hashCode(this.ts)) * 31) + Long.hashCode(this.createdAt)) * 31) + this.kind.hashCode()) * 31) + this.label.hashCode()) * 31) + Integer.hashCode(this.intensity)) * 31) + Integer.hashCode(this.socialBattery)) * 31) + Integer.hashCode(this.bodyEnergy)) * 31) + this.notes.hashCode()) * 31) + this.source.hashCode();
    }

    public String toString() {
        return "RegulationEvent(id=" + this.id + ", ts=" + this.ts + ", createdAt=" + this.createdAt + ", kind=" + this.kind + ", label=" + this.label + ", intensity=" + this.intensity + ", socialBattery=" + this.socialBattery + ", bodyEnergy=" + this.bodyEnergy + ", notes=" + this.notes + ", source=" + this.source + ")";
    }

    public RegulationEvent(String id, long ts, long createdAt, String kind, String label, int intensity, int socialBattery, int bodyEnergy, String notes, String source) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(notes, "notes");
        Intrinsics.checkNotNullParameter(source, "source");
        this.id = id;
        this.ts = ts;
        this.createdAt = createdAt;
        this.kind = kind;
        this.label = label;
        this.intensity = intensity;
        this.socialBattery = socialBattery;
        this.bodyEnergy = bodyEnergy;
        this.notes = notes;
        this.source = source;
    }

    public /* synthetic */ RegulationEvent(String str, long j, long j2, String str2, String str3, int i, int i2, int i3, String str4, String str5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, j2, str2, str3, (i4 & 32) != 0 ? 0 : i, (i4 & 64) != 0 ? -1 : i2, (i4 & 128) != 0 ? -1 : i3, (i4 & 256) != 0 ? "" : str4, (i4 & 512) != 0 ? "app" : str5);
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

    public final String getKind() {
        return this.kind;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getIntensity() {
        return this.intensity;
    }

    public final int getSocialBattery() {
        return this.socialBattery;
    }

    public final int getBodyEnergy() {
        return this.bodyEnergy;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final String getSource() {
        return this.source;
    }
}
