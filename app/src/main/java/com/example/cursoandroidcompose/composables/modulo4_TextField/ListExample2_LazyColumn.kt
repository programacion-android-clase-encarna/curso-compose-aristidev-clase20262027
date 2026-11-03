package com.example.cursoandroidcompose.composables.modulo4_TextField

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Text
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun ListExample2_LazyColumn(modifier: Modifier=
                                Modifier){
    val frutas=listOf("Manzana"
    ,"Pera","Plátano","Naranja","Kiwi"
        )

    LazyColumn(modifier = modifier ) {
        item {
            Box(modifier = Modifier.fillMaxWidth()
                .height(40.dp)
                .background(color = Color.Cyan),
                contentAlignment =
                    Alignment.Center){
                Text("Frutas")
            }
        }
        items(frutas){
            Text(it,
                color=Color.Yellow,
                fontSize = 20.sp)
        }
    }
}