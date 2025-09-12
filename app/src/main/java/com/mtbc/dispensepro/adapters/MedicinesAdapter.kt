package com.mtbc.dispensepro.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.mtbc.dispensepro.R
import com.mtbc.dispensepro.model.Medicine

class MedicinesAdapter(
    private val context: Context,
    private var medicines: List<Medicine>
) : BaseAdapter() {

    override fun getCount(): Int = medicines.size

    override fun getItem(position: Int): Medicine = medicines[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val holder: ViewHolder

        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_medicine, parent, false)
            holder = ViewHolder(
                view.findViewById(R.id.medicineImage),
                view.findViewById(R.id.medicineName),
                view.findViewById(R.id.medicineQuantity),
                view.findViewById(R.id.medicineExpiry)
            )
            view.tag = holder
        } else {
            view = convertView
            holder = view.tag as ViewHolder
        }

        val medicine = medicines[position]
        holder.image.setImageResource(medicine.imageResId)
        holder.name.text = medicine.name
        holder.quantity.text = "Qty: ${medicine.quantity}"
        holder.expiry.text = "Exp: ${medicine.expiryDate}"

        return view
    }

    fun updateData(newMedicines: List<Medicine>) {
        medicines = newMedicines
        notifyDataSetChanged()
    }

    private data class ViewHolder(
        val image: ImageView,
        val name: TextView,
        val quantity: TextView,
        val expiry: TextView
    )
}
