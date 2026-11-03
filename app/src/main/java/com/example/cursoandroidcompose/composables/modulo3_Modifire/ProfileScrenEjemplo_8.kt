package com.example.cursoandroidcompose.composables.modulo3_Modifire


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cursoandroidcompose.R

@Preview
@Composable

fun ProfileScreenExample_8_VamosF_1() {
    Box(modifier = Modifier.fillMaxSize(). clickable() {

    }.padding(vertical = 20.dp),contentAlignment = Alignment.TopCenter) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color(0xFF3AADB7))
                .padding(horizontal = 44.dp, vertical = 40.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {

            Image(
                modifier = Modifier.size(75.dp),
                painter = painterResource(R.drawable.gomu),
                contentDescription = "User profile"
            )

            //La podemos reducir


            Column(


            ) {
                Text("Hola", color = Color.White)
                Text("2DAM", color = Color.White)
            }
            Button(onClick = {}) {
                Text("Follow")
            }

        }
    }

}