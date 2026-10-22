package com.spectrum.app.data;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
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

/* JADX INFO: compiled from: AbcRecordDao_Impl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/spectrum/app/data/AbcRecordDao_Impl;", "Lcom/spectrum/app/data/AbcRecordDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfAbcRecord", "Landroidx/room/EntityInsertAdapter;", "Lcom/spectrum/app/data/AbcRecord;", "insert", "", "record", "(Lcom/spectrum/app/data/AbcRecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recent", "", "limit", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class AbcRecordDao_Impl implements AbcRecordDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<AbcRecord> __insertAdapterOfAbcRecord;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public AbcRecordDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfAbcRecord = new EntityInsertAdapter<AbcRecord>() { // from class: com.spectrum.app.data.AbcRecordDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR ABORT INTO `abc_record` (`antecedente`,`comportamento`,`consequencia`,`contexto`,`id`,`ts`,`createdAt`) VALUES (?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, AbcRecord entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo1399bindText(1, entity.getAntecedente());
                statement.mo1399bindText(2, entity.getComportamento());
                statement.mo1399bindText(3, entity.getConsequencia());
                statement.mo1399bindText(4, entity.getContexto());
                statement.mo1399bindText(5, entity.getId());
                statement.mo1397bindLong(6, entity.getTs());
                statement.mo1397bindLong(7, entity.getCreatedAt());
            }
        };
    }

    @Override // com.spectrum.app.data.AbcRecordDao
    public Object insert(final AbcRecord record, Continuation<? super Unit> continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.spectrum.app.data.AbcRecordDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbcRecordDao_Impl.insert$lambda$0(this.f$0, record, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insert$lambda$0(AbcRecordDao_Impl this$0, AbcRecord $record, SQLiteConnection _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__insertAdapterOfAbcRecord.insert(_connection, $record);
        return Unit.INSTANCE;
    }

    @Override // com.spectrum.app.data.AbcRecordDao
    public Object recent(final int limit, Continuation<? super List<AbcRecord>> continuation) {
        final String _sql = "SELECT * FROM abc_record ORDER BY ts DESC LIMIT ?";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.spectrum.app.data.AbcRecordDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbcRecordDao_Impl.recent$lambda$1(_sql, limit, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List recent$lambda$1(String $_sql, int $limit, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.mo1397bindLong(1, $limit);
            int _columnIndexOfAntecedente = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "antecedente");
            int _columnIndexOfComportamento = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "comportamento");
            int _columnIndexOfConsequencia = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "consequencia");
            int _columnIndexOfContexto = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "contexto");
            int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
            int _columnIndexOfTs = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "ts");
            int _columnIndexOfCreatedAt = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "createdAt");
            List _result = new ArrayList();
            while (_stmt.step()) {
                String _tmpAntecedente = _stmt.getText(_columnIndexOfAntecedente);
                String _tmpComportamento = _stmt.getText(_columnIndexOfComportamento);
                String _tmpConsequencia = _stmt.getText(_columnIndexOfConsequencia);
                String _tmpContexto = _stmt.getText(_columnIndexOfContexto);
                String _tmpId = _stmt.getText(_columnIndexOfId);
                long _tmpTs = _stmt.getLong(_columnIndexOfTs);
                long _tmpCreatedAt = _stmt.getLong(_columnIndexOfCreatedAt);
                AbcRecord _item = new AbcRecord(_tmpAntecedente, _tmpComportamento, _tmpConsequencia, _tmpContexto, _tmpId, _tmpTs, _tmpCreatedAt);
                _result.add(_item);
            }
            _stmt.close();
            return _result;
        } catch (Throwable th) {
            _stmt.close();
            throw th;
        }
    }

    /* JADX INFO: compiled from: AbcRecordDao_Impl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/spectrum/app/data/AbcRecordDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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
