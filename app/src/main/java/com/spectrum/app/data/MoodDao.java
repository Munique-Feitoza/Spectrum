package com.spectrum.app.data;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: MoodDao.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\tJ\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\r\u001a\u00020\bH§@¢\u0006\u0002\u0010\u000eJ\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\r\u001a\u00020\bH§@¢\u0006\u0002\u0010\u000eJ\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\r\u001a\u00020\bH§@¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0011\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/spectrum/app/data/MoodDao;", "", "insert", "", NotificationCompat.CATEGORY_EVENT, "Lcom/spectrum/app/data/MoodEvent;", "(Lcom/spectrum/app/data/MoodEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "count", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "latest", "recentAll", "", "limit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recentPositive", "recentNegative", "deleteAll", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface MoodDao {
    Object count(Continuation<? super Integer> continuation);

    Object deleteAll(Continuation<? super Unit> continuation);

    Object insert(MoodEvent moodEvent, Continuation<? super Unit> continuation);

    Object latest(Continuation<? super MoodEvent> continuation);

    Object recentAll(int i, Continuation<? super List<MoodEvent>> continuation);

    Object recentNegative(int i, Continuation<? super List<MoodEvent>> continuation);

    Object recentPositive(int i, Continuation<? super List<MoodEvent>> continuation);
}
