package com.example.ufrb_problemas.model.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Image(
    val id: Int,
    val file: File,
): Parcelable
