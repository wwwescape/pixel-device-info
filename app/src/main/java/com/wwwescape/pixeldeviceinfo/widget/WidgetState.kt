package com.wwwescape.pixeldeviceinfo.widget

import androidx.datastore.preferences.core.stringPreferencesKey

/** Per-widget-instance override of [com.wwwescape.pixeldeviceinfo.data.settings.ThemeMode], set via
 * [PixelDeviceInfoWidgetConfigActivity] and stored in the widget's own Glance state (not the app's
 * global settings) so each placed widget can pin its own theme. */
val WIDGET_THEME_MODE_KEY = stringPreferencesKey("widget_theme_mode")
