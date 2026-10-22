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

/* JADX INFO: compiled from: OverloadPlanDao_Impl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/spectrum/app/data/OverloadPlanDao_Impl;", "Lcom/spectrum/app/data/OverloadPlanDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfOverloadPlan", "Landroidx/room/EntityInsertAdapter;", "Lcom/spectrum/app/data/OverloadPlan;", "upsert", "", "plan", "(Lcom/spectrum/app/data/OverloadPlan;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class OverloadPlanDao_Impl implements OverloadPlanDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<OverloadPlan> __insertAdapterOfOverloadPlan;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public OverloadPlanDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfOverloadPlan = new EntityInsertAdapter<OverloadPlan>() { // from class: com.spectrum.app.data.OverloadPlanDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `overload_plan` (`id`,`sinais`,`umMinuto`,`evitar`,`frase`,`ancora`,`updatedAt`) VALUES (?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, OverloadPlan entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo1397bindLong(1, entity.getId());
                statement.mo1399bindText(2, entity.getSinais());
                statement.mo1399bindText(3, entity.getUmMinuto());
                statement.mo1399bindText(4, entity.getEvitar());
                statement.mo1399bindText(5, entity.getFrase());
                statement.mo1399bindText(6, entity.getAncora());
                statement.mo1397bindLong(7, entity.getUpdatedAt());
            }
        };
    }

    @Override // com.spectrum.app.data.OverloadPlanDao
    public Object upsert(final OverloadPlan plan, Continuation<? super Unit> continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.spectrum.app.data.OverloadPlanDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OverloadPlanDao_Impl.upsert$lambda$0(this.f$0, plan, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit upsert$lambda$0(OverloadPlanDao_Impl this$0, OverloadPlan $plan, SQLiteConnection _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__insertAdapterOfOverloadPlan.insert(_connection, $plan);
        return Unit.INSTANCE;
    }

    @Override // com.spectrum.app.data.OverloadPlanDao
    public Object get(Continuation<? super OverloadPlan> continuation) {
        final String _sql = "SELECT * FROM overload_plan WHERE id = 1";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.spectrum.app.data.OverloadPlanDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OverloadPlanDao_Impl.get$lambda$1(_sql, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OverloadPlan get$lambda$1(String $_sql, SQLiteConnection _connection) {
        OverloadPlan _result;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
            int _columnIndexOfSinais = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "sinais");
            int _columnIndexOfUmMinuto = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "umMinuto");
            int _columnIndexOfEvitar = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "evitar");
            int _columnIndexOfFrase = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "frase");
            int _columnIndexOfAncora = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "ancora");
            int _columnIndexOfUpdatedAt = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "updatedAt");
            if (_stmt.step()) {
                int _tmpId = (int) _stmt.getLong(_columnIndexOfId);
                String _tmpSinais = _stmt.getText(_columnIndexOfSinais);
                String _tmpUmMinuto = _stmt.getText(_columnIndexOfUmMinuto);
                String _tmpEvitar = _stmt.getText(_columnIndexOfEvitar);
                String _tmpFrase = _stmt.getText(_columnIndexOfFrase);
                String _tmpAncora = _stmt.getText(_columnIndexOfAncora);
                long _tmpUpdatedAt = _stmt.getLong(_columnIndexOfUpdatedAt);
                _result = new OverloadPlan(_tmpId, _tmpSinais, _tmpUmMinuto, _tmpEvitar, _tmpFrase, _tmpAncora, _tmpUpdatedAt);
            } else {
                _result = null;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    /* JADX INFO: compiled from: OverloadPlanDao_Impl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/spectrum/app/data/OverloadPlanDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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
