package com.example.cursoandroidcompose.core

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class IMCResult(val result: Float): NavKey
@Serializable
data object Menu: NavKey

@Serializable
data object IMC: NavKey