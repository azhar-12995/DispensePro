package com.mtbc.dispensepro.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.mtbc.dispensepro.authentication.StorageManager
import com.mtbc.dispensepro.authentication.AuthViewModel
import com.mtbc.dispensepro.databinding.ActivitySignupBinding
import com.mtbc.dispensepro.moveToNextActivity
import com.mtbc.dispensepro.users.UsersViewModel
import com.mtbc.dispensepro.users.model.User
import com.mtbc.dispensepro.utils.LoaderDialog
import com.mtbc.dispensepro.utils.Resource
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class SignupActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignupBinding
    private lateinit var authviewModel: AuthViewModel

    private lateinit var userViewModel: UsersViewModel
    private lateinit var loader: LoaderDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)
        authviewModel = ViewModelProvider(this)[AuthViewModel::class.java]

        userViewModel = ViewModelProvider(this)[UsersViewModel::class.java]
        loader = LoaderDialog(this)
        observeAuthState()
        initListners()
    }

    private fun initListners() {
        binding.btnSignup.setOnClickListener {
            if (checkValidation()) {
                authviewModel.signUp(
                    binding.etEmail.text.toString(), binding.etPassword.text.toString()
                )

            }
        }
        binding.liLogin.setOnClickListener {
            moveToNextActivity(LoginActivity::class.java)
        }
    }

    private fun checkValidation(): Boolean {
        val name = binding.etName.text.toString().trim()
        val email = binding.etEmail.text.toString().trim()
        val password = binding.etPassword.text.toString().trim()

        return when {
            name.isEmpty() -> {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
                false
            }

            email.isEmpty() -> {
                Toast.makeText(this, "Please enter your email", Toast.LENGTH_SHORT).show()
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
                        StorageManager.saveUserId(this@SignupActivity, authviewModel.getCurrentUser()!!.uid)

                        loader.hide()
                        Toast.makeText(
                            this@SignupActivity, "Signup successful!", Toast.LENGTH_SHORT
                        ).show()
                        userViewModel.addUser(getUserData())
                        userViewModel.getUser(authviewModel.getCurrentUser()!!.uid)
                       moveToNextActivity(MainActivity::class.java)
                        finish()
                    }

                    is Resource.Error -> {
                        loader.hide()
                        Toast.makeText(this@SignupActivity, resource.message, Toast.LENGTH_LONG)
                            .show()
                    }

                    null -> Unit
                    Resource.Idle -> TODO()
                }
            }
        }
    }

    private fun getUserData(): User {
        val user = User(
            authviewModel.getCurrentUser()!!.uid,
            binding.etName.text.toString(),
            binding.etEmail.text.toString()
        )
        return user
    }

}