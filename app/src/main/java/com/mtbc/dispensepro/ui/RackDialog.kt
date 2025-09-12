package com.mtbc.dispensepro.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mtbc.dispensepro.R
import com.mtbc.dispensepro.adapters.DrugsAdapter
import com.mtbc.dispensepro.adapters.MedicinesAdapter
import com.mtbc.dispensepro.adapters.RackAdapter
import com.mtbc.dispensepro.databinding.RackDialogBinding
import com.mtbc.dispensepro.model.Medicine
import com.skydoves.balloon.ArrowOrientation
import com.skydoves.balloon.BalloonSizeSpec
import com.skydoves.balloon.createBalloon

class RackDialog : DialogFragment() {

    private var _binding: RackDialogBinding? = null
    private val binding get() = _binding!!

    private lateinit var medicineAdapter: MedicinesAdapter


    private val allMedicines = listOf(
        // A
        Medicine("Acetaminophen (Paracetamol)", R.drawable.brufin, 25, "12/2026"),
        Medicine("Amoxicillin", R.drawable.brufin, 15, "11/2025"),
        Medicine("Amlodipine", R.drawable.brufin, 18, "09/2027"),
        Medicine("Azithromycin", R.drawable.brufin, 20, "03/2026"),
        Medicine("Aspirin", R.drawable.brufin, 30, "01/2027"),
        Medicine("Atorvastatin", R.drawable.brufin, 10, "05/2026"),
        Medicine("Alprazolam", R.drawable.brufin, 12, "07/2025"),
        Medicine("Allopurinol", R.drawable.brufin, 15, "02/2026"),
        Medicine("Aripiprazole", R.drawable.brufin, 10, "04/2027"),
        Medicine("Amiodarone", R.drawable.brufin, 8, "10/2025"),

        // B
        Medicine("Bisoprolol", R.drawable.brufin, 12, "08/2026"),
        Medicine("Budesonide", R.drawable.brufin, 20, "09/2026"),
        Medicine("Bupropion", R.drawable.brufin, 10, "12/2025"),
        Medicine("Brimonidine", R.drawable.brufin, 7, "06/2026"),
        Medicine("Beclometasone", R.drawable.brufin, 14, "11/2026"),
        Medicine("Baclofen", R.drawable.brufin, 9, "03/2026"),
        Medicine("Benzylpenicillin", R.drawable.brufin, 8, "05/2027"),
        Medicine("Bromocriptine", R.drawable.brufin, 6, "07/2025"),
        Medicine("Betahistine", R.drawable.brufin, 10, "10/2026"),
        Medicine("Buspirone", R.drawable.brufin, 5, "01/2026"),

        // C
        Medicine("Ciprofloxacin", R.drawable.brufin, 18, "06/2026"),
        Medicine("Cetrizine", R.drawable.brufin, 25, "07/2027"),
        Medicine("Clopidogrel", R.drawable.brufin, 10, "09/2026"),
        Medicine("Clarithromycin", R.drawable.brufin, 15, "04/2026"),
        Medicine("Ceftriaxone", R.drawable.brufin, 20, "01/2027"),
        Medicine("Carvedilol", R.drawable.brufin, 12, "12/2026"),
        Medicine("Captopril", R.drawable.brufin, 14, "03/2025"),
        Medicine("Chlorpheniramine", R.drawable.brufin, 30, "02/2026"),
        Medicine("Citalopram", R.drawable.brufin, 9, "06/2026"),
        Medicine("Clindamycin", R.drawable.brufin, 8, "11/2026"),

        // D
        Medicine("Diclofenac", R.drawable.brufin, 20, "05/2026"),
        Medicine("Doxycycline", R.drawable.brufin, 15, "09/2026"),
        Medicine("Diazepam", R.drawable.brufin, 12, "04/2027"),
        Medicine("Dexamethasone", R.drawable.brufin, 10, "12/2026"),
        Medicine("Digoxin", R.drawable.brufin, 6, "11/2025"),
        Medicine("Domperidone", R.drawable.brufin, 18, "08/2026"),
        Medicine("Diphenhydramine", R.drawable.brufin, 20, "07/2027"),
        Medicine("Duloxetine", R.drawable.brufin, 9, "03/2026"),
        Medicine("Desloratadine", R.drawable.brufin, 25, "01/2026"),
        Medicine("Dobutamine", R.drawable.brufin, 5, "10/2026"),

        // E
        Medicine("Erythromycin", R.drawable.brufin, 15, "12/2026"),
        Medicine("Enalapril", R.drawable.brufin, 10, "05/2027"),
        Medicine("Escitalopram", R.drawable.brufin, 8, "04/2026"),
        Medicine("Esomeprazole", R.drawable.brufin, 20, "03/2027"),
        Medicine("Etodolac", R.drawable.brufin, 7, "09/2026"),
        Medicine("Etoricoxib", R.drawable.brufin, 12, "02/2026"),
        Medicine("Etoposide", R.drawable.brufin, 6, "11/2025"),
        Medicine("Empagliflozin", R.drawable.brufin, 10, "10/2027"),
        Medicine("Econazole", R.drawable.brufin, 9, "08/2026"),
        Medicine("Eltrombopag", R.drawable.brufin, 5, "12/2025"),

        // F
        Medicine("Furosemide", R.drawable.brufin, 15, "05/2026"),
        Medicine("Fluoxetine", R.drawable.brufin, 12, "07/2026"),
        Medicine("Fluticasone", R.drawable.brufin, 20, "09/2027"),
        Medicine("Ferrous Sulfate", R.drawable.brufin, 18, "01/2026"),
        Medicine("Fexofenadine", R.drawable.brufin, 25, "12/2026"),
        Medicine("Famotidine", R.drawable.brufin, 10, "11/2026"),
        Medicine("Finasteride", R.drawable.brufin, 8, "03/2027"),
        Medicine("Fluconazole", R.drawable.brufin, 14, "06/2026"),
        Medicine("Folic Acid", R.drawable.brufin, 20, "02/2026"),
        Medicine("Febuxostat", R.drawable.brufin, 6, "04/2027")
        // … continue for G → Z similarly
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = RackDialogBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.ivBack.setOnClickListener {
            dismiss()
        }
        binding.ivAddDrug.setOnClickListener {
            showAddedDrugs(it)
        }
        binding.ivPrecription.setOnClickListener {
            showPrescriptionDialog()
        }


        // GridView with custom medicine adapter
        medicineAdapter = MedicinesAdapter(requireContext(), emptyList())
        binding.gridView.adapter = medicineAdapter

        // RecyclerView for A-Z letters
        val letters = ('A'..'Z').map { it.toString() }
        binding.recyclerViewAlphabet.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = RackAdapter(letters) { letter ->
                filterMedicines(letter)
            }
        }

        // Default filter: A
        filterMedicines("A")
    }

    private fun filterMedicines(letter: String) {
        val filtered = allMedicines.filter { it.name.startsWith(letter, ignoreCase = true) }
        medicineAdapter.updateData(filtered)
    }

    private fun showPrescriptionDialog() {
        val dialogView = LayoutInflater.from(requireContext())
            .inflate(R.layout.prescription_dialog, null)

        val dialog = AlertDialog.Builder(requireContext())
            .setView(dialogView)
            .create()

        // Bind views
        val hospital = dialogView.findViewById<TextView>(R.id.tvHospital)
        val doctor = dialogView.findViewById<TextView>(R.id.tvDoctor)
        val patient = dialogView.findViewById<TextView>(R.id.tvPatient)
        val date = dialogView.findViewById<TextView>(R.id.tvDate)
        val allergies = dialogView.findViewById<TextView>(R.id.tvAllergies)
        val diagnosis = dialogView.findViewById<TextView>(R.id.tvDiagnosis)
        val medicines = dialogView.findViewById<TextView>(R.id.tvMedicines)
        val followUp = dialogView.findViewById<TextView>(R.id.tvFollowUp)

        // Set values (dynamic if needed)
        hospital.text = "Hospital: DrugScribe"
        doctor.text = "Doctor: Dr. XYZ (Pain Physician)"
        patient.text = "Patient: ABC | 45y | Female | MR# 12-34-56"
        date.text = "Date: 06-Sep-25"
        allergies.text = "Allergies: NKDA"
        diagnosis.text = "Diagnosis: Chronic neck & back pain"
        medicines.text = """
        • Dextop 30 mg – 1 cap BD × 7d (before meals)
        • Lyta 20 mg – 1 cap BD × 7d (after breakfast)
        • Miro 2.5 mg – 1 tab OD × 7d
    """.trimIndent()
        followUp.text = "Follow-up: After 1 week"

        // Close


        dialog.show()
        dialog.window?.setLayout(
            (resources.displayMetrics.widthPixels * 0.5).toInt(),
            (resources.displayMetrics.widthPixels * 0.4).toInt()
        )
    }

    private fun showAddedDrugs(anchor: View) {
        val balloon = createBalloon(anchor.context) {
            setLayout(R.layout.drugs_list)
            setWidth(BalloonSizeSpec.WRAP)   // ✅ width adjusts automatically
            setHeight(BalloonSizeSpec.WRAP)  // ✅ height adjusts automatically
            setCornerRadius(12f)
            setBackgroundColorResource(android.R.color.white)
            setElevation(6)
            setArrowSize(12)
            arrowColor = resources.getColor(R.color.blue, null)
            setArrowOrientation(ArrowOrientation.BOTTOM)
            setArrowPosition(0.5f)
            setDismissWhenTouchOutside(true)
            setDismissWhenShowAgain(true)
            setLifecycleOwner(lifecycleOwner)
        }

        val recyclerView = balloon.getContentView().findViewById<RecyclerView>(R.id.recyclerViewDrugs)

        val medicines = listOf(
            Medicine("Brufen", R.drawable.brufin),
            Medicine("Cetrizine", R.drawable.brufin),
            Medicine("Paracetamol", R.drawable.brufin),
            Medicine("Aspirin", R.drawable.brufin)
        )

        recyclerView.layoutManager = LinearLayoutManager(
            anchor.context,
            LinearLayoutManager.HORIZONTAL,
            false
        )
        recyclerView.adapter = DrugsAdapter(medicines)

        balloon.showAlignTop(anchor)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}


