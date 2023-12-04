package com.example.uts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class GoalAdapter(private val goalList: List<GoalItem>) : RecyclerView.Adapter<GoalAdapter.GoalViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GoalViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_goal, parent, false)
        return GoalViewHolder(view)
    }

    override fun onBindViewHolder(holder: GoalViewHolder, position: Int) {
        val (text) = goalList[position]
        holder.tvGoalList.text = text
    }

    override fun getItemCount(): Int = goalList.size

    class GoalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val goalCardView: CardView = itemView.findViewById(R.id.goal_card_view)
        val tvGoalList: TextView = itemView.findViewById(R.id.tv_goal_list)
    }
}
