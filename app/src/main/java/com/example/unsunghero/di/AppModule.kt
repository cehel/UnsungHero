package com.example.unsunghero.di

import android.app.Application
import android.content.Context
import com.example.unsunghero.datasouce.ElectionRemoteDataSource
import com.example.unsunghero.datasouce.local.ElectionRemoteElectionLocal
import com.example.unsunghero.datasouce.remote.ElectionRemoteImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideContext(application: Application?): Context? {
        return application
    }

    @Provides
    @Singleton
    fun provideUnsungHeroElectionLocal() = ElectionRemoteElectionLocal()

    @Provides
    @Singleton
    fun provideUnsungHeroElectionRemote(): ElectionRemoteDataSource =
        ElectionRemoteImpl()
}