package com.spectrum.app.data;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ActivityLog.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006%"}, d2 = {"Lcom/spectrum/app/data/ActivityLog;", "", "atividade", "", "prazer", "", "dominio", "nota", "id", "ts", "", "createdAt", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;JJ)V", "getAtividade", "()Ljava/lang/String;", "getPrazer", "()I", "getDominio", "getNota", "getId", "getTs", "()J", "getCreatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ActivityLog {
    public static final int $stable = 0;
    private final String atividade;
    private final long createdAt;
    private final int dominio;
    private final String id;
    private final String nota;
    private final int prazer;
    private final long ts;

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAtividade() {
        return this.atividade;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPrazer() {
        return this.prazer;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDominio() {
        return this.dominio;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNota() {
        return this.nota;
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

    public final ActivityLog copy(String atividade, int prazer, int dominio, String nota, String id, long ts, long createdAt) {
        Intrinsics.checkNotNullParameter(atividade, "atividade");
        Intrinsics.checkNotNullParameter(nota, "nota");
        Intrinsics.checkNotNullParameter(id, "id");
        return new ActivityLog(atividade, prazer, dominio, nota, id, ts, createdAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityLog)) {
            return false;
        }
        ActivityLog activityLog = (ActivityLog) other;
        return Intrinsics.areEqual(this.atividade, activityLog.atividade) && this.prazer == activityLog.prazer && this.dominio == activityLog.dominio && Intrinsics.areEqual(this.nota, activityLog.nota) && Intrinsics.areEqual(this.id, activityLog.id) && this.ts == activityLog.ts && this.createdAt == activityLog.createdAt;
    }

    public int hashCode() {
        return (((((((((((this.atividade.hashCode() * 31) + Integer.hashCode(this.prazer)) * 31) + Integer.hashCode(this.dominio)) * 31) + this.nota.hashCode()) * 31) + this.id.hashCode()) * 31) + Long.hashCode(this.ts)) * 31) + Long.hashCode(this.createdAt);
    }

    public String toString() {
        return "ActivityLog(atividade=" + this.atividade + ", prazer=" + this.prazer + ", dominio=" + this.dominio + ", nota=" + this.nota + ", id=" + this.id + ", ts=" + this.ts + ", createdAt=" + this.createdAt + ")";
    }

    public ActivityLog(String atividade, int prazer, int dominio, String nota, String id, long ts, long createdAt) {
        Intrinsics.checkNotNullParameter(atividade, "atividade");
        Intrinsics.checkNotNullParameter(nota, "nota");
        Intrinsics.checkNotNullParameter(id, "id");
        this.atividade = atividade;
        this.prazer = prazer;
        this.dominio = dominio;
        this.nota = nota;
        this.id = id;
        this.ts = ts;
        this.createdAt = createdAt;
    }

    public /* synthetic */ ActivityLog(String str, int i, int i2, String str2, String str3, long j, long j2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, str2, (i3 & 16) != 0 ? UUID.randomUUID().toString() : str3, (i3 & 32) != 0 ? System.currentTimeMillis() : j, (i3 & 64) != 0 ? System.currentTimeMillis() : j2);
    }

    public final String getAtividade() {
        return this.atividade;
    }

    public final int getPrazer() {
        return this.prazer;
    }

    public final int getDominio() {
        return this.dominio;
    }

    public final String getNota() {
        return this.nota;
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
