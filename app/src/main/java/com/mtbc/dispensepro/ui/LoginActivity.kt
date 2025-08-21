package com.mtbc.dispensepro.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.mtbc.dispensepro.authentication.StorageManager
import com.mtbc.dispensepro.authentication.AuthViewModel
import com.mtbc.dispensepro.databinding.ActivityLoginBinding
import com.mtbc.dispensepro.moveToNextActivity
import com.mtbc.dispensepro.utils.LoaderDialog
import com.mtbc.dispensepro.utils.Resource
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var authviewModel: AuthViewModel
    private lateinit var loader: LoaderDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loader = LoaderDialog(this)

        authviewModel = ViewModelProvider(this)[AuthViewModel::class.java]

        initListners()
        observeAuthState()
    }


    private fun initListners() {
        binding.btnLogin.setOnClickListener {
            if(checkValidation()){
                authviewModel.login(binding.etEmail.text.toString(), binding.etPassword.text.toString())
            }

        }
        binding.liSignup.setOnClickListener {
            moveToNextActivity(SignupActivity::class.java)
        }
    }



    private fun checkValidation(): Boolean {
        val phone = binding.etEmail.text.toString().trim()
        val password = binding.etPassword.text.toString().trim()

        return when {
            phone.isEmpty() -> {
                Toast.makeText(this, "Please enter Email", Toast.LENGTH_SHORT).show()
                false
            }
            password.isEmpty() -> {
                Toast.makeText(this, "Please enter your password", Toast.LENGTH_SHORT).show()
                false
            }
            else -> true
        }
    }

    private fun observeAuthState() {
        lifecycleScope.launch {
            authviewModel.authState.collect { resource ->
                when (resource) {
                    is Resource.Loading -> {
                        loader.show()
                    }
                    is Resource.Success -> {
                        StorageManager.saveUserId(this@LoginActivity, authviewModel.getCurrentUser()!!.uid)

                        loader.hide()
                        Toast.makeText(this@LoginActivity, "Login successful!", Toast.LENGTH_SHORT).show()
                        moveToNextActivity(MainActivity::class.java)
                        finish()
                    }
                    is Resource.Error -> {
                        loader.hide()
                        Toast.makeText(this@LoginActivity, resource.message, Toast.LENGTH_LONG).show()
                    }
                    null -> Unit
                    Resource.Idle -> {

                    }
                }
            }
        }
    }
}