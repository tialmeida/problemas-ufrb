package com.example.ufrb_problemas.model.data

import android.os.Parcelable
import com.example.ufrb_problemas.model.data.Enum.AlertStatus
import kotlinx.parcelize.Parcelize

@Parcelize
data class Alert(
    val id: Int,
    val title: String,
    val details: String,
    val localization: Localization,
    val status: AlertStatus,
    val user: User,
    val images: List<Image>
): Parcelable
