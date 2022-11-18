package com.example.android.architecture.blueprints.foonkiemonkey.di

import android.content.Context
import androidx.room.Room
import com.example.android.architecture.blueprints.foonkiemonkey.data.UserListDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DbAppModule {

    @Singleton
    @Provides
    fun provideUserInfoDatabase(@ApplicationContext app: Context) =
        Room.databaseBuilder(app, UserListDatabase::class.java,"userData_database").build()


    @Singleton
    @Provides
    fun provideUserListDao(database: UserListDatabase) = database.getUserListDao()
}