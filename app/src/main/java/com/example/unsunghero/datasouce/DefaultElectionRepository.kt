package com.example.unsunghero.datasouce

import com.example.unsunghero.datasouce.local.ElectionRemoteElectionLocal
import javax.inject.Inject

class DefaultElectionRepository @Inject constructor(
    private val remote: ElectionRemoteDataSource,
    private val local: ElectionRemoteElectionLocal
): ElectionRepository {

    override fun findElections() {
    }

    override fun startNewElection() {
        TODO("Not yet implemented")
    }

    override fun stopElection() {
        TODO("Not yet implemented")
    }
}