package com.nikhil.hiltpoc.di

import com.nikhil.hiltpoc.data.Driver
import com.nikhil.hiltpoc.data.Engine
import com.nikhil.hiltpoc.data.PetrolEngine
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@Module
@InstallIn(SingletonComponent::class) // Installs FooModule in the generate SingletonComponent.
object PetrolEngineModule {
    @Provides
    fun provideEngine(@Named("horsePower")  horsePower:Int,
                      @Named("engineCapacity")  engineCapacity:Int): Engine = PetrolEngine(horsePower,engineCapacity)

    @Provides
    @Named("horsePower")
    fun provideHorsePower(): Int = 80

    @Provides
    @Named("engineCapacity")
    fun provideEngineCapacity(): Int = 2000
}

