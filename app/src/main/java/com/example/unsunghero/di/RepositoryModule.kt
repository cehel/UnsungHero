package com.example.unsunghero.di

import com.example.unsunghero.datasouce.DefaultElectionRepository
import com.example.unsunghero.datasouce.ElectionRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideElectionRepo(repo: DefaultElectionRepository): ElectionRepository = repo

}