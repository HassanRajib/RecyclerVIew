package com.example.recyclerview

import android.content.Intent
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
        item.add(items(R.drawable.apple, "Apple", "$18", "domesticated tree and fruit of the rose family (Rosaceae), one of the most widely cultivated tree fruits. Apples are predominantly grown for sale as fresh fruit, though apples are also used commercially for vinegar, juice, jelly, applesauce, and apple butter and are canned as pie stock. A significant portion of the global crop also is used for cider, wine, and brandy. Fresh apples are eaten raw or cooked. There are a variety of ways in which cooked apples are used; frequently, they are used as a pastry filling, apple pie being perhaps the archetypal American dessert. Especially in Europe, fried apples characteristically accompany certain dishes of sausage or pork. Apples provide vitamins A and C, are high in carbohydrates, and are an excellent source of dietary fibre."))
        item.add(items(R.drawable.orange, "Banana", "$20", "any of several species of small trees or shrubs of the genus Citrus of the family Rutaceae and their nearly round fruits, which have leathery and oily rinds and edible, juicy inner flesh. A number of species and varieties of orange are economically important, namely the China orange, also called the sweet, or common, orange (Citrus ×sinensis); the mandarin orange (C. reticulata), some varieties of which are called tangerines; and the sour, or Seville, orange (C. ×aurantium), which is less extensively grown. Common varieties of the sweet orange include the Jaffa, from Israel, the seedless navel, and the Maltese, or blood, orange."))
        item.add(items(R.drawable.kiwi, "Kiwi", "$25", "(Actinidia deliciosa), woody vine and edible fruit of the family Actinidiaceae. The plant is native to mainland China and Taiwan and is also grown commercially in New Zealand and California. The fruit has a slightly acid taste and can be eaten raw or cooked. The juice is sometimes used as a meat tenderizer. Raw kiwis are high in vitamins C and K."))
        item.add(items(R.drawable.papay, "Papaya", "$30", "succulent fruit of a large plant of the family Caricaceae. Though its origin is rather obscure, the papaya may represent the fusion of two or more species of Carica native to Mexico and Central America. Today it is cultivated throughout the tropical world and into the warmest parts of the subtropics. The papaya fruit is slightly sweet, with an agreeable musky tang, which is more pronounced in some varieties and in some climates than in others. It is a popular breakfast fruit in many countries and is also used in salads, pies, sherbets, juices, and confections. The unripe fruit can be cooked like squash."))
        item.add(items(R.drawable.pineapple, "Pineapple", "$35", "perennial plant of the family Bromeliaceae and its edible fruit. Pineapple is native to tropical and subtropical America and has been introduced elsewhere. The fruit has become a characteristic ingredient in the meat, vegetable, fish, and rice dishes of what is loosely termed Pan-Asian cuisine. The fruit is eaten fresh where available and in canned form worldwide. In the United States and in Europe it is sometimes used as a pastry filling or in baked desserts."))
        item.add(items(R.drawable.strawberry, "Strawberry", "$40", "genus of more than 20 species of flowering plants in the rose family (Rosaceae) and their edible fruit. Strawberries are native to the temperate regions of the Northern Hemisphere, and cultivated varieties are widely grown throughout the world. The fruits are rich in vitamin C and are commonly eaten fresh as a dessert fruit, are used as a pastry or pie filling, and may be preserved in many ways. Strawberry shortcake—made of fresh strawberries, sponge cake, and whipped cream—is a traditional American dessert."))

        var itemA = ItemAdapter(item)
        binding.recyclerView.adapter = itemA

        itemA.onClick = {
            val intent = Intent(this, DetailsView::class.java)
            intent.putExtra("name", it.name)
            intent.putExtra("price", it.price)
            intent.putExtra("details", it.decs)
            intent.putExtra("image", it.image)
            startActivity(intent)
        }
    }
}