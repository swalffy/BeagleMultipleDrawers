package com.github.swalffy.beaglemultipledrawers

import android.app.Application
import com.github.swalffy.BuildConfig
import com.github.swalffy.R
import com.pandulapeter.beagle.Beagle
import com.pandulapeter.beagle.modules.AppInfoButtonModule
import com.pandulapeter.beagle.modules.HeaderModule

class CustomApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        Beagle.initialize(this)

        Beagle.set(
            HeaderModule(
                title = getString(R.string.app_name),
                subtitle = BuildConfig.APPLICATION_ID,
                text = "${BuildConfig.BUILD_TYPE} v${BuildConfig.VERSION_NAME} (${BuildConfig.VERSION_CODE})"
            ),
            AppInfoButtonModule(),
        )
    }
}