package com.spectrum.app.widget

import android.content.ComponentName
import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.action.ActionParameters
import androidx.glance.action.actionParametersOf
import androidx.glance.action.actionStartActivity
import androidx.glance.action.clickable
import androidx.glance.appwidget.CornerRadius
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.action.actionRunCallback
import androidx.glance.appwidget.cornerRadius
import androidx.glance.appwidget.provideContent
import androidx.glance.background
import androidx.glance.layout.Alignment
import androidx.glance.layout.Box
import androidx.glance.layout.Column
import androidx.glance.layout.Row
import androidx.glance.layout.Spacer
import androidx.glance.layout.fillMaxSize
import androidx.glance.layout.fillMaxWidth
import androidx.glance.layout.height
import androidx.glance.layout.padding
import androidx.glance.layout.width
import androidx.glance.text.FontWeight
import androidx.glance.text.TextAlign
import androidx.glance.text.Text
import androidx.glance.text.TextStyle
import androidx.glance.unit.ColorProvider
import com.spectrum.app.ui.MainActivity

/**
 * QuickLogWidget — Widget elegante de tela inicial do Spectrum
 *
 * Oferece acolhimento visual imediato e registro em 1 toque para autorregulação,
 * identificação rápida de humor e botão de pausa/descompressão sensorial.
 */
class QuickLogWidget : GlanceAppWidget() {

    override suspend fun provideGlance(context: Context, id: GlanceId) {
        provideContent {
            WidgetContent(context)
        }
    }

    @Composable
    private fun WidgetContent(context: Context) {
        // Container principal com cantos arredondados, fundo escuro e acabamento Material 3
        Box(
            modifier = GlanceModifier
                .fillMaxSize()
                .cornerRadius(24.dp)
                .background(Color(0xFF131815))
                .padding(14.dp),
            contentAlignment = Alignment.TopStart
        ) {
            Column(
                modifier = GlanceModifier.fillMaxSize()
            ) {
                // Header com identidade do app e frase acolhedora
                Row(
                    modifier = GlanceModifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "🧠 SPECTRUM",
                        style = TextStyle(
                            color = ColorProvider(Color(0xFF86E2B6)),
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Spacer(modifier = GlanceModifier.defaultWeight())
                    Text(
                        text = "como você está?",
                        style = TextStyle(
                            color = ColorProvider(Color(0xFFA0A8A2)),
                            fontSize = 10.sp
                        )
                    )
                }

                Spacer(modifier = GlanceModifier.height(8.dp))

                // Linha 1 de emoções
                Row(
                    modifier = GlanceModifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    MoodPill("😊 Feliz", 0.8f, 0.5f, Color(0xFF2E4E3B), GlanceModifier.defaultWeight())
                    Spacer(modifier = GlanceModifier.width(6.dp))
                    MoodPill("😌 Calmo", 0.6f, -0.3f, Color(0xFF284852), GlanceModifier.defaultWeight())
                    Spacer(modifier = GlanceModifier.width(6.dp))
                    MoodPill("😢 Triste", -0.7f, -0.4f, Color(0xFF3E364A), GlanceModifier.defaultWeight())
                }

                Spacer(modifier = GlanceModifier.height(6.dp))

                // Linha 2 de emoções
                Row(
                    modifier = GlanceModifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    MoodPill("⚡ Ansioso", -0.5f, 0.8f, Color(0xFF5A442A), GlanceModifier.defaultWeight())
                    Spacer(modifier = GlanceModifier.width(6.dp))
                    MoodPill("😴 Cansado", -0.3f, -0.7f, Color(0xFF383838), GlanceModifier.defaultWeight())
                    Spacer(modifier = GlanceModifier.width(6.dp))
                    MoodPill("😤 Irritado", -0.8f, 0.7f, Color(0xFF542C2C), GlanceModifier.defaultWeight())
                }

                Spacer(modifier = GlanceModifier.height(8.dp))

                // Linha de ações rápidas: Pausa sensorial e Abertura do app
                Row(
                    modifier = GlanceModifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Botão de Pausa / Descompressão imediata
                    val careParams = actionParametersOf(
                        LogCareAction.kindKey to "pause",
                        LogCareAction.labelKey to "Pausa Sensorial",
                        LogCareAction.valenceKey to -0.2f,
                        LogCareAction.arousalKey to 0.2f
                    )
                    Text(
                        text = "⏸ Pausa Sensorial",
                        modifier = GlanceModifier
                            .defaultWeight()
                            .cornerRadius(12.dp)
                            .background(Color(0xFF2C3E35))
                            .clickable(actionRunCallback<LogCareAction>(careParams))
                            .padding(vertical = 8.dp, horizontal = 10.dp),
                        style = TextStyle(
                            color = ColorProvider(Color(0xFFD4EDE0)),
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Medium,
                            textAlign = TextAlign.Center
                        )
                    )

                    Spacer(modifier = GlanceModifier.width(6.dp))

                    // Abrir o Spectrum
                    Text(
                        text = "＋ Abrir App",
                        modifier = GlanceModifier
                            .defaultWeight()
                            .cornerRadius(12.dp)
                            .background(Color(0xFF222B26))
                            .clickable(actionStartActivity(ComponentName(context, MainActivity::class.java)))
                            .padding(vertical = 8.dp, horizontal = 10.dp),
                        style = TextStyle(
                            color = ColorProvider(Color(0xFFB8C2BB)),
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Medium,
                            textAlign = TextAlign.Center
                        )
                    )
                }
            }
        }
    }

    @Composable
    private fun MoodPill(
        label: String,
        valence: Float,
        arousal: Float,
        pillColor: Color,
        modifier: GlanceModifier
    ) {
        val params = actionParametersOf(
            LogMoodAction.valenceKey to valence,
            LogMoodAction.arousalKey to arousal,
            LogMoodAction.labelKey to label
        )

        Text(
            text = label,
            modifier = modifier
                .cornerRadius(12.dp)
                .background(pillColor)
                .clickable(actionRunCallback<LogMoodAction>(params))
                .padding(vertical = 8.dp, horizontal = 4.dp),
            style = TextStyle(
                color = ColorProvider(Color(0xFFF2F4F2)),
                fontSize = 11.sp,
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Center
            )
        )
    }
}
