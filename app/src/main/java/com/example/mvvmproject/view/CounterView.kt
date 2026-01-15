package com.example.mvvmproject.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mvvmproject.viewmodel.CounterViewModel

@Composable
fun CounterView(viewModel: CounterViewModel= viewModel()) {
    Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text("Count:${viewModel.count}", Modifier.padding(10.dp),
            fontSize = 25.sp)
        Button(onClick = {viewModel.increase()}) {
            Text(text = "Increase", fontSize = 25.sp)
        }
    }
}