package com.example.mvvmproject.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mvvmproject.viewmodel.UserViewModel

@Composable
fun Main(vm: UserViewModel= viewModel()){
    Column(modifier = Modifier.fillMaxSize()){
        UserData(vm.userName,vm.userAge.toInt(),
            changeName = {vm.changeName(it)},
            changeAge = {vm.changeAge(it)},
            add = {
                if(!vm.edit) vm.addUser() else
            {
                vm.editUser()
            }})
        UserList(users = vm.usersList,
            delete = {vm.deleteUser(it)},
            edit = {vm.changeUser(it)})
    }
}