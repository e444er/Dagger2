package com.droidli.dagger2

import android.app.Application
import com.droidli.dagger2.di.DaggerApplicationComponent

class ExampleApplication: Application() {

    val component by lazy {
        DaggerApplicationComponent
            .factory().create(this, System.currentTimeMillis())
    }

//    override fun onCreate() {
//        super.onCreate()
//        val component = DaggerApplicationComponent
//            .factory().create(this, System.currentTimeMillis())
//    }

//    private val component by lazy {
//        DaggerApplicationComponent
//            .builder()
//            .context(application)
//            .timeMillis(System.currentTimeMillis())
//            .build()
//    }
}