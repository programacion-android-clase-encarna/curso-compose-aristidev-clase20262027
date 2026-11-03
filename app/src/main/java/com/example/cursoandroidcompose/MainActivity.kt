package com.example.cursoandroidcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cursoandroidcompose.composables.features.imc.IMCScreen
import com.example.cursoandroidcompose.composables.modulo1_vistasprincipales.ButtonEjemplo2
import com.example.cursoandroidcompose.composables.modulo4_TextField.CounterScreen_Example4
import com.example.cursoandroidcompose.composables.modulo4_TextField.Ejercicio2_TextField_StateHoisting
import com.example.cursoandroidcompose.composables.modulo4_TextField.TextFieldExample_1
import com.example.cursoandroidcompose.composables.modulo4_TextField.counterScreen
import com.example.cursoandroidcompose.ui.theme.CursoAndroidComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CursoAndroidComposeTheme {
                IMCScreen()
                //Ejercicio2_TextField_StateHoisting()
            // CounterScreen_Example4(modifier = Modifier.fillMaxWidth())
            //counterScreen()
            //TextFieldExample_1()
               // TextEjemplo1()
                //ButtonEjemplo2()

//               Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
            }//fin CursoAndroid...
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CursoAndroidComposeTheme {
        var name="Encarna"
        Greeting(name)
    }
}