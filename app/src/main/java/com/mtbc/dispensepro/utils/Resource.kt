package com.mtbc.dispensepro.utils

sealed class Resource<out T> {
    object Idle : Resource<Nothing>()               // No action yet
    object Loading : Resource<Nothing>()            // In progress
    data class Success<out T>(val data: T) : Resource<T>() // Success result
    data class Error(val message: String) : Resource<Nothing>() // Failure
}


