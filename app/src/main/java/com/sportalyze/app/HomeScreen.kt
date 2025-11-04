package com.sportalyze.app

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun HomeScreen(nav: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically)
    ) {
        Text("Sportalyze", fontSize = 22.sp)
        Button(onClick = { nav.navigate(Routes.FOOTBALL_OCR) }) { Text("Football OCR") }
        Button(onClick = { nav.navigate(Routes.BASKETBALL_OCR) }) { Text("Basketball OCR") }
        Button(onClick = { nav.navigate(Routes.RESULTS) }) { Text("Results") }
    }
}