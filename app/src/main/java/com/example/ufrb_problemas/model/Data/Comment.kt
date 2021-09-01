package com.example.ufrb_problemas.model.Data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Comment(
    val id: Int,
    val comment: String
): Parcelable
