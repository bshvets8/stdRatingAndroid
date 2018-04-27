package com.bshvets8.stdrating.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import com.bshvets8.stdrating.R
import com.bshvets8.stdrating.adapters.ProfessorsAdapter
import com.bshvets8.stdrating.cache.Cache
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
		recyclerView.adapter = ProfessorsAdapter().apply { setProfessors(Cache.professors) }
	}
}
