package com.droidli.dagger2.di

import com.droidli.dagger2.data.repository.ExampleRepositoryImpl
import com.droidli.dagger2.domain.ExampleRepository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {

    @Binds
    fun bindsRepository(impl: ExampleRepositoryImpl): ExampleRepository
}