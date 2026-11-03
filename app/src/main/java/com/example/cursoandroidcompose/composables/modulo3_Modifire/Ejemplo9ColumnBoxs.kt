package com.example.cursoandroidcompose.composables.modulo3_Modifire

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun Ejemplo9ColumnBoxs() {

    Column() {

        Box(
            modifier = Modifier.fillMaxWidth().weight(1f)
                .background(Color.Red)
        ) {}

        Box(
            modifier = Modifier.fillMaxWidth().weight(1f)
                .background(Color.Blue)
        ) {}

        Box(
            modifier = Modifier.size(100.dp)
                .background(Color.Green)
        ) {}
    }

}
@Preview
@Composable

fun Ejemplo9FilasBoxs(){

    Row() {

        Box(modifier = Modifier.fillMaxHeight().weight(1f)
            .background(Color.Red)){}

        Box(modifier = Modifier.fillMaxHeight().weight(1f)
            .background(Color.Blue)){}


    }

}



