package com.example.mvvmproject.view

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mvvmproject.data.User
import com.example.mvvmproject.viewmodel.UserViewModel

@Composable
fun Main(vm: UserViewModel= viewModel()){
    Column{
        UserData(vm.userName,vm.userAge, changeName = {vm.changeName(it)},
            changeAge = {vm.changeAge(it)},
            add = {if(!vm.edit) vm.addUser() else
            {
                vm.editUser()
            }})
        UserList(users = vm.usersList, delete = {vm.deleteUser(it)}, edit = {vm.changeUser(it)})
    }
}