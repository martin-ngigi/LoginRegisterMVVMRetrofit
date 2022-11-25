package com.example.login_register_mvvm_retrofit.data.api

import com.example.login_register_mvvm_retrofit.data.model.modelrequest.LoginRequest
import com.example.login_register_mvvm_retrofit.data.model.modelrequest.UserRequest
import com.example.login_register_mvvm_retrofit.data.model.modelresponse.LoginResponse
import com.example.login_register_mvvm_retrofit.data.model.modelresponse.UserResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiServices {
    @Headers("Content-Type: application/json")
    @POST("/auth/signup/")
    fun register(@Body userRequest: UserRequest): Call<UserResponse> //Call can also be replaced with Response

    @Headers("Content-Type: application/json")
    @POST("/auth/login2/")
    fun login2(@Body loginRequest: LoginRequest): Call<LoginResponse> //Call can also be replaced with Response

}