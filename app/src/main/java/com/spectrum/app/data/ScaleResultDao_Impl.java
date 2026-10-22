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

/* JADX INFO: compiled from: ScaleResultDao_Impl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\fJ$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/spectrum/app/data/ScaleResultDao_Impl;", "Lcom/spectrum/app/data/ScaleResultDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfScaleResult", "Landroidx/room/EntityInsertAdapter;", "Lcom/spectrum/app/data/ScaleResult;", "insert", "", "result", "(Lcom/spectrum/app/data/ScaleResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recentByCode", "", "code", "", "limit", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ScaleResultDao_Impl implements ScaleResultDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<ScaleResult> __insertAdapterOfScaleResult;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public ScaleResultDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfScaleResult = new EntityInsertAdapter<ScaleResult>() { // from class: com.spectrum.app.data.ScaleResultDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR ABORT INTO `scale_result` (`code`,`total`,`band`,`answers`,`id`,`ts`,`createdAt`) VALUES (?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, ScaleResult entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo1399bindText(1, entity.getCode());
                statement.mo1397bindLong(2, entity.getTotal());
                statement.mo1399bindText(3, entity.getBand());
                statement.mo1399bindText(4, entity.getAnswers());
                statement.mo1399bindText(5, entity.getId());
                statement.mo1397bindLong(6, entity.getTs());
                statement.mo1397bindLong(7, entity.getCreatedAt());
            }
        };
    }

    @Override // com.spectrum.app.data.ScaleResultDao
    public Object insert(final ScaleResult result, Continuation<? super Unit> continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.spectrum.app.data.ScaleResultDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScaleResultDao_Impl.insert$lambda$0(this.f$0, result, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insert$lambda$0(ScaleResultDao_Impl this$0, ScaleResult $result, SQLiteConnection _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__insertAdapterOfScaleResult.insert(_connection, $result);
        return Unit.INSTANCE;
    }

    @Override // com.spectrum.app.data.ScaleResultDao
    public Object recentByCode(final String code, final int limit, Continuation<? super List<ScaleResult>> continuation) {
        final String _sql = "SELECT * FROM scale_result WHERE code = ? ORDER BY ts DESC LIMIT ?";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.spectrum.app.data.ScaleResultDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScaleResultDao_Impl.recentByCode$lambda$1(_sql, code, limit, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List recentByCode$lambda$1(String $_sql, String $code, int $limit, SQLiteConnection _connection) throws Throwable {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.mo1399bindText(1, $code);
            int _tmpTotal = 2;
            try {
                _stmt.mo1397bindLong(2, $limit);
                int _columnIndexOfCode = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "code");
                int _columnIndexOfTotal = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "total");
                int _columnIndexOfBand = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "band");
                int _columnIndexOfAnswers = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "answers");
                int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
                int _columnIndexOfTs = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "ts");
                int _columnIndexOfCreatedAt = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "createdAt");
                List _result = new ArrayList();
                while (_stmt.step()) {
                    String _tmpCode = _stmt.getText(_columnIndexOfCode);
                    int _argIndex = _tmpTotal;
                    int _tmpTotal2 = (int) _stmt.getLong(_columnIndexOfTotal);
                    String _tmpBand = _stmt.getText(_columnIndexOfBand);
                    String _tmpAnswers = _stmt.getText(_columnIndexOfAnswers);
                    String _tmpId = _stmt.getText(_columnIndexOfId);
                    long _tmpTs = _stmt.getLong(_columnIndexOfTs);
                    long _tmpCreatedAt = _stmt.getLong(_columnIndexOfCreatedAt);
                    ScaleResult _item = new ScaleResult(_tmpCode, _tmpTotal2, _tmpBand, _tmpAnswers, _tmpId, _tmpTs, _tmpCreatedAt);
                    _result.add(_item);
                    _tmpTotal = _argIndex;
                }
                _stmt.close();
                return _result;
            } catch (Throwable th) {
                th = th;
                _stmt.close();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: compiled from: ScaleResultDao_Impl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/spectrum/app/data/ScaleResultDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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
