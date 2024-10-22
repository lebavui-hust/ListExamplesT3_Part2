package vn.edu.hust.listexamples

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import vn.edu.hust.listexamples.adapters.StudentAdapter
import vn.edu.hust.listexamples.models.StudentModel

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val students = mutableListOf<StudentModel>()
    repeat(28) {
      students.add(
        StudentModel("Student $it", "$it",
        resources.getIdentifier("thumb${it + 1}", "drawable", packageName))
      )
    }

    val adapter = StudentAdapter(students)

    val listStudents = findViewById<ListView>(R.id.list_students)
    listStudents.adapter = adapter
  }
}