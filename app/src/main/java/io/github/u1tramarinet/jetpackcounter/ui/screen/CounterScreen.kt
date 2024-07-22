package io.github.u1tramarinet.jetpackcounter.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.u1tramarinet.jetpackcounter.ui.theme.JetpackCounterTheme

@Composable
fun CounterScreen(modifier: Modifier = Modifier) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            modifier = modifier.padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            CounterView()
            Spacer(modifier = Modifier.height(32.dp))
            CounterView2()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CounterScreenPreview() {
    JetpackCounterTheme {
        CounterScreen(modifier = Modifier.fillMaxSize())
    }
}