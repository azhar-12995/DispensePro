package com.mtbc.dispensepro.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.mtbc.dispensepro.authentication.StorageManager
import com.mtbc.dispensepro.moveToNextActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LauncherActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        // Install the system-managed splash screen
        installSplashScreen()

        super.onCreate(savedInstanceState)

        if (StorageManager.isUserLoggedIn(this)) {
            // User is logged in → Go to main screen
            moveToNextActivity(MainActivity::class.java)
        } else {
            // User not logged in → Go to Signup/Login screen
            moveToNextActivity(SignupActivity::class.java)
        }

        // Finish launcher so it doesn’t stay in back stack
        finish()
    }

}