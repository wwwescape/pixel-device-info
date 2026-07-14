package com.wwwescape.pixeldeviceinfo.ui.screens.display

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.wwwescape.pixeldeviceinfo.data.display.DisplayInfo
import com.wwwescape.pixeldeviceinfo.data.display.DisplayRepository

class DisplayViewModel(application: Application) : AndroidViewModel(application) {
    val displayInfo: DisplayInfo = DisplayRepository.collectStatic(application)
}
