package com.example.androidapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private val _ScreenNum = MutableLiveData<Int>(0)
    val ScreenNum: LiveData<Int> = _ScreenNum
    fun setScreenNum(ScrNum : Int){
        _ScreenNum.value = ScrNum
    }
}