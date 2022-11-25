package com.example.login_register_mvvm_retrofit.data.model.modelrequest


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep
import java.io.Serializable

@Keep
data class LoginRequest(
    /**
    {
    "email": "martinwainaina@gmail.com",
    "password": "12345678"
    }
     */
    @SerializedName("email")
    val email: String,
    @SerializedName("password")
    val password: String
): Serializable