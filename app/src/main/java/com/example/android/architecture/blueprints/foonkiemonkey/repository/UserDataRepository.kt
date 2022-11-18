package com.example.android.architecture.blueprints.foonkiemonkey.repository

import com.example.android.architecture.blueprints.foonkiemonkey.data.UserData
import com.example.android.architecture.blueprints.foonkiemonkey.data.UserListDao
import javax.inject.Inject

class UserDataRepository
@Inject
constructor(private val userListDao: UserListDao) {

    suspend fun insertUser(userList: UserData): Long = userListDao.insertUser(userList)

}