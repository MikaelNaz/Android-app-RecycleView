package com.example.laba22

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView

class HotelDetailsActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hotel_details)
        
        // Получаем переданный объект отеля из Intent
        val hotel = intent.getSerializableExtra("HOTEL") as Hotel
        
        // Инициализируем представления
        val imageViewDetail: ImageView = findViewById(R.id.imageViewDetail)
        val textViewDetailName: TextView = findViewById(R.id.textViewDetailName)
        val textViewDetailAddress: TextView = findViewById(R.id.textViewDetailAddress)
        val ratingBarDetail: RatingBar = findViewById(R.id.ratingBarDetail)
        val textViewDetailPrice: TextView = findViewById(R.id.textViewDetailPrice)
        val textViewDescription: TextView = findViewById(R.id.textViewDescription)
        val textViewWifi: TextView = findViewById(R.id.textViewWifi)
        val textViewPool: TextView = findViewById(R.id.textViewPool)
        val buttonOpenMap: Button = findViewById(R.id.buttonOpenMap)
        val buttonBookNow: Button = findViewById(R.id.buttonBookNow)
        
        // Заполняем данными из объекта отеля
        imageViewDetail.setImageResource(hotel.imageResId)
        textViewDetailName.text = hotel.name
        textViewDetailAddress.text = hotel.address
        ratingBarDetail.rating = hotel.rating
        textViewDetailPrice.text = "${hotel.pricePerNight} ₽/ночь"
        textViewDescription.text = hotel.description
        
        // Отображение информации об удобствах
        textViewWifi.text = "Wi-Fi: ${if (hotel.hasWifi) "Есть" else "Нет"}"
        textViewPool.text = "Бассейн: ${if (hotel.hasPool) "Есть" else "Нет"}"
        
        // Настраиваем кнопку для открытия карты
        buttonOpenMap.setOnClickListener {
//            val mapIntent = Intent(Intent.ACTION_VIEW)
            // Здесь мы используем адрес отеля для поиска на карте
            val geoUri = Uri.parse("geo:0,0?q=${Uri.encode(hotel.address)}")
            val mapIntent = Intent(Intent.ACTION_VIEW, geoUri)
//            mapIntent.data = Uri.parse("https://www.google.ru/maps")
            startActivity(mapIntent)
        }
        
        // Настраиваем кнопку для бронирования
        buttonBookNow.setOnClickListener {
            val bookingIntent = Intent(Intent.ACTION_VIEW)
            bookingIntent.data = Uri.parse("https://booking.com")
            startActivity(bookingIntent)
        }
    }
}
