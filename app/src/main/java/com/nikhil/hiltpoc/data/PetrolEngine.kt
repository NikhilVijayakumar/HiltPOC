package com.nikhil.hiltpoc.data

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(@Named("horsePower") var horsePower:Int,
                                       @Named("engineCapacity") var engineCapacity:Int) : Engine {

    companion object {
        private const val TAG = "PetrolEngine"
    }

    override fun start() {
        Log.d(TAG, "PetrolEngine started with horsePower of $horsePower and engineCapacity of $engineCapacity")
    }
}