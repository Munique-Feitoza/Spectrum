package com.spectrum.app.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.RemoteViews;
import android.widget.Toast;

import com.spectrum.app.R;
import com.spectrum.app.data.MoodDao;
import com.spectrum.app.data.MoodEvent;
import com.spectrum.app.data.RegulationEvent;
import com.spectrum.app.data.SpectrumDatabase;
import com.spectrum.app.data.DatabaseProvider;
import com.spectrum.app.ui.MainActivity;

import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * QuickLogWidgetProvider — Widget nativo do Spectrum em Java puro (RemoteViews).
 *
 * Funciona de forma imediata e confiável em qualquer versão do Android e launchers (Samsung One UI, etc).
 * Carrega instantaneamente sem delay e permite registrar humor e pausas sensoriais em 1 toque.
 */
public class QuickLogWidgetProvider extends AppWidgetProvider {

    public static final String ACTION_LOG_MOOD = "com.spectrum.app.ACTION_LOG_MOOD";
    public static final String ACTION_LOG_CARE = "com.spectrum.app.ACTION_LOG_CARE";

    public static final String EXTRA_LABEL = "extra_label";
    public static final String EXTRA_VALENCE = "extra_valence";
    public static final String EXTRA_AROUSAL = "extra_arousal";
    public static final String EXTRA_CARE_KIND = "extra_care_kind";

    private static final ExecutorService executor = Executors.newSingleThreadExecutor();

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        for (int appWidgetId : appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId);
        }
    }

    public static void updateAppWidget(Context context, AppWidgetManager appWidgetManager, int appWidgetId) {
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget_quick_log);

        // 1. Botões de humor
        views.setOnClickPendingIntent(R.id.btn_happy, createMoodPendingIntent(context, "Feliz", 0.8f, 0.5f, 1));
        views.setOnClickPendingIntent(R.id.btn_calm, createMoodPendingIntent(context, "Calmo", 0.6f, -0.3f, 2));
        views.setOnClickPendingIntent(R.id.btn_sad, createMoodPendingIntent(context, "Triste", -0.7f, -0.4f, 3));
        views.setOnClickPendingIntent(R.id.btn_anxious, createMoodPendingIntent(context, "Ansioso", -0.5f, 0.8f, 4));
        views.setOnClickPendingIntent(R.id.btn_tired, createMoodPendingIntent(context, "Cansado", -0.3f, -0.7f, 5));
        views.setOnClickPendingIntent(R.id.btn_irritated, createMoodPendingIntent(context, "Irritado", -0.8f, 0.7f, 6));

        // 2. Botão de pausa sensorial
        Intent careIntent = new Intent(context, QuickLogWidgetProvider.class);
        careIntent.setAction(ACTION_LOG_CARE);
        careIntent.putExtra(EXTRA_CARE_KIND, "pause");
        careIntent.putExtra(EXTRA_LABEL, "Pausa Sensorial");
        int flags = Build.VERSION.SDK_INT >= Build.VERSION_CODES.M ? PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE : PendingIntent.FLAG_UPDATE_CURRENT;
        PendingIntent carePendingIntent = PendingIntent.getBroadcast(context, 100, careIntent, flags);
        views.setOnClickPendingIntent(R.id.btn_pause_sensory, carePendingIntent);

        // 3. Botão de abrir o Spectrum
        Intent openAppIntent = new Intent(context, MainActivity.class);
        openAppIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent openAppPendingIntent = PendingIntent.getActivity(context, 200, openAppIntent, flags);
        views.setOnClickPendingIntent(R.id.btn_open_spectrum, openAppPendingIntent);

        appWidgetManager.updateAppWidget(appWidgetId, views);
    }

    private static PendingIntent createMoodPendingIntent(Context context, String label, float valence, float arousal, int requestCode) {
        Intent intent = new Intent(context, QuickLogWidgetProvider.class);
        intent.setAction(ACTION_LOG_MOOD);
        intent.putExtra(EXTRA_LABEL, label);
        intent.putExtra(EXTRA_VALENCE, valence);
        intent.putExtra(EXTRA_AROUSAL, arousal);

        int flags = Build.VERSION.SDK_INT >= Build.VERSION_CODES.M ? PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE : PendingIntent.FLAG_UPDATE_CURRENT;
        return PendingIntent.getBroadcast(context, requestCode, intent, flags);
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);

        String action = intent.getAction();
        if (ACTION_LOG_MOOD.equals(action)) {
            String label = intent.getStringExtra(EXTRA_LABEL);
            float valence = intent.getFloatExtra(EXTRA_VALENCE, 0f);
            float arousal = intent.getFloatExtra(EXTRA_AROUSAL, 0f);

            executor.execute(() -> {
                try {
                    long now = System.currentTimeMillis();
                    SpectrumDatabase db = DatabaseProvider.INSTANCE.get(context);
                    db.moodDao().insertBlocking(new MoodEvent(
                            UUID.randomUUID().toString(),
                            now,
                            now,
                            valence,
                            arousal,
                            label,
                            "widget"
                    ));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });

            new Handler(Looper.getMainLooper()).post(() ->
                    Toast.makeText(context, "✨ Humor registrado: " + label, Toast.LENGTH_SHORT).show()
            );

            refreshWidgets(context);

        } else if (ACTION_LOG_CARE.equals(action)) {
            String label = intent.getStringExtra(EXTRA_LABEL);
            String kind = intent.getStringExtra(EXTRA_CARE_KIND);

            executor.execute(() -> {
                try {
                    long now = System.currentTimeMillis();
                    SpectrumDatabase db = DatabaseProvider.INSTANCE.get(context);
                    db.regulationDao().insertBlocking(new RegulationEvent(
                            UUID.randomUUID().toString(),
                            now,
                            now,
                            kind != null ? kind : "pause",
                            label != null ? label : "Pausa Sensorial",
                            -0.2f,
                            0.2f,
                            "widget"
                    ));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });

            new Handler(Looper.getMainLooper()).post(() ->
                    Toast.makeText(context, "🌿 Pausa sensorial ativada! Respire fundo.", Toast.LENGTH_SHORT).show()
            );

            refreshWidgets(context);
        }
    }

    private void refreshWidgets(Context context) {
        AppWidgetManager manager = AppWidgetManager.getInstance(context);
        ComponentName component = new ComponentName(context, QuickLogWidgetProvider.class);
        int[] ids = manager.getAppWidgetIds(component);
        if (ids != null && ids.length > 0) {
            onUpdate(context, manager, ids);
        }
    }
}
