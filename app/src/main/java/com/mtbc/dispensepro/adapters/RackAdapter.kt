package com.mtbc.dispensepro.adapters

import android.view.Gravity
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RackAdapter(
    private val letters: List<String>,
    private val onLetterClick: (String) -> Unit
) : RecyclerView.Adapter<RackAdapter.ViewHolder>() {

    inner class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView) {
        fun bind(letter: String) {
            textView.text = letter
            textView.setOnClickListener { onLetterClick(letter) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val tv = LayoutInflater.from(parent.context)
            .inflate(android.R.layout.simple_list_item_1, parent, false) as TextView
        tv.gravity = Gravity.CENTER
        return ViewHolder(tv)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(letters[position])
    }

    override fun getItemCount() = letters.size
}
