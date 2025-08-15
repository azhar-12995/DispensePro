package com.mtbc.dispensepro.model

class MCQ(
    val id: Int = 0,
    val question: String = "",
    val options: List<String> = emptyList(),
    val correctAnswerIndex: Int = -1, // -1 means no answer
    var selectedOptionIndex: Int = -1 // -1 means no option selected
) {
    fun isCorrect(): Boolean {
        return selectedOptionIndex == correctAnswerIndex
    }
}