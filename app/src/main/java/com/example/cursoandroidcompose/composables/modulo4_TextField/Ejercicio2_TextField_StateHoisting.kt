package com.example.cursoandroidcompose.composables.modulo4_TextField

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun Ejercicio2_TextField_StateHoisting(modifier: Modifier = Modifier) {
    var texto by remember() { mutableStateOf(value = "hola") }
    Column(){
        TextField(
          value = texto,
            onValueChange =
                {nuevoTexto -> texto=nuevoTexto},
            label = {Text("Introduce nombre")}
        )
    }

}