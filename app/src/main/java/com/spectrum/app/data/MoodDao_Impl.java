package com.spectrum.app.data;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
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

/* JADX INFO: compiled from: MoodDao_Impl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0002\u0010\u000fJ\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u0013\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u0014J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u0013\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u0014J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u0013\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u0014J\u000e\u0010\u0017\u001a\u00020\nH\u0096@¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/spectrum/app/data/MoodDao_Impl;", "Lcom/spectrum/app/data/MoodDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfMoodEvent", "Landroidx/room/EntityInsertAdapter;", "Lcom/spectrum/app/data/MoodEvent;", "insert", "", NotificationCompat.CATEGORY_EVENT, "(Lcom/spectrum/app/data/MoodEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "count", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "latest", "recentAll", "", "limit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recentPositive", "recentNegative", "deleteAll", "Companion", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class MoodDao_Impl implements MoodDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<MoodEvent> __insertAdapterOfMoodEvent;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public MoodDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfMoodEvent = new EntityInsertAdapter<MoodEvent>() { // from class: com.spectrum.app.data.MoodDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR ABORT INTO `mood_event` (`id`,`ts`,`createdAt`,`valence`,`arousal`,`label`,`source`) VALUES (?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, MoodEvent entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo1399bindText(1, entity.getId());
                statement.mo1397bindLong(2, entity.getTs());
                statement.mo1397bindLong(3, entity.getCreatedAt());
                statement.mo1396bindDouble(4, entity.getValence());
                statement.mo1396bindDouble(5, entity.getArousal());
                String _tmpLabel = entity.getLabel();
                if (_tmpLabel == null) {
                    statement.mo1398bindNull(6);
                } else {
                    statement.mo1399bindText(6, _tmpLabel);
                }
                statement.mo1399bindText(7, entity.getSource());
            }
        };
    }

    @Override // com.spectrum.app.data.MoodDao
    public Object insert(final MoodEvent event, Continuation<? super Unit> continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.spectrum.app.data.MoodDao_Impl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MoodDao_Impl.insert$lambda$0(this.f$0, event, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insert$lambda$0(MoodDao_Impl this$0, MoodEvent $event, SQLiteConnection _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__insertAdapterOfMoodEvent.insert(_connection, $event);
        return Unit.INSTANCE;
    }

    @Override // com.spectrum.app.data.MoodDao
    public Object count(Continuation<? super Integer> continuation) {
        final String _sql = "SELECT COUNT(*) FROM mood_event";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.spectrum.app.data.MoodDao_Impl$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(MoodDao_Impl.count$lambda$1(_sql, (SQLiteConnection) obj));
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int count$lambda$1(String $_sql, SQLiteConnection _connection) {
        int _result;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            if (_stmt.step()) {
                int _tmp = (int) _stmt.getLong(0);
                _result = _tmp;
            } else {
                _result = 0;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.spectrum.app.data.MoodDao
    public Object latest(Continuation<? super MoodEvent> continuation) {
        final String _sql = "SELECT * FROM mood_event ORDER BY ts DESC LIMIT 1";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.spectrum.app.data.MoodDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MoodDao_Impl.latest$lambda$2(_sql, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MoodEvent latest$lambda$2(String $_sql, SQLiteConnection _connection) {
        MoodEvent _result;
        String _tmpLabel;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
            int _columnIndexOfTs = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "ts");
            int _columnIndexOfCreatedAt = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "createdAt");
            int _columnIndexOfValence = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "valence");
            int _columnIndexOfArousal = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "arousal");
            int _columnIndexOfLabel = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "label");
            int _columnIndexOfSource = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "source");
            if (_stmt.step()) {
                String _tmpId = _stmt.getText(_columnIndexOfId);
                long _tmpTs = _stmt.getLong(_columnIndexOfTs);
                long _tmpCreatedAt = _stmt.getLong(_columnIndexOfCreatedAt);
                float _tmpValence = (float) _stmt.getDouble(_columnIndexOfValence);
                float _tmpArousal = (float) _stmt.getDouble(_columnIndexOfArousal);
                if (_stmt.isNull(_columnIndexOfLabel)) {
                    _tmpLabel = null;
                } else {
                    _tmpLabel = _stmt.getText(_columnIndexOfLabel);
                }
                String _tmpSource = _stmt.getText(_columnIndexOfSource);
                _result = new MoodEvent(_tmpId, _tmpTs, _tmpCreatedAt, _tmpValence, _tmpArousal, _tmpLabel, _tmpSource);
            } else {
                _result = null;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.spectrum.app.data.MoodDao
    public Object recentAll(final int limit, Continuation<? super List<MoodEvent>> continuation) {
        final String _sql = "SELECT * FROM mood_event ORDER BY ts DESC LIMIT ?";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.spectrum.app.data.MoodDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MoodDao_Impl.recentAll$lambda$3(_sql, limit, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List recentAll$lambda$3(String $_sql, int $limit, SQLiteConnection _connection) {
        String _tmpLabel;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        float _tmpValence = Float.MIN_VALUE;
        try {
            _stmt.mo1397bindLong(1, $limit);
            int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
            int _columnIndexOfTs = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "ts");
            int _columnIndexOfCreatedAt = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "createdAt");
            int _columnIndexOfValence = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "valence");
            int _columnIndexOfArousal = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "arousal");
            int _columnIndexOfLabel = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "label");
            int _columnIndexOfSource = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "source");
            List _result = new ArrayList();
            while (_stmt.step()) {
                String _tmpId = _stmt.getText(_columnIndexOfId);
                long _tmpTs = _stmt.getLong(_columnIndexOfTs);
                long _tmpCreatedAt = _stmt.getLong(_columnIndexOfCreatedAt);
                float _argIndex = _tmpValence;
                float _tmpValence2 = (float) _stmt.getDouble(_columnIndexOfValence);
                float _tmpArousal = (float) _stmt.getDouble(_columnIndexOfArousal);
                if (_stmt.isNull(_columnIndexOfLabel)) {
                    _tmpLabel = null;
                } else {
                    _tmpLabel = _stmt.getText(_columnIndexOfLabel);
                }
                String _tmpSource = _stmt.getText(_columnIndexOfSource);
                MoodEvent _item = new MoodEvent(_tmpId, _tmpTs, _tmpCreatedAt, _tmpValence2, _tmpArousal, _tmpLabel, _tmpSource);
                _result.add(_item);
                _tmpValence = _argIndex;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.spectrum.app.data.MoodDao
    public Object recentPositive(final int limit, Continuation<? super List<MoodEvent>> continuation) {
        final String _sql = "SELECT * FROM mood_event WHERE valence > 0 ORDER BY ts DESC LIMIT ?";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.spectrum.app.data.MoodDao_Impl$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MoodDao_Impl.recentPositive$lambda$4(_sql, limit, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List recentPositive$lambda$4(String $_sql, int $limit, SQLiteConnection _connection) {
        String _tmpLabel;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        float _tmpValence = Float.MIN_VALUE;
        try {
            _stmt.mo1397bindLong(1, $limit);
            int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
            int _columnIndexOfTs = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "ts");
            int _columnIndexOfCreatedAt = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "createdAt");
            int _columnIndexOfValence = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "valence");
            int _columnIndexOfArousal = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "arousal");
            int _columnIndexOfLabel = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "label");
            int _columnIndexOfSource = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "source");
            List _result = new ArrayList();
            while (_stmt.step()) {
                String _tmpId = _stmt.getText(_columnIndexOfId);
                long _tmpTs = _stmt.getLong(_columnIndexOfTs);
                long _tmpCreatedAt = _stmt.getLong(_columnIndexOfCreatedAt);
                float _argIndex = _tmpValence;
                float _tmpValence2 = (float) _stmt.getDouble(_columnIndexOfValence);
                float _tmpArousal = (float) _stmt.getDouble(_columnIndexOfArousal);
                if (_stmt.isNull(_columnIndexOfLabel)) {
                    _tmpLabel = null;
                } else {
                    _tmpLabel = _stmt.getText(_columnIndexOfLabel);
                }
                String _tmpSource = _stmt.getText(_columnIndexOfSource);
                MoodEvent _item = new MoodEvent(_tmpId, _tmpTs, _tmpCreatedAt, _tmpValence2, _tmpArousal, _tmpLabel, _tmpSource);
                _result.add(_item);
                _tmpValence = _argIndex;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.spectrum.app.data.MoodDao
    public Object recentNegative(final int limit, Continuation<? super List<MoodEvent>> continuation) {
        final String _sql = "SELECT * FROM mood_event WHERE valence < 0 ORDER BY ts DESC LIMIT ?";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.spectrum.app.data.MoodDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MoodDao_Impl.recentNegative$lambda$5(_sql, limit, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List recentNegative$lambda$5(String $_sql, int $limit, SQLiteConnection _connection) {
        String _tmpLabel;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        float _tmpValence = Float.MIN_VALUE;
        try {
            _stmt.mo1397bindLong(1, $limit);
            int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
            int _columnIndexOfTs = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "ts");
            int _columnIndexOfCreatedAt = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "createdAt");
            int _columnIndexOfValence = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "valence");
            int _columnIndexOfArousal = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "arousal");
            int _columnIndexOfLabel = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "label");
            int _columnIndexOfSource = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "source");
            List _result = new ArrayList();
            while (_stmt.step()) {
                String _tmpId = _stmt.getText(_columnIndexOfId);
                long _tmpTs = _stmt.getLong(_columnIndexOfTs);
                long _tmpCreatedAt = _stmt.getLong(_columnIndexOfCreatedAt);
                float _argIndex = _tmpValence;
                float _tmpValence2 = (float) _stmt.getDouble(_columnIndexOfValence);
                float _tmpArousal = (float) _stmt.getDouble(_columnIndexOfArousal);
                if (_stmt.isNull(_columnIndexOfLabel)) {
                    _tmpLabel = null;
                } else {
                    _tmpLabel = _stmt.getText(_columnIndexOfLabel);
                }
                String _tmpSource = _stmt.getText(_columnIndexOfSource);
                MoodEvent _item = new MoodEvent(_tmpId, _tmpTs, _tmpCreatedAt, _tmpValence2, _tmpArousal, _tmpLabel, _tmpSource);
                _result.add(_item);
                _tmpValence = _argIndex;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.spectrum.app.data.MoodDao
    public Object deleteAll(Continuation<? super Unit> continuation) {
        final String _sql = "DELETE FROM mood_event";
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.spectrum.app.data.MoodDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MoodDao_Impl.deleteAll$lambda$6(_sql, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteAll$lambda$6(String $_sql, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.step();
            return Unit.INSTANCE;
        } finally {
            _stmt.close();
        }
    }

    /* JADX INFO: compiled from: MoodDao_Impl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/spectrum/app/data/MoodDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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
