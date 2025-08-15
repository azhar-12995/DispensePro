package com.mtbc.dispensepro.authentication

import com.google.firebase.auth.FirebaseAuth
import com.mtbc.dispensepro.utils.Resource
import kotlinx.coroutines.tasks.await
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AuthRepository @Inject constructor(
    private val firebaseAuth: FirebaseAuth
) {

    suspend fun signUp(email: String, password: String): Resource<Unit> {
        return try {
            firebaseAuth.createUserWithEmailAndPassword(email, password).await()
            Resource.Success(Unit)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Failed to signup")
        }
    }

    suspend fun login(email: String, password: String): Resource<Unit> {
        return try {
            firebaseAuth.signInWithEmailAndPassword(email, password).await()
            Resource.Success(Unit)
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Failed to signup")
        }
    }

    fun logout() = firebaseAuth.signOut()

    fun getCurrentUser() = firebaseAuth.currentUser
}
