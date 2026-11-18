package com.example.cursoandroidcompose.composables.features.imc.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cursoandroidcompose.ui.theme.colorUnSelectedCard

@Composable
fun CounterSelector(
    age: Int,
    onPlusAgeSelected: () -> Int,
    onMinusAgeSelected: () -> Int,
    weight: Int,
    onPlusWeightSelected: () -> Int,
    onMinusWeightSelected: () -> Int
) {
    Row(modifier = Modifier.fillMaxWidth().padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)){
        CounterCard(modifier = Modifier.weight(1f),title="Peso", value=weight,onPlus={onPlusWeightSelected()},onMinus={onMinusWeightSelected()})

        CounterCard(modifier = Modifier.weight(1f),title="Edad", value=age,onPlus={onPlusAgeSelected()},onMinus={onMinusAgeSelected()})
    }

}
@Preview
@Composable
fun CounterCard(modifier:Modifier= Modifier, title: String="PESO", value: Int=90, onPlus: () -> Unit={}, onMinus: () -> Unit={}) {
    Card(modifier.height(180.dp
    ),
        colors = CardDefaults.cardColors(containerColor = colorUnSelectedCard)){
        Column(Modifier.fillMaxSize().padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally){
            Text(title, fontSize = 32.sp, fontWeight = FontWeight.Bold)
            Text(value.toString(), fontSize = 48.sp, fontWeight = FontWeight.Bold)
            Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                Button(onClick = {onMinus()},modifier=Modifier.size(42.dp),
                    contentPadding = PaddingValues(0.dp)) {
                    Text("-")
                }
                Button(onClick = {onPlus()},modifier=Modifier.size(42.dp),
                    contentPadding = PaddingValues(0.dp)) {
                    Text("+")
                }
            }
        }
    }
}