package com.example.cursoandroidcompose.composables.modulo4_TextField

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun ListExample_2 (modifier:Modifier= Modifier) {

    val names=listOf(
        "Aris",
        "MoureDev",
        "BettaTech"
    )
    Column(modifier=modifier,
        verticalArrangement= Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        names.forEach {
            Text(text= it,
                color= Color.Yellow,
                fontSize = 10.sp)
        }
    }
}