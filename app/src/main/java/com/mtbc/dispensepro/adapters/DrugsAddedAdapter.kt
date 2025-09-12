package com.mtbc.dispensepro.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mtbc.dispensepro.R
import com.mtbc.dispensepro.model.Medicine

class DrugsAdapter(
    private val medicines: List<Medicine>
) : RecyclerView.Adapter<DrugsAdapter.DrugViewHolder>() {

    inner class DrugViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivDrug: ImageView = itemView.findViewById(R.id.ivDrugImage)
        val tvDrugName: TextView = itemView.findViewById(R.id.tvDrugName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DrugViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_drug, parent, false)
        return DrugViewHolder(view)
    }

    override fun onBindViewHolder(holder: DrugViewHolder, position: Int) {
        val medicine = medicines[position]
        holder.ivDrug.setImageResource(medicine.imageResId)
        holder.tvDrugName.text = medicine.name
    }

    override fun getItemCount(): Int = medicines.size
}
