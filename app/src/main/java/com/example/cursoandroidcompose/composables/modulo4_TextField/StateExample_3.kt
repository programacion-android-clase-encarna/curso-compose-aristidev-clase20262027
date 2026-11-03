package com.example.cursoandroidcompose.composables.modulo4_TextField

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cursoandroidcompose.R


@Preview
@Composable

fun counterScreen (modifier: Modifier = Modifier) {
var counter by remember{ mutableStateOf(0)}

    Box(modifier = modifier.padding(all = 30.dp).background(color=Color.Blue)){
        Column(modifier = modifier) {
            Text("pulsaciones: $counter", color = Color.Black)
            Button(onClick = {
                counter++
                Log.d("counter",counter.toString())
            },
                content = {Text("Sumar")})

        }

    }
}
