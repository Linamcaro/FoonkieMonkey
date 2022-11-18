package com.example.android.architecture.blueprints.foonkiemonkey.model

import com.example.android.architecture.blueprints.foonkiemonkey.helper.Constants
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET(Constants.END_POINT)
    suspend fun getUserPage(): Response<UserList>

    /*@GET(Constants.END_POINT)
    suspend fun getUserPage(
        @Query("page") page: Int
    ): Response<UserList>*/

}