package com.spectrum.app.data;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ThoughtRecord.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0011HÆ\u0003J\t\u00103\u001a\u00020\u0011HÆ\u0003J\u0095\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\u0006HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0012\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$¨\u0006:"}, d2 = {"Lcom/spectrum/app/data/ThoughtRecord;", "", "situacao", "", "emocao", "intensidadeAntes", "", "pensamento", "distorcoes", "evidenciasFavor", "evidenciasContra", "pensamentoAlternativo", "intensidadeDepois", "crencaAntes", "crencaDepois", "id", "ts", "", "createdAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;JJ)V", "getSituacao", "()Ljava/lang/String;", "getEmocao", "getIntensidadeAntes", "()I", "getPensamento", "getDistorcoes", "getEvidenciasFavor", "getEvidenciasContra", "getPensamentoAlternativo", "getIntensidadeDepois", "getCrencaAntes", "getCrencaDepois", "getId", "getTs", "()J", "getCreatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ThoughtRecord {
    public static final int $stable = 0;
    private final long createdAt;
    private final int crencaAntes;
    private final int crencaDepois;
    private final String distorcoes;
    private final String emocao;
    private final String evidenciasContra;
    private final String evidenciasFavor;
    private final String id;
    private final int intensidadeAntes;
    private final int intensidadeDepois;
    private final String pensamento;
    private final String pensamentoAlternativo;
    private final String situacao;
    private final long ts;

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSituacao() {
        return this.situacao;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getCrencaAntes() {
        return this.crencaAntes;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getCrencaDepois() {
        return this.crencaDepois;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final long getTs() {
        return this.ts;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmocao() {
        return this.emocao;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIntensidadeAntes() {
        return this.intensidadeAntes;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPensamento() {
        return this.pensamento;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDistorcoes() {
        return this.distorcoes;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEvidenciasFavor() {
        return this.evidenciasFavor;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEvidenciasContra() {
        return this.evidenciasContra;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPensamentoAlternativo() {
        return this.pensamentoAlternativo;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getIntensidadeDepois() {
        return this.intensidadeDepois;
    }

    public final ThoughtRecord copy(String situacao, String emocao, int intensidadeAntes, String pensamento, String distorcoes, String evidenciasFavor, String evidenciasContra, String pensamentoAlternativo, int intensidadeDepois, int crencaAntes, int crencaDepois, String id, long ts, long createdAt) {
        Intrinsics.checkNotNullParameter(situacao, "situacao");
        Intrinsics.checkNotNullParameter(emocao, "emocao");
        Intrinsics.checkNotNullParameter(pensamento, "pensamento");
        Intrinsics.checkNotNullParameter(distorcoes, "distorcoes");
        Intrinsics.checkNotNullParameter(evidenciasFavor, "evidenciasFavor");
        Intrinsics.checkNotNullParameter(evidenciasContra, "evidenciasContra");
        Intrinsics.checkNotNullParameter(pensamentoAlternativo, "pensamentoAlternativo");
        Intrinsics.checkNotNullParameter(id, "id");
        return new ThoughtRecord(situacao, emocao, intensidadeAntes, pensamento, distorcoes, evidenciasFavor, evidenciasContra, pensamentoAlternativo, intensidadeDepois, crencaAntes, crencaDepois, id, ts, createdAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThoughtRecord)) {
            return false;
        }
        ThoughtRecord thoughtRecord = (ThoughtRecord) other;
        return Intrinsics.areEqual(this.situacao, thoughtRecord.situacao) && Intrinsics.areEqual(this.emocao, thoughtRecord.emocao) && this.intensidadeAntes == thoughtRecord.intensidadeAntes && Intrinsics.areEqual(this.pensamento, thoughtRecord.pensamento) && Intrinsics.areEqual(this.distorcoes, thoughtRecord.distorcoes) && Intrinsics.areEqual(this.evidenciasFavor, thoughtRecord.evidenciasFavor) && Intrinsics.areEqual(this.evidenciasContra, thoughtRecord.evidenciasContra) && Intrinsics.areEqual(this.pensamentoAlternativo, thoughtRecord.pensamentoAlternativo) && this.intensidadeDepois == thoughtRecord.intensidadeDepois && this.crencaAntes == thoughtRecord.crencaAntes && this.crencaDepois == thoughtRecord.crencaDepois && Intrinsics.areEqual(this.id, thoughtRecord.id) && this.ts == thoughtRecord.ts && this.createdAt == thoughtRecord.createdAt;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.situacao.hashCode() * 31) + this.emocao.hashCode()) * 31) + Integer.hashCode(this.intensidadeAntes)) * 31) + this.pensamento.hashCode()) * 31) + this.distorcoes.hashCode()) * 31) + this.evidenciasFavor.hashCode()) * 31) + this.evidenciasContra.hashCode()) * 31) + this.pensamentoAlternativo.hashCode()) * 31) + Integer.hashCode(this.intensidadeDepois)) * 31) + Integer.hashCode(this.crencaAntes)) * 31) + Integer.hashCode(this.crencaDepois)) * 31) + this.id.hashCode()) * 31) + Long.hashCode(this.ts)) * 31) + Long.hashCode(this.createdAt);
    }

    public String toString() {
        return "ThoughtRecord(situacao=" + this.situacao + ", emocao=" + this.emocao + ", intensidadeAntes=" + this.intensidadeAntes + ", pensamento=" + this.pensamento + ", distorcoes=" + this.distorcoes + ", evidenciasFavor=" + this.evidenciasFavor + ", evidenciasContra=" + this.evidenciasContra + ", pensamentoAlternativo=" + this.pensamentoAlternativo + ", intensidadeDepois=" + this.intensidadeDepois + ", crencaAntes=" + this.crencaAntes + ", crencaDepois=" + this.crencaDepois + ", id=" + this.id + ", ts=" + this.ts + ", createdAt=" + this.createdAt + ")";
    }

    public ThoughtRecord(String situacao, String emocao, int intensidadeAntes, String pensamento, String distorcoes, String evidenciasFavor, String evidenciasContra, String pensamentoAlternativo, int intensidadeDepois, int crencaAntes, int crencaDepois, String id, long ts, long createdAt) {
        Intrinsics.checkNotNullParameter(situacao, "situacao");
        Intrinsics.checkNotNullParameter(emocao, "emocao");
        Intrinsics.checkNotNullParameter(pensamento, "pensamento");
        Intrinsics.checkNotNullParameter(distorcoes, "distorcoes");
        Intrinsics.checkNotNullParameter(evidenciasFavor, "evidenciasFavor");
        Intrinsics.checkNotNullParameter(evidenciasContra, "evidenciasContra");
        Intrinsics.checkNotNullParameter(pensamentoAlternativo, "pensamentoAlternativo");
        Intrinsics.checkNotNullParameter(id, "id");
        this.situacao = situacao;
        this.emocao = emocao;
        this.intensidadeAntes = intensidadeAntes;
        this.pensamento = pensamento;
        this.distorcoes = distorcoes;
        this.evidenciasFavor = evidenciasFavor;
        this.evidenciasContra = evidenciasContra;
        this.pensamentoAlternativo = pensamentoAlternativo;
        this.intensidadeDepois = intensidadeDepois;
        this.crencaAntes = crencaAntes;
        this.crencaDepois = crencaDepois;
        this.id = id;
        this.ts = ts;
        this.createdAt = createdAt;
    }

    public /* synthetic */ ThoughtRecord(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, int i2, int i3, int i4, String str8, long j, long j2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, str3, str4, str5, str6, str7, i2, i3, i4, (i5 & 2048) != 0 ? UUID.randomUUID().toString() : str8, (i5 & 4096) != 0 ? System.currentTimeMillis() : j, (i5 & 8192) != 0 ? System.currentTimeMillis() : j2);
    }

    public final String getSituacao() {
        return this.situacao;
    }

    public final String getEmocao() {
        return this.emocao;
    }

    public final int getIntensidadeAntes() {
        return this.intensidadeAntes;
    }

    public final String getPensamento() {
        return this.pensamento;
    }

    public final String getDistorcoes() {
        return this.distorcoes;
    }

    public final String getEvidenciasFavor() {
        return this.evidenciasFavor;
    }

    public final String getEvidenciasContra() {
        return this.evidenciasContra;
    }

    public final String getPensamentoAlternativo() {
        return this.pensamentoAlternativo;
    }

    public final int getIntensidadeDepois() {
        return this.intensidadeDepois;
    }

    public final int getCrencaAntes() {
        return this.crencaAntes;
    }

    public final int getCrencaDepois() {
        return this.crencaDepois;
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
