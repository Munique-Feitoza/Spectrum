package com.spectrum.app.data;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: OverloadPlanDao.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/spectrum/app/data/OverloadPlanDao;", "", "get", "Lcom/spectrum/app/data/OverloadPlan;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upsert", "", "plan", "(Lcom/spectrum/app/data/OverloadPlan;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface OverloadPlanDao {
    Object get(Continuation<? super OverloadPlan> continuation);

    Object upsert(OverloadPlan overloadPlan, Continuation<? super Unit> continuation);
}
