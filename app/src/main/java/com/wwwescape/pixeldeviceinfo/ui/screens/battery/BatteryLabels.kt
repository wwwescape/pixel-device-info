package com.wwwescape.pixeldeviceinfo.ui.screens.battery

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.wwwescape.pixeldeviceinfo.R
import com.wwwescape.pixeldeviceinfo.data.battery.BatteryChargeStatus
import com.wwwescape.pixeldeviceinfo.data.battery.BatteryHealth
import com.wwwescape.pixeldeviceinfo.data.battery.BatteryPlugSource
import com.wwwescape.pixeldeviceinfo.data.battery.ThermalStatus
import com.wwwescape.pixeldeviceinfo.data.battery.labelRes

@Composable
fun BatteryChargeStatus.label(): String = stringResource(
    when (this) {
        BatteryChargeStatus.CHARGING -> R.string.battery_status_charging
        BatteryChargeStatus.DISCHARGING -> R.string.battery_status_discharging
        BatteryChargeStatus.FULL -> R.string.battery_status_full
        BatteryChargeStatus.NOT_CHARGING -> R.string.battery_status_not_charging
        BatteryChargeStatus.UNKNOWN -> R.string.battery_status_unknown
    },
)

@Composable
fun BatteryPlugSource.label(): String = stringResource(
    when (this) {
        BatteryPlugSource.AC -> R.string.battery_plug_ac
        BatteryPlugSource.USB -> R.string.battery_plug_usb
        BatteryPlugSource.WIRELESS -> R.string.battery_plug_wireless
        BatteryPlugSource.DOCK -> R.string.battery_plug_dock
        BatteryPlugSource.NONE -> R.string.battery_plug_none
    },
)

@Composable
fun BatteryHealth.label(): String = stringResource(labelRes)

@Composable
fun ThermalStatus.label(): String = stringResource(labelRes)
