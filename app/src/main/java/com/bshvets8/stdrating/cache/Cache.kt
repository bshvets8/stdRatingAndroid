package com.bshvets8.stdrating.cache

import com.bshvets8.stdrating.data.Professor

object Cache {

	val professors: MutableList<Professor> = mutableListOf(
			Professor(1, "Awesome Dude", "IFNTUOG"),
			Professor(2, "Not that good", "IFNTUOG"),
			Professor(3, "Event Worse", "IFNTUOG"),
			Professor(4, "Worst (", "IFNTUOG")
	)
}