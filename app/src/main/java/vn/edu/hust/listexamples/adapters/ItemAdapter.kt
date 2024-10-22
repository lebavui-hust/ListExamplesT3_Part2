package vn.edu.hust.listexamples.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import vn.edu.hust.listexamples.ItemClickListener
import vn.edu.hust.listexamples.R
import vn.edu.hust.listexamples.RecyclerViewActivity
import vn.edu.hust.listexamples.models.StudentModel

class ItemAdapter(val students: List<StudentModel>, val listener: ItemClickListener? = null): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
    val itemView = LayoutInflater.from(parent.context)
      .inflate(R.layout.layout_item, parent, false)
    return ItemViewHolder(itemView, listener)
  }

  override fun getItemCount(): Int = students.size

  override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
    val student = students[position]
    holder.imageAvatar.setImageResource(student.avatarResId)
    holder.textHoten.text = student.hoten
    holder.textMssv.text = student.mssv
  }

  class ItemViewHolder(itemView: View, val listener: ItemClickListener?): RecyclerView.ViewHolder(itemView) {
    val imageAvatar: ImageView
    val textHoten: TextView
    val textMssv: TextView
    init {
      imageAvatar = itemView.findViewById(R.id.image_avatar)
      textHoten = itemView.findViewById(R.id.text_hoten)
      textMssv = itemView.findViewById(R.id.text_mssv)

      itemView.setOnClickListener {
        listener?.OnItemClicked(adapterPosition)
      }
    }
  }
}