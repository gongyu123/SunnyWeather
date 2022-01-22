package com.jerry.sunnyweather

import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {

    companion object {
        lateinit var context: Context
        const val TOKEN = "填入申请到的令牌"
    }
    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}