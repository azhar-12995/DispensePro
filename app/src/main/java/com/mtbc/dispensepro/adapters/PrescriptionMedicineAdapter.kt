package com.mtbc.dispensepro.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mtbc.dispensepro.R
import com.mtbc.dispensepro.model.PrescriptionMedicine

class PrescriptionMedicineAdapter(
    private val medicines: List<PrescriptionMedicine>
) : RecyclerView.Adapter<PrescriptionMedicineAdapter.MedicineViewHolder>() {

    inner class MedicineViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.tvMedicineName)
        val tvDose: TextView = itemView.findViewById(R.id.tvMedicineDose)
        val tvFrequency: TextView = itemView.findViewById(R.id.tvMedicineFrequency)
        val tvDuration: TextView = itemView.findViewById(R.id.tvMedicineDuration)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MedicineViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_prescription_medicine, parent, false)
        return MedicineViewHolder(view)
    }

    override fun onBindViewHolder(holder: MedicineViewHolder, position: Int) {
        val med = medicines[position]
        holder.tvName.text = med.name
        holder.tvDose.text = "Dose: ${med.dose}"
        holder.tvFrequency.text = "Frequency: ${med.frequency}"
        holder.tvDuration.text = "Duration: ${med.duration}"
    }

    override fun getItemCount(): Int = medicines.size
}
