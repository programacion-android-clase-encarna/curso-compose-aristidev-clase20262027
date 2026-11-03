package com.example.cursoandroidcompose.composables.modulo2_Distribuidores

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun RowEjemplo5() {
    Row(){
        Text("Hola1", color = Color.Red)
        Text("Hola1")
        Text("Hola1")
        Text("Hola1")
        Text("Hola1")
    }

}