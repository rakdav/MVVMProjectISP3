package com.example.mvvmproject.data

interface UserRepository {
    fun getUsers(): List<User>
    fun addUser(user: User)
    fun editUser(user: User)
    fun  delete(user: User)
}