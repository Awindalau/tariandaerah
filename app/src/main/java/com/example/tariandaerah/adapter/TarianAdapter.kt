package com.example.tariandaerah.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.tariandaerah.databinding.ListTarianBinding
import com.example.tariandaerah.model.Tarian

class TarianAdapter(private val listTarian : ArrayList<Tarian>,
                    private val listener : TarianAdapter.onTarianClik): RecyclerView.Adapter<TarianAdapter.TarianViewHolder>()  {

    inner class TarianViewHolder(val binding : ListTarianBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarianViewHolder {
        return TarianViewHolder(ListTarianBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: TarianViewHolder, position: Int) {
        holder.binding.apply {
            Glide.with(holder.itemView.context)
                .load(listTarian[position].gambarTarian)
                .into(holder.binding.Tumbnail)

            Title.text = listTarian[position].namaTarian
        }
        holder.itemView.setOnClickListener {
            listener.onClick(listTarian[position])
        }
    }

    override fun getItemCount(): Int {
        return listTarian.size
    }

    interface onTarianClik{
        fun onClick(tarian: Tarian)
    }
}