package com.nikhil.hiltpoc.ui

import androidx.lifecycle.ViewModel
import com.nikhil.hiltpoc.data.Car
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val car: Car
) : ViewModel() {

    init {
        initCar()
    }

    fun initCar() {
        car.drive()

    }
}
