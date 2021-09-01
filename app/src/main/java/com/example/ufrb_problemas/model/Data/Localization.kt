package com.example.ufrb_problemas.model.Data

import android.os.Parcelable
import com.example.ufrb_problemas.model.Data.Enum.Center
import kotlinx.parcelize.Parcelize

@Parcelize
data class Localization(
    val id: Int,
    val center: Center,
    val building: String,
    val floor: String,
    val details: String,
    val created_at: String,
    val updated_at: String
): Parcelable
