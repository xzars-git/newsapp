package com.loc.newsapp.domain.usecases

import com.loc.newsapp.domain.manger.LocalUserManger

class SaveAppEntry (private val localUserManger: LocalUserManger) {
    suspend operator fun invoke(){
        localUserManger.saveAppEntry()
    }
}