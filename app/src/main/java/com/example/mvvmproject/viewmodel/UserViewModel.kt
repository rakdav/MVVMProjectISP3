package com.example.mvvmproject.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.mvvmproject.data.User
import com.example.mvvmproject.data.UserRepository
import com.example.mvvmproject.data.UsersRepositoryImpl

class UserViewModel: ViewModel() {
    private val usersRepository: UserRepository= UsersRepositoryImpl()
    var usersList=usersRepository.getUsers()
    var userName by mutableStateOf("")
    var userAge by mutableStateOf(0)
    fun addUser(){
        usersRepository.addUser(User(userName,userAge))
    }
    fun deleteUser(user: User){
        usersRepository.delete(user)
    }
    fun changeName(name: String){
        userName=name
    }
    fun changeAge(age: String){
        userAge=age.toIntOrNull()?:userAge
    }
    fun editUser(user:User){
        usersRepository.editUser(user)
    }
}