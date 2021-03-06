package com.example.ufrb_problemas.model.data

import android.os.Parcelable
import com.example.ufrb_problemas.model.data.Enum.Center
import com.example.ufrb_problemas.model.data.Enum.UserType
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val id: Int,
    val name: String,
    val email: String,
    val phone_number: String,
    val center: Center,
    val userType: UserType,
    val code: String,
    val user_photo: File?
): Parcelable
