package com.bshvets8.stdrating.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bshvets8.stdrating.R
import com.bshvets8.stdrating.data.Professor
import kotlinx.android.synthetic.main.list_item_professor.view.*

class ProfessorsAdapter : RecyclerView.Adapter<ProfessorsAdapter.ProfessorViewHolder>() {
	private val professors: MutableList<Professor> = mutableListOf()

	fun setProfessors(professors: List<Professor>) {
		this.professors.clear()
		this.professors.addAll(professors)
	}

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfessorViewHolder =
			ProfessorViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item_professor, parent, false))

	override fun getItemCount() = professors.size

	override fun onBindViewHolder(holder: ProfessorViewHolder, position: Int) {
		val professor = professors[position]

		holder.itemView.tvProfessorName.text = professor.name
		holder.itemView.tvUniversity.text = professor.university
	}

	class ProfessorViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView)
}