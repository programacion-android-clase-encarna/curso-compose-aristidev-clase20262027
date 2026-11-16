package com.example.cursoandroidcompose.composables.features.imc.composables

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CounterSelector(
    age: Int,
    onPlusAgeSelected: () -> Int,
    onMinusAgeSelected: () -> Int,
    weight: Int,
    onPlusWeightSelected: () -> Int,
    onMinusWeightSelected: () -> Int
) {
    Row(modifier = Modifier.fillMaxWidth()){
        CounterCard(title="Peso", value=weight,onPlus={onPlusWeightSelected()},nMinus={onMinusWeightSelected()})

        CounterCard(title="Edad", value=age,onPlus={onPlusAgeSelected()},nMinus={onMinusAgeSelected()})
    }

}

@Composable
fun CounterCard(title: String, value: Int, onPlus: () -> Int, nMinus: () -> Int) {
    TODO("Not yet implemented")
}