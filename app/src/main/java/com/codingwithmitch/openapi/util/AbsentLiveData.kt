package com.codingwithmitch.openapi.util

import androidx.lifecycle.LiveData

// way to return empty live data object
class AbsentLiveData <T: Any?> private constructor(): LiveData<T>() {
    init {
        postValue(null)
    }

    companion object {
        fun <T> create(): LiveData<T> {
            return AbsentLiveData()
        }
    }
}