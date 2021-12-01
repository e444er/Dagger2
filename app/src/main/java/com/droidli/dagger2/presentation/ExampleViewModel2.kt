package com.droidli.dagger2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.droidli.dagger2.domain.ExampleRepository
import com.droidli.dagger2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel2  @Inject constructor(
    private val repository: ExampleRepository,
    private val id: String,
    private val name: String,
): ViewModel() {

    fun method() {
        repository.method()
        Log.d("ExampleViewModel2", "$this $id $name")

    }
}
