package com.example.android.architecture.blueprints.foonkiemonkey.data

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface UserListDao {

    @Insert
    suspend fun insertUser(userList: UserData): Long


}


