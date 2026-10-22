package com.spectrum.app.data;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: compiled from: SafetyPlanRepository.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0018\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/spectrum/app/data/SafetyPlanRepository;", "", "<init>", "()V", "dao", "Lcom/spectrum/app/data/SafetyPlanDao;", "context", "Landroid/content/Context;", "get", "Lcom/spectrum/app/data/SafetyPlan;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "save", "", "plan", "(Landroid/content/Context;Lcom/spectrum/app/data/SafetyPlan;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class SafetyPlanRepository {
    public static final int $stable = 0;
    public static final SafetyPlanRepository INSTANCE = new SafetyPlanRepository();

    private SafetyPlanRepository() {
    }

    private final SafetyPlanDao dao(Context context) {
        return DatabaseProvider.INSTANCE.get(context).safetyPlanDao();
    }

    public final Object get(Context context, Continuation<? super SafetyPlan> continuation) {
        return dao(context).get(continuation);
    }

    public final Object save(Context context, SafetyPlan plan, Continuation<? super Unit> continuation) {
        Object objUpsert = dao(context).upsert(plan.copy((126 & 1) != 0 ? plan.id : 1, (126 & 2) != 0 ? plan.sinaisAlerta : null, (126 & 4) != 0 ? plan.estrategias : null, (126 & 8) != 0 ? plan.pessoasDistracao : null, (126 & 16) != 0 ? plan.pessoasAjuda : null, (126 & 32) != 0 ? plan.profissionais : null, (126 & 64) != 0 ? plan.ambienteSeguro : null, (126 & 128) != 0 ? plan.updatedAt : System.currentTimeMillis()), continuation);
        return objUpsert == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpsert : Unit.INSTANCE;
    }
}
