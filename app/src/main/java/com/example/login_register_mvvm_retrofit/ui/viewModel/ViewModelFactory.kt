package com.example.login_register_mvvm_retrofit.ui.viewModel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.login_register_mvvm_retrofit.data.repository.MainRepository
import com.example.login_register_mvvm_retrofit.di.Injection


class ViewModelFactory (private val mainRepository: MainRepository) : ViewModelProvider.NewInstanceFactory(){

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LoginViewModel::class.java)){
            return LoginViewModel(mainRepository) as T
        }
        throw IllegalArgumentException("unknown ViewModel class: " + modelClass.name)
    }


    companion object {
        @Volatile
        private var instance: ViewModelFactory? = null
        fun getInstance(context: Context): ViewModelFactory =
            instance ?: synchronized(this){
                instance ?: ViewModelFactory(Injection.provideRepository(context))
            }.also {
                instance = it
            }
    }
}