package com.spectrum.app.dock;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.spectrum.app.R;
import com.spectrum.app.data.MoodEvent;
import com.spectrum.app.data.MoodRepository;
import com.spectrum.app.ui.MainActivity;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: compiled from: DockNotifier.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0007J\u0016\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0007J\u000e\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ \u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/spectrum/app/dock/DockNotifier;", "", "<init>", "()V", "ID", "", "CHANNEL_ID", "", "ensureChannel", "", "context", "Landroid/content/Context;", "build", "Landroid/app/Notification;", "lastLine", "show", "refreshAsync", "cancel", "action", "Landroid/app/PendingIntent;", "request", "app_debug"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class DockNotifier {
    public static final int $stable = 0;
    public static final String CHANNEL_ID = "spectrum_dock";
    public static final int ID = 1881;
    public static final DockNotifier INSTANCE = new DockNotifier();

    private DockNotifier() {
    }

    public final void ensureChannel(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        NotificationManager manager = (NotificationManager) context.getSystemService(NotificationManager.class);
        NotificationChannel existing = manager.getNotificationChannel(CHANNEL_ID);
        if (existing != null) {
            return;
        }
        NotificationChannel $this$ensureChannel_u24lambda_u240 = new NotificationChannel(CHANNEL_ID, "Atalho quieto", 2);
        $this$ensureChannel_u24lambda_u240.setDescription("Fica aí. Não pergunta. Não toca, não vibra.");
        $this$ensureChannel_u24lambda_u240.setShowBadge(false);
        $this$ensureChannel_u24lambda_u240.enableVibration(false);
        $this$ensureChannel_u24lambda_u240.setSound(null, null);
        manager.createNotificationChannel($this$ensureChannel_u24lambda_u240);
    }

    public final Notification build(Context context, String lastLine) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lastLine, "lastLine");
        ensureChannel(context);
        PendingIntent open = PendingIntent.getActivity(context, 0, new Intent(context, (Class<?>) MainActivity.class).addFlags(SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING), 201326592);
        Notification notificationBuild = new NotificationCompat.Builder(context, CHANNEL_ID).setSmallIcon(R.drawable.ic_dock).setContentTitle("Spectrum · sem avaliação").setContentText(lastLine).setStyle(new NotificationCompat.BigTextStyle().bigText(lastLine)).setOngoing(true).setSilent(true).setOnlyAlertOnce(true).setContentIntent(open).setPriority(-1).addAction(0, "Igual", action(context, DockActionReceiver.SAME, 1)).addAction(0, "Pausar", action(context, DockActionReceiver.PAUSE, 2)).addAction(0, "Ok", action(context, DockActionReceiver.OKAY, 3)).build();
        Intrinsics.checkNotNullExpressionValue(notificationBuild, "build(...)");
        return notificationBuild;
    }

    public final void show(Context context, String lastLine) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lastLine, "lastLine");
        ensureChannel(context);
        NotificationManager manager = (NotificationManager) context.getSystemService(NotificationManager.class);
        manager.notify(ID, build(context, lastLine));
    }

    /* JADX INFO: renamed from: com.spectrum.app.dock.DockNotifier$refreshAsync$1, reason: invalid class name */
    /* JADX INFO: compiled from: DockNotifier.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.spectrum.app.dock.DockNotifier$refreshAsync$1", f = "DockNotifier.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $app;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$app = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$app, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            String line;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    MoodRepository moodRepository = MoodRepository.INSTANCE;
                    Context context = this.$app;
                    Intrinsics.checkNotNull(context);
                    this.label = 1;
                    Object objLatest = moodRepository.latest(context, this);
                    if (objLatest == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    $result = objLatest;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MoodEvent last = (MoodEvent) $result;
            if (last == null) {
                line = "ainda sem registro. Igual / Pausar / Ok — sem roda.";
            } else {
                String hm = new SimpleDateFormat("HH:mm", new Locale("pt", "BR")).format(new Date(last.getTs()));
                String label = last.getLabel();
                if (label == null) {
                    label = "registro";
                }
                line = "último: " + label + " · " + hm + ". toque Igual se não mudou.";
            }
            DockNotifier dockNotifier = DockNotifier.INSTANCE;
            Context context2 = this.$app;
            Intrinsics.checkNotNull(context2);
            dockNotifier.show(context2, line);
            return Unit.INSTANCE;
        }
    }

    public final void refreshAsync(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context app = context.getApplicationContext();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new AnonymousClass1(app, null), 3, null);
    }

    public final void cancel(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ((NotificationManager) context.getSystemService(NotificationManager.class)).cancel(ID);
    }

    private final PendingIntent action(Context context, String action, int request) {
        Intent intent = new Intent(context, (Class<?>) DockActionReceiver.class).setAction(action);
        Intrinsics.checkNotNullExpressionValue(intent, "setAction(...)");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, request, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
        return broadcast;
    }
}
