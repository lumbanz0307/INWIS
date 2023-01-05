package com.inwis.ui.halaman

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HalamanViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is halaman Fragment"
    }
    val text: LiveData<String> = _text
}