package com.example.cursoandroidcompose.composables.modulo2_Distribuidores

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable

fun RowAlinearExample_7_5(){
    Row(modifier = Modifier.size(150.dp),
        horizontalArrangement = Arrangement.End,
        verticalAlignment = Alignment.Bottom

        ) {

        Text("Hola1")
        Text("Hola2")
        Text("hola3")

    }

}
