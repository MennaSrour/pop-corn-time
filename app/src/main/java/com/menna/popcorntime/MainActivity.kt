package com.menna.popcorntime

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MovioApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }
}