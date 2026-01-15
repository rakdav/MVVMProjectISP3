package com.example.mvvmproject.data

class UsersRepositoryImpl: UserRepository {
    var users: MutableList<User>
    init {
        users= getUsers()
    }
    override fun getUsers(): MutableList<User> {
        return mutableListOf(
            User("Serge",18),
            User("Nadya",20)
        )
    }
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