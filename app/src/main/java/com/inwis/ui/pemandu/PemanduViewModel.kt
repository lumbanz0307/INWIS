package com.inwis.ui.pemandu

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PemanduViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is pemandu Fragment"
    }
    val text: LiveData<String> = _text
}