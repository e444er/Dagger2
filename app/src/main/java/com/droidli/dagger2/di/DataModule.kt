package com.droidli.dagger2.di

import com.droidli.dagger2.data.datasource.*
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindsLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @ProdQualifier
    @ApplicationScope
    @Binds
    fun bindsRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

    @TestQualifier
    @ApplicationScope
    @Binds
    fun bindsTestDataSource(impl: TestRemoteDataSourceImpl): ExampleRemoteDataSource

}