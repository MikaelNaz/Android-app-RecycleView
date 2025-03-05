package com.example.laba22

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var hotelAdapter: HotelAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Инициализируем RecyclerView
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Получаем список отелей из данных
        val hotels = HotelsData.getHotels()

        // Создаем и устанавливаем адаптер
        hotelAdapter = HotelAdapter(hotels) { hotel ->
            // Обработчик клика на элемент отеля
            openHotelDetails(hotel)
        }

        recyclerView.adapter = hotelAdapter
    }

    // Метод для открытия активности с деталями отеля
    private fun openHotelDetails(hotel: Hotel) {
        val intent = Intent(this, HotelDetailsActivity::class.java)
        intent.putExtra("HOTEL", hotel) // Передаем объект отеля
        startActivity(intent)
    }
}
