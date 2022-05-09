package com.bafoor.cryptocurrency.di

import com.bafoor.cryptocurrency.common.Constant
import com.bafoor.cryptocurrency.data.remote.CoinPaprikaApi
import com.bafoor.cryptocurrency.data.repository.CoinRepositoryImpl
import com.bafoor.cryptocurrency.domain.repository.CoinRepository
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideCoinsApi() : CoinPaprikaApi {
       return Retrofit.Builder()
            .baseUrl(Constant.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinPaprikaApi::class.java)
    }

    @Singleton
    @Provides
    fun provideCoinsRepository(api : CoinPaprikaApi) : CoinRepository {
        return CoinRepositoryImpl(api)
    }




}