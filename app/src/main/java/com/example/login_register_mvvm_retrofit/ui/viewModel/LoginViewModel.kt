package com.example.login_register_mvvm_retrofit.ui.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.login_register_mvvm_retrofit.data.model.modelrequest.LoginRequest
import com.example.login_register_mvvm_retrofit.data.model.modelresponse.LoginResponse
import com.example.login_register_mvvm_retrofit.data.repository.MainRepository
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginViewModel(
    private val repository: MainRepository
) : ViewModel(){
    val TAG = "LoginViewModel"
    fun Login(loginRequest: LoginRequest) = viewModelScope.launch {
        Log.d("login...",loginRequest.toString())
        repository.login(loginRequest).collect{
            it.enqueue(object : Callback<LoginResponse> {
                override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
                    Log.d("success", "res")
                    Log.d("success", "res :${response.toString()}")
                    val dataTOken = response.body()
                    Log.d("success", "res :${dataTOken.toString()}")
                    Log.d("success", "token :${dataTOken?.access.toString()}")
                    Log.d("success", "res2 :${response.body().toString()}")
                }

                override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                    Log.d("hasil", "error")
                }
            })
        }
    }
}