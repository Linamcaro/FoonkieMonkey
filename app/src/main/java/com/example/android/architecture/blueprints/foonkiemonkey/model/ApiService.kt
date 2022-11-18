package com.example.android.architecture.blueprints.foonkiemonkey.model

import com.example.android.architecture.blueprints.foonkiemonkey.helper.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET(Constants.END_POINT)
    suspend fun getUserPage(
        @Query("page") page: Int
    ): Response<UserList>



}