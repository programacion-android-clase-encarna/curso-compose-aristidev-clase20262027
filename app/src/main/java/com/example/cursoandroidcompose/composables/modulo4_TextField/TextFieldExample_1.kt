package com.example.cursoandroidcompose.composables.modulo4_TextField

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.LineHeightStyle


@Composable
fun TextFieldExample_1() {
    //Texto debe ser declarada como una variable de estado,//
    //Que recuerde su último valor
    var texto by remember {mutableStateOf("Iván") }
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center){
        TextField(
            value=texto,
            onValueChange ={
                nuevoTexto -> texto=nuevoTexto
            },
            label = {Text("Introduce tu nombre")}
        );
    }
}