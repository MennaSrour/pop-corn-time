package com.example.popcorntime

import android.app.Application
import org.koin.core.context.startKoin
import org.koin.android.ext.koin.androidContext
import com.example.popcorntime.di.appModule

class MovioApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MovioApplication)
            modules(appModule)
        }
    }
}