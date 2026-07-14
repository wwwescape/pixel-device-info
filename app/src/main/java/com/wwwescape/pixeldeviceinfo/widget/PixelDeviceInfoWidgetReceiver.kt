package com.wwwescape.pixeldeviceinfo.widget

import android.content.Context
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.GlanceAppWidgetReceiver

class PixelDeviceInfoWidgetReceiver : GlanceAppWidgetReceiver() {
    override val glanceAppWidget: GlanceAppWidget = PixelDeviceInfoWidget()

    /** First widget instance placed. */
    override fun onEnabled(context: Context) {
        super.onEnabled(context)
        scheduleWidgetRefreshWork(context)
    }

    /** Last widget instance removed — nothing left to keep fresh. */
    override fun onDisabled(context: Context) {
        super.onDisabled(context)
        cancelWidgetRefreshWork(context)
    }
}
