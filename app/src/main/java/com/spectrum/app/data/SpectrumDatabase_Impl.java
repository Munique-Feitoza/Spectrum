package com.spectrum.app.data;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: SpectrumDatabase_Impl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\"\u0010\u001b\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d0\u001e0\u001cH\u0014J\u0016\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020!0\u001d0 H\u0016J*\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u001e2\u001a\u0010$\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020!0\u001d\u0012\u0004\u0012\u00020!0\u001cH\u0016J\b\u0010%\u001a\u00020\u0006H\u0016J\b\u0010&\u001a\u00020\bH\u0016J\b\u0010'\u001a\u00020\nH\u0016J\b\u0010(\u001a\u00020\fH\u0016J\b\u0010)\u001a\u00020\u000eH\u0016J\b\u0010*\u001a\u00020\u0010H\u0016J\b\u0010+\u001a\u00020\u0012H\u0016J\b\u0010,\u001a\u00020\u0014H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/spectrum/app/data/SpectrumDatabase_Impl;", "Lcom/spectrum/app/data/SpectrumDatabase;", "<init>", "()V", "_moodDao", "Lkotlin/Lazy;", "Lcom/spectrum/app/data/MoodDao;", "_thoughtRecordDao", "Lcom/spectrum/app/data/ThoughtRecordDao;", "_safetyPlanDao", "Lcom/spectrum/app/data/SafetyPlanDao;", "_scaleResultDao", "Lcom/spectrum/app/data/ScaleResultDao;", "_activityLogDao", "Lcom/spectrum/app/data/ActivityLogDao;", "_abcRecordDao", "Lcom/spectrum/app/data/AbcRecordDao;", "_regulationEventDao", "Lcom/spectrum/app/data/RegulationEventDao;", "_overloadPlanDao", "Lcom/spectrum/app/data/OverloadPlanDao;", "createOpenDelegate", "Landroidx/room/RoomOpenDelegate;", "createInvalidationTracker", "Landroidx/room/InvalidationTracker;", "clearAllTables", "", "getRequiredTypeConverterClasses", "", "Lkotlin/reflect/KClass;", "", "getRequiredAutoMigrationSpecClasses", "", "Landroidx/room/migration/AutoMigrationSpec;", "createAutoMigrations", "Landroidx/room/migration/Migration;", "autoMigrationSpecs", "moodDao", "thoughtRecordDao", "safetyPlanDao", "scaleResultDao", "activityLogDao", "abcRecordDao", "regulationEventDao", "overloadPlanDao", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class SpectrumDatabase_Impl extends SpectrumDatabase {
    public static final int $stable = 8;
    private final Lazy<MoodDao> _moodDao = LazyKt.lazy(new Function0() { // from class: com.spectrum.app.data.SpectrumDatabase_Impl$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SpectrumDatabase_Impl._moodDao$lambda$0(this.f$0);
        }
    });
    private final Lazy<ThoughtRecordDao> _thoughtRecordDao = LazyKt.lazy(new Function0() { // from class: com.spectrum.app.data.SpectrumDatabase_Impl$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SpectrumDatabase_Impl._thoughtRecordDao$lambda$1(this.f$0);
        }
    });
    private final Lazy<SafetyPlanDao> _safetyPlanDao = LazyKt.lazy(new Function0() { // from class: com.spectrum.app.data.SpectrumDatabase_Impl$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SpectrumDatabase_Impl._safetyPlanDao$lambda$2(this.f$0);
        }
    });
    private final Lazy<ScaleResultDao> _scaleResultDao = LazyKt.lazy(new Function0() { // from class: com.spectrum.app.data.SpectrumDatabase_Impl$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SpectrumDatabase_Impl._scaleResultDao$lambda$3(this.f$0);
        }
    });
    private final Lazy<ActivityLogDao> _activityLogDao = LazyKt.lazy(new Function0() { // from class: com.spectrum.app.data.SpectrumDatabase_Impl$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SpectrumDatabase_Impl._activityLogDao$lambda$4(this.f$0);
        }
    });
    private final Lazy<AbcRecordDao> _abcRecordDao = LazyKt.lazy(new Function0() { // from class: com.spectrum.app.data.SpectrumDatabase_Impl$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SpectrumDatabase_Impl._abcRecordDao$lambda$5(this.f$0);
        }
    });
    private final Lazy<RegulationEventDao> _regulationEventDao = LazyKt.lazy(new Function0() { // from class: com.spectrum.app.data.SpectrumDatabase_Impl$$ExternalSyntheticLambda6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SpectrumDatabase_Impl._regulationEventDao$lambda$6(this.f$0);
        }
    });
    private final Lazy<OverloadPlanDao> _overloadPlanDao = LazyKt.lazy(new Function0() { // from class: com.spectrum.app.data.SpectrumDatabase_Impl$$ExternalSyntheticLambda7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SpectrumDatabase_Impl._overloadPlanDao$lambda$7(this.f$0);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final MoodDao_Impl _moodDao$lambda$0(SpectrumDatabase_Impl this$0) {
        return new MoodDao_Impl(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ThoughtRecordDao_Impl _thoughtRecordDao$lambda$1(SpectrumDatabase_Impl this$0) {
        return new ThoughtRecordDao_Impl(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SafetyPlanDao_Impl _safetyPlanDao$lambda$2(SpectrumDatabase_Impl this$0) {
        return new SafetyPlanDao_Impl(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScaleResultDao_Impl _scaleResultDao$lambda$3(SpectrumDatabase_Impl this$0) {
        return new ScaleResultDao_Impl(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActivityLogDao_Impl _activityLogDao$lambda$4(SpectrumDatabase_Impl this$0) {
        return new ActivityLogDao_Impl(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbcRecordDao_Impl _abcRecordDao$lambda$5(SpectrumDatabase_Impl this$0) {
        return new AbcRecordDao_Impl(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RegulationEventDao_Impl _regulationEventDao$lambda$6(SpectrumDatabase_Impl this$0) {
        return new RegulationEventDao_Impl(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OverloadPlanDao_Impl _overloadPlanDao$lambda$7(SpectrumDatabase_Impl this$0) {
        return new OverloadPlanDao_Impl(this$0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public RoomOpenDelegate createOpenDelegate() {
        RoomOpenDelegate _openDelegate = new RoomOpenDelegate() { // from class: com.spectrum.app.data.SpectrumDatabase_Impl$createOpenDelegate$_openDelegate$1
            {
                super(8, "28cf2eb76bb5f9c988784d0b3d26f806", "7e06375ad4af959d646ebf5b08c1f23b");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void createAllTables(SQLiteConnection connection) throws Exception {
                Intrinsics.checkNotNullParameter(connection, "connection");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `mood_event` (`id` TEXT NOT NULL, `ts` INTEGER NOT NULL, `createdAt` INTEGER NOT NULL, `valence` REAL NOT NULL, `arousal` REAL NOT NULL, `label` TEXT, `source` TEXT NOT NULL, PRIMARY KEY(`id`))");
                SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_mood_event_ts` ON `mood_event` (`ts`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `thought_record` (`situacao` TEXT NOT NULL, `emocao` TEXT NOT NULL, `intensidadeAntes` INTEGER NOT NULL, `pensamento` TEXT NOT NULL, `distorcoes` TEXT NOT NULL, `evidenciasFavor` TEXT NOT NULL, `evidenciasContra` TEXT NOT NULL, `pensamentoAlternativo` TEXT NOT NULL, `intensidadeDepois` INTEGER NOT NULL, `crencaAntes` INTEGER NOT NULL, `crencaDepois` INTEGER NOT NULL, `id` TEXT NOT NULL, `ts` INTEGER NOT NULL, `createdAt` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_thought_record_ts` ON `thought_record` (`ts`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `safety_plan` (`id` INTEGER NOT NULL, `sinaisAlerta` TEXT NOT NULL, `estrategias` TEXT NOT NULL, `pessoasDistracao` TEXT NOT NULL, `pessoasAjuda` TEXT NOT NULL, `profissionais` TEXT NOT NULL, `ambienteSeguro` TEXT NOT NULL, `updatedAt` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `scale_result` (`code` TEXT NOT NULL, `total` INTEGER NOT NULL, `band` TEXT NOT NULL, `answers` TEXT NOT NULL, `id` TEXT NOT NULL, `ts` INTEGER NOT NULL, `createdAt` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_scale_result_ts` ON `scale_result` (`ts`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `activity_log` (`atividade` TEXT NOT NULL, `prazer` INTEGER NOT NULL, `dominio` INTEGER NOT NULL, `nota` TEXT NOT NULL, `id` TEXT NOT NULL, `ts` INTEGER NOT NULL, `createdAt` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_activity_log_ts` ON `activity_log` (`ts`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `abc_record` (`antecedente` TEXT NOT NULL, `comportamento` TEXT NOT NULL, `consequencia` TEXT NOT NULL, `contexto` TEXT NOT NULL, `id` TEXT NOT NULL, `ts` INTEGER NOT NULL, `createdAt` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_abc_record_ts` ON `abc_record` (`ts`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `regulation_event` (`id` TEXT NOT NULL, `ts` INTEGER NOT NULL, `createdAt` INTEGER NOT NULL, `kind` TEXT NOT NULL, `label` TEXT NOT NULL, `intensity` INTEGER NOT NULL, `socialBattery` INTEGER NOT NULL, `bodyEnergy` INTEGER NOT NULL, `notes` TEXT NOT NULL, `source` TEXT NOT NULL, PRIMARY KEY(`id`))");
                SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_regulation_event_ts` ON `regulation_event` (`ts`)");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `overload_plan` (`id` INTEGER NOT NULL, `sinais` TEXT NOT NULL, `umMinuto` TEXT NOT NULL, `evitar` TEXT NOT NULL, `frase` TEXT NOT NULL, `ancora` TEXT NOT NULL, `updatedAt` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                SQLite.execSQL(connection, RoomMasterTable.CREATE_QUERY);
                SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '28cf2eb76bb5f9c988784d0b3d26f806')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void dropAllTables(SQLiteConnection connection) throws Exception {
                Intrinsics.checkNotNullParameter(connection, "connection");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `mood_event`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `thought_record`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `safety_plan`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `scale_result`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `activity_log`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `abc_record`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `regulation_event`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `overload_plan`");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onCreate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onOpen(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                this.this$0.internalInitInvalidationTracker(connection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPreMigrate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                DBUtil.dropFtsSyncTriggers(connection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPostMigrate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
            }

            @Override // androidx.room.RoomOpenDelegate
            public RoomOpenDelegate.ValidationResult onValidateSchema(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                Map _columnsMoodEvent = new LinkedHashMap();
                _columnsMoodEvent.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
                _columnsMoodEvent.put("ts", new TableInfo.Column("ts", "INTEGER", true, 0, null, 1));
                _columnsMoodEvent.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", true, 0, null, 1));
                _columnsMoodEvent.put("valence", new TableInfo.Column("valence", "REAL", true, 0, null, 1));
                _columnsMoodEvent.put("arousal", new TableInfo.Column("arousal", "REAL", true, 0, null, 1));
                _columnsMoodEvent.put("label", new TableInfo.Column("label", "TEXT", false, 0, null, 1));
                _columnsMoodEvent.put("source", new TableInfo.Column("source", "TEXT", true, 0, null, 1));
                Set _foreignKeysMoodEvent = new LinkedHashSet();
                Set _indicesMoodEvent = new LinkedHashSet();
                _indicesMoodEvent.add(new TableInfo.Index("index_mood_event_ts", false, CollectionsKt.listOf("ts"), CollectionsKt.listOf("ASC")));
                TableInfo _infoMoodEvent = new TableInfo("mood_event", _columnsMoodEvent, _foreignKeysMoodEvent, _indicesMoodEvent);
                TableInfo _existingMoodEvent = TableInfo.INSTANCE.read(connection, "mood_event");
                if (!_infoMoodEvent.equals(_existingMoodEvent)) {
                    return new RoomOpenDelegate.ValidationResult(false, "mood_event(com.spectrum.app.data.MoodEvent).\n Expected:\n" + _infoMoodEvent + "\n Found:\n" + _existingMoodEvent);
                }
                Map _columnsThoughtRecord = new LinkedHashMap();
                _columnsThoughtRecord.put("situacao", new TableInfo.Column("situacao", "TEXT", true, 0, null, 1));
                _columnsThoughtRecord.put("emocao", new TableInfo.Column("emocao", "TEXT", true, 0, null, 1));
                _columnsThoughtRecord.put("intensidadeAntes", new TableInfo.Column("intensidadeAntes", "INTEGER", true, 0, null, 1));
                _columnsThoughtRecord.put("pensamento", new TableInfo.Column("pensamento", "TEXT", true, 0, null, 1));
                _columnsThoughtRecord.put("distorcoes", new TableInfo.Column("distorcoes", "TEXT", true, 0, null, 1));
                _columnsThoughtRecord.put("evidenciasFavor", new TableInfo.Column("evidenciasFavor", "TEXT", true, 0, null, 1));
                _columnsThoughtRecord.put("evidenciasContra", new TableInfo.Column("evidenciasContra", "TEXT", true, 0, null, 1));
                _columnsThoughtRecord.put("pensamentoAlternativo", new TableInfo.Column("pensamentoAlternativo", "TEXT", true, 0, null, 1));
                _columnsThoughtRecord.put("intensidadeDepois", new TableInfo.Column("intensidadeDepois", "INTEGER", true, 0, null, 1));
                _columnsThoughtRecord.put("crencaAntes", new TableInfo.Column("crencaAntes", "INTEGER", true, 0, null, 1));
                _columnsThoughtRecord.put("crencaDepois", new TableInfo.Column("crencaDepois", "INTEGER", true, 0, null, 1));
                _columnsThoughtRecord.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
                _columnsThoughtRecord.put("ts", new TableInfo.Column("ts", "INTEGER", true, 0, null, 1));
                _columnsThoughtRecord.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", true, 0, null, 1));
                Set _foreignKeysThoughtRecord = new LinkedHashSet();
                Set _indicesThoughtRecord = new LinkedHashSet();
                _indicesThoughtRecord.add(new TableInfo.Index("index_thought_record_ts", false, CollectionsKt.listOf("ts"), CollectionsKt.listOf("ASC")));
                TableInfo _infoThoughtRecord = new TableInfo("thought_record", _columnsThoughtRecord, _foreignKeysThoughtRecord, _indicesThoughtRecord);
                TableInfo _existingThoughtRecord = TableInfo.INSTANCE.read(connection, "thought_record");
                if (!_infoThoughtRecord.equals(_existingThoughtRecord)) {
                    return new RoomOpenDelegate.ValidationResult(false, "thought_record(com.spectrum.app.data.ThoughtRecord).\n Expected:\n" + _infoThoughtRecord + "\n Found:\n" + _existingThoughtRecord);
                }
                Map _columnsSafetyPlan = new LinkedHashMap();
                _columnsSafetyPlan.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                _columnsSafetyPlan.put("sinaisAlerta", new TableInfo.Column("sinaisAlerta", "TEXT", true, 0, null, 1));
                _columnsSafetyPlan.put("estrategias", new TableInfo.Column("estrategias", "TEXT", true, 0, null, 1));
                _columnsSafetyPlan.put("pessoasDistracao", new TableInfo.Column("pessoasDistracao", "TEXT", true, 0, null, 1));
                _columnsSafetyPlan.put("pessoasAjuda", new TableInfo.Column("pessoasAjuda", "TEXT", true, 0, null, 1));
                _columnsSafetyPlan.put("profissionais", new TableInfo.Column("profissionais", "TEXT", true, 0, null, 1));
                _columnsSafetyPlan.put("ambienteSeguro", new TableInfo.Column("ambienteSeguro", "TEXT", true, 0, null, 1));
                _columnsSafetyPlan.put("updatedAt", new TableInfo.Column("updatedAt", "INTEGER", true, 0, null, 1));
                Set _foreignKeysSafetyPlan = new LinkedHashSet();
                Set _indicesSafetyPlan = new LinkedHashSet();
                TableInfo _infoSafetyPlan = new TableInfo("safety_plan", _columnsSafetyPlan, _foreignKeysSafetyPlan, _indicesSafetyPlan);
                TableInfo _existingSafetyPlan = TableInfo.INSTANCE.read(connection, "safety_plan");
                if (!_infoSafetyPlan.equals(_existingSafetyPlan)) {
                    return new RoomOpenDelegate.ValidationResult(false, "safety_plan(com.spectrum.app.data.SafetyPlan).\n Expected:\n" + _infoSafetyPlan + "\n Found:\n" + _existingSafetyPlan);
                }
                Map _columnsScaleResult = new LinkedHashMap();
                _columnsScaleResult.put("code", new TableInfo.Column("code", "TEXT", true, 0, null, 1));
                _columnsScaleResult.put("total", new TableInfo.Column("total", "INTEGER", true, 0, null, 1));
                _columnsScaleResult.put("band", new TableInfo.Column("band", "TEXT", true, 0, null, 1));
                _columnsScaleResult.put("answers", new TableInfo.Column("answers", "TEXT", true, 0, null, 1));
                _columnsScaleResult.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
                _columnsScaleResult.put("ts", new TableInfo.Column("ts", "INTEGER", true, 0, null, 1));
                _columnsScaleResult.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", true, 0, null, 1));
                Set _foreignKeysScaleResult = new LinkedHashSet();
                Set _indicesScaleResult = new LinkedHashSet();
                _indicesScaleResult.add(new TableInfo.Index("index_scale_result_ts", false, CollectionsKt.listOf("ts"), CollectionsKt.listOf("ASC")));
                TableInfo _infoScaleResult = new TableInfo("scale_result", _columnsScaleResult, _foreignKeysScaleResult, _indicesScaleResult);
                TableInfo _existingScaleResult = TableInfo.INSTANCE.read(connection, "scale_result");
                if (!_infoScaleResult.equals(_existingScaleResult)) {
                    return new RoomOpenDelegate.ValidationResult(false, "scale_result(com.spectrum.app.data.ScaleResult).\n Expected:\n" + _infoScaleResult + "\n Found:\n" + _existingScaleResult);
                }
                Map _columnsActivityLog = new LinkedHashMap();
                _columnsActivityLog.put("atividade", new TableInfo.Column("atividade", "TEXT", true, 0, null, 1));
                _columnsActivityLog.put("prazer", new TableInfo.Column("prazer", "INTEGER", true, 0, null, 1));
                _columnsActivityLog.put("dominio", new TableInfo.Column("dominio", "INTEGER", true, 0, null, 1));
                _columnsActivityLog.put("nota", new TableInfo.Column("nota", "TEXT", true, 0, null, 1));
                _columnsActivityLog.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
                _columnsActivityLog.put("ts", new TableInfo.Column("ts", "INTEGER", true, 0, null, 1));
                _columnsActivityLog.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", true, 0, null, 1));
                Set _foreignKeysActivityLog = new LinkedHashSet();
                Set _indicesActivityLog = new LinkedHashSet();
                _indicesActivityLog.add(new TableInfo.Index("index_activity_log_ts", false, CollectionsKt.listOf("ts"), CollectionsKt.listOf("ASC")));
                TableInfo _infoActivityLog = new TableInfo("activity_log", _columnsActivityLog, _foreignKeysActivityLog, _indicesActivityLog);
                TableInfo _existingActivityLog = TableInfo.INSTANCE.read(connection, "activity_log");
                if (!_infoActivityLog.equals(_existingActivityLog)) {
                    return new RoomOpenDelegate.ValidationResult(false, "activity_log(com.spectrum.app.data.ActivityLog).\n Expected:\n" + _infoActivityLog + "\n Found:\n" + _existingActivityLog);
                }
                Map _columnsAbcRecord = new LinkedHashMap();
                _columnsAbcRecord.put("antecedente", new TableInfo.Column("antecedente", "TEXT", true, 0, null, 1));
                _columnsAbcRecord.put("comportamento", new TableInfo.Column("comportamento", "TEXT", true, 0, null, 1));
                _columnsAbcRecord.put("consequencia", new TableInfo.Column("consequencia", "TEXT", true, 0, null, 1));
                _columnsAbcRecord.put("contexto", new TableInfo.Column("contexto", "TEXT", true, 0, null, 1));
                _columnsAbcRecord.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
                _columnsAbcRecord.put("ts", new TableInfo.Column("ts", "INTEGER", true, 0, null, 1));
                _columnsAbcRecord.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", true, 0, null, 1));
                Set _foreignKeysAbcRecord = new LinkedHashSet();
                Set _indicesAbcRecord = new LinkedHashSet();
                _indicesAbcRecord.add(new TableInfo.Index("index_abc_record_ts", false, CollectionsKt.listOf("ts"), CollectionsKt.listOf("ASC")));
                TableInfo _infoAbcRecord = new TableInfo("abc_record", _columnsAbcRecord, _foreignKeysAbcRecord, _indicesAbcRecord);
                TableInfo _existingAbcRecord = TableInfo.INSTANCE.read(connection, "abc_record");
                if (!_infoAbcRecord.equals(_existingAbcRecord)) {
                    return new RoomOpenDelegate.ValidationResult(false, "abc_record(com.spectrum.app.data.AbcRecord).\n Expected:\n" + _infoAbcRecord + "\n Found:\n" + _existingAbcRecord);
                }
                Map _columnsRegulationEvent = new LinkedHashMap();
                _columnsRegulationEvent.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
                _columnsRegulationEvent.put("ts", new TableInfo.Column("ts", "INTEGER", true, 0, null, 1));
                _columnsRegulationEvent.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", true, 0, null, 1));
                _columnsRegulationEvent.put("kind", new TableInfo.Column("kind", "TEXT", true, 0, null, 1));
                _columnsRegulationEvent.put("label", new TableInfo.Column("label", "TEXT", true, 0, null, 1));
                _columnsRegulationEvent.put("intensity", new TableInfo.Column("intensity", "INTEGER", true, 0, null, 1));
                _columnsRegulationEvent.put("socialBattery", new TableInfo.Column("socialBattery", "INTEGER", true, 0, null, 1));
                _columnsRegulationEvent.put("bodyEnergy", new TableInfo.Column("bodyEnergy", "INTEGER", true, 0, null, 1));
                _columnsRegulationEvent.put("notes", new TableInfo.Column("notes", "TEXT", true, 0, null, 1));
                _columnsRegulationEvent.put("source", new TableInfo.Column("source", "TEXT", true, 0, null, 1));
                Set _foreignKeysRegulationEvent = new LinkedHashSet();
                Set _indicesRegulationEvent = new LinkedHashSet();
                _indicesRegulationEvent.add(new TableInfo.Index("index_regulation_event_ts", false, CollectionsKt.listOf("ts"), CollectionsKt.listOf("ASC")));
                TableInfo _infoRegulationEvent = new TableInfo("regulation_event", _columnsRegulationEvent, _foreignKeysRegulationEvent, _indicesRegulationEvent);
                TableInfo _existingRegulationEvent = TableInfo.INSTANCE.read(connection, "regulation_event");
                if (!_infoRegulationEvent.equals(_existingRegulationEvent)) {
                    return new RoomOpenDelegate.ValidationResult(false, "regulation_event(com.spectrum.app.data.RegulationEvent).\n Expected:\n" + _infoRegulationEvent + "\n Found:\n" + _existingRegulationEvent);
                }
                Map _columnsOverloadPlan = new LinkedHashMap();
                _columnsOverloadPlan.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                _columnsOverloadPlan.put("sinais", new TableInfo.Column("sinais", "TEXT", true, 0, null, 1));
                _columnsOverloadPlan.put("umMinuto", new TableInfo.Column("umMinuto", "TEXT", true, 0, null, 1));
                _columnsOverloadPlan.put("evitar", new TableInfo.Column("evitar", "TEXT", true, 0, null, 1));
                _columnsOverloadPlan.put("frase", new TableInfo.Column("frase", "TEXT", true, 0, null, 1));
                _columnsOverloadPlan.put("ancora", new TableInfo.Column("ancora", "TEXT", true, 0, null, 1));
                _columnsOverloadPlan.put("updatedAt", new TableInfo.Column("updatedAt", "INTEGER", true, 0, null, 1));
                Set _foreignKeysOverloadPlan = new LinkedHashSet();
                Set _indicesOverloadPlan = new LinkedHashSet();
                TableInfo _infoOverloadPlan = new TableInfo("overload_plan", _columnsOverloadPlan, _foreignKeysOverloadPlan, _indicesOverloadPlan);
                TableInfo _existingOverloadPlan = TableInfo.INSTANCE.read(connection, "overload_plan");
                return !_infoOverloadPlan.equals(_existingOverloadPlan) ? new RoomOpenDelegate.ValidationResult(false, "overload_plan(com.spectrum.app.data.OverloadPlan).\n Expected:\n" + _infoOverloadPlan + "\n Found:\n" + _existingOverloadPlan) : new RoomOpenDelegate.ValidationResult(true, null);
            }
        };
        return _openDelegate;
    }

    @Override // androidx.room.RoomDatabase
    protected InvalidationTracker createInvalidationTracker() {
        Map _shadowTablesMap = new LinkedHashMap();
        Map _viewTables = new LinkedHashMap();
        return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "mood_event", "thought_record", "safety_plan", "scale_result", "activity_log", "abc_record", "regulation_event", "overload_plan");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "mood_event", "thought_record", "safety_plan", "scale_result", "activity_log", "abc_record", "regulation_event", "overload_plan");
    }

    @Override // androidx.room.RoomDatabase
    protected Map<KClass<?>, List<KClass<?>>> getRequiredTypeConverterClasses() {
        Map _typeConvertersMap = new LinkedHashMap();
        _typeConvertersMap.put(Reflection.getOrCreateKotlinClass(MoodDao.class), MoodDao_Impl.INSTANCE.getRequiredConverters());
        _typeConvertersMap.put(Reflection.getOrCreateKotlinClass(ThoughtRecordDao.class), ThoughtRecordDao_Impl.INSTANCE.getRequiredConverters());
        _typeConvertersMap.put(Reflection.getOrCreateKotlinClass(SafetyPlanDao.class), SafetyPlanDao_Impl.INSTANCE.getRequiredConverters());
        _typeConvertersMap.put(Reflection.getOrCreateKotlinClass(ScaleResultDao.class), ScaleResultDao_Impl.INSTANCE.getRequiredConverters());
        _typeConvertersMap.put(Reflection.getOrCreateKotlinClass(ActivityLogDao.class), ActivityLogDao_Impl.INSTANCE.getRequiredConverters());
        _typeConvertersMap.put(Reflection.getOrCreateKotlinClass(AbcRecordDao.class), AbcRecordDao_Impl.INSTANCE.getRequiredConverters());
        _typeConvertersMap.put(Reflection.getOrCreateKotlinClass(RegulationEventDao.class), RegulationEventDao_Impl.INSTANCE.getRequiredConverters());
        _typeConvertersMap.put(Reflection.getOrCreateKotlinClass(OverloadPlanDao.class), OverloadPlanDao_Impl.INSTANCE.getRequiredConverters());
        return _typeConvertersMap;
    }

    @Override // androidx.room.RoomDatabase
    public Set<KClass<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecClasses() {
        Set _autoMigrationSpecsSet = new LinkedHashSet();
        return _autoMigrationSpecsSet;
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> createAutoMigrations(Map<KClass<? extends AutoMigrationSpec>, ? extends AutoMigrationSpec> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        List _autoMigrations = new ArrayList();
        return _autoMigrations;
    }

    @Override // com.spectrum.app.data.SpectrumDatabase
    public MoodDao moodDao() {
        return this._moodDao.getValue();
    }

    @Override // com.spectrum.app.data.SpectrumDatabase
    public ThoughtRecordDao thoughtRecordDao() {
        return this._thoughtRecordDao.getValue();
    }

    @Override // com.spectrum.app.data.SpectrumDatabase
    public SafetyPlanDao safetyPlanDao() {
        return this._safetyPlanDao.getValue();
    }

    @Override // com.spectrum.app.data.SpectrumDatabase
    public ScaleResultDao scaleResultDao() {
        return this._scaleResultDao.getValue();
    }

    @Override // com.spectrum.app.data.SpectrumDatabase
    public ActivityLogDao activityLogDao() {
        return this._activityLogDao.getValue();
    }

    @Override // com.spectrum.app.data.SpectrumDatabase
    public AbcRecordDao abcRecordDao() {
        return this._abcRecordDao.getValue();
    }

    @Override // com.spectrum.app.data.SpectrumDatabase
    public RegulationEventDao regulationEventDao() {
        return this._regulationEventDao.getValue();
    }

    @Override // com.spectrum.app.data.SpectrumDatabase
    public OverloadPlanDao overloadPlanDao() {
        return this._overloadPlanDao.getValue();
    }
}
