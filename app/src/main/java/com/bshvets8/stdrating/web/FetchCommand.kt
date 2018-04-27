package com.bshvets8.stdrating.web

typealias FetchedCallback = () -> Unit

interface FetchCommand {

	fun fetch(fetchedCallback: FetchedCallback)
}