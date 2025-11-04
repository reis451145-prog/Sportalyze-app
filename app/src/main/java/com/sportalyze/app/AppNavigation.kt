package com.sportalyze.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

object Routes {
    const val HOME = "home"
    const val FOOTBALL_OCR = "football_ocr"
    const val BASKETBALL_OCR = "basketball_ocr"
    const val RESULTS = "results"
}

@Composable
fun AppNavigation() {
    val nav = rememberNavController()
    NavHost(navController = nav, startDestination = Routes.HOME) {
        composable(Routes.HOME) { HomeScreen(nav) }
        composable(Routes.FOOTBALL_OCR) { FootballOCRScreen() }
        composable(Routes.BASKETBALL_OCR) { BasketballOCRScreen() }
        composable(Routes.RESULTS) { ResultsScreen() }
    }
}