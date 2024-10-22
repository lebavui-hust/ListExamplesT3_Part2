package vn.edu.hust.listexamples.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import vn.edu.hust.listexamples.R
import vn.edu.hust.listexamples.models.ItemModel

class SubAdapter(val items: List<ItemModel>): RecyclerView.Adapter<SubAdapter.SubViewHolder>() {
  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubViewHolder {
    val itemView = LayoutInflater.from(parent.context).inflate(R.layout.layout_single_item, parent, false)
    return SubViewHolder(itemView)
  }

  override fun getItemCount(): Int = items.size

  override fun onBindViewHolder(holder: SubViewHolder, position: Int) {
    val item = items[position]
    holder.imageAvatar.setImageResource(item.imageResId)
    holder.textTitle.text = item.title
  }

  class SubViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val imageAvatar: ImageView
    val textTitle: TextView
    init {
      imageAvatar = itemView.findViewById(R.id.image_avatar)
      textTitle = itemView.findViewById(R.id.text_title)
    }
  }
}