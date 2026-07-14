package com.wwwescape.pixeldeviceinfo.ui.screens.network

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.wwwescape.pixeldeviceinfo.R
import com.wwwescape.pixeldeviceinfo.data.network.ConnectionType

@Composable
fun ConnectionType.label(): String = stringResource(
    when (this) {
        ConnectionType.WIFI -> R.string.connection_type_wifi
        ConnectionType.CELLULAR -> R.string.connection_type_cellular
        ConnectionType.ETHERNET -> R.string.connection_type_ethernet
        ConnectionType.OTHER -> R.string.connection_type_other
        ConnectionType.NONE -> R.string.connection_type_none
    },
)
