package com.bshvets8.stdrating.web

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object WepApiProvider {
	private const val API_BASE_URL: String = "http://baseurl.com"

	private val webApi: WebApi by lazy {
		Retrofit.Builder()
				.baseUrl(API_BASE_URL)
				.addConverterFactory(GsonConverterFactory.create())
				.build()
				.create(WebApi::class.java)
	}
}