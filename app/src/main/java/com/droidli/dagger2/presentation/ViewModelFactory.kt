package com.droidli.dagger2.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject
import javax.inject.Provider

class ViewModelFactory @Inject constructor(
    private val viewModelsProvides: @JvmSuppressWildcards Map<String, Provider<ViewModel>>
): ViewModelProvider.Factory{

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return viewModelsProvides[modelClass.simpleName]?.get() as T
    }

}