package com.example.mvvmexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmexample.databinding.ActivityMainBinding
import com.example.mvvmexample.model.mvvmmodel
import com.example.mvvmexample.viewmodel.mvvm_viewmodel


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var my_mvvm_viewmodel : mvvm_viewmodel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(
            layoutInflater
        )
        setContentView(binding.root)
        my_mvvm_viewmodel=ViewModelProvider(this).get(mvvm_viewmodel::class.java)
        binding.btnSend.setOnClickListener {
            my_mvvm_viewmodel.connectModel(binding.etTextsend.text.toString())
        }
        var observer = Observer<String>{
            binding.tvText.text=it
        }
        //connect provider observer
      my_mvvm_viewmodel.getData().observe(this, observer)


    }
}