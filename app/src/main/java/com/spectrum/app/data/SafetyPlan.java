package com.spectrum.app.data;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SafetyPlan.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lcom/spectrum/app/data/SafetyPlan;", "", "id", "", "sinaisAlerta", "", "estrategias", "pessoasDistracao", "pessoasAjuda", "profissionais", "ambienteSeguro", "updatedAt", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getId", "()I", "getSinaisAlerta", "()Ljava/lang/String;", "getEstrategias", "getPessoasDistracao", "getPessoasAjuda", "getProfissionais", "getAmbienteSeguro", "getUpdatedAt", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class SafetyPlan {
    public static final int $stable = 0;
    private final String ambienteSeguro;
    private final String estrategias;
    private final int id;
    private final String pessoasAjuda;
    private final String pessoasDistracao;
    private final String profissionais;
    private final String sinaisAlerta;
    private final long updatedAt;

    public SafetyPlan() {
        this(0, null, null, null, null, null, null, 0L, 255, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSinaisAlerta() {
        return this.sinaisAlerta;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEstrategias() {
        return this.estrategias;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPessoasDistracao() {
        return this.pessoasDistracao;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPessoasAjuda() {
        return this.pessoasAjuda;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getProfissionais() {
        return this.profissionais;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAmbienteSeguro() {
        return this.ambienteSeguro;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public final SafetyPlan copy(int id, String sinaisAlerta, String estrategias, String pessoasDistracao, String pessoasAjuda, String profissionais, String ambienteSeguro, long updatedAt) {
        Intrinsics.checkNotNullParameter(sinaisAlerta, "sinaisAlerta");
        Intrinsics.checkNotNullParameter(estrategias, "estrategias");
        Intrinsics.checkNotNullParameter(pessoasDistracao, "pessoasDistracao");
        Intrinsics.checkNotNullParameter(pessoasAjuda, "pessoasAjuda");
        Intrinsics.checkNotNullParameter(profissionais, "profissionais");
        Intrinsics.checkNotNullParameter(ambienteSeguro, "ambienteSeguro");
        return new SafetyPlan(id, sinaisAlerta, estrategias, pessoasDistracao, pessoasAjuda, profissionais, ambienteSeguro, updatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SafetyPlan)) {
            return false;
        }
        SafetyPlan safetyPlan = (SafetyPlan) other;
        return this.id == safetyPlan.id && Intrinsics.areEqual(this.sinaisAlerta, safetyPlan.sinaisAlerta) && Intrinsics.areEqual(this.estrategias, safetyPlan.estrategias) && Intrinsics.areEqual(this.pessoasDistracao, safetyPlan.pessoasDistracao) && Intrinsics.areEqual(this.pessoasAjuda, safetyPlan.pessoasAjuda) && Intrinsics.areEqual(this.profissionais, safetyPlan.profissionais) && Intrinsics.areEqual(this.ambienteSeguro, safetyPlan.ambienteSeguro) && this.updatedAt == safetyPlan.updatedAt;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.id) * 31) + this.sinaisAlerta.hashCode()) * 31) + this.estrategias.hashCode()) * 31) + this.pessoasDistracao.hashCode()) * 31) + this.pessoasAjuda.hashCode()) * 31) + this.profissionais.hashCode()) * 31) + this.ambienteSeguro.hashCode()) * 31) + Long.hashCode(this.updatedAt);
    }

    public String toString() {
        return "SafetyPlan(id=" + this.id + ", sinaisAlerta=" + this.sinaisAlerta + ", estrategias=" + this.estrategias + ", pessoasDistracao=" + this.pessoasDistracao + ", pessoasAjuda=" + this.pessoasAjuda + ", profissionais=" + this.profissionais + ", ambienteSeguro=" + this.ambienteSeguro + ", updatedAt=" + this.updatedAt + ")";
    }

    public SafetyPlan(int id, String sinaisAlerta, String estrategias, String pessoasDistracao, String pessoasAjuda, String profissionais, String ambienteSeguro, long updatedAt) {
        Intrinsics.checkNotNullParameter(sinaisAlerta, "sinaisAlerta");
        Intrinsics.checkNotNullParameter(estrategias, "estrategias");
        Intrinsics.checkNotNullParameter(pessoasDistracao, "pessoasDistracao");
        Intrinsics.checkNotNullParameter(pessoasAjuda, "pessoasAjuda");
        Intrinsics.checkNotNullParameter(profissionais, "profissionais");
        Intrinsics.checkNotNullParameter(ambienteSeguro, "ambienteSeguro");
        this.id = id;
        this.sinaisAlerta = sinaisAlerta;
        this.estrategias = estrategias;
        this.pessoasDistracao = pessoasDistracao;
        this.pessoasAjuda = pessoasAjuda;
        this.profissionais = profissionais;
        this.ambienteSeguro = ambienteSeguro;
        this.updatedAt = updatedAt;
    }

    public /* synthetic */ SafetyPlan(int i, String str, String str2, String str3, String str4, String str5, String str6, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) == 0 ? str6 : "", (i2 & 128) != 0 ? System.currentTimeMillis() : j);
    }

    public final int getId() {
        return this.id;
    }

    public final String getSinaisAlerta() {
        return this.sinaisAlerta;
    }

    public final String getEstrategias() {
        return this.estrategias;
    }

    public final String getPessoasDistracao() {
        return this.pessoasDistracao;
    }

    public final String getPessoasAjuda() {
        return this.pessoasAjuda;
    }

    public final String getProfissionais() {
        return this.profissionais;
    }

    public final String getAmbienteSeguro() {
        return this.ambienteSeguro;
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
    }
}
