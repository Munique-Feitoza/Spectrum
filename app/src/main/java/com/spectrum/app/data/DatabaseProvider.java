package com.spectrum.app.data;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.room.Room;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.zetetic.database.sqlcipher.SupportOpenHelperFactory;

/* JADX INFO: compiled from: DatabaseProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/spectrum/app/data/DatabaseProvider;", "", "<init>", "()V", "instance", "Lcom/spectrum/app/data/SpectrumDatabase;", "get", "context", "Landroid/content/Context;", "build", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class DatabaseProvider {
    private static volatile SpectrumDatabase instance;
    public static final DatabaseProvider INSTANCE = new DatabaseProvider();
    public static final int $stable = 8;

    private DatabaseProvider() {
    }

    public final SpectrumDatabase get(Context context) {
        SpectrumDatabase it;
        Intrinsics.checkNotNullParameter(context, "context");
        SpectrumDatabase spectrumDatabase = instance;
        if (spectrumDatabase == null) {
            synchronized (this) {
                it = instance;
                if (it == null) {
                    DatabaseProvider databaseProvider = INSTANCE;
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    it = databaseProvider.build(applicationContext);
                    instance = it;
                }
            }
            return it;
        }
        return spectrumDatabase;
    }

    private final SpectrumDatabase build(Context context) {
        System.loadLibrary("sqlcipher");
        byte[] passphrase = DatabaseKey.INSTANCE.getOrCreatePassphrase(context);
        SupportOpenHelperFactory factory = new SupportOpenHelperFactory(passphrase);
        return (SpectrumDatabase) Room.databaseBuilder(context, SpectrumDatabase.class, "spectrum.db").openHelperFactory(factory).addMigrations(SpectrumDatabase.INSTANCE.getMIGRATION_1_2(), SpectrumDatabase.INSTANCE.getMIGRATION_2_3(), SpectrumDatabase.INSTANCE.getMIGRATION_3_4(), SpectrumDatabase.INSTANCE.getMIGRATION_4_5(), SpectrumDatabase.INSTANCE.getMIGRATION_5_6(), SpectrumDatabase.INSTANCE.getMIGRATION_6_7(), SpectrumDatabase.INSTANCE.getMIGRATION_7_8()).build();
    }
}
