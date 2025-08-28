package com.mtbc.dispensepro.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.mtbc.dispensepro.R
import com.mtbc.dispensepro.databinding.ItemLessonBinding
import com.mtbc.dispensepro.model.Lesson
import com.mtbc.dispensepro.utils.AppDialog

class LessonAdapter(
    private val lessons: List<Lesson>,
    private val onLessonClick: (Lesson) -> Unit
) : RecyclerView.Adapter<LessonAdapter.LessonViewHolder>() {

    inner class LessonViewHolder(val binding: ItemLessonBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonViewHolder {
        val binding = ItemLessonBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LessonViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LessonViewHolder, position: Int) {
        val lesson = lessons[position]
        val binding = holder.binding

        binding.lessonTitle.text = lesson.title
        if (position != 0 && lesson.locked) {
            // Locked (except first item)
            binding.rootLinear.setBackgroundResource(R.color.pending)
            binding.ivLock.visibility = View.VISIBLE
            binding.ivForward.visibility = View.GONE
        } else if (!lesson.locked) {
            // Unlocked (completed)
            binding.rootLinear.setBackgroundResource(R.color.completed)
            binding.ivLock.visibility = View.GONE
            binding.ivForward.visibility = View.VISIBLE
        }

        binding.root.setOnClickListener {
            if(lesson.locked){
                AppDialog.showMessage(binding.root.context, "This lesson is locked")
                return@setOnClickListener
            }
            onLessonClick(lesson)
        }
    }

    override fun getItemCount(): Int = lessons.size
}
