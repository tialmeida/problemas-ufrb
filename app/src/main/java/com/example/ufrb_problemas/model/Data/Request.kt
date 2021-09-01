package com.example.ufrb_problemas.model.Data

import android.os.Parcelable
import com.example.ufrb_problemas.model.Data.Enum.RequestStatus
import kotlinx.parcelize.Parcelize

@Parcelize
data class Request(
    val id: Int,
    val status: RequestStatus,
    val alerts_requests: List<AlertRequest>, //TODO("Falar com João sobre")
    val completion_prediction_date: String,
    val completion_date: String?,
    val comments: List<Comment>
): Parcelable
