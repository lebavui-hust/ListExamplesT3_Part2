package vn.edu.hust.listexamples

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import vn.edu.hust.listexamples.adapters.MainAdapter
import vn.edu.hust.listexamples.models.ItemModel

class NestedRecyclerActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_nested_recycler)

    val itemss = mutableListOf<List<ItemModel>>()
    val items1 = mutableListOf<ItemModel>()
    items1.add(ItemModel(R.drawable.thumb1, "Item 11"))
    items1.add(ItemModel(R.drawable.thumb2, "Item 12"))
    items1.add(ItemModel(R.drawable.thumb3, "Item 13"))
    items1.add(ItemModel(R.drawable.thumb4, "Item 14"))
    items1.add(ItemModel(R.drawable.thumb5, "Item 15"))
    items1.add(ItemModel(R.drawable.thumb6, "Item 16"))
    itemss.add(items1)

    val items2 = mutableListOf<ItemModel>()
    items2.add(ItemModel(R.drawable.thumb7, "Item 21"))
    items2.add(ItemModel(R.drawable.thumb8, "Item 22"))
    items2.add(ItemModel(R.drawable.thumb9, "Item 23"))
    items2.add(ItemModel(R.drawable.thumb10, "Item 24"))
    items2.add(ItemModel(R.drawable.thumb11, "Item 25"))
    items2.add(ItemModel(R.drawable.thumb12, "Item 26"))
    itemss.add(items2)

    val items3 = mutableListOf<ItemModel>()
    items3.add(ItemModel(R.drawable.thumb1, "Item 31"))
    items3.add(ItemModel(R.drawable.thumb2, "Item 32"))
    items3.add(ItemModel(R.drawable.thumb3, "Item 33"))
    items3.add(ItemModel(R.drawable.thumb4, "Item 34"))
    items3.add(ItemModel(R.drawable.thumb5, "Item 35"))
    items3.add(ItemModel(R.drawable.thumb6, "Item 36"))
    itemss.add(items3)

    val items4 = mutableListOf<ItemModel>()
    items4.add(ItemModel(R.drawable.thumb7, "Item 41"))
    items4.add(ItemModel(R.drawable.thumb8, "Item 42"))
    items4.add(ItemModel(R.drawable.thumb9, "Item 43"))
    items4.add(ItemModel(R.drawable.thumb10, "Item 44"))
    items4.add(ItemModel(R.drawable.thumb11, "Item 45"))
    items4.add(ItemModel(R.drawable.thumb12, "Item 46"))
    itemss.add(items4)

    val mainAdapter = MainAdapter(itemss)
    val mainRecycler = findViewById<RecyclerView>(R.id.main_recycler)
    mainRecycler.layoutManager = LinearLayoutManager(this)
    mainRecycler.adapter = mainAdapter
  }
}