package com.spectrum.app.data;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AbcRecord.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006$"}, d2 = {"Lcom/spectrum/app/data/AbcRecord;", "", "antecedente", "", "comportamento", "consequencia", "contexto", "id", "ts", "", "createdAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V", "getAntecedente", "()Ljava/lang/String;", "getComportamento", "getConsequencia", "getContexto", "getId", "getTs", "()J", "getCreatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class AbcRecord {
    public static final int $stable = 0;
    private final String antecedente;
    private final String comportamento;
    private final String consequencia;
    private final String contexto;
    private final long createdAt;
    private final String id;
    private final long ts;

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAntecedente() {
        return this.antecedente;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getComportamento() {
        return this.comportamento;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getConsequencia() {
        return this.consequencia;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getContexto() {
        return this.contexto;
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

    public final AbcRecord copy(String antecedente, String comportamento, String consequencia, String contexto, String id, long ts, long createdAt) {
        Intrinsics.checkNotNullParameter(antecedente, "antecedente");
        Intrinsics.checkNotNullParameter(comportamento, "comportamento");
        Intrinsics.checkNotNullParameter(consequencia, "consequencia");
        Intrinsics.checkNotNullParameter(contexto, "contexto");
        Intrinsics.checkNotNullParameter(id, "id");
        return new AbcRecord(antecedente, comportamento, consequencia, contexto, id, ts, createdAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AbcRecord)) {
            return false;
        }
        AbcRecord abcRecord = (AbcRecord) other;
        return Intrinsics.areEqual(this.antecedente, abcRecord.antecedente) && Intrinsics.areEqual(this.comportamento, abcRecord.comportamento) && Intrinsics.areEqual(this.consequencia, abcRecord.consequencia) && Intrinsics.areEqual(this.contexto, abcRecord.contexto) && Intrinsics.areEqual(this.id, abcRecord.id) && this.ts == abcRecord.ts && this.createdAt == abcRecord.createdAt;
    }

    public int hashCode() {
        return (((((((((((this.antecedente.hashCode() * 31) + this.comportamento.hashCode()) * 31) + this.consequencia.hashCode()) * 31) + this.contexto.hashCode()) * 31) + this.id.hashCode()) * 31) + Long.hashCode(this.ts)) * 31) + Long.hashCode(this.createdAt);
    }

    public String toString() {
        return "AbcRecord(antecedente=" + this.antecedente + ", comportamento=" + this.comportamento + ", consequencia=" + this.consequencia + ", contexto=" + this.contexto + ", id=" + this.id + ", ts=" + this.ts + ", createdAt=" + this.createdAt + ")";
    }

    public AbcRecord(String antecedente, String comportamento, String consequencia, String contexto, String id, long ts, long createdAt) {
        Intrinsics.checkNotNullParameter(antecedente, "antecedente");
        Intrinsics.checkNotNullParameter(comportamento, "comportamento");
        Intrinsics.checkNotNullParameter(consequencia, "consequencia");
        Intrinsics.checkNotNullParameter(contexto, "contexto");
        Intrinsics.checkNotNullParameter(id, "id");
        this.antecedente = antecedente;
        this.comportamento = comportamento;
        this.consequencia = consequencia;
        this.contexto = contexto;
        this.id = id;
        this.ts = ts;
        this.createdAt = createdAt;
    }

    public /* synthetic */ AbcRecord(String str, String str2, String str3, String str4, String str5, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? UUID.randomUUID().toString() : str5, (i & 32) != 0 ? System.currentTimeMillis() : j, (i & 64) != 0 ? System.currentTimeMillis() : j2);
    }

    public final String getAntecedente() {
        return this.antecedente;
    }

    public final String getComportamento() {
        return this.comportamento;
    }

    public final String getConsequencia() {
        return this.consequencia;
    }

    public final String getContexto() {
        return this.contexto;
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
