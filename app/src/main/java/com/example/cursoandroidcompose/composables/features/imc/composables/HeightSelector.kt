package com.example.cursoandroidcompose.composables.features.imc.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cursoandroidcompose.ui.theme.colorUnSelectedCard

@Composable
fun HeightSelector(height: Float, onHeightChange: (Float) -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(180.dp)
            .padding(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorUnSelectedCard
        )
    ){
        Column(modifier= Modifier.fillMaxSize().padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
            ){
            Text("Altura", fontSize = 18.sp, color = Color.White)
            Text(height.toInt().toString() + " cm", fontSize = 48.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White)
            Slider(
                value = height,
                onValueChange = {onHeightChange (it)},
                valueRange = 120f..220f
                )
        }
    }
}

@Preview
@Composable
fun HeightSelectorPreview(){
    HeightSelector(height = 160f, onHeightChange = {})
}

