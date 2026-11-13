package com.example.cursoandroidcompose.core

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.example.cursoandroidcompose.composables.features.imc.MenuScreen

@Composable
fun AppNavigation() {
    val backStack = rememberNavBackStack()
    NavDisplay(backStack, entryProvider = entryProvider {
        entry<Menu>{
            MenuScreen()
        }

        entry<IMC>{
            IMCScreen()
        }
    })
}