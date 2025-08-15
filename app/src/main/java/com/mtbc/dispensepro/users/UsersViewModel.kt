package com.mtbc.dispensepro.users

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mtbc.dispensepro.firestore.FirestoreRepository
import com.mtbc.dispensepro.users.model.User
import com.mtbc.dispensepro.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UsersViewModel @Inject constructor(
    private val repository: FirestoreRepository
) : ViewModel() {

    private val _user = MutableStateFlow<Resource<User>>(Resource.Loading())
    val user: StateFlow<Resource<User>> = _user.asStateFlow()

    fun getUser(userId: String) = viewModelScope.launch {
        repository.getUser(userId).collect { result ->
            _user.value = result
        }
    }

    fun addUser(user: User) = viewModelScope.launch {
        repository.addUser(user)
    }
}