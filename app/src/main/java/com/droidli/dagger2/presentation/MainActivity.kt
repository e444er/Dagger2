package com.droidli.dagger2.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.droidli.dagger2.ExampleApplication
import com.droidli.dagger2.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel

    private val component by lazy {
        (application as ExampleApplication).component
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
    }
}