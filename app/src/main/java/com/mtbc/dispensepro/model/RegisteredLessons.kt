package com.mtbc.dispensepro.model

import com.google.firebase.firestore.PropertyName

data class RegisteredLessons(
    val id: Int = 0,

    @get:PropertyName("isCompleted") @set:PropertyName("isCompleted")
    var isCompleted: Boolean = false,

    @get:PropertyName("isRegistered") @set:PropertyName("isRegistered")
    var isRegistered: Boolean = false,

    val quizMarks: Double = 0.0,
    val beforeAttemptMarks: Double = 0.0,
    val afterAttemptMarks: Double = 0.0
)