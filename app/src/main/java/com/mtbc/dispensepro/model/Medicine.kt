package com.mtbc.dispensepro.model

data class Medicine(
    val name: String = "",
    val imageResId: Int = 0,   // drawable resource id
    val quantity: Int = 0,
    val expiryDate: String = ""
)