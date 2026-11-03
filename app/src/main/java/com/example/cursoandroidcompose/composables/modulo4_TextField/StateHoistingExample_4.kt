package com.example.cursoandroidcompose.composables.modulo4_TextField

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun CounterScreen_Example4(modifier: Modifier = Modifier) {
    var counter1 by rememberSaveable { mutableStateOf(value = 0) }
    var counter2 by rememberSaveable { mutableStateOf(value = 0) }
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        CounterReusable(
            modifier = modifier,
            counter = counter1,
            onIncrement = { counter1++ })
        CounterReusable(
            modifier = modifier,
            counter = counter2,
            onIncrement = { counter2++ })
    }

}




    @Composable
    fun CounterReusable(modifier: Modifier, counter: Int, onIncrement: () -> Int) {
        Box(
            modifier = modifier
                .padding(all = 30.dp)
                .background(color = Color.LightGray)
        ) {
            Column(modifier = modifier ,
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text("pulsaciones: $counter", color = Color.Black)
                Button(
                    onClick = { onIncrement() },
                    content = { Text("Sumar") })

            }

        }
    }

