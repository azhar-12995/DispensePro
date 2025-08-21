package com.mtbc.dispensepro.authentication

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mtbc.dispensepro.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val repository: AuthRepository
) : ViewModel() {

    private val _authState = MutableStateFlow<Resource<Unit>?>(null)
    val authState: StateFlow<Resource<Unit>?> = _authState

    fun login(email: String, password: String) {
        viewModelScope.launch {
            _authState.value = Resource.Loading
            _authState.value = repository.login(email, password)
        }
    }


    fun signUp(email: String, password: String) {
        viewModelScope.launch {
            _authState.value = Resource.Loading
            _authState.value = repository.signUp(email, password)
        }
    }

    fun logout() {
        repository.logout()
        _authState.value = null
    }

    fun getCurrentUser() = repository.getCurrentUser()
}