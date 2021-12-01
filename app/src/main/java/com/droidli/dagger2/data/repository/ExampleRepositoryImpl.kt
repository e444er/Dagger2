package com.droidli.dagger2.data.repository

import com.droidli.dagger2.data.datasource.ExampleLocalDataSource
import com.droidli.dagger2.data.datasource.ExampleRemoteDataSource
import com.droidli.dagger2.data.mapper.ExampleMapper
import com.droidli.dagger2.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    private val localDataSource: ExampleLocalDataSource,
    private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
) : ExampleRepository {

    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}