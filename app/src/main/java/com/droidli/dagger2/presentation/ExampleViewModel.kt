package com.droidli.dagger2.presentation

import com.droidli.dagger2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel  @Inject constructor(
    private val useCase: ExampleUseCase
) {

    fun method() {
        useCase()
    }
}
