package com.droidli.dagger2.presentation

import androidx.lifecycle.ViewModel
import com.droidli.dagger2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel  @Inject constructor(
    private val useCase: ExampleUseCase
): ViewModel() {

    fun method() {
        useCase()
    }
}
