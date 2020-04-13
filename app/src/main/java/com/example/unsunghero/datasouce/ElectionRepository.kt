package com.example.unsunghero.datasouce

interface ElectionRepository {

    fun findElections()

    fun startNewElection()

    fun stopElection()
}