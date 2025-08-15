package com.mtbc.dispensepro.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mtbc.dispensepro.R
import com.mtbc.dispensepro.model.Badges
import com.mtbc.dispensepro.utils.BadgeViewType


class BadgesAdapter(
    private val badgeList: List<Badges>,
    private val screenType: BadgeViewType
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        private const val VIEW_TYPE_MAIN = 1
        private const val VIEW_TYPE_ALL_BADGES = 2
    }

    override fun getItemViewType(position: Int): Int {
        return when (screenType) {
            BadgeViewType.MAIN_SCREEN -> VIEW_TYPE_MAIN
            BadgeViewType.ALL_BADGES_SCREEN -> VIEW_TYPE_ALL_BADGES
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            VIEW_TYPE_MAIN -> {
                val view = inflater.inflate(R.layout.item_badges, parent, false)
                MainBadgeViewHolder(view)
            }
            VIEW_TYPE_ALL_BADGES -> {
                val view = inflater.inflate(R.layout.item_badge_all, parent, false)
                AllBadgesViewHolder(view)
            }
            else -> throw IllegalArgumentException("Unknown view type: $viewType")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val badge = badgeList[position]
        when (holder) {
            is MainBadgeViewHolder -> holder.bind(badge)
            is AllBadgesViewHolder -> holder.bind(badge)
        }
    }

    override fun getItemCount(): Int = badgeList.size

    // ViewHolder for Mail Screen
    class MainBadgeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val icon: ImageView = itemView.findViewById(R.id.ivLessonImage)
        private val title: TextView = itemView.findViewById(R.id.tvLessonName)

        fun bind(item: Badges) {
            icon.setImageResource(item.imageRes)
            title.text = item.lessonName

        }

    }

    // ViewHolder for All Badges Screen
    class AllBadgesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val icon: ImageView = itemView.findViewById(R.id.ivLessonImage)
        private val title: TextView = itemView.findViewById(R.id.tvLessonName)

        fun bind(item: Badges) {
            icon.setImageResource(item.imageRes)
            title.text = item.lessonName
        }
    }
}
