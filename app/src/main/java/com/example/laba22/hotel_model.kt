package com.example.laba22

import java.io.Serializable

data class Hotel(
    val id: Int,
    val name: String,         // Название отеля
    val address: String,      // Адрес
    val rating: Float,        // Рейтинг (например, от 1 до 5)
    val pricePerNight: Int,   // Цена за ночь
    val description: String,  // Подробное описание (будет показано только в Details)
    val hasWifi: Boolean,     // Есть ли Wi-Fi (будет показано только в Details)
    val hasPool: Boolean,     // Есть ли бассейн (будет показано только в Details)
    val imageResId: Int       // ID ресурса для изображения (будет показано только в Details)
) : Serializable
