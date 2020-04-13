package com.example.unsunghero.di

import android.content.Context
import com.example.unsunghero.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Component(
    modules = [
        FragmentModule::class,
        ActivityModule::class,
        AndroidInjectionModule::class,
        AndroidSupportInjectionModule::class,
        ViewModelBuilderModule::class,
        RepositoryModule::class,
        ViewModelModule::class,
        AppModule::class
    ]
)
@Singleton
interface ApplicationComponent: AndroidInjector<App> {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): ApplicationComponent
    }
}