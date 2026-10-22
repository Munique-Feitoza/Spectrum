package com.spectrum.app.data;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MoodRepository.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J8\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u0015J$\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001aH\u0086@¢\u0006\u0002\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/spectrum/app/data/MoodRepository;", "", "<init>", "()V", "HISTORY_LIMIT", "", "dao", "Lcom/spectrum/app/data/MoodDao;", "context", "Landroid/content/Context;", "log", "", "valence", "", "arousal", "label", "", "source", "(Landroid/content/Context;FFLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "latest", "Lcom/spectrum/app/data/MoodEvent;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "count", "history", "", "filter", "Lcom/spectrum/app/data/MoodFilter;", "(Landroid/content/Context;Lcom/spectrum/app/data/MoodFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clear", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class MoodRepository {
    public static final int $stable = 0;
    private static final int HISTORY_LIMIT = 100;
    public static final MoodRepository INSTANCE = new MoodRepository();

    /* JADX INFO: compiled from: MoodRepository.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MoodFilter.values().length];
            try {
                iArr[MoodFilter.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[MoodFilter.POSITIVE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[MoodFilter.NEGATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private MoodRepository() {
    }

    private final MoodDao dao(Context context) {
        return DatabaseProvider.INSTANCE.get(context).moodDao();
    }

    public final Object log(Context context, float valence, float arousal, String label, String source, Continuation<? super Unit> continuation) {
        long now = System.currentTimeMillis();
        MoodDao moodDaoDao = dao(context);
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Object objInsert = moodDaoDao.insert(new MoodEvent(string, now, now, valence, arousal, label, source), continuation);
        return objInsert == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInsert : Unit.INSTANCE;
    }

    public final Object latest(Context context, Continuation<? super MoodEvent> continuation) {
        return dao(context).latest(continuation);
    }

    public final Object count(Context context, Continuation<? super Integer> continuation) {
        return dao(context).count(continuation);
    }

    public final Object history(Context context, MoodFilter filter, Continuation<? super List<MoodEvent>> continuation) {
        switch (WhenMappings.$EnumSwitchMapping$0[filter.ordinal()]) {
            case 1:
                return dao(context).recentAll(100, continuation);
            case 2:
                return dao(context).recentPositive(100, continuation);
            case 3:
                return dao(context).recentNegative(100, continuation);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final Object clear(Context context, Continuation<? super Unit> continuation) {
        Object objDeleteAll = dao(context).deleteAll(continuation);
        return objDeleteAll == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDeleteAll : Unit.INSTANCE;
    }
}
