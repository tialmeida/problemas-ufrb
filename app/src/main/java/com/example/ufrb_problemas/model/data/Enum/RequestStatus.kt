package com.example.ufrb_problemas.model.data.Enum

enum class RequestStatus(val displayName: String) {
    OPEN("aberta"),
    IN_PROGRESS("em progresso"),
    DONE("resolvida"),
    CANCELED("cancelada")
}