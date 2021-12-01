package com.droidli.dagger2.di

import com.droidli.dagger2.presentation.MainActivity
import com.droidli.dagger2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent(modules = [ViewModule::class])
interface ActivityComponent {

    fun inject(activity: MainActivity)

    fun inject(activity: MainActivity2)

    @Subcomponent.Factory
    interface Factory {
        fun create(
            @BindsInstance @IdQualifier id: String,
            @BindsInstance @NameQualifier name: String,
        ): ActivityComponent
    }
}