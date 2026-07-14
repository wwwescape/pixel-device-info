package com.wwwescape.pixeldeviceinfo.ui.screens.camera

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.wwwescape.pixeldeviceinfo.data.camera.CameraLensInfo
import com.wwwescape.pixeldeviceinfo.data.camera.CameraRepository
import com.wwwescape.pixeldeviceinfo.util.CameraLensRole
import com.wwwescape.pixeldeviceinfo.util.classifyLensRoles
import com.wwwescape.pixeldeviceinfo.util.mainLens

class CameraViewModel(application: Application) : AndroidViewModel(application) {
    val cameras: List<CameraLensInfo> = CameraRepository.listCameras(application)
    val lensRoles: Map<String, CameraLensRole> = classifyLensRoles(cameras)
    val mainLens: CameraLensInfo? = mainLens(cameras, lensRoles)
}
