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

/* JADX INFO: compiled from: ActivityLogDao_Impl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/spectrum/app/data/ActivityLogDao_Impl;", "Lcom/spectrum/app/data/ActivityLogDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfActivityLog", "Landroidx/room/EntityInsertAdapter;", "Lcom/spectrum/app/data/ActivityLog;", "insert", "", "log", "(Lcom/spectrum/app/data/ActivityLog;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recent", "", "limit", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ActivityLogDao_Impl implements ActivityLogDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<ActivityLog> __insertAdapterOfActivityLog;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public ActivityLogDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfActivityLog = new EntityInsertAdapter<ActivityLog>() { // from class: com.spectrum.app.data.ActivityLogDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR ABORT INTO `activity_log` (`atividade`,`prazer`,`dominio`,`nota`,`id`,`ts`,`createdAt`) VALUES (?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, ActivityLog entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo1399bindText(1, entity.getAtividade());
                statement.mo1397bindLong(2, entity.getPrazer());
                statement.mo1397bindLong(3, entity.getDominio());
                statement.mo1399bindText(4, entity.getNota());
                statement.mo1399bindText(5, entity.getId());
                statement.mo1397bindLong(6, entity.getTs());
                statement.mo1397bindLong(7, entity.getCreatedAt());
            }
        };
    }

    @Override // com.spectrum.app.data.ActivityLogDao
    public Object insert(final ActivityLog log, Continuation<? super Unit> continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.spectrum.app.data.ActivityLogDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivityLogDao_Impl.insert$lambda$0(this.f$0, log, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insert$lambda$0(ActivityLogDao_Impl this$0, ActivityLog $log, SQLiteConnection _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__insertAdapterOfActivityLog.insert(_connection, $log);
        return Unit.INSTANCE;
    }

    @Override // com.spectrum.app.data.ActivityLogDao
    public Object recent(final int limit, Continuation<? super List<ActivityLog>> continuation) {
        final String _sql = "SELECT * FROM activity_log ORDER BY ts DESC LIMIT ?";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.spectrum.app.data.ActivityLogDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivityLogDao_Impl.recent$lambda$1(_sql, limit, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List recent$lambda$1(String $_sql, int $limit, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        int _tmpPrazer = 1;
        try {
            _stmt.mo1397bindLong(1, $limit);
            int _columnIndexOfAtividade = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "atividade");
            int _columnIndexOfPrazer = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "prazer");
            int _columnIndexOfDominio = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "dominio");
            int _columnIndexOfNota = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "nota");
            int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
            int _columnIndexOfTs = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "ts");
            int _columnIndexOfCreatedAt = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "createdAt");
            List _result = new ArrayList();
            while (_stmt.step()) {
                String _tmpAtividade = _stmt.getText(_columnIndexOfAtividade);
                int _argIndex = _tmpPrazer;
                int _tmpPrazer2 = (int) _stmt.getLong(_columnIndexOfPrazer);
                int _tmpDominio = (int) _stmt.getLong(_columnIndexOfDominio);
                String _tmpNota = _stmt.getText(_columnIndexOfNota);
                String _tmpId = _stmt.getText(_columnIndexOfId);
                long _tmpTs = _stmt.getLong(_columnIndexOfTs);
                long _tmpCreatedAt = _stmt.getLong(_columnIndexOfCreatedAt);
                ActivityLog _item = new ActivityLog(_tmpAtividade, _tmpPrazer2, _tmpDominio, _tmpNota, _tmpId, _tmpTs, _tmpCreatedAt);
                _result.add(_item);
                _tmpPrazer = _argIndex;
            }
            _stmt.close();
            return _result;
        } catch (Throwable th) {
            _stmt.close();
            throw th;
        }
    }

    /* JADX INFO: compiled from: ActivityLogDao_Impl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/spectrum/app/data/ActivityLogDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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
