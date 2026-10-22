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

/* JADX INFO: compiled from: RegulationEventDao_Impl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/spectrum/app/data/RegulationEventDao_Impl;", "Lcom/spectrum/app/data/RegulationEventDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfRegulationEvent", "Landroidx/room/EntityInsertAdapter;", "Lcom/spectrum/app/data/RegulationEvent;", "insert", "", NotificationCompat.CATEGORY_EVENT, "(Lcom/spectrum/app/data/RegulationEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recent", "", "limit", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "count", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class RegulationEventDao_Impl implements RegulationEventDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<RegulationEvent> __insertAdapterOfRegulationEvent;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public RegulationEventDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfRegulationEvent = new EntityInsertAdapter<RegulationEvent>() { // from class: com.spectrum.app.data.RegulationEventDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `regulation_event` (`id`,`ts`,`createdAt`,`kind`,`label`,`intensity`,`socialBattery`,`bodyEnergy`,`notes`,`source`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, RegulationEvent entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo1399bindText(1, entity.getId());
                statement.mo1397bindLong(2, entity.getTs());
                statement.mo1397bindLong(3, entity.getCreatedAt());
                statement.mo1399bindText(4, entity.getKind());
                statement.mo1399bindText(5, entity.getLabel());
                statement.mo1397bindLong(6, entity.getIntensity());
                statement.mo1397bindLong(7, entity.getSocialBattery());
                statement.mo1397bindLong(8, entity.getBodyEnergy());
                statement.mo1399bindText(9, entity.getNotes());
                statement.mo1399bindText(10, entity.getSource());
            }
        };
    }

    @Override // com.spectrum.app.data.RegulationEventDao
    public Object insert(final RegulationEvent event, Continuation<? super Unit> continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.spectrum.app.data.RegulationEventDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegulationEventDao_Impl.insert$lambda$0(this.f$0, event, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insert$lambda$0(RegulationEventDao_Impl this$0, RegulationEvent $event, SQLiteConnection _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__insertAdapterOfRegulationEvent.insert(_connection, $event);
        return Unit.INSTANCE;
    }

    @Override // com.spectrum.app.data.RegulationEventDao
    public Object recent(final int limit, Continuation<? super List<RegulationEvent>> continuation) {
        final String _sql = "SELECT * FROM regulation_event ORDER BY ts DESC LIMIT ?";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.spectrum.app.data.RegulationEventDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegulationEventDao_Impl.recent$lambda$1(_sql, limit, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List recent$lambda$1(String $_sql, int $limit, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        int _tmpIntensity = 1;
        try {
            _stmt.mo1397bindLong(1, $limit);
            int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
            int _columnIndexOfTs = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "ts");
            int _columnIndexOfCreatedAt = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "createdAt");
            int _columnIndexOfKind = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "kind");
            int _columnIndexOfLabel = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "label");
            int _columnIndexOfIntensity = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "intensity");
            int _columnIndexOfSocialBattery = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "socialBattery");
            int _columnIndexOfBodyEnergy = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "bodyEnergy");
            int _columnIndexOfNotes = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "notes");
            int _columnIndexOfSource = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "source");
            List _result = new ArrayList();
            while (_stmt.step()) {
                String _tmpId = _stmt.getText(_columnIndexOfId);
                long _tmpTs = _stmt.getLong(_columnIndexOfTs);
                long _tmpCreatedAt = _stmt.getLong(_columnIndexOfCreatedAt);
                String _tmpKind = _stmt.getText(_columnIndexOfKind);
                String _tmpLabel = _stmt.getText(_columnIndexOfLabel);
                int _argIndex = _tmpIntensity;
                int _tmpIntensity2 = (int) _stmt.getLong(_columnIndexOfIntensity);
                int _tmpSocialBattery = (int) _stmt.getLong(_columnIndexOfSocialBattery);
                int _columnIndexOfId2 = _columnIndexOfId;
                int _tmpBodyEnergy = (int) _stmt.getLong(_columnIndexOfBodyEnergy);
                String _tmpNotes = _stmt.getText(_columnIndexOfNotes);
                String _tmpSource = _stmt.getText(_columnIndexOfSource);
                RegulationEvent _item = new RegulationEvent(_tmpId, _tmpTs, _tmpCreatedAt, _tmpKind, _tmpLabel, _tmpIntensity2, _tmpSocialBattery, _tmpBodyEnergy, _tmpNotes, _tmpSource);
                _result.add(_item);
                _columnIndexOfId = _columnIndexOfId2;
                _tmpIntensity = _argIndex;
            }
            _stmt.close();
            return _result;
        } catch (Throwable th) {
            _stmt.close();
            throw th;
        }
    }

    @Override // com.spectrum.app.data.RegulationEventDao
    public Object count(Continuation<? super Integer> continuation) {
        final String _sql = "SELECT COUNT(*) FROM regulation_event";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.spectrum.app.data.RegulationEventDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(RegulationEventDao_Impl.count$lambda$2(_sql, (SQLiteConnection) obj));
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int count$lambda$2(String $_sql, SQLiteConnection _connection) {
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

    /* JADX INFO: compiled from: RegulationEventDao_Impl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/spectrum/app/data/RegulationEventDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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
