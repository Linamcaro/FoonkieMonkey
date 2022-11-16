package com.example.android.architecture.blueprints.foonkiemonkey.repository

import com.example.android.architecture.blueprints.foonkiemonkey.model.ApiService
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class UsersRepository
@Inject
constructor(private val apiService: ApiService){

    suspend fun getUserPage(page: Int)  = apiService.getUserPage(page)

}