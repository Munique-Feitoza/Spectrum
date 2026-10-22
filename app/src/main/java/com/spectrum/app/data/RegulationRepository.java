package com.spectrum.app.data;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RegulationRepository.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002JX\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u0013J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/spectrum/app/data/RegulationRepository;", "", "<init>", "()V", "dao", "Lcom/spectrum/app/data/RegulationEventDao;", "context", "Landroid/content/Context;", "log", "", "kind", "", "label", "intensity", "", "socialBattery", "bodyEnergy", "notes", "source", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recent", "", "Lcom/spectrum/app/data/RegulationEvent;", "limit", "(Landroid/content/Context;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class RegulationRepository {
    public static final int $stable = 0;
    public static final RegulationRepository INSTANCE = new RegulationRepository();

    private RegulationRepository() {
    }

    private final RegulationEventDao dao(Context context) {
        return DatabaseProvider.INSTANCE.get(context).regulationEventDao();
    }

    public final Object log(Context context, String kind, String label, int intensity, int socialBattery, int bodyEnergy, String notes, String source, Continuation<? super Unit> continuation) {
        long now = System.currentTimeMillis();
        RegulationEventDao regulationEventDaoDao = dao(context);
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Object objInsert = regulationEventDaoDao.insert(new RegulationEvent(string, now, now, kind, label, intensity, socialBattery, bodyEnergy, notes, source), continuation);
        return objInsert == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInsert : Unit.INSTANCE;
    }

    public static /* synthetic */ Object recent$default(RegulationRepository regulationRepository, Context context, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 20;
        }
        return regulationRepository.recent(context, i, continuation);
    }

    public final Object recent(Context context, int limit, Continuation<? super List<RegulationEvent>> continuation) {
        return dao(context).recent(limit, continuation);
    }
}
