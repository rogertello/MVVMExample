package com.example.mvvmexample.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmexample.model.mvvmmodel


class mvvm_viewmodel:ViewModel (){
        private val list_Song : MutableLiveData<String> by lazy {
                        MutableLiveData<String>()
                    }

        fun getData():LiveData<String>
        {
            return list_Song
        }

        fun connectModel(myValue:String)
        {
            list_Song.value =mvvmmodel().methodModel(myValue)

        }

    //mutable
    //
}