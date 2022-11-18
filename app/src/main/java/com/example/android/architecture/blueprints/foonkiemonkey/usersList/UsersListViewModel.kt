package com.example.android.architecture.blueprints.foonkiemonkey.usersList

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.architecture.blueprints.foonkiemonkey.model.UserInfo
import com.example.android.architecture.blueprints.foonkiemonkey.repository.UsersRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UsersListViewModel
@Inject
constructor(private val repository: UsersRepository) : ViewModel(){

    private val _response = MutableLiveData<List<UserInfo>>()
    val responseUserList : LiveData<List<UserInfo>>
        get() = _response


     fun getUsersList() {
         viewModelScope.launch {
             repository.getUserPage().let { response ->
                 if(response.isSuccessful){
                     val userEntries = response.body()?.data?.map{  UserInfo ->
                         val number = UserInfo.avatar.takeLastWhile { it.isDigit() }

                         val url = "https://reqres.in/img/faces/${number}-image.jpg"
                         UserInfo(url, UserInfo.email, UserInfo.first_name, UserInfo.last_name)

                     }

                     _response.postValue(userEntries)

                     Log.d("Tag", "getUserPage response: $userEntries")

                 }else{
                     Log.d("Tag", "getUserPage Error: ${response.code()}")
                 }
             }
        }

    }

}

