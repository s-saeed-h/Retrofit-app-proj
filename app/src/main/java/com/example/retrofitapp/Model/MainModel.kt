package com.example.retrofitapp.Model

data class MainModel(
    val success:Int,
    val ok:Boolean,
    val message:String,
    val report:ArrayList<ReportModel>
)