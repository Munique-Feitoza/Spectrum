package com.spectrum.app.data;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScaleResult.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006%"}, d2 = {"Lcom/spectrum/app/data/ScaleResult;", "", "code", "", "total", "", "band", "answers", "id", "ts", "", "createdAt", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V", "getCode", "()Ljava/lang/String;", "getTotal", "()I", "getBand", "getAnswers", "getId", "getTs", "()J", "getCreatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ScaleResult {
    public static final int $stable = 0;
    private final String answers;
    private final String band;
    private final String code;
    private final long createdAt;
    private final String id;
    private final int total;
    private final long ts;

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBand() {
        return this.band;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAnswers() {
        return this.answers;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getTs() {
        return this.ts;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final ScaleResult copy(String code, int total, String band, String answers, String id, long ts, long createdAt) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(band, "band");
        Intrinsics.checkNotNullParameter(answers, "answers");
        Intrinsics.checkNotNullParameter(id, "id");
        return new ScaleResult(code, total, band, answers, id, ts, createdAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScaleResult)) {
            return false;
        }
        ScaleResult scaleResult = (ScaleResult) other;
        return Intrinsics.areEqual(this.code, scaleResult.code) && this.total == scaleResult.total && Intrinsics.areEqual(this.band, scaleResult.band) && Intrinsics.areEqual(this.answers, scaleResult.answers) && Intrinsics.areEqual(this.id, scaleResult.id) && this.ts == scaleResult.ts && this.createdAt == scaleResult.createdAt;
    }

    public int hashCode() {
        return (((((((((((this.code.hashCode() * 31) + Integer.hashCode(this.total)) * 31) + this.band.hashCode()) * 31) + this.answers.hashCode()) * 31) + this.id.hashCode()) * 31) + Long.hashCode(this.ts)) * 31) + Long.hashCode(this.createdAt);
    }

    public String toString() {
        return "ScaleResult(code=" + this.code + ", total=" + this.total + ", band=" + this.band + ", answers=" + this.answers + ", id=" + this.id + ", ts=" + this.ts + ", createdAt=" + this.createdAt + ")";
    }

    public ScaleResult(String code, int total, String band, String answers, String id, long ts, long createdAt) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(band, "band");
        Intrinsics.checkNotNullParameter(answers, "answers");
        Intrinsics.checkNotNullParameter(id, "id");
        this.code = code;
        this.total = total;
        this.band = band;
        this.answers = answers;
        this.id = id;
        this.ts = ts;
        this.createdAt = createdAt;
    }

    public /* synthetic */ ScaleResult(String str, int i, String str2, String str3, String str4, long j, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, (i2 & 16) != 0 ? UUID.randomUUID().toString() : str4, (i2 & 32) != 0 ? System.currentTimeMillis() : j, (i2 & 64) != 0 ? System.currentTimeMillis() : j2);
    }

    public final String getCode() {
        return this.code;
    }

    public final int getTotal() {
        return this.total;
    }

    public final String getBand() {
        return this.band;
    }

    public final String getAnswers() {
        return this.answers;
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
}
