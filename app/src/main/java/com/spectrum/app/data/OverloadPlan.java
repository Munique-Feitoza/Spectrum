package com.spectrum.app.data;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: OverloadPlan.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/spectrum/app/data/OverloadPlan;", "", "id", "", "sinais", "", "umMinuto", "evitar", "frase", "ancora", "updatedAt", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getId", "()I", "getSinais", "()Ljava/lang/String;", "getUmMinuto", "getEvitar", "getFrase", "getAncora", "getUpdatedAt", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class OverloadPlan {
    public static final int $stable = 0;
    private final String ancora;
    private final String evitar;
    private final String frase;
    private final int id;
    private final String sinais;
    private final String umMinuto;
    private final long updatedAt;

    public OverloadPlan() {
        this(0, null, null, null, null, null, 0L, WorkQueueKt.MASK, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSinais() {
        return this.sinais;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUmMinuto() {
        return this.umMinuto;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEvitar() {
        return this.evitar;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFrase() {
        return this.frase;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAncora() {
        return this.ancora;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public final OverloadPlan copy(int id, String sinais, String umMinuto, String evitar, String frase, String ancora, long updatedAt) {
        Intrinsics.checkNotNullParameter(sinais, "sinais");
        Intrinsics.checkNotNullParameter(umMinuto, "umMinuto");
        Intrinsics.checkNotNullParameter(evitar, "evitar");
        Intrinsics.checkNotNullParameter(frase, "frase");
        Intrinsics.checkNotNullParameter(ancora, "ancora");
        return new OverloadPlan(id, sinais, umMinuto, evitar, frase, ancora, updatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OverloadPlan)) {
            return false;
        }
        OverloadPlan overloadPlan = (OverloadPlan) other;
        return this.id == overloadPlan.id && Intrinsics.areEqual(this.sinais, overloadPlan.sinais) && Intrinsics.areEqual(this.umMinuto, overloadPlan.umMinuto) && Intrinsics.areEqual(this.evitar, overloadPlan.evitar) && Intrinsics.areEqual(this.frase, overloadPlan.frase) && Intrinsics.areEqual(this.ancora, overloadPlan.ancora) && this.updatedAt == overloadPlan.updatedAt;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.id) * 31) + this.sinais.hashCode()) * 31) + this.umMinuto.hashCode()) * 31) + this.evitar.hashCode()) * 31) + this.frase.hashCode()) * 31) + this.ancora.hashCode()) * 31) + Long.hashCode(this.updatedAt);
    }

    public String toString() {
        return "OverloadPlan(id=" + this.id + ", sinais=" + this.sinais + ", umMinuto=" + this.umMinuto + ", evitar=" + this.evitar + ", frase=" + this.frase + ", ancora=" + this.ancora + ", updatedAt=" + this.updatedAt + ")";
    }

    public OverloadPlan(int id, String sinais, String umMinuto, String evitar, String frase, String ancora, long updatedAt) {
        Intrinsics.checkNotNullParameter(sinais, "sinais");
        Intrinsics.checkNotNullParameter(umMinuto, "umMinuto");
        Intrinsics.checkNotNullParameter(evitar, "evitar");
        Intrinsics.checkNotNullParameter(frase, "frase");
        Intrinsics.checkNotNullParameter(ancora, "ancora");
        this.id = id;
        this.sinais = sinais;
        this.umMinuto = umMinuto;
        this.evitar = evitar;
        this.frase = frase;
        this.ancora = ancora;
        this.updatedAt = updatedAt;
    }

    public /* synthetic */ OverloadPlan(int i, String str, String str2, String str3, String str4, String str5, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) == 0 ? str5 : "", (i2 & 64) != 0 ? System.currentTimeMillis() : j);
    }

    public final int getId() {
        return this.id;
    }

    public final String getSinais() {
        return this.sinais;
    }

    public final String getUmMinuto() {
        return this.umMinuto;
    }

    public final String getEvitar() {
        return this.evitar;
    }

    public final String getFrase() {
        return this.frase;
    }

    public final String getAncora() {
        return this.ancora;
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
    }
}
