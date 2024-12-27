package com.example.retrofitapp

import com.example.retrofitapp.Model.MainModel

interface testrequest {
    fun onSuccess(data:MainModel)
    fun onNotsuccess(message:String)
    fun onError(error:String)
}