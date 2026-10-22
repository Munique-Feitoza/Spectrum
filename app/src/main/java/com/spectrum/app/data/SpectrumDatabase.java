package com.spectrum.app.data;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SpectrumDatabase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H&¨\u0006\u0015"}, d2 = {"Lcom/spectrum/app/data/SpectrumDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "moodDao", "Lcom/spectrum/app/data/MoodDao;", "thoughtRecordDao", "Lcom/spectrum/app/data/ThoughtRecordDao;", "safetyPlanDao", "Lcom/spectrum/app/data/SafetyPlanDao;", "scaleResultDao", "Lcom/spectrum/app/data/ScaleResultDao;", "activityLogDao", "Lcom/spectrum/app/data/ActivityLogDao;", "abcRecordDao", "Lcom/spectrum/app/data/AbcRecordDao;", "regulationEventDao", "Lcom/spectrum/app/data/RegulationEventDao;", "overloadPlanDao", "Lcom/spectrum/app/data/OverloadPlanDao;", "Companion", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public abstract class SpectrumDatabase extends RoomDatabase {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Migration MIGRATION_1_2 = new Migration() { // from class: com.spectrum.app.data.SpectrumDatabase$Companion$MIGRATION_1_2$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_mood_event_ts ON mood_event(ts)");
        }
    };
    private static final Migration MIGRATION_2_3 = new Migration() { // from class: com.spectrum.app.data.SpectrumDatabase$Companion$MIGRATION_2_3$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("CREATE TABLE IF NOT EXISTS thought_record (\n    situacao TEXT NOT NULL,\n    emocao TEXT NOT NULL,\n    intensidadeAntes INTEGER NOT NULL,\n    pensamento TEXT NOT NULL,\n    distorcoes TEXT NOT NULL,\n    evidenciasFavor TEXT NOT NULL,\n    evidenciasContra TEXT NOT NULL,\n    pensamentoAlternativo TEXT NOT NULL,\n    intensidadeDepois INTEGER NOT NULL,\n    crencaAntes INTEGER NOT NULL,\n    crencaDepois INTEGER NOT NULL,\n    id TEXT NOT NULL PRIMARY KEY,\n    ts INTEGER NOT NULL,\n    createdAt INTEGER NOT NULL\n)");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_thought_record_ts ON thought_record(ts)");
        }
    };
    private static final Migration MIGRATION_3_4 = new Migration() { // from class: com.spectrum.app.data.SpectrumDatabase$Companion$MIGRATION_3_4$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("CREATE TABLE IF NOT EXISTS safety_plan (\n    id INTEGER NOT NULL PRIMARY KEY,\n    sinaisAlerta TEXT NOT NULL,\n    estrategias TEXT NOT NULL,\n    pessoasDistracao TEXT NOT NULL,\n    pessoasAjuda TEXT NOT NULL,\n    profissionais TEXT NOT NULL,\n    ambienteSeguro TEXT NOT NULL,\n    updatedAt INTEGER NOT NULL\n)");
        }
    };
    private static final Migration MIGRATION_4_5 = new Migration() { // from class: com.spectrum.app.data.SpectrumDatabase$Companion$MIGRATION_4_5$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("CREATE TABLE IF NOT EXISTS scale_result (\n    code TEXT NOT NULL,\n    total INTEGER NOT NULL,\n    band TEXT NOT NULL,\n    answers TEXT NOT NULL,\n    id TEXT NOT NULL PRIMARY KEY,\n    ts INTEGER NOT NULL,\n    createdAt INTEGER NOT NULL\n)");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_scale_result_ts ON scale_result(ts)");
        }
    };
    private static final Migration MIGRATION_5_6 = new Migration() { // from class: com.spectrum.app.data.SpectrumDatabase$Companion$MIGRATION_5_6$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("CREATE TABLE IF NOT EXISTS activity_log (\n    atividade TEXT NOT NULL,\n    prazer INTEGER NOT NULL,\n    dominio INTEGER NOT NULL,\n    nota TEXT NOT NULL,\n    id TEXT NOT NULL PRIMARY KEY,\n    ts INTEGER NOT NULL,\n    createdAt INTEGER NOT NULL\n)");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_activity_log_ts ON activity_log(ts)");
        }
    };
    private static final Migration MIGRATION_6_7 = new Migration() { // from class: com.spectrum.app.data.SpectrumDatabase$Companion$MIGRATION_6_7$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("CREATE TABLE IF NOT EXISTS abc_record (\n    antecedente TEXT NOT NULL,\n    comportamento TEXT NOT NULL,\n    consequencia TEXT NOT NULL,\n    contexto TEXT NOT NULL,\n    id TEXT NOT NULL PRIMARY KEY,\n    ts INTEGER NOT NULL,\n    createdAt INTEGER NOT NULL\n)");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_abc_record_ts ON abc_record(ts)");
        }
    };
    private static final Migration MIGRATION_7_8 = new Migration() { // from class: com.spectrum.app.data.SpectrumDatabase$Companion$MIGRATION_7_8$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.execSQL("CREATE TABLE IF NOT EXISTS regulation_event (\n    kind TEXT NOT NULL,\n    label TEXT NOT NULL,\n    intensity INTEGER NOT NULL,\n    socialBattery INTEGER NOT NULL,\n    bodyEnergy INTEGER NOT NULL,\n    notes TEXT NOT NULL,\n    source TEXT NOT NULL,\n    id TEXT NOT NULL PRIMARY KEY,\n    ts INTEGER NOT NULL,\n    createdAt INTEGER NOT NULL\n)");
            db.execSQL("CREATE INDEX IF NOT EXISTS index_regulation_event_ts ON regulation_event(ts)");
            db.execSQL("CREATE TABLE IF NOT EXISTS overload_plan (\n    id INTEGER NOT NULL PRIMARY KEY,\n    sinais TEXT NOT NULL,\n    umMinuto TEXT NOT NULL,\n    evitar TEXT NOT NULL,\n    frase TEXT NOT NULL,\n    ancora TEXT NOT NULL,\n    updatedAt INTEGER NOT NULL\n)");
        }
    };

    public abstract AbcRecordDao abcRecordDao();

    public abstract ActivityLogDao activityLogDao();

    public abstract MoodDao moodDao();

    public abstract OverloadPlanDao overloadPlanDao();

    public abstract RegulationEventDao regulationEventDao();

    public abstract SafetyPlanDao safetyPlanDao();

    public abstract ScaleResultDao scaleResultDao();

    public abstract ThoughtRecordDao thoughtRecordDao();

    /* JADX INFO: compiled from: SpectrumDatabase.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/spectrum/app/data/SpectrumDatabase$Companion;", "", "<init>", "()V", "MIGRATION_1_2", "Landroidx/room/migration/Migration;", "getMIGRATION_1_2", "()Landroidx/room/migration/Migration;", "MIGRATION_2_3", "getMIGRATION_2_3", "MIGRATION_3_4", "getMIGRATION_3_4", "MIGRATION_4_5", "getMIGRATION_4_5", "MIGRATION_5_6", "getMIGRATION_5_6", "MIGRATION_6_7", "getMIGRATION_6_7", "MIGRATION_7_8", "getMIGRATION_7_8", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Migration getMIGRATION_1_2() {
            return SpectrumDatabase.MIGRATION_1_2;
        }

        public final Migration getMIGRATION_2_3() {
            return SpectrumDatabase.MIGRATION_2_3;
        }

        public final Migration getMIGRATION_3_4() {
            return SpectrumDatabase.MIGRATION_3_4;
        }

        public final Migration getMIGRATION_4_5() {
            return SpectrumDatabase.MIGRATION_4_5;
        }

        public final Migration getMIGRATION_5_6() {
            return SpectrumDatabase.MIGRATION_5_6;
        }

        public final Migration getMIGRATION_6_7() {
            return SpectrumDatabase.MIGRATION_6_7;
        }

        public final Migration getMIGRATION_7_8() {
            return SpectrumDatabase.MIGRATION_7_8;
        }
    }
}
