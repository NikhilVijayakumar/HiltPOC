package com.nikhil.hiltpoc.data

import android.util.Log
import javax.inject.Named


class DiselEngine(@Named("horsePower") val horsePower:Int,
                  @Named("engineCapacity") val engineCapacity:Int)  : Engine {

    companion object {
        private const val TAG = "DiselEngine"
    }

    override fun start() {
        Log.d(TAG, "DiselEngine started with horsePower of $horsePower and engineCapacity of $engineCapacity")
    }
}