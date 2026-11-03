package com.example.cursoandroidcompose.composables.features.imc

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.cursoandroidcompose.composables.features.imc.composables.GenderSelector

@Composable
fun IMCScreen() {
    var isMaleSelected by remember{ mutableStateOf(true) }
    Box(Modifier.fillMaxSize()){
        GenderSelector(isMaleSelected= isMaleSelected,
            onGenderSelected= {
                isMaleSelected=it
            })
    }

}

