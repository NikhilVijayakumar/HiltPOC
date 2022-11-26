package com.nikhil.hiltpoc.ui

import com.nikhil.hiltpoc.data.Car
import com.nikhil.hiltpoc.data.DiselEngine
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.HiltTestApplication
import org.junit.Assert.*
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
        assertNotNull(car)
    }

    @Test
    fun testCarHP() {
        hiltRule.inject()
        val engine = car.engine as DiselEngine
        assert(engine.horsePower == 120)
    }

    @Test
    fun testCarCapacity() {
        hiltRule.inject()
        val engine = car.engine as DiselEngine
        assert(engine.engineCapacity == 2500)
    }

}