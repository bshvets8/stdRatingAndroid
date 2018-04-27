package com.bshvets8.stdrating.web

import com.bshvets8.stdrating.data.Professor
import retrofit2.Call
import retrofit2.http.GET

interface WebApi {

	@GET("api/professors")
	fun getProfessors(): Call<List<Professor>>
}