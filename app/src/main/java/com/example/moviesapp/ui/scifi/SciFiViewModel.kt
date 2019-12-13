package com.example.moviesapp.ui.scifi

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SciFiViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is SciFI Fragment"
    }
    val text: LiveData<String> = _text
}