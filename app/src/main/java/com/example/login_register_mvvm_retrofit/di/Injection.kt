package com.example.login_register_mvvm_retrofit.di

import android.content.Context
import com.example.login_register_mvvm_retrofit.data.api.ApiConfig
import com.example.login_register_mvvm_retrofit.data.datastore.RemoteDataSource
import com.example.login_register_mvvm_retrofit.data.repository.MainRepository

object Injection {
    fun provideRepository(context: Context): MainRepository{
        val apiServices = ApiConfig.getApiService()
        val remoteDataSource = RemoteDataSource(apiServices)
        return MainRepository(remoteDataSource)
    }
}