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

/* JADX INFO: compiled from: ThoughtRecordDao_Impl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u000fJ\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u0006\u0010\u0012\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/spectrum/app/data/ThoughtRecordDao_Impl;", "Lcom/spectrum/app/data/ThoughtRecordDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfThoughtRecord", "Landroidx/room/EntityInsertAdapter;", "Lcom/spectrum/app/data/ThoughtRecord;", "insert", "", "record", "(Lcom/spectrum/app/data/ThoughtRecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "count", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recent", "", "limit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ThoughtRecordDao_Impl implements ThoughtRecordDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<ThoughtRecord> __insertAdapterOfThoughtRecord;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public ThoughtRecordDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfThoughtRecord = new EntityInsertAdapter<ThoughtRecord>() { // from class: com.spectrum.app.data.ThoughtRecordDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR ABORT INTO `thought_record` (`situacao`,`emocao`,`intensidadeAntes`,`pensamento`,`distorcoes`,`evidenciasFavor`,`evidenciasContra`,`pensamentoAlternativo`,`intensidadeDepois`,`crencaAntes`,`crencaDepois`,`id`,`ts`,`createdAt`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, ThoughtRecord entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo1399bindText(1, entity.getSituacao());
                statement.mo1399bindText(2, entity.getEmocao());
                statement.mo1397bindLong(3, entity.getIntensidadeAntes());
                statement.mo1399bindText(4, entity.getPensamento());
                statement.mo1399bindText(5, entity.getDistorcoes());
                statement.mo1399bindText(6, entity.getEvidenciasFavor());
                statement.mo1399bindText(7, entity.getEvidenciasContra());
                statement.mo1399bindText(8, entity.getPensamentoAlternativo());
                statement.mo1397bindLong(9, entity.getIntensidadeDepois());
                statement.mo1397bindLong(10, entity.getCrencaAntes());
                statement.mo1397bindLong(11, entity.getCrencaDepois());
                statement.mo1399bindText(12, entity.getId());
                statement.mo1397bindLong(13, entity.getTs());
                statement.mo1397bindLong(14, entity.getCreatedAt());
            }
        };
    }

    @Override // com.spectrum.app.data.ThoughtRecordDao
    public Object insert(final ThoughtRecord record, Continuation<? super Unit> continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.spectrum.app.data.ThoughtRecordDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThoughtRecordDao_Impl.insert$lambda$0(this.f$0, record, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insert$lambda$0(ThoughtRecordDao_Impl this$0, ThoughtRecord $record, SQLiteConnection _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__insertAdapterOfThoughtRecord.insert(_connection, $record);
        return Unit.INSTANCE;
    }

    @Override // com.spectrum.app.data.ThoughtRecordDao
    public Object count(Continuation<? super Integer> continuation) {
        final String _sql = "SELECT COUNT(*) FROM thought_record";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.spectrum.app.data.ThoughtRecordDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(ThoughtRecordDao_Impl.count$lambda$1(_sql, (SQLiteConnection) obj));
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

    @Override // com.spectrum.app.data.ThoughtRecordDao
    public Object recent(final int limit, Continuation<? super List<ThoughtRecord>> continuation) {
        final String _sql = "SELECT * FROM thought_record ORDER BY ts DESC LIMIT ?";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.spectrum.app.data.ThoughtRecordDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThoughtRecordDao_Impl.recent$lambda$2(_sql, limit, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List recent$lambda$2(String $_sql, int $limit, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.mo1397bindLong(1, $limit);
            int _tmpIntensidadeDepois = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "situacao");
            int _tmpCrencaAntes = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "emocao");
            int _tmpCrencaDepois = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "intensidadeAntes");
            int _columnIndexOfPensamento = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "pensamento");
            int _columnIndexOfDistorcoes = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "distorcoes");
            int _columnIndexOfEvidenciasFavor = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "evidenciasFavor");
            int _columnIndexOfEvidenciasContra = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "evidenciasContra");
            int _columnIndexOfPensamentoAlternativo = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "pensamentoAlternativo");
            int _columnIndexOfIntensidadeDepois = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "intensidadeDepois");
            int _columnIndexOfCrencaAntes = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "crencaAntes");
            int _columnIndexOfCrencaDepois = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "crencaDepois");
            int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
            int _columnIndexOfTs = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "ts");
            int _columnIndexOfCreatedAt = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "createdAt");
            List _result = new ArrayList();
            while (_stmt.step()) {
                String _tmpSituacao = _stmt.getText(_tmpIntensidadeDepois);
                String _tmpEmocao = _stmt.getText(_tmpCrencaAntes);
                int _columnIndexOfSituacao = _tmpIntensidadeDepois;
                int _tmpIntensidadeAntes = (int) _stmt.getLong(_tmpCrencaDepois);
                String _tmpPensamento = _stmt.getText(_columnIndexOfPensamento);
                String _tmpDistorcoes = _stmt.getText(_columnIndexOfDistorcoes);
                String _tmpEvidenciasFavor = _stmt.getText(_columnIndexOfEvidenciasFavor);
                String _tmpEvidenciasContra = _stmt.getText(_columnIndexOfEvidenciasContra);
                String _tmpPensamentoAlternativo = _stmt.getText(_columnIndexOfPensamentoAlternativo);
                int _columnIndexOfEmocao = _tmpCrencaAntes;
                int _tmpIntensidadeDepois2 = (int) _stmt.getLong(_columnIndexOfIntensidadeDepois);
                int _columnIndexOfIntensidadeAntes = _tmpCrencaDepois;
                int _tmpCrencaAntes2 = (int) _stmt.getLong(_columnIndexOfCrencaAntes);
                int _columnIndexOfPensamento2 = _columnIndexOfPensamento;
                int _tmpCrencaDepois2 = (int) _stmt.getLong(_columnIndexOfCrencaDepois);
                String _tmpId = _stmt.getText(_columnIndexOfId);
                long _tmpTs = _stmt.getLong(_columnIndexOfTs);
                long _tmpCreatedAt = _stmt.getLong(_columnIndexOfCreatedAt);
                ThoughtRecord _item = new ThoughtRecord(_tmpSituacao, _tmpEmocao, _tmpIntensidadeAntes, _tmpPensamento, _tmpDistorcoes, _tmpEvidenciasFavor, _tmpEvidenciasContra, _tmpPensamentoAlternativo, _tmpIntensidadeDepois2, _tmpCrencaAntes2, _tmpCrencaDepois2, _tmpId, _tmpTs, _tmpCreatedAt);
                int _columnIndexOfId2 = _columnIndexOfId;
                List _result2 = _result;
                _result2.add(_item);
                _result = _result2;
                _columnIndexOfId = _columnIndexOfId2;
                _tmpCrencaAntes = _columnIndexOfEmocao;
                _tmpIntensidadeDepois = _columnIndexOfSituacao;
                _tmpCrencaDepois = _columnIndexOfIntensidadeAntes;
                _columnIndexOfPensamento = _columnIndexOfPensamento2;
            }
            List list = _result;
            _stmt.close();
            return list;
        } catch (Throwable th) {
            _stmt.close();
            throw th;
        }
    }

    /* JADX INFO: compiled from: ThoughtRecordDao_Impl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/spectrum/app/data/ThoughtRecordDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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
