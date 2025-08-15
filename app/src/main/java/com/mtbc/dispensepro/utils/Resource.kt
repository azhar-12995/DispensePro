package com.mtbc.dispensepro.utils

sealed class Resource<out T> {
    data class Success<out T>(val data: T) : Resource<T>()
    data class Error(val message: String) : Resource<Nothing>()
    class Loading<out T> : Resource<T>()
}
