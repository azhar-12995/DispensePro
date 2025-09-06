package com.mtbc.dispensepro.model

data class Lesson(
    val id: Int = 0,
    val title: String = "",
    val info: String = "",
    val mcqs: List<MCQ> = emptyList(),
    var locked: Boolean = true,
    var isCompleted: Boolean = false,
    var marks: Double = 0.0
)
