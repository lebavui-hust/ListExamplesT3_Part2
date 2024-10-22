package vn.edu.hust.listexamples

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import vn.edu.hust.listexamples.adapters.ItemAdapter
import vn.edu.hust.listexamples.models.StudentModel

class RecyclerViewActivity : AppCompatActivity(), ItemClickListener {
  lateinit var students: MutableList<StudentModel>
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_recycler_view)

    students = mutableListOf<StudentModel>()
    repeat(28) {
      students.add(
        StudentModel("Student $it", "$it",
          resources.getIdentifier("thumb${it + 1}", "drawable", packageName))
      )
    }

    val adapter = ItemAdapter(students, this)

    val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
    recyclerView.layoutManager = LinearLayoutManager(this)
    recyclerView.adapter = adapter

    findViewById<Button>(R.id.button_add).setOnClickListener {
      students.add(1, StudentModel("NEW STUDENT", "0000", R.drawable.thumb11))
      adapter.notifyItemInserted(1)
    }

    findViewById<Button>(R.id.button_remove).setOnClickListener {
      students.removeAt(1)
      adapter.notifyItemRemoved(1)
    }

    findViewById<Button>(R.id.button_update).setOnClickListener {
      students[1].hoten = "UPDATED"
      adapter.notifyItemChanged(1)
    }
  }

  override fun OnItemClicked(position: Int) {
    Log.v("TAG", "${students[position]}")
  }
}