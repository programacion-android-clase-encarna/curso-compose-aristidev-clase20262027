package com.example.cursoandroidcompose.composables.modulo2_Distribuidores

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun ColumnAlinearExample7_4() {
    Column(modifier = Modifier.size(150.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top) {
        Text("Hola1")
        Text("Hola2")
        Text("Hola3")
        Text("Hola4")
        Text("Hola5")
        Text("Hola6")
    }
}