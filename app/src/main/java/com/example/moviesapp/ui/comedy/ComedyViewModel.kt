package com.example.moviesapp.ui.comedy

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ComedyViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is comedy Fragment"
    }
    val text: LiveData<String> = _text
}