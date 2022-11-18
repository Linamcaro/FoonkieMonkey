package com.example.android.architecture.blueprints.foonkiemonkey.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [UserData::class], version = 1, exportSchema = false)
abstract class UserListDatabase: RoomDatabase() {

    abstract fun getUserListDao(): UserListDao

}