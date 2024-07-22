package io.github.u1tramarinet.jetpackcounter.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CounterView(modifier: Modifier = Modifier) {
    val count = rememberSaveable { mutableIntStateOf(0) }
    CounterButton(
        modifier = modifier,
        count = count.intValue
    ) {
        count.intValue++
    }
}

@Composable
@Preview(showBackground = true)
fun CounterViewPreview() {
    CounterView()
}