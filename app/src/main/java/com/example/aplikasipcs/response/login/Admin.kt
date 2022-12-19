package com.example.aplikasipcs.response.login

import android.provider.ContactsContract.CommonDataKinds.Email

data class Admin(
    val id:String,
    val email:String,
    val password:String,
    val nama:String
)
