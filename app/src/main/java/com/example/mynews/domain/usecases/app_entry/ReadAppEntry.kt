package com.example.mynews.domain.usecases.app_entry

import com.example.mynews.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry(
    private val localUserManager: LocalUserManager

) {
    operator fun invoke(): Flow<Boolean> {
        return localUserManager.readAppEntry()
    }

}