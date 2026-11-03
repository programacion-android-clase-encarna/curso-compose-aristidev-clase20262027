package com.example.cursoandroidcompose.composables.modulo1_vistasprincipales

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview //(showBackground = true)
@Composable
fun ButtonEjemplo2() {
    Button(onClick = {
        //función callBack (lambda)
        print("Hola me has pulsado")
    }, content={
        Text("Pulsame")
    } )
}