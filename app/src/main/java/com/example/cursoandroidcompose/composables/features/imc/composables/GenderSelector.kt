package com.example.cursoandroidcompose.composables.features.imc.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cursoandroidcompose.ui.theme.colorSelectedCard
import com.example.cursoandroidcompose.ui.theme.colorUnSelectedCard

@Preview
@Composable
fun GenderSelector(isMaleSelected: Boolean = true, onGenderSelected: (Boolean) -> Unit = {}) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        /*Box(Modifier.background(Color.Red).height(100.dp).weight(1f))
        Box(Modifier.background(Color.Blue).height(100.dp).weight(1f))
    */
        GenderCard(
            modifier = Modifier.weight(1f),
            gender = "Hombre",
            simbolo = "♂",
            isSelected = isMaleSelected,
            onClick = { onGenderSelected(true) })

        GenderCard(
            modifier = Modifier.weight(1f),
            gender = "Mujer",
            simbolo = "♀",
            isSelected = !isMaleSelected, /*¡Ojo! Debemos negar la variable
            para que su valor true sea false (=mujer no seleccionada inicialmente)
            */
            onClick = { onGenderSelected(false) })
    }
}

@Composable
fun GenderCard(
    modifier: Modifier,
    gender: String,
    simbolo: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    val colorContenedor = if (isSelected) {
        //Color.Red
        colorSelectedCard
    } else {
        //Color.Blue
        colorUnSelectedCard
    }

    /*¡Ojo! Hacer clickable a Card, para
    que al pusar sobre ella, cambie el valor
    de la variable de estado isMaleSelected,
    declarada en su composable abuelo IMCScreen,
    llamando a la función de callBack onClick()
    cuando se produce el evento onClic sobre Card
            */
    Card(
        modifier = modifier
            .height(160.dp)
            .clickable() { onClick() },
        colors = CardDefaults.cardColors(
            containerColor = colorContenedor,
            contentColor = Color.White
        )
    ) {

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            content = {
                Text(simbolo, fontSize = 64.sp, fontWeight = FontWeight.ExtraBold)
                Text(gender, fontSize = 18.sp, fontWeight = FontWeight.Bold)
            })
    }
}

