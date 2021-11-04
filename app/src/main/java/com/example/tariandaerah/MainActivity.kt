package com.example.tariandaerah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.tariandaerah.adapter.TarianAdapter
import com.example.tariandaerah.databinding.ActivityMainBinding
import com.example.tariandaerah.model.Tarian
import com.example.tariandaerah.model.TarianData

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var tarianAdapter: TarianAdapter
    private var listTarian : ArrayList<Tarian> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        showTarianRecyclerView()
    }

    fun showTarianRecyclerView(){
        listTarian.addAll(TarianData.listTarian)
        tarianAdapter = TarianAdapter(listTarian, object : TarianAdapter.onTarianClik{
            override fun onClick(tarian: Tarian) {
                startActivity(Intent(this@MainActivity, DetailActivity::class.java).apply {
                    putExtra("namaTarian", tarian.namaTarian)
                    putExtra("gambarTarian", tarian.gambarTarian)
                    putExtra("descTarian", tarian.descTarian)
                })
            }
        })

        binding.RvTarian.apply {
            val lm = GridLayoutManager(this@MainActivity, 2)
            adapter = tarianAdapter
            layoutManager = lm
        }
    }
}