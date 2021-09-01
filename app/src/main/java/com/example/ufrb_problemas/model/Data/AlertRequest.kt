package com.example.ufrb_problemas.model.Data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class AlertRequest(
    val id: Int,
    val alert: Alert,
    val request: Request
): Parcelable
