package com.example.ufrb_problemas.utils

import com.example.ufrb_problemas.model.data.*
import com.example.ufrb_problemas.model.data.Enum.AlertStatus
import com.example.ufrb_problemas.model.data.Enum.Center
import com.example.ufrb_problemas.model.data.Enum.RequestStatus
import com.example.ufrb_problemas.model.data.Enum.UserType
import kotlin.random.Random

object GenerateData {
    private var idLocalization = 0
    private var idAlert = 0
    private var idUser = 0
    private var idFile = 0
    private var idImage = 0
    private var idAlertRequest = 0
    private var idRequest = 0
    private const val DATE = "2021-09-31T00:00:0000"

    fun generateLocalization(): Localization {
        idLocalization++
        return Localization(idLocalization, Center.CAHL, "Prédio Aleatório", "Térreo", "Perto da cantina", DATE, DATE)
    }

    fun generateUser(): User {
        idUser++
        return User(idUser, "Maria Tester", "mariatester@gmail.com", "75988779944", Center.CAHL, UserType.EMPLOYEE_CENTER, "54sa", null)
    }

    fun generateFile(): File {
        idFile++
        return File(idFile, "https://i.picsum.photos/id/408/200/300.jpg?hmac=WHLCqIpd4lzmPZlRRMknXp1aOoOr7_qdtEUwozDmIWQ")
    }

    fun generateImage(): Image {
        idImage++
        return Image(idImage, generateFile())
    }

    fun generateAlert(): Alert {
        idAlert++
        val localization = generateLocalization()
        val images = arrayListOf<Image>()
        for(i in 0..Random(5).nextInt(1, 5)) {
            images.add(generateImage())
        }
        return Alert(idAlert, "Torneira com problema", "A torneira está jorrando água", localization, AlertStatus.OPENED_REQUEST, generateUser(), images)
    }

    fun generateAlertRequest(): AlertRequest {
        idAlertRequest++
        return AlertRequest(idAlertRequest, generateAlert(), null)
    }

    fun generateRequest(): Request {
        idRequest++
        val alertRequests = arrayListOf<AlertRequest>()
        for(i in 0..Random(3).nextInt(1,3)) {
            alertRequests.add(generateAlertRequest())
        }
        return Request(idRequest, "Torneira pingando", RequestStatus.IN_PROGRESS, alertRequests, DATE, null, arrayListOf())
    }
}