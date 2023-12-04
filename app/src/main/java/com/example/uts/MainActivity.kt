package com.example.uts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvGoal: RecyclerView = findViewById(R.id.rv_goal)
        val goalList = resources.getStringArray(R.array.data_goal).map { GoalItem(it) }
        val adapter = GoalAdapter(goalList)
        rvGoal.adapter = adapter
        rvGoal.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
    }
}