package com.droidli.dagger2.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.droidli.dagger2.R
import com.droidli.dagger2.di.DaggerApplicationComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel

    private val component by lazy {
        DaggerApplicationComponent
            .factory().create(application, System.currentTimeMillis())
    }

//    private val component by lazy {
//        DaggerApplicationComponent
//            .builder()
//            .context(application)
//            .timeMillis(System.currentTimeMillis())
//            .build()
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
    }
}