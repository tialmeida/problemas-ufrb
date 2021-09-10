package com.example.ufrb_problemas.model.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class File(
    val id: Int,
    val url: String
): Parcelable
