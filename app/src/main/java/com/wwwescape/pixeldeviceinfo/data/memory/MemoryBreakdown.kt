package com.wwwescape.pixeldeviceinfo.data.memory

/** A kernel-level RAM breakdown from `/proc/meminfo`, in bytes. */
data class MemoryBreakdown(
    val activeBytes: Long,
    val cachedBytes: Long,
    val swapUsedBytes: Long,
    val buffersBytes: Long,
)
