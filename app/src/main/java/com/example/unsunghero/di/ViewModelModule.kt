package com.example.unsunghero.di

import androidx.lifecycle.ViewModel
import com.example.herotabtest.ui.main.PageViewModel
import com.example.unsunghero.datasouce.DefaultElectionRepository
import com.example.unsunghero.datasouce.ElectionRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(PageViewModel::class)
    abstract fun bindPageViewModel(vm: PageViewModel): ViewModel

}