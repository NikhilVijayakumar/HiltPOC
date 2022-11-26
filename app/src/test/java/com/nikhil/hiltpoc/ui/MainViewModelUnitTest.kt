package com.nikhil.hiltpoc.ui

import com.nikhil.hiltpoc.data.Car
import com.nikhil.hiltpoc.data.ElectricEngine
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import javax.inject.Inject

@HiltAndroidTest
class MainViewModelTest{

    @get:Rule
    val hiltRule = HiltAndroidRule(this)

    @Inject
    lateinit var car: Car

    @Test
    fun testCarNotNull() {
        hiltRule.inject()
        Assert.assertNotNull(car)
    }

    @Test
    fun testCarHP() {
        hiltRule.inject()
        val engine = car.engine as ElectricEngine
        assert(engine.horsePower == 150)
    }

    @Test
    fun testCarCapacity() {
        hiltRule.inject()
        val engine = car.engine as ElectricEngine
        assert(engine.engineCapacity == 2200)
    }

}