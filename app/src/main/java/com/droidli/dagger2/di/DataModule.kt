package com.droidli.dagger2.di

import com.droidli.dagger2.data.datasource.ExampleLocalDataSource
import com.droidli.dagger2.data.datasource.ExampleLocalDataSourceImpl
import com.droidli.dagger2.data.datasource.ExampleRemoteDataSource
import com.droidli.dagger2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @Binds
    fun bindsLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    fun bindsRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

}