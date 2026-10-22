package com.spectrum.app.ui;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AacBoard.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bJ\u0016\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bJ\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/spectrum/app/ui/AacBoard;", "", "<init>", "()V", "tiles", "", "Lcom/spectrum/app/ui/AacBoard$Tile;", "getTiles", "()Ljava/util/List;", "en", "", "", "es", "resolveLang", "context", "Landroid/content/Context;", "label", "key", "lang", "bilingual", "title", "Tile", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class AacBoard {
    public static final AacBoard INSTANCE = new AacBoard();
    private static final List<Tile> tiles = CollectionsKt.listOf((Object[]) new Tile[]{new Tile("feliz", "😊", "feel", 0.75f, 0.55f), new Tile("calmo", "🌿", "feel", 0.45f, 0.2f), new Tile("triste", "😢", "feel", -0.55f, 0.25f), new Tile("bravo", "😠", "feel", -0.55f, 0.8f), new Tile("com medo", "😨", "feel", -0.6f, 0.75f), new Tile("cansado", "😴", "feel", -0.25f, 0.1f), new Tile("cheio demais", "💥", "pause", -0.5f, 0.9f), new Tile("ajuda", "🆘", "help", -0.4f, 0.7f), new Tile("não", "🚫", "need", -0.35f, 0.55f), new Tile("quero parar", "✋", "pause", -0.3f, 0.5f), new Tile("dói", "💢", "need", -0.7f, 0.65f), new Tile("fome", "🍽️", "need", -0.2f, 0.4f), new Tile("banheiro", "🚻", "need", 0.0f, 0.4f), new Tile("silêncio", "🔇", "quiet", -0.1f, 0.2f), new Tile("sozinho", "🚪", "need", -0.15f, 0.3f), new Tile("ok", "👍", "okay", 0.25f, 0.3f)});
    private static final Map<String, String> en = MapsKt.mapOf(TuplesKt.to("feliz", "happy"), TuplesKt.to("calmo", "calm"), TuplesKt.to("triste", "sad"), TuplesKt.to("bravo", "angry"), TuplesKt.to("com medo", "scared"), TuplesKt.to("cansado", "tired"), TuplesKt.to("cheio demais", "too much"), TuplesKt.to("ajuda", "help"), TuplesKt.to("não", "no"), TuplesKt.to("quero parar", "stop"), TuplesKt.to("dói", "hurts"), TuplesKt.to("fome", "hungry"), TuplesKt.to("banheiro", "bathroom"), TuplesKt.to("silêncio", "quiet"), TuplesKt.to("sozinho", "alone"), TuplesKt.to("ok", "ok"));
    private static final Map<String, String> es = MapsKt.mapOf(TuplesKt.to("feliz", "feliz"), TuplesKt.to("calmo", "tranquilo"), TuplesKt.to("triste", "triste"), TuplesKt.to("bravo", "enojado"), TuplesKt.to("com medo", "miedo"), TuplesKt.to("cansado", "cansado"), TuplesKt.to("cheio demais", "demasiado"), TuplesKt.to("ajuda", "ayuda"), TuplesKt.to("não", "no"), TuplesKt.to("quero parar", "parar"), TuplesKt.to("dói", "duele"), TuplesKt.to("fome", "hambre"), TuplesKt.to("banheiro", "baño"), TuplesKt.to("silêncio", "silencio"), TuplesKt.to("sozinho", "solo"), TuplesKt.to("ok", "ok"));
    public static final int $stable = 8;

    private AacBoard() {
    }

    /* JADX INFO: compiled from: AacBoard.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/spectrum/app/ui/AacBoard$Tile;", "", "key", "", "emoji", "kind", "valence", "", "arousal", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FF)V", "getKey", "()Ljava/lang/String;", "getEmoji", "getKind", "getValence", "()F", "getArousal", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Tile {
        public static final int $stable = 0;
        private final float arousal;
        private final String emoji;
        private final String key;
        private final String kind;
        private final float valence;

        public static /* synthetic */ Tile copy$default(Tile tile, String str, String str2, String str3, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tile.key;
            }
            if ((i & 2) != 0) {
                str2 = tile.emoji;
            }
            String str4 = str2;
            if ((i & 4) != 0) {
                str3 = tile.kind;
            }
            String str5 = str3;
            if ((i & 8) != 0) {
                f = tile.valence;
            }
            float f3 = f;
            if ((i & 16) != 0) {
                f2 = tile.arousal;
            }
            return tile.copy(str, str4, str5, f3, f2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getEmoji() {
            return this.emoji;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getKind() {
            return this.kind;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getValence() {
            return this.valence;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final float getArousal() {
            return this.arousal;
        }

        public final Tile copy(String key, String emoji, String kind, float valence, float arousal) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(emoji, "emoji");
            Intrinsics.checkNotNullParameter(kind, "kind");
            return new Tile(key, emoji, kind, valence, arousal);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tile)) {
                return false;
            }
            Tile tile = (Tile) other;
            return Intrinsics.areEqual(this.key, tile.key) && Intrinsics.areEqual(this.emoji, tile.emoji) && Intrinsics.areEqual(this.kind, tile.kind) && Float.compare(this.valence, tile.valence) == 0 && Float.compare(this.arousal, tile.arousal) == 0;
        }

        public int hashCode() {
            return (((((((this.key.hashCode() * 31) + this.emoji.hashCode()) * 31) + this.kind.hashCode()) * 31) + Float.hashCode(this.valence)) * 31) + Float.hashCode(this.arousal);
        }

        public String toString() {
            return "Tile(key=" + this.key + ", emoji=" + this.emoji + ", kind=" + this.kind + ", valence=" + this.valence + ", arousal=" + this.arousal + ")";
        }

        public Tile(String key, String emoji, String kind, float valence, float arousal) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(emoji, "emoji");
            Intrinsics.checkNotNullParameter(kind, "kind");
            this.key = key;
            this.emoji = emoji;
            this.kind = kind;
            this.valence = valence;
            this.arousal = arousal;
        }

        public final String getKey() {
            return this.key;
        }

        public final String getEmoji() {
            return this.emoji;
        }

        public final String getKind() {
            return this.kind;
        }

        public final float getValence() {
            return this.valence;
        }

        public final float getArousal() {
            return this.arousal;
        }
    }

    public final List<Tile> getTiles() {
        return tiles;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r0.equals("en") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r0.equals("pt") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r0.equals("es") != false) goto L14;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String resolveLang(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            com.spectrum.app.data.UserPrefs r0 = com.spectrum.app.data.UserPrefs.INSTANCE
            java.lang.String r0 = r0.boardLang(r7)
            int r1 = r0.hashCode()
            java.lang.String r2 = "pt"
            java.lang.String r3 = "es"
            java.lang.String r4 = "en"
            switch(r1) {
                case 3241: goto L27;
                case 3246: goto L20;
                case 3588: goto L19;
                default: goto L18;
            }
        L18:
            goto L2f
        L19:
            boolean r1 = r0.equals(r2)
            if (r1 != 0) goto L2e
            goto L18
        L20:
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L18
            goto L2e
        L27:
            boolean r1 = r0.equals(r4)
            if (r1 != 0) goto L2e
            goto L18
        L2e:
            return r0
        L2f:
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r1 = r1.getLanguage()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r5 == 0) goto L3f
            r2 = r4
            goto L48
        L3f:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 == 0) goto L47
            r2 = r3
            goto L48
        L47:
        L48:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spectrum.app.ui.AacBoard.resolveLang(android.content.Context):java.lang.String");
    }

    public final String label(String key, String lang) {
        String str;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(lang, "lang");
        if (Intrinsics.areEqual(lang, "en")) {
            String str2 = en.get(key);
            if (str2 != null) {
                return str2;
            }
        } else if (Intrinsics.areEqual(lang, "es") && (str = es.get(key)) != null) {
            return str;
        }
        return key;
    }

    public final String bilingual(String key, String lang) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(lang, "lang");
        String t = label(key, lang);
        return (Intrinsics.areEqual(lang, "pt") || Intrinsics.areEqual(t, key)) ? key : key + " · " + t;
    }

    public final String title(String lang) {
        Intrinsics.checkNotNullParameter(lang, "lang");
        if (Intrinsics.areEqual(lang, "en")) {
            return "Tap what it is now";
        }
        return Intrinsics.areEqual(lang, "es") ? "Toca lo que es ahora" : "Toque o que é agora";
    }
}
