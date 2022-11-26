package com.nikhil.hiltpoc.di

import com.nikhil.hiltpoc.data.DiselEngine
import com.nikhil.hiltpoc.data.Driver
import com.nikhil.hiltpoc.data.Engine
import com.nikhil.hiltpoc.data.PetrolEngine
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import javax.inject.Named

@Module
@TestInstallIn(
    components = [SingletonComponent::class],
    replaces = [PetrolEngineModule::class])
object DiselEngineModule {
    @Provides
    fun provideEngine(@Named("horsePower")  horsePower:Int,
                      @Named("engineCapacity")  engineCapacity:Int): Engine = DiselEngine(horsePower,engineCapacity)

    @Provides
    @Named("horsePower")
    fun provideHorsePower(): Int = 120

    @Provides
    @Named("engineCapacity")
    fun provideEngineCapacity(): Int = 2500
}

