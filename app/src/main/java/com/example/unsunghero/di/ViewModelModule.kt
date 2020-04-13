package com.example.unsunghero.di

import androidx.lifecycle.ViewModel
import com.example.herotabtest.ui.main.PageViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(PageViewModel::class)
    abstract fun bindPageViewModel(vm: PageViewModel): ViewModel

}