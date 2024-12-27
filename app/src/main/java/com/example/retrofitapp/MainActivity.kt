package com.example.retrofitapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.retrofitapp.Model.MainModel
import com.example.retrofitapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),testrequest {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener(){
            binding.progressBar.visibility = View.VISIBLE
            ApiRepository.instance.sendText(
                "BMnIxcOiFxR84zgRATyGMgMYibrLP3N1XXkN7E4L",
                "hi welcome",this
            )
        }
    }

    override fun onSuccess(data: MainModel) {
        binding.textview.text = data.message
        binding.progressBar.visibility = View.INVISIBLE
    }

    override fun onNotsuccess(message: String) {
    binding.textview.text = message
        binding.progressBar.visibility = View.INVISIBLE
    }

    override fun onError(error: String) {
        binding.progressBar.visibility = View.INVISIBLE
        Log.e("ERROR_HANDLER",error)

    }
}