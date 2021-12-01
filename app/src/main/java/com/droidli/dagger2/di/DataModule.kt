package com.droidli.dagger2.di

import com.droidli.dagger2.data.datasource.ExampleLocalDataSource
import com.droidli.dagger2.data.datasource.ExampleLocalDataSourceImpl
import com.droidli.dagger2.data.datasource.ExampleRemoteDataSource
import com.droidli.dagger2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindsLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @ApplicationScope
    @Binds
    fun bindsRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

}