package com.example.tariandaerah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.tariandaerah.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        showDetailTarian()
        backButtonClick()
    }

    fun backButtonClick(){
        binding.btnBack.setOnClickListener {
            finish()
        }
    }

    fun showDetailTarian(){
        val nama = intent.getStringExtra("namaTarian")
        val gambar = intent.getIntExtra("gambarTarian", 0)
        val desc = intent.getStringExtra("descTarian")
        binding.apply {
            Glide.with(this@DetailActivity)
                .load(gambar)
                .into(ImageDetail)

            TitleDetail.text = nama
            ContentDetail.text = desc
        }

    }
}