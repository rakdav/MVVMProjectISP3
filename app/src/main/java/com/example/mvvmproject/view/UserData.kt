package com.example.mvvmproject.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun UserData(userName: String, userAge: Int,changeName:(String)-> Unit,
             changeAge: (String) -> Unit,add:()-> Unit){
    Column{
        OutlinedTextField(value = userName, modifier = Modifier.padding(8.dp),
            label = { Text("Введите имя")}, onValueChange = {changeName(it)})
        OutlinedTextField(value = userAge.toString(), modifier = Modifier.padding(8.dp),
            label = { Text("Введите возраст")}, onValueChange = {changeAge(it)})
        Button(onClick = {add()}, Modifier.padding(8.dp)) {
            Text("Сохранить", fontSize = 22.sp)
        }
    }
}