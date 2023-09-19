package com.example.homework.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UserModel(
    val name:String,
    val surname:String,
    val email:String,
    val phone:Int
):Parcelable
