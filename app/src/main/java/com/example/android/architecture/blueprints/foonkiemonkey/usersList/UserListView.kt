package com.example.android.architecture.blueprints.foonkiemonkey.usersList

import android.widget.Button
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.LiveData
import com.example.android.architecture.blueprints.foonkiemonkey.model.UserInfo


@Preview
@Composable
fun UsersListView() {

    Surface(color = MaterialTheme.colors.background) {


        UserList()


    }


}

@Composable
fun UserList(usersListViewModel: UsersListViewModel = hiltViewModel()) {

    val userList by usersListViewModel.responseUserList.observeAsState()

    Button(onClick = { usersListViewModel.getUsersList(1)
    }) {
    }

}

