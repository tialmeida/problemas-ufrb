package com.example.ufrb_problemas.model.Data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Image(
    val id: Int,
    val file: File,
    val alert: Alert
): Parcelable
