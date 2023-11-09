package com.example.doctors

import android.widget.ImageView

data class DoctorsInfo(
    val icon: ImageView,
    val name: String,
    val specialization: String,
    val data: String,
    val time: String
)
