package com.spectrum.app.data;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: compiled from: ThoughtRecordRepository.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u0010J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/spectrum/app/data/ThoughtRecordRepository;", "", "<init>", "()V", "HISTORY_LIMIT", "", "dao", "Lcom/spectrum/app/data/ThoughtRecordDao;", "context", "Landroid/content/Context;", "save", "", "record", "Lcom/spectrum/app/data/ThoughtRecord;", "(Landroid/content/Context;Lcom/spectrum/app/data/ThoughtRecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "count", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recent", "", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ThoughtRecordRepository {
    public static final int $stable = 0;
    private static final int HISTORY_LIMIT = 50;
    public static final ThoughtRecordRepository INSTANCE = new ThoughtRecordRepository();

    private ThoughtRecordRepository() {
    }

    private final ThoughtRecordDao dao(Context context) {
        return DatabaseProvider.INSTANCE.get(context).thoughtRecordDao();
    }

    public final Object save(Context context, ThoughtRecord record, Continuation<? super Unit> continuation) {
        Object objInsert = dao(context).insert(record, continuation);
        return objInsert == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInsert : Unit.INSTANCE;
    }

    public final Object count(Context context, Continuation<? super Integer> continuation) {
        return dao(context).count(continuation);
    }

    public final Object recent(Context context, Continuation<? super List<ThoughtRecord>> continuation) {
        return dao(context).recent(50, continuation);
    }
}
