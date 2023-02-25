package ru.myitschool.lab23

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val list: List<MyItem>?) : RecyclerView.Adapter<MyAdapter.MyView>() {

    class MyView(view: View) : RecyclerView.ViewHolder(view) {
        val type: TextView = view.findViewById(R.id.textView2)
        val date: TextView = view.findViewById(R.id.textView3)
        val amount: TextView = view.findViewById(R.id.textView4)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyView {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return MyView(view)
    }

    override fun getItemCount() = list?.size ?: 0

    override fun onBindViewHolder(holder: MyView, position: Int) {
        holder.amount.text = list?.get(position)?.type ?: ""
        // ...
    }

}