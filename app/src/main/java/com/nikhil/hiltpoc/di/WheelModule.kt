package com.nikhil.hiltpoc.di

import com.nikhil.hiltpoc.data.Rims
import com.nikhil.hiltpoc.data.Tires
import com.nikhil.hiltpoc.data.Wheels
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object WheelModule {

    @Provides
    fun provideWheels(rims: Rims,tires: Tires): Wheels = Wheels(rims,tires)

    @Provides
    fun provideRims(): Rims = Rims()

    @Provides
    fun provideTires(): Tires {
        val tire: Tires = Tires()
        tire.inflate()
        return tire
    }
}

