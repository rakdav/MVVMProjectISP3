package com.example.mvvmproject.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mvvmproject.data.User

@Composable
fun UserList(users: List<User>,delete:(User)-> Unit,edit:(User)-> Unit) {
    LazyColumn(Modifier.fillMaxWidth()) {
        items(users){
            u->
            Row (Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceEvenly) {
                Column{
                    Text(u.name, Modifier.padding(start = 12.dp), fontSize = 25.sp)
                    Text(u.age.toString(), Modifier.padding(start = 12.dp), fontSize = 25.sp)
                }
                Button(onClick = { edit(u) }) {
                    Icon(
                        imageVector = Icons.Default.Edit,
                        contentDescription = "Del"
                    )
                }
                Button(onClick = { delete(u) }) {
                    Icon(
                        imageVector = Icons.Default.Delete,
                        contentDescription = "Del"
                    )
                }
            }
        }
    }
}


