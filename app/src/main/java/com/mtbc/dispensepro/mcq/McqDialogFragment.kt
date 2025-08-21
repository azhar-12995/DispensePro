package com.mtbc.dispensepro.mcq

import android.app.Dialog
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.fragment.app.DialogFragment
import com.mtbc.dispensepro.R
import com.mtbc.dispensepro.databinding.McqItemBinding
import com.mtbc.dispensepro.lessons.StaticLessonProvider
import com.mtbc.dispensepro.model.Lesson
import com.mtbc.dispensepro.model.MCQ

class McqDialogFragment(private val lesson: Lesson) : DialogFragment() {
    private var _binding: McqItemBinding? = null
    private val binding get() = _binding!!
    private var mcqList: List<MCQ> = emptyList()
    private var currentIndex = 0
    var currentQuestionIndex = 0
    var totalQuestions = 0

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        _binding = McqItemBinding.inflate(layoutInflater)
     isCancelable = false
        // Get MCQs from arguments (passed as ArrayList of Parcelable or JSON)
        mcqList = lesson.mcqs
        totalQuestions = lesson.mcqs.size
        if (lesson.mcqs.isEmpty()) {
            Toast.makeText(requireContext(), "No MCQs found", Toast.LENGTH_SHORT).show()
            dismiss()
            return super.onCreateDialog(savedInstanceState)
        }

        binding.imageViewDismiss.setOnClickListener {
            dismiss()
        }

        showQuestion(currentIndex)

        binding.btnSubmit.setOnClickListener {
            val selectedIndex = when (binding.rgOptions.checkedRadioButtonId) {
                R.id.rbOptionA -> 0
                R.id.rbOptionB -> 1
                R.id.rbOptionC -> 2
                  R.id.rbOptionD -> 3
                else -> -1
            }

            if (selectedIndex == -1) {
                Toast.makeText(requireContext(), "Please select an option", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }

            val correctIndex = mcqList[currentIndex].correctAnswerIndex
            if (selectedIndex == correctIndex) {
                binding.tvResult.text = "✅  Correct!"
                binding.llExplanation.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.correct_color))
            } else {
                binding.tvResult.text =
                    "❌  Wrong. \nCorrect: ${mcqList[currentIndex].options[correctIndex]}"
                binding.llExplanation.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.wrong_color))
            }
            binding.llExplanation.visibility = View.VISIBLE

            // Disable options so user can’t change
            for (i in 0 until binding.rgOptions.childCount) {
                binding.rgOptions.getChildAt(i).isEnabled = false
            }

            binding.btnSubmit.visibility = View.GONE
            binding.btnNext.visibility = View.VISIBLE
        }

        binding.btnNext.setOnClickListener {
            currentIndex++
            if (currentIndex < mcqList.size) {
                showQuestion(currentIndex)

            } else {
                dismiss() // End of quiz
                Toast.makeText(requireContext(), "Quiz Finished!", Toast.LENGTH_SHORT).show()
            }
        }

        return AlertDialog.Builder(requireContext()).setView(binding.root)
            .setCancelable(false) // Prevent closing without finishing
            .create()

    }

    private fun showQuestion(index: Int) {
        updateProgress(index + 1, mcqList.size)
        val mcq = mcqList[index]

        binding.tvQuestion.text = mcq.question
        binding.tvQuestionHeader.text = "Question ${index + 1}/${mcqList.size}"

        // Clear previous selection
        binding.rgOptions.clearCheck()

        // Hide all first
        for (i in 0 until binding.rgOptions.childCount) {
            binding.rgOptions.getChildAt(i).visibility = View.GONE
        }

        // Dynamically set text and show only needed radio buttons
        mcq.options.forEachIndexed { i, option ->
            if (i < binding.rgOptions.childCount) {
                val rb = binding.rgOptions.getChildAt(i) as RadioButton
                rb.text = "${('A' + i)}) $option"
                rb.isEnabled = true
                rb.visibility = View.VISIBLE
            }
        }

        binding.llExplanation.visibility = View.GONE
        binding.btnSubmit.visibility = View.VISIBLE
        binding.btnNext.visibility = View.GONE
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance(lesson: Lesson): McqDialogFragment {
            val fragment = McqDialogFragment(lesson)
            return fragment
        }
    }

    override fun onStart() {
        super.onStart()
        dialog?.window?.apply {
            // Transparent background
            setBackgroundDrawableResource(android.R.color.transparent)

            // Custom width & height
            setLayout(
                (resources.displayMetrics.widthPixels * 0.95).toInt(),   // 95% of screen width
                WindowManager.LayoutParams.WRAP_CONTENT                 // height wrap content
            )

            // Optional: control dim (0f = no dim, 1f = full black)
            setDimAmount(0.5f)
        }
    }

    fun updateProgress(currentQuestion: Int, totalQuestions: Int) {
        val percentage = (currentQuestion.toFloat() / totalQuestions * 100).toInt()
        binding.progress.setProgress(percentage, true)
    }
}
