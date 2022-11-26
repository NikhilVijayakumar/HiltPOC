package com.nikhil.hiltpoc.di

import com.nikhil.hiltpoc.data.Driver
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class) // Installs FooModule in the generate SingletonComponent.
object DriverModule {
    @Provides
    fun provideDriver(): Driver = Driver()
}

