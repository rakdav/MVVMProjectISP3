package com.example.mvvmproject.data

interface UserRepository {
    fun getUsers(): MutableList<User>
    fun addUser(user: User)
    fun editUser(user: User,index: Int)
    fun  delete(user: User)
}