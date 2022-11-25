package com.example.login_register_mvvm_retrofit.data.repository

import com.example.login_register_mvvm_retrofit.data.datastore.RemoteDataSource
import com.example.login_register_mvvm_retrofit.data.model.modelrequest.LoginRequest
import com.example.login_register_mvvm_retrofit.data.model.modelrequest.UserRequest

class MainRepository(private val remoteDataSource: RemoteDataSource) {
    fun register(userRequest: UserRequest) = remoteDataSource
        .register(userRequest)

    fun login(loginRequest: LoginRequest) = remoteDataSource
        .login(loginRequest)

}