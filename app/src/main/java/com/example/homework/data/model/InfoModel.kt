package com.example.homework.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class InfoModel(
    val user: UserModel,
    val age:Int,
    val size:Float,
    val kilo:Int,
    val hobby:String
):Parcelable
