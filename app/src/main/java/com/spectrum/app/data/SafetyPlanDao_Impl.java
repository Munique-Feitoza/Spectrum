package com.spectrum.app.data;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: SafetyPlanDao_Impl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/spectrum/app/data/SafetyPlanDao_Impl;", "Lcom/spectrum/app/data/SafetyPlanDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfSafetyPlan", "Landroidx/room/EntityInsertAdapter;", "Lcom/spectrum/app/data/SafetyPlan;", "upsert", "", "plan", "(Lcom/spectrum/app/data/SafetyPlan;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class SafetyPlanDao_Impl implements SafetyPlanDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<SafetyPlan> __insertAdapterOfSafetyPlan;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public SafetyPlanDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfSafetyPlan = new EntityInsertAdapter<SafetyPlan>() { // from class: com.spectrum.app.data.SafetyPlanDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `safety_plan` (`id`,`sinaisAlerta`,`estrategias`,`pessoasDistracao`,`pessoasAjuda`,`profissionais`,`ambienteSeguro`,`updatedAt`) VALUES (?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, SafetyPlan entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo1397bindLong(1, entity.getId());
                statement.mo1399bindText(2, entity.getSinaisAlerta());
                statement.mo1399bindText(3, entity.getEstrategias());
                statement.mo1399bindText(4, entity.getPessoasDistracao());
                statement.mo1399bindText(5, entity.getPessoasAjuda());
                statement.mo1399bindText(6, entity.getProfissionais());
                statement.mo1399bindText(7, entity.getAmbienteSeguro());
                statement.mo1397bindLong(8, entity.getUpdatedAt());
            }
        };
    }

    @Override // com.spectrum.app.data.SafetyPlanDao
    public Object upsert(final SafetyPlan plan, Continuation<? super Unit> continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.spectrum.app.data.SafetyPlanDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SafetyPlanDao_Impl.upsert$lambda$0(this.f$0, plan, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit upsert$lambda$0(SafetyPlanDao_Impl this$0, SafetyPlan $plan, SQLiteConnection _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__insertAdapterOfSafetyPlan.insert(_connection, $plan);
        return Unit.INSTANCE;
    }

    @Override // com.spectrum.app.data.SafetyPlanDao
    public Object get(Continuation<? super SafetyPlan> continuation) {
        final String _sql = "SELECT * FROM safety_plan WHERE id = 1";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.spectrum.app.data.SafetyPlanDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SafetyPlanDao_Impl.get$lambda$1(_sql, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SafetyPlan get$lambda$1(String $_sql, SQLiteConnection _connection) {
        SafetyPlan _result;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
            int _columnIndexOfSinaisAlerta = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "sinaisAlerta");
            int _columnIndexOfEstrategias = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "estrategias");
            int _columnIndexOfPessoasDistracao = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "pessoasDistracao");
            int _columnIndexOfPessoasAjuda = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "pessoasAjuda");
            int _columnIndexOfProfissionais = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "profissionais");
            int _columnIndexOfAmbienteSeguro = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "ambienteSeguro");
            int _columnIndexOfUpdatedAt = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "updatedAt");
            if (_stmt.step()) {
                int _tmpId = (int) _stmt.getLong(_columnIndexOfId);
                String _tmpSinaisAlerta = _stmt.getText(_columnIndexOfSinaisAlerta);
                String _tmpEstrategias = _stmt.getText(_columnIndexOfEstrategias);
                String _tmpPessoasDistracao = _stmt.getText(_columnIndexOfPessoasDistracao);
                String _tmpPessoasAjuda = _stmt.getText(_columnIndexOfPessoasAjuda);
                String _tmpProfissionais = _stmt.getText(_columnIndexOfProfissionais);
                String _tmpAmbienteSeguro = _stmt.getText(_columnIndexOfAmbienteSeguro);
                long _tmpUpdatedAt = _stmt.getLong(_columnIndexOfUpdatedAt);
                _result = new SafetyPlan(_tmpId, _tmpSinaisAlerta, _tmpEstrategias, _tmpPessoasDistracao, _tmpPessoasAjuda, _tmpProfissionais, _tmpAmbienteSeguro, _tmpUpdatedAt);
            } else {
                _result = null;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    /* JADX INFO: compiled from: SafetyPlanDao_Impl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/spectrum/app/data/SafetyPlanDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<KClass<?>> getRequiredConverters() {
            return CollectionsKt.emptyList();
        }
    }
}
