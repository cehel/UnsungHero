package com.example.unsunghero.ui

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.unsunghero.App
import javax.inject.Inject

open class BaseFragment: Fragment() {

    @Inject
    protected lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onAttach(context: Context) {
        super.onAttach(context)

        (requireActivity().application as App).appComponent.inject(this)
    }
}