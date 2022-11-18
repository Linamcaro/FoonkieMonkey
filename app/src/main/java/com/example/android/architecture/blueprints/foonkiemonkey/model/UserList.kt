package com.example.android.architecture.blueprints.foonkiemonkey.model

data class UserList(
    val data: List<UserInfo>,
    val page: Int,
    val per_page: Int,
    val support: Support,
    val total: Int,
    val total_pages: Int
)