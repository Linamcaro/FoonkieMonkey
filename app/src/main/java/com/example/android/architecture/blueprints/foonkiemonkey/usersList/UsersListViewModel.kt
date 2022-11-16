package com.example.android.architecture.blueprints.foonkiemonkey.usersList

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.architecture.blueprints.foonkiemonkey.model.UsersList
import com.example.android.architecture.blueprints.foonkiemonkey.repository.UsersRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UsersListViewModel
@Inject
constructor(private val repository: UsersRepository) : ViewModel(){

    private val _response = MutableLiveData<List<UsersList>>(listOf())
    val responseMovie : LiveData<List<UsersList>>
        get() = _response

     suspend fun getUsersList(page: Int) {
         viewModelScope.launch {
            repository.getUserPage(page).let { response ->
                if(response.isSuccessful){
                    _response.postValue(response.body())
                }else{
                    Log.d("Tag", "getUserPage Error: ${response.code()}")
                }
            }
        }

    }

}

