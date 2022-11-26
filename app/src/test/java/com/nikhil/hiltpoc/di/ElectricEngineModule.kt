package com.nikhil.hiltpoc.di

import com.nikhil.hiltpoc.data.ElectricEngine
import com.nikhil.hiltpoc.data.Engine
import dagger.Module
import dagger.Provides
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import javax.inject.Named


@Module
@TestInstallIn(
    components = [SingletonComponent::class],
    replaces = [PetrolEngineModule::class])
object ElectricEngineModule {
    @Provides
    fun provideEngine(@Named("horsePower")  horsePower:Int,
                      @Named("engineCapacity")  engineCapacity:Int): Engine = ElectricEngine(horsePower,engineCapacity)

    @Provides
    @Named("horsePower")
    fun provideHorsePower(): Int = 150

    @Provides
    @Named("engineCapacity")
    fun provideEngineCapacity(): Int = 2200
}

