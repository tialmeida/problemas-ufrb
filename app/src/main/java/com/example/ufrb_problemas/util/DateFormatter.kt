package com.example.ufrb_problemas.util

object DateFormatter {
    fun formatterDate(date: String): String {
        return try {
            val dateArray = date.split("-", "T")
            "${dateArray[2]}/${dateArray[1]}/${dateArray[0]}"
        } catch (e: Exception) {
             ""
        }
    }
}