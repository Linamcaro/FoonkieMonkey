package com.example.android.architecture.blueprints.foonkiemonkey.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_data_table")
data class UserData (
    @PrimaryKey(autoGenerate = true)
    var nightId: Long = 0L,

    @ColumnInfo(name = "avatar")
    var avatar: String,

    @ColumnInfo(name = "email")
    var email: String,

    @ColumnInfo(name = "first_name")
    var first_name: String,

    @ColumnInfo(name = "last_name")
    var last_name: String
)