package com.nikhil.hiltpoc.data

import android.util.Log
import javax.inject.Named


class ElectricEngine(@Named("horsePower") val horsePower:Int,
                     @Named("engineCapacity") val engineCapacity:Int)  : Engine {

    companion object {
        private const val TAG = "ElectricEngine"
    }

    override fun start() {
        Log.d(TAG, "ElectricEngine started with horsePower of $horsePower and engineCapacity of $engineCapacity")
    }
}