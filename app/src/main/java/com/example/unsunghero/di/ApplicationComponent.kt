package com.example.unsunghero.di

import android.content.Context
import com.example.unsunghero.App
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [
        ViewModelBuilderModule::class,
        RepositoryModule::class,
        ViewModelModule::class
    ]
)
interface ApplicationComponent {
    fun inject(app: App?)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): ApplicationComponent
    }
}