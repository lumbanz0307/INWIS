package com.inwis.ui.pencarian

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PencarianViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is pencarian Fragment"
    }
    val text: LiveData<String> = _text
}