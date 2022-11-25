package com.example.login_register_mvvm_retrofit.data.datastore

import android.util.Log
import com.example.login_register_mvvm_retrofit.data.api.ApiServices
import com.example.login_register_mvvm_retrofit.data.model.modelrequest.LoginRequest
import com.example.login_register_mvvm_retrofit.data.model.modelrequest.UserRequest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class RemoteDataSource(
    private val apiServices: ApiServices
) {
    val TAG = "RemoteDataSource"

    fun register(userRequest: UserRequest) = flow {
        val response = apiServices.register(userRequest)
        emit(response)
    }.catch {
        Log.e(TAG, "Register failed. ErrorHint: ${it.message}", )
    }.flowOn(Dispatchers.IO)

    fun login(loginRequest: LoginRequest) = flow {
        val response = apiServices.login2(loginRequest)
        emit(response)
    }.catch {
        Log.e(TAG, "Login failed. ErrorHint: ${it.message}", )
    }.flowOn(Dispatchers.IO)

}