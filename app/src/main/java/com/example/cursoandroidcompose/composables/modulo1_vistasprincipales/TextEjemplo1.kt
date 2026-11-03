package com.example.cursoandroidcompose.composables.modulo1_vistasprincipales

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


@Preview(showBackground = true)
@Composable
fun TextEjemplo1() {
    Text("Hola", fontSize = 25.sp,
        fontWeight = FontWeight.Thin,
        //color=Color(0xFFE11717)
        color=Color.Red
    )

}