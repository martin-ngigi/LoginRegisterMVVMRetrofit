package com.example.login_register_mvvm_retrofit.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.login_register_mvvm_retrofit.R
import com.example.login_register_mvvm_retrofit.data.model.modelrequest.LoginRequest
import com.example.login_register_mvvm_retrofit.databinding.ActivityLoginBinding
import com.example.login_register_mvvm_retrofit.ui.viewModel.LoginViewModel
import com.example.login_register_mvvm_retrofit.ui.viewModel.ViewModelFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private val loginViewModel : LoginViewModel by viewModels {
        ViewModelFactory.getInstance(this)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)


        binding.button.setOnClickListener {
            val email = binding.editText.text.toString()
            val password = binding.edtEmail.text.toString()
            when {
                email.isEmpty() -> {
                    binding.editText.error = "Empty Email"
                }
                password.isEmpty() -> {
                    binding.edtEmail.error = "Empty Password"
                }
                else -> {
                    val loginBody = LoginRequest(email,password)
                    loginViewModel.Login(loginBody)
                }
            }
        }
    }
}