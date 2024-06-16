package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        val item = ArrayList<items>()
        item.add(items(R.drawable.apple, "Apple", "$18"))
        item.add(items(R.drawable.orange, "Banana", "$20"))
        item.add(items(R.drawable.kiwi, "Kiwi", "$25"))
        item.add(items(R.drawable.papay, "Papaya", "$30"))
        item.add(items(R.drawable.pineapple, "Pineapple", "$35"))
        item.add(items(R.drawable.strawberry, "Strawberry", "$40"))

        binding.recyclerView.adapter = ItemAdapter(item)
    }
}