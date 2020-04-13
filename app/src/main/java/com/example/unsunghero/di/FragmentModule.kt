package com.example.unsunghero.di

import com.example.herotabtest.ui.main.PlaceholderFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract fun bindPlaceHolderFragment(): PlaceholderFragment
}