package com.spectrum.app.widget;

import android.content.ComponentName;
import android.content.Context;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.glance.BackgroundKt;
import androidx.glance.CompositionLocalsKt;
import androidx.glance.GlanceId;
import androidx.glance.GlanceModifier;
import androidx.glance.ImageKt;
import androidx.glance.action.ActionKt;
import androidx.glance.action.ActionParameters;
import androidx.glance.action.ActionParametersKt;
import androidx.glance.action.StartActivityActionKt;
import androidx.glance.appwidget.CornerRadiusKt;
import androidx.glance.appwidget.GlanceAppWidget;
import androidx.glance.appwidget.GlanceAppWidgetKt;
import androidx.glance.appwidget.action.RunCallbackActionKt;
import androidx.glance.layout.Alignment;
import androidx.glance.layout.BoxKt;
import androidx.glance.layout.ColumnKt;
import androidx.glance.layout.ColumnScope;
import androidx.glance.layout.PaddingKt;
import androidx.glance.layout.RowKt;
import androidx.glance.layout.RowScope;
import androidx.glance.layout.SizeModifiersKt;
import androidx.glance.layout.SpacerKt;
import androidx.glance.text.FontWeight;
import androidx.glance.text.TextAlign;
import androidx.glance.text.TextKt;
import androidx.glance.text.TextStyle;
import androidx.glance.unit.ColorProvider;
import androidx.glance.unit.ColorProviderKt;
import com.spectrum.app.R;
import com.spectrum.app.ui.CoreEmotion;
import com.spectrum.app.ui.EmotionWheel;
import com.spectrum.app.ui.EmotionWord;
import com.spectrum.app.ui.MainActivity;
import com.spectrum.app.ui.SecondaryEmotion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: QuickLogWidget.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u0000 *2\u00020\u0001:\u0002)*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\r\u0010\u000b\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\fJ%\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0003¢\u0006\u0002\u0010\u0017J?\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u0016H\u0003¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016H\u0003¢\u0006\u0002\u0010$J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0&H\u0002J\u0010\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u001aH\u0002¨\u0006+"}, d2 = {"Lcom/spectrum/app/widget/QuickLogWidget;", "Landroidx/glance/appwidget/GlanceAppWidget;", "<init>", "()V", "provideGlance", "", "context", "Landroid/content/Context;", "id", "Landroidx/glance/GlanceId;", "(Landroid/content/Context;Landroidx/glance/GlanceId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Content", "(Landroidx/compose/runtime/Composer;I)V", "Row3", "a", "Lcom/spectrum/app/widget/QuickLogWidget$Core;", "b", "c", "(Lcom/spectrum/app/widget/QuickLogWidget$Core;Lcom/spectrum/app/widget/QuickLogWidget$Core;Lcom/spectrum/app/widget/QuickLogWidget$Core;Landroidx/compose/runtime/Composer;I)V", "CorePill", "core", "modifier", "Landroidx/glance/GlanceModifier;", "(Lcom/spectrum/app/widget/QuickLogWidget$Core;Landroidx/glance/GlanceModifier;Landroidx/compose/runtime/Composer;I)V", "CarePill", "text", "", "kind", "valence", "", "arousal", "color", "Landroidx/compose/ui/graphics/Color;", "CarePill-yrwZFoE", "(Ljava/lang/String;Ljava/lang/String;FFJLandroidx/glance/GlanceModifier;Landroidx/compose/runtime/Composer;I)V", "OpenPill", "(Landroidx/glance/GlanceModifier;Landroidx/compose/runtime/Composer;I)V", "widgetCores", "", "emojiFor", "name", "Core", "Companion", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class QuickLogWidget extends GlanceAppWidget {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    private static final ColorProvider INK = ColorProviderKt.m1366ColorProvider8_81llA(ColorKt.Color(4280952883L));

    /* JADX INFO: renamed from: com.spectrum.app.widget.QuickLogWidget$provideGlance$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: QuickLogWidget.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.spectrum.app.widget.QuickLogWidget", f = "QuickLogWidget.kt", i = {}, l = {58}, m = "provideGlance", n = {}, s = {})
    static final class C01871 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C01871(Continuation<? super C01871> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return QuickLogWidget.this.provideGlance(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CarePill_yrwZFoE$lambda$3(QuickLogWidget quickLogWidget, String str, String str2, float f, float f2, long j, GlanceModifier glanceModifier, int i, Composer composer, int i2) {
        quickLogWidget.m1533CarePillyrwZFoE(str, str2, f, f2, j, glanceModifier, composer, i | 1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$0(QuickLogWidget quickLogWidget, int i, Composer composer, int i2) {
        quickLogWidget.Content(composer, i | 1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CorePill$lambda$2(QuickLogWidget quickLogWidget, Core core, GlanceModifier glanceModifier, int i, Composer composer, int i2) {
        quickLogWidget.CorePill(core, glanceModifier, composer, i | 1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OpenPill$lambda$4(QuickLogWidget quickLogWidget, GlanceModifier glanceModifier, int i, Composer composer, int i2) {
        quickLogWidget.OpenPill(glanceModifier, composer, i | 1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Row3$lambda$1(QuickLogWidget quickLogWidget, Core core, Core core2, Core core3, int i, Composer composer, int i2) {
        quickLogWidget.Row3(core, core2, core3, composer, i | 1);
        return Unit.INSTANCE;
    }

    public QuickLogWidget() {
        super(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: QuickLogWidget.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0010J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003JB\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u00020\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006$"}, d2 = {"Lcom/spectrum/app/widget/QuickLogWidget$Core;", "", "name", "", "emoji", "color", "Landroidx/compose/ui/graphics/Color;", "valence", "", "arousal", "<init>", "(Ljava/lang/String;Ljava/lang/String;JFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getName", "()Ljava/lang/String;", "getEmoji", "getColor-0d7_KjU", "()J", "J", "getValence", "()F", "getArousal", "component1", "component2", "component3", "component3-0d7_KjU", "component4", "component5", "copy", "copy-XO-JAsU", "(Ljava/lang/String;Ljava/lang/String;JFF)Lcom/spectrum/app/widget/QuickLogWidget$Core;", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    static final /* data */ class Core {
        private final float arousal;
        private final long color;
        private final String emoji;
        private final String name;
        private final float valence;

        public /* synthetic */ Core(String str, String str2, long j, float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, j, f, f2);
        }

        /* JADX INFO: renamed from: copy-XO-JAsU$default, reason: not valid java name */
        public static /* synthetic */ Core m1535copyXOJAsU$default(Core core, String str, String str2, long j, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = core.name;
            }
            if ((i & 2) != 0) {
                str2 = core.emoji;
            }
            String str3 = str2;
            if ((i & 4) != 0) {
                j = core.color;
            }
            long j2 = j;
            if ((i & 8) != 0) {
                f = core.valence;
            }
            float f3 = f;
            if ((i & 16) != 0) {
                f2 = core.arousal;
            }
            return core.m1537copyXOJAsU(str, str3, j2, f3, f2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getEmoji() {
            return this.emoji;
        }

        /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getColor() {
            return this.color;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getValence() {
            return this.valence;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final float getArousal() {
            return this.arousal;
        }

        /* JADX INFO: renamed from: copy-XO-JAsU, reason: not valid java name */
        public final Core m1537copyXOJAsU(String name, String emoji, long color, float valence, float arousal) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(emoji, "emoji");
            return new Core(name, emoji, color, valence, arousal, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Core)) {
                return false;
            }
            Core core = (Core) other;
            return Intrinsics.areEqual(this.name, core.name) && Intrinsics.areEqual(this.emoji, core.emoji) && Color.m331equalsimpl0(this.color, core.color) && Float.compare(this.valence, core.valence) == 0 && Float.compare(this.arousal, core.arousal) == 0;
        }

        public int hashCode() {
            return (((((((this.name.hashCode() * 31) + this.emoji.hashCode()) * 31) + Color.m337hashCodeimpl(this.color)) * 31) + Float.hashCode(this.valence)) * 31) + Float.hashCode(this.arousal);
        }

        public String toString() {
            return "Core(name=" + this.name + ", emoji=" + this.emoji + ", color=" + Color.m338toStringimpl(this.color) + ", valence=" + this.valence + ", arousal=" + this.arousal + ")";
        }

        private Core(String name, String emoji, long color, float valence, float arousal) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(emoji, "emoji");
            this.name = name;
            this.emoji = emoji;
            this.color = color;
            this.valence = valence;
            this.arousal = arousal;
        }

        public final String getName() {
            return this.name;
        }

        public final String getEmoji() {
            return this.emoji;
        }

        /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
        public final long m1538getColor0d7_KjU() {
            return this.color;
        }

        public final float getValence() {
            return this.valence;
        }

        public final float getArousal() {
            return this.arousal;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.glance.appwidget.GlanceAppWidget
    public Object provideGlance(Context context, GlanceId glanceId, Continuation<? super Unit> continuation) {
        C01871 c01871;
        if (continuation instanceof C01871) {
            c01871 = (C01871) continuation;
            if ((c01871.label & Integer.MIN_VALUE) != 0) {
                c01871.label -= Integer.MIN_VALUE;
            } else {
                c01871 = new C01871(continuation);
            }
        } else {
            c01871 = new C01871(continuation);
        }
        Object $result = c01871.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c01871.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                ComposableLambda composableLambdaComposableLambdaInstance = ComposableLambdaKt.composableLambdaInstance(-1763852657, true, new Function2<Composer, Integer, Unit>() { // from class: com.spectrum.app.widget.QuickLogWidget.provideGlance.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer $composer, int $changed) {
                        ComposerKt.sourceInformation($composer, "C57@2051L9:QuickLogWidget.kt#17i9dr");
                        if (($changed & 3) == 2 && $composer.getSkipping()) {
                            $composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1763852657, $changed, -1, "com.spectrum.app.widget.QuickLogWidget.provideGlance.<anonymous> (QuickLogWidget.kt:57)");
                        }
                        QuickLogWidget.this.Content($composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                c01871.label = 1;
                if (GlanceAppWidgetKt.provideContent(this, composableLambdaComposableLambdaInstance, c01871) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Content(Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(950391482);
        ComposerKt.sourceInformation($composer2, "C(Content)63@2156L1401:QuickLogWidget.kt#17i9dr");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(this) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 3) != 2 || !$composer2.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(950391482, $dirty2, -1, "com.spectrum.app.widget.QuickLogWidget.Content (QuickLogWidget.kt:61)");
            }
            final List<Core> listWidgetCores = widgetCores();
            BoxKt.Box(CornerRadiusKt.m1160cornerRadius3ABfNKs(BackgroundKt.m1126background4WTKRHQ(SizeModifiersKt.fillMaxSize(GlanceModifier.INSTANCE), ColorKt.Color(4293456356L)), Dp.m844constructorimpl(24)), Alignment.INSTANCE.getTopEnd(), ComposableLambdaKt.composableLambda($composer2, -564938728, true, new Function2<Composer, Integer, Unit>() { // from class: com.spectrum.app.widget.QuickLogWidget.Content.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer $composer3, int $changed2) {
                    ComposerKt.sourceInformation($composer3, "C70@2388L954,88@3355L192:QuickLogWidget.kt#17i9dr");
                    if (($changed2 & 3) != 2 || !$composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-564938728, $changed2, -1, "com.spectrum.app.widget.QuickLogWidget.Content.<anonymous> (QuickLogWidget.kt:70)");
                        }
                        GlanceModifier glanceModifierM1290padding3ABfNKs = PaddingKt.m1290padding3ABfNKs(SizeModifiersKt.fillMaxSize(GlanceModifier.INSTANCE), Dp.m844constructorimpl(10));
                        final QuickLogWidget quickLogWidget = QuickLogWidget.this;
                        final List<Core> list = listWidgetCores;
                        ColumnKt.m1249ColumnK4GKKTE(glanceModifierM1290padding3ABfNKs, 0, 0, ComposableLambdaKt.composableLambda($composer3, 1768685666, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.spectrum.app.widget.QuickLogWidget.Content.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
                                invoke(columnScope, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(ColumnScope Column, Composer $composer4, int $changed3) {
                                Intrinsics.checkNotNullParameter(Column, "$this$Column");
                                ComposerKt.sourceInformation($composer4, "C71@2458L187,75@2662L35,76@2714L34,77@2765L35,78@2817L34,79@2868L35,80@2920L408:QuickLogWidget.kt#17i9dr");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1768685666, $changed3, -1, "com.spectrum.app.widget.QuickLogWidget.Content.<anonymous>.<anonymous> (QuickLogWidget.kt:71)");
                                }
                                TextKt.Text("Como você está? Um toque basta.", null, new TextStyle(QuickLogWidget.Companion.getINK(), TextUnit.m1015boximpl(TextUnitKt.getSp(13)), FontWeight.m1324boximpl(FontWeight.INSTANCE.m1332getMediumWjrlUT0()), null, null, null, null, 120, null), 0, $composer4, 6, 10);
                                SpacerKt.Spacer(SizeModifiersKt.m1299height3ABfNKs(GlanceModifier.INSTANCE, Dp.m844constructorimpl(6)), $composer4, 0, 0);
                                quickLogWidget.Row3(list.get(0), list.get(1), list.get(2), $composer4, 0);
                                SpacerKt.Spacer(SizeModifiersKt.m1299height3ABfNKs(GlanceModifier.INSTANCE, Dp.m844constructorimpl(5)), $composer4, 0, 0);
                                quickLogWidget.Row3(list.get(3), list.get(4), list.get(5), $composer4, 0);
                                SpacerKt.Spacer(SizeModifiersKt.m1299height3ABfNKs(GlanceModifier.INSTANCE, Dp.m844constructorimpl(5)), $composer4, 0, 0);
                                GlanceModifier glanceModifierFillMaxWidth = SizeModifiersKt.fillMaxWidth(GlanceModifier.INSTANCE);
                                final QuickLogWidget quickLogWidget2 = quickLogWidget;
                                final List<Core> list2 = list;
                                RowKt.m1296RowlMAjyxE(glanceModifierFillMaxWidth, 0, 0, ComposableLambdaKt.composableLambda($composer4, 876646526, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.spectrum.app.widget.QuickLogWidget.Content.1.1.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
                                        invoke(rowScope, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(RowScope Row, Composer $composer5, int $changed4) {
                                        Intrinsics.checkNotNullParameter(Row, "$this$Row");
                                        ComposerKt.sourceInformation($composer5, "C81@2977L50,82@3048L34,83@3103L91,84@3215L34,85@3270L40:QuickLogWidget.kt#17i9dr");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(876646526, $changed4, -1, "com.spectrum.app.widget.QuickLogWidget.Content.<anonymous>.<anonymous>.<anonymous> (QuickLogWidget.kt:81)");
                                        }
                                        quickLogWidget2.CorePill(list2.get(6), Row.defaultWeight(GlanceModifier.INSTANCE), $composer5, 0);
                                        SpacerKt.Spacer(SizeModifiersKt.m1302width3ABfNKs(GlanceModifier.INSTANCE, Dp.m844constructorimpl(5)), $composer5, 0, 0);
                                        quickLogWidget2.m1533CarePillyrwZFoE("Pausar", "pause", -0.2f, 0.2f, ColorKt.Color(4292339920L), Row.defaultWeight(GlanceModifier.INSTANCE), $composer5, 27702);
                                        SpacerKt.Spacer(SizeModifiersKt.m1302width3ABfNKs(GlanceModifier.INSTANCE, Dp.m844constructorimpl(5)), $composer5, 0, 0);
                                        quickLogWidget2.OpenPill(Row.defaultWeight(GlanceModifier.INSTANCE), $composer5, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), $composer4, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), $composer3, 3072, 6);
                        ImageKt.m1135ImageGCr5PR4(ImageKt.ImageProvider(R.drawable.sprig), null, PaddingKt.m1290padding3ABfNKs(SizeModifiersKt.m1300size3ABfNKs(GlanceModifier.INSTANCE, Dp.m844constructorimpl(40)), Dp.m844constructorimpl(6)), 0, null, $composer3, 48, 24);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    $composer3.skipToGroupEnd();
                }
            }), $composer2, (Alignment.$stable << 3) | 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.spectrum.app.widget.QuickLogWidget$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QuickLogWidget.Content$lambda$0(this.f$0, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Row3(final Core a, final Core b, final Core c, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(492927287);
        ComposerKt.sourceInformation($composer2, "C(Row3)98@3639L308:QuickLogWidget.kt#17i9dr");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(a) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(b) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changed(c) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changed(this) ? 2048 : 1024;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 1171) != 1170 || !$composer2.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(492927287, $dirty2, -1, "com.spectrum.app.widget.QuickLogWidget.Row3 (QuickLogWidget.kt:97)");
            }
            RowKt.m1296RowlMAjyxE(SizeModifiersKt.fillMaxWidth(GlanceModifier.INSTANCE), 0, 0, ComposableLambdaKt.composableLambda($composer2, -262731181, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.spectrum.app.widget.QuickLogWidget.Row3.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
                    invoke(rowScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope Row, Composer $composer3, int $changed2) {
                    Intrinsics.checkNotNullParameter(Row, "$this$Row");
                    ComposerKt.sourceInformation($composer3, "C99@3688L43,100@3744L34,101@3791L43,102@3847L34,103@3894L43:QuickLogWidget.kt#17i9dr");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-262731181, $changed2, -1, "com.spectrum.app.widget.QuickLogWidget.Row3.<anonymous> (QuickLogWidget.kt:99)");
                    }
                    QuickLogWidget.this.CorePill(a, Row.defaultWeight(GlanceModifier.INSTANCE), $composer3, 0);
                    SpacerKt.Spacer(SizeModifiersKt.m1302width3ABfNKs(GlanceModifier.INSTANCE, Dp.m844constructorimpl(5)), $composer3, 0, 0);
                    QuickLogWidget.this.CorePill(b, Row.defaultWeight(GlanceModifier.INSTANCE), $composer3, 0);
                    SpacerKt.Spacer(SizeModifiersKt.m1302width3ABfNKs(GlanceModifier.INSTANCE, Dp.m844constructorimpl(5)), $composer3, 0, 0);
                    QuickLogWidget.this.CorePill(c, Row.defaultWeight(GlanceModifier.INSTANCE), $composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), $composer2, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.spectrum.app.widget.QuickLogWidget$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QuickLogWidget.Row3$lambda$1(this.f$0, a, b, c, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void CorePill(final Core core, final GlanceModifier modifier, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1201531775);
        ComposerKt.sourceInformation($composer2, "C(CorePill)109@4044L753:QuickLogWidget.kt#17i9dr");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(core) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(modifier) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 19) == 18 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1201531775, $dirty2, -1, "com.spectrum.app.widget.QuickLogWidget.CorePill (QuickLogWidget.kt:108)");
            }
            String str = core.getEmoji() + " " + core.getName();
            TextStyle textStyle = new TextStyle(INK, TextUnit.m1015boximpl(TextUnitKt.getSp(12)), null, null, TextAlign.m1334boximpl(TextAlign.INSTANCE.m1341getCenterROrN78o()), null, null, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, null);
            GlanceModifier glanceModifierM1291paddingVpY3zN4 = PaddingKt.m1291paddingVpY3zN4(CornerRadiusKt.m1160cornerRadius3ABfNKs(BackgroundKt.m1126background4WTKRHQ(modifier, core.m1538getColor0d7_KjU()), Dp.m844constructorimpl(14)), Dp.m844constructorimpl(2), Dp.m844constructorimpl(10));
            ActionParameters parameters$iv = ActionParametersKt.actionParametersOf(LogMoodAction.INSTANCE.getValenceKey().to(Float.valueOf(core.getValence())), LogMoodAction.INSTANCE.getArousalKey().to(Float.valueOf(core.getArousal())), LogMoodAction.INSTANCE.getLabelKey().to(core.getName()));
            TextKt.Text(str, ActionKt.clickable(glanceModifierM1291paddingVpY3zN4, RunCallbackActionKt.actionRunCallback(LogMoodAction.class, parameters$iv)), textStyle, 1, $composer2, 3072, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.spectrum.app.widget.QuickLogWidget$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QuickLogWidget.CorePill$lambda$2(this.f$0, core, modifier, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: CarePill-yrwZFoE, reason: not valid java name */
    public final void m1533CarePillyrwZFoE(final String text, final String kind, final float valence, final float arousal, final long color, final GlanceModifier modifier, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(937894963);
        ComposerKt.sourceInformation($composer2, "C(CarePill)P(4,2,5!1,1:c#ui.graphics.Color)138@5011L768:QuickLogWidget.kt#17i9dr");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(text) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(kind) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changed(valence) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changed(arousal) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer2.changed(color) ? 16384 : 8192;
        }
        if ((196608 & $changed) == 0) {
            $dirty |= $composer2.changed(modifier) ? 131072 : 65536;
        }
        int $dirty2 = $dirty;
        if ((74899 & $dirty2) == 74898 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(937894963, $dirty2, -1, "com.spectrum.app.widget.QuickLogWidget.CarePill (QuickLogWidget.kt:137)");
            }
            TextStyle textStyle = new TextStyle(INK, TextUnit.m1015boximpl(TextUnitKt.getSp(12)), null, null, TextAlign.m1334boximpl(TextAlign.INSTANCE.m1341getCenterROrN78o()), null, null, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, null);
            GlanceModifier glanceModifierM1291paddingVpY3zN4 = PaddingKt.m1291paddingVpY3zN4(CornerRadiusKt.m1160cornerRadius3ABfNKs(BackgroundKt.m1126background4WTKRHQ(modifier, color), Dp.m844constructorimpl(14)), Dp.m844constructorimpl(2), Dp.m844constructorimpl(10));
            ActionParameters parameters$iv = ActionParametersKt.actionParametersOf(LogCareAction.INSTANCE.getKindKey().to(kind), LogCareAction.INSTANCE.getLabelKey().to(text), LogCareAction.INSTANCE.getValenceKey().to(Float.valueOf(valence)), LogCareAction.INSTANCE.getArousalKey().to(Float.valueOf(arousal)));
            TextKt.Text(text, ActionKt.clickable(glanceModifierM1291paddingVpY3zN4, RunCallbackActionKt.actionRunCallback(LogCareAction.class, parameters$iv)), textStyle, 1, $composer2, ($dirty2 & 14) | 3072, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.spectrum.app.widget.QuickLogWidget$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QuickLogWidget.CarePill_yrwZFoE$lambda$3(this.f$0, text, kind, valence, arousal, color, modifier, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OpenPill(final GlanceModifier modifier, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1628988203);
        ComposerKt.sourceInformation($composer2, "C(OpenPill)161@5891L7,162@5907L440:QuickLogWidget.kt#17i9dr");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(modifier) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (($dirty2 & 3) == 2 && $composer2.getSkipping()) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1628988203, $dirty2, -1, "com.spectrum.app.widget.QuickLogWidget.OpenPill (QuickLogWidget.kt:160)");
            }
            ProvidableCompositionLocal<Context> localContext = CompositionLocalsKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Context context = (Context) objConsume;
            TextKt.Text("＋ abrir", ActionKt.clickable(PaddingKt.m1291paddingVpY3zN4(CornerRadiusKt.m1160cornerRadius3ABfNKs(BackgroundKt.m1126background4WTKRHQ(modifier, ColorKt.Color(4292339920L)), Dp.m844constructorimpl(14)), Dp.m844constructorimpl(2), Dp.m844constructorimpl(10)), StartActivityActionKt.actionStartActivity$default(new ComponentName(context, (Class<?>) MainActivity.class), (ActionParameters) null, 2, (Object) null)), new TextStyle(INK, TextUnit.m1015boximpl(TextUnitKt.getSp(12)), null, null, TextAlign.m1334boximpl(TextAlign.INSTANCE.m1341getCenterROrN78o()), null, null, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, null), 1, $composer2, 3078, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.spectrum.app.widget.QuickLogWidget$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QuickLogWidget.OpenPill$lambda$4(this.f$0, modifier, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final List<Core> widgetCores() {
        List order;
        Core core;
        List order2 = CollectionsKt.listOf((Object[]) new String[]{"Feliz", "Triste", "Surpresa", "Mal", "Medo", "Raiva", "Nojo"});
        Iterable $this$associateBy$iv = EmotionWheel.INSTANCE.getCores();
        int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associateBy$iv, 10)), 16);
        Map destination$iv$iv = new LinkedHashMap(capacity$iv);
        for (Object element$iv$iv : $this$associateBy$iv) {
            CoreEmotion it = (CoreEmotion) element$iv$iv;
            destination$iv$iv.put(it.getName(), element$iv$iv);
        }
        Map byName = destination$iv$iv;
        List $this$mapNotNull$iv = order2;
        int $i$f$mapNotNull = 0;
        Collection destination$iv$iv2 = new ArrayList();
        for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
            String name = (String) element$iv$iv$iv;
            CoreEmotion core2 = (CoreEmotion) byName.get(name);
            if (core2 == null) {
                core = null;
                order = order2;
            } else {
                Iterable<SecondaryEmotion> $this$flatMap$iv = core2.getSecondaries();
                Collection destination$iv$iv3 = new ArrayList();
                for (SecondaryEmotion it2 : $this$flatMap$iv) {
                    Iterable list$iv$iv = it2.getTertiaries();
                    Collection destination$iv$iv4 = destination$iv$iv3;
                    CollectionsKt.addAll(destination$iv$iv4, list$iv$iv);
                    order2 = order2;
                    destination$iv$iv3 = destination$iv$iv4;
                }
                Iterable destination$iv$iv5 = destination$iv$iv3;
                order = order2;
                Iterable words = (List) destination$iv$iv5;
                String name2 = core2.getName();
                String strEmojiFor = emojiFor(core2.getName());
                long jColor = ColorKt.Color(core2.getColor());
                Iterable $this$map$iv = words;
                int $i$f$mapNotNull2 = CollectionsKt.collectionSizeOrDefault($this$map$iv, 10);
                Collection destination$iv$iv6 = new ArrayList($i$f$mapNotNull2);
                Iterable $this$mapTo$iv$iv = $this$map$iv;
                for (Object item$iv$iv : $this$mapTo$iv$iv) {
                    EmotionWord it3 = (EmotionWord) item$iv$iv;
                    destination$iv$iv6.add(Float.valueOf(it3.getValence()));
                    $this$mapTo$iv$iv = $this$mapTo$iv$iv;
                }
                float fAverageOfFloat = (float) CollectionsKt.averageOfFloat((List) destination$iv$iv6);
                Iterable $this$map$iv2 = words;
                int $i$f$map = CollectionsKt.collectionSizeOrDefault($this$map$iv2, 10);
                Collection destination$iv$iv7 = new ArrayList($i$f$map);
                for (Object item$iv$iv2 : $this$map$iv2) {
                    EmotionWord it4 = (EmotionWord) item$iv$iv2;
                    destination$iv$iv7.add(Float.valueOf(it4.getArousal()));
                }
                core = new Core(name2, strEmojiFor, jColor, fAverageOfFloat, (float) CollectionsKt.averageOfFloat((List) destination$iv$iv7), null);
            }
            if (core != null) {
                destination$iv$iv2.add(core);
            }
            byName = byName;
            $this$mapNotNull$iv = $this$mapNotNull$iv;
            $i$f$mapNotNull = $i$f$mapNotNull;
            order2 = order;
        }
        return (List) destination$iv$iv2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x005c A[ORIG_RETURN, RETURN] */
    private final String emojiFor(String name) {
        switch (name) {
            case "Triste":
                return "😢";
            case "Surpresa":
                return "😮";
            case "Mal":
                return "😖";
            case "Medo":
                return "😨";
            case "Nojo":
                return "🤢";
            case "Feliz":
                return "😊";
            case "Raiva":
                return "😠";
            default:
                return "•";
        }
    }

    /* JADX INFO: compiled from: QuickLogWidget.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spectrum/app/widget/QuickLogWidget$Companion;", "", "<init>", "()V", "INK", "Landroidx/glance/unit/ColorProvider;", "getINK", "()Landroidx/glance/unit/ColorProvider;", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ColorProvider getINK() {
            return QuickLogWidget.INK;
        }
    }
}
