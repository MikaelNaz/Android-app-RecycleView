package com.example.laba22

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HotelAdapter(
    private val hotels: List<Hotel>,
    private val onItemClick: (Hotel) -> Unit
) : RecyclerView.Adapter<HotelAdapter.HotelViewHolder>() {

    // ViewHolder для элемента отеля
    class HotelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textViewName: TextView = itemView.findViewById(R.id.textViewName)
        val textViewAddress: TextView = itemView.findViewById(R.id.textViewAddress)
        val ratingBar: RatingBar = itemView.findViewById(R.id.ratingBar)
        val textViewPrice: TextView = itemView.findViewById(R.id.textViewPrice)
    }

    // Создание нового ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotelViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_hotel, parent, false)
        return HotelViewHolder(view)
    }

    // Привязка данных к ViewHolder
    override fun onBindViewHolder(holder: HotelViewHolder, position: Int) {
        val hotel = hotels[position]
        
        // Заполняем поля данными
        holder.imageView.setImageResource(hotel.imageResId)
        holder.textViewName.text = hotel.name
        holder.textViewAddress.text = hotel.address
        holder.ratingBar.rating = hotel.rating
        holder.textViewPrice.text = "${hotel.pricePerNight} ₽/ночь"
        
        // Устанавливаем обработчик клика на элемент
        holder.itemView.setOnClickListener {
            onItemClick(hotel)
        }
    }

    // Возвращает количество элементов
    override fun getItemCount(): Int = hotels.size
}
