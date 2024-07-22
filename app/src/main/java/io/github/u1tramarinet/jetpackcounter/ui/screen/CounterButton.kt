package io.github.u1tramarinet.jetpackcounter.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CounterButton(modifier: Modifier = Modifier, count: Int, onClick: () -> Unit) {
    Column(
        modifier = modifier.padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = count.toString(), style = MaterialTheme.typography.displayLarge)
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = onClick) {
            Text(text = "Count up")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun CounterButtonPreview() {
    CounterButton(count = 0) {

    }
}