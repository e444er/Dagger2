package com.droidli.dagger2.presentation

import androidx.lifecycle.ViewModel
import com.droidli.dagger2.domain.ExampleRepository
import com.droidli.dagger2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel2  @Inject constructor(
    private val repository: ExampleRepository
): ViewModel() {

    fun method() {
        repository.method()
    }
}
