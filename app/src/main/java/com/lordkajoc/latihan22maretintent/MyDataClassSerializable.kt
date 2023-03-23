package com.lordkajoc.latihan22maretintent

import java.io.Serializable

data class MyDataClassSerializable(
    var name: String,
    var email:String,
    var phone:String,
    var address:String,
    var age:String,
): Serializable