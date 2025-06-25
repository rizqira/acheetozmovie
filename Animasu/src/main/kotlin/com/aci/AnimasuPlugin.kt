package com.aci

import android.content.Context
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class aciPlugin : Plugin() {
    override fun load(context: Context) {
        // All providers should be added in this manner. Please don't edit the providers list
        // directly.
        registerMainAPI(aci())
        registerExtractorAPI(Archivd())
        registerExtractorAPI(Newuservideo())
        registerExtractorAPI(Vidhidepro())
        registerExtractorAPI(Blogger())
    }
}