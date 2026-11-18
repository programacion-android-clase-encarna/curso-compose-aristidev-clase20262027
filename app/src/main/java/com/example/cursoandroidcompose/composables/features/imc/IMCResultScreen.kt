package com.example.cursoandroidcompose.composables.features.imc

import android.R
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun IMCResultScreen(result: Float=20f,onBackSelected: ()-> Unit={}){

    val category=getBmiCategory(result)
    val description=getBmiDescription(result)
    val color=getBmiColor(result)

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Analizando...") })
        }
    ) {
        paddingValues ->
        Column(modifier = Modifier.fillMaxSize().padding(paddingValues).padding(16.dp)) {
            Text("Tu resultado: ")
            Spacer(modifier = Modifier.height(32.dp))
            Card(modifier = Modifier.fillMaxWidth().weight(1f)) {
                Text(category, color = color, fontSize = 28.sp, fontWeight = FontWeight.ExtraBold)
                Text(result.toString(), color = color, fontSize = 74.sp, fontWeight = FontWeight.Bold)
                Text(description, color = color, fontSize = 24.sp,
                    fontWeight = FontWeight.Bold)

            }

            Spacer(modifier= Modifier.height(32.dp))
            Button(onClick = {
                onBackSelected()
            }, modifier = Modifier.fillMaxWidth().height(32.dp)) {
                Text("Recalcular", fontSize = 28.sp, fontWeight = FontWeight.ExtraBold)
            }
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

fun getBmiCategory(bmi:Float):String{
    return when{
        bmi<18.5f-> "Bajo Peso"
        bmi<25f->"Normal"
        bmi<30f->"Sobrepeso"
        else->"Obesidad"
    }
}

fun getBmiDescription(bmi:Float):String{
    return when{
        bmi<18.5f-> "Bajo Peso:por debajo del peso recomendado"
        bmi<25f->"Normal: tu peso es el recomendado"
        bmi<30f->"Sobrepeso: tu peso excede lo recomendado"
        else->"Obesidad:debes ir al dietista cuanto antes"
    }
}

fun getBmiColor(bmi:Float): Color{
    return when{
        bmi<18.5f-> Color(0xFF03A9F4)
        bmi<25f->Color(0xFF14EA1C)
        bmi<30f->Color(0xFF9C27B0)
        else->Color(0xFFF4436)
    }
}