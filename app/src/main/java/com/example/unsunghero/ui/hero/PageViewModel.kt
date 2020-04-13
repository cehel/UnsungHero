package com.example.herotabtest.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.unsunghero.datasouce.ElectionRepository
import javax.inject.Inject

class PageViewModel @Inject constructor(
    private val electionRepository: ElectionRepository
) : ViewModel() {

    private val _index = MutableLiveData<Int>()
    val text: LiveData<String> = Transformations.map(_index) {
        electionRepository.findElections()
        "Hello world from section: $it"
    }

    fun setIndex(index: Int) {
        _index.value = index
    }
}