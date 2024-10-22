package vn.edu.hust.listexamples.models

data class StudentModel(var hoten: String, val mssv: String, val avatarResId: Int) {
  var selected: Boolean = false
}
