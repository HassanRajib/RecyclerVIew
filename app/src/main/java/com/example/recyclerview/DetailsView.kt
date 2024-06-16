package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.recyclerview.databinding.ActivityDetailsViewBinding

class DetailsView : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDetailsViewBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var name = intent.getStringExtra("name")
        var price = intent.getStringExtra("price")
        var details = intent.getStringExtra("details")
        var image = intent.getIntExtra("image", 0)

        binding.itemNa.text = name
        binding.itemPr.text = price
        binding.itemDe.text = details
        binding.itemIm.setImageResource(image)

    }
}