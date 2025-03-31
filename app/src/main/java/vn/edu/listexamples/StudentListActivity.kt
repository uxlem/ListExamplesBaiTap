package vn.edu.listexamples

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class StudentListActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_student_list)

    val students = mutableListOf<StudentModel>()
    repeat(28) {
      students.add(StudentModel(
        resources.getIdentifier("thumb$it", "drawable", packageName),
        "Student $it",
        "SV$it"
      ))
    }

    val adapter = StudentAdapter(students)

    val listStudents = findViewById<ListView>(R.id.list_students)
    listStudents.adapter = adapter
  }
}