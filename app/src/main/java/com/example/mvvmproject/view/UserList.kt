package com.example.mvvmproject.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mvvmproject.data.User

@Composable
fun UserList(users: List<User>,delete:(User)-> Unit,edit:(User)-> Unit) {
    LazyColumn(Modifier.fillMaxWidth()) {
        items(users){
            u->
            Card(
                modifier = Modifier.fillMaxWidth().padding(
                    start = 8.dp,
                    top = 4.dp,
                    end = 8.dp,
                    bottom = 4.dp
                ).height(100.dp),
                shape = MaterialTheme.shapes.large,
                elevation = CardDefaults.cardElevation()

            )
            {
                Row(modifier = Modifier.fillMaxWidth().padding(all = 15.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    ) {
                    Column {
                        Text(u.name, Modifier.padding(start = 12.dp), fontSize = 30.sp)
                        Text(u.age.toString(), Modifier.padding(start = 12.dp), fontSize = 30.sp)
                    }
                    Row {
                        Button(onClick = { edit(u) }) {
                            Icon(
                                imageVector = Icons.Default.Edit,
                                contentDescription = "Del"
                            )
                        }
                        Spacer(modifier = Modifier.size(20.dp))
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
    }
}


