package com.nikhil.hiltpoc.data

import android.util.Log


class Driver {
    companion object{
        private const val TAG = "Driver"
    }
    fun drive(){
        Log.d(TAG, "driver is driving the car and he is $this")
    }
}