package com.example.cursoandroidcompose.core

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.example.cursoandroidcompose.composables.features.imc.IMCScreen
import com.example.cursoandroidcompose.composables.features.imc.MenuScreen

@Composable
fun AppNavigation() {
    val backStack = rememberNavBackStack(Menu)
    NavDisplay(backStack, entryProvider = entryProvider {
        entry<Menu>{
            MenuScreen(modifier = Modifier.fillMaxWidth(),
                onIMCSelected = {backStack.add(IMC)})
        }

        entry<IMC>{
            IMCScreen()
        }
    })
}