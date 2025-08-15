package com.mtbc.dispensepro.authentication

import android.content.Context
import com.google.firebase.auth.FirebaseAuth

object StorageManager {

    private const val PREFS_NAME = "auth_prefs"
    private const val KEY_USER_ID = "user_id"
    private const val KEY_LESSONS_INITIALIZED = "lessons_initialized"

    fun saveUserId(context: Context, userId: String) {
        context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
            .edit()
            .putString(KEY_USER_ID, userId)
            .apply()
    }

    fun getUserId(context: Context): String? {
        return context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
            .getString(KEY_USER_ID, null)
    }

    fun isUserLoggedIn(context: Context): Boolean {
        val userId = getUserId(context)
        val firebaseUser = FirebaseAuth.getInstance().currentUser
        return userId != null && firebaseUser != null
    }

    fun clearSession(context: Context) {
        FirebaseAuth.getInstance().signOut()
        context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
            .edit()
            .clear()
            .apply()
    }

    fun isLessonsInitialized(context: Context): Boolean {
        return context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
            .getBoolean(KEY_LESSONS_INITIALIZED, false)
    }

    fun markLessonsAsInitialized(context: Context) {
        context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
            .edit()
            .putBoolean(KEY_LESSONS_INITIALIZED, true)
            .apply()
    }
}