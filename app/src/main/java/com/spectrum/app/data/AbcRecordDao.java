package com.spectrum.app.data;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: AbcRecordDao.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/spectrum/app/data/AbcRecordDao;", "", "insert", "", "record", "Lcom/spectrum/app/data/AbcRecord;", "(Lcom/spectrum/app/data/AbcRecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recent", "", "limit", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface AbcRecordDao {
    Object insert(AbcRecord abcRecord, Continuation<? super Unit> continuation);

    Object recent(int i, Continuation<? super List<AbcRecord>> continuation);
}
