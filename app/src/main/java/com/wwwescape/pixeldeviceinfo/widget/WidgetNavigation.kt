package com.wwwescape.pixeldeviceinfo.widget

import android.appwidget.AppWidgetManager
import android.content.Context
import android.content.Intent
import com.wwwescape.pixeldeviceinfo.MainActivity

/** Intent extra carrying the [com.wwwescape.pixeldeviceinfo.ui.navigation.Destination] route a widget
 * tap should open — read by `MainActivity` and consumed by `PixelDeviceInfoApp` to navigate there once. */
const val EXTRA_DESTINATION_ROUTE = "destination_route"

/** An [Intent] that opens the app directly on [route] — `FLAG_ACTIVITY_NEW_TASK` is required
 * since this launches from a widget's PendingIntent, outside any Activity context. */
fun widgetDestinationIntent(context: Context, route: String): Intent =
    Intent(context, MainActivity::class.java).apply {
        putExtra(EXTRA_DESTINATION_ROUTE, route)
        flags = Intent.FLAG_ACTIVITY_NEW_TASK
    }

/** Reopens [PixelDeviceInfoWidgetConfigActivity] for an already-placed widget instance, so its
 * Light/Dark/System choice can be changed after the fact (the system only shows a configuration
 * activity automatically once, at initial placement). */
fun widgetConfigIntent(context: Context, appWidgetId: Int): Intent =
    Intent(context, PixelDeviceInfoWidgetConfigActivity::class.java).apply {
        putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, appWidgetId)
        flags = Intent.FLAG_ACTIVITY_NEW_TASK
    }
