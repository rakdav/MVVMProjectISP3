package com.example.mvvmproject.data

import androidx.compose.runtime.mutableStateListOf


class UsersRepositoryImpl: UserRepository {
    private val users = mutableStateListOf<User>()
    override fun getUsers(): MutableList<User> =users
    override fun addUser(user: User) {
        users.add(user)
    }
    override fun editUser(user: User) {
        val index=users.indexOf(user)
        users[index].name=user.name
        users[index].age=user.age
    }
    override fun delete(user: User) {
        users.remove(user)
    }
}