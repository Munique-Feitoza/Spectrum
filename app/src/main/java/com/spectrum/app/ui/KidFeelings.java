package com.spectrum.app.ui;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KidFeelings.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/spectrum/app/ui/KidFeelings;", "", "<init>", "()V", "all", "", "Lcom/spectrum/app/ui/KidFeelings$Feeling;", "getAll", "()Ljava/util/List;", "Feeling", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class KidFeelings {
    public static final KidFeelings INSTANCE = new KidFeelings();
    private static final List<Feeling> all = CollectionsKt.listOf((Object[]) new Feeling[]{new Feeling("feliz", "😊", 0.75f, 0.55f), new Feeling("calmo", "🌿", 0.45f, 0.2f), new Feeling("triste", "😢", -0.55f, 0.25f), new Feeling("bravo", "😠", -0.55f, 0.8f), new Feeling("com medo", "😨", -0.6f, 0.75f), new Feeling("cansado", "😴", -0.25f, 0.1f), new Feeling("confuso", "😕", -0.15f, 0.5f), new Feeling("alegre demais", "⚡", 0.4f, 0.9f)});
    public static final int $stable = 8;

    /* JADX INFO: compiled from: KidFeelings.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/spectrum/app/ui/KidFeelings$Feeling;", "", "name", "", "emoji", "valence", "", "arousal", "<init>", "(Ljava/lang/String;Ljava/lang/String;FF)V", "getName", "()Ljava/lang/String;", "getEmoji", "getValence", "()F", "getArousal", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Feeling {
        public static final int $stable = 0;
        private final float arousal;
        private final String emoji;
        private final String name;
        private final float valence;

        public static /* synthetic */ Feeling copy$default(Feeling feeling, String str, String str2, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = feeling.name;
            }
            if ((i & 2) != 0) {
                str2 = feeling.emoji;
            }
            if ((i & 4) != 0) {
                f = feeling.valence;
            }
            if ((i & 8) != 0) {
                f2 = feeling.arousal;
            }
            return feeling.copy(str, str2, f, f2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getEmoji() {
            return this.emoji;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getValence() {
            return this.valence;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getArousal() {
            return this.arousal;
        }

        public final Feeling copy(String name, String emoji, float valence, float arousal) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(emoji, "emoji");
            return new Feeling(name, emoji, valence, arousal);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Feeling)) {
                return false;
            }
            Feeling feeling = (Feeling) other;
            return Intrinsics.areEqual(this.name, feeling.name) && Intrinsics.areEqual(this.emoji, feeling.emoji) && Float.compare(this.valence, feeling.valence) == 0 && Float.compare(this.arousal, feeling.arousal) == 0;
        }

        public int hashCode() {
            return (((((this.name.hashCode() * 31) + this.emoji.hashCode()) * 31) + Float.hashCode(this.valence)) * 31) + Float.hashCode(this.arousal);
        }

        public String toString() {
            return "Feeling(name=" + this.name + ", emoji=" + this.emoji + ", valence=" + this.valence + ", arousal=" + this.arousal + ")";
        }

        public Feeling(String name, String emoji, float valence, float arousal) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(emoji, "emoji");
            this.name = name;
            this.emoji = emoji;
            this.valence = valence;
            this.arousal = arousal;
        }

        public final String getName() {
            return this.name;
        }

        public final String getEmoji() {
            return this.emoji;
        }

        public final float getValence() {
            return this.valence;
        }

        public final float getArousal() {
            return this.arousal;
        }
    }

    private KidFeelings() {
    }

    public final List<Feeling> getAll() {
        return all;
    }
}
