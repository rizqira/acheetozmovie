package com.dutamovie

import android.content.Context
import com.lagradost.cloudstream3.extractors.JWPlayer
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class DutaMoviePlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(DutaMovie())
        registerExtractorAPI(Ryderjet())
        registerExtractorAPI(JWPlayer())
        registerExtractorAPI(Embedfirex())
    }
}
