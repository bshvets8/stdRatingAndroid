package com.bshvets8.stdrating.web

import com.bshvets8.stdrating.cache.Cache
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class FetchProfessorsCommand(private val webApi: WebApi) : FetchCommand {

	override fun fetch(fetchedCallback: FetchedCallback) {
		doAsync {
			val response = webApi.getProfessors().execute()

			val professors = response.body();

			if (!response.isSuccessful || professors == null)
				return@doAsync

			Cache.professors
					.apply { clear() }
					.apply { addAll(professors) }

			uiThread {
				fetchedCallback()
			}
		}
	}
}