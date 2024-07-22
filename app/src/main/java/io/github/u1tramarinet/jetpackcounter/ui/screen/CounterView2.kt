package io.github.u1tramarinet.jetpackcounter.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CounterView2(modifier: Modifier = Modifier) {
    val counter = rememberCounter()
    CounterButton(
        modifier = modifier,
        count = counter.count,
        onClick = counter.onClick
    )
}

data class Counter(
    val count: Int,
    val onClick: () -> Unit
)

@Composable
fun rememberCounter(): Counter {
    var count by rememberSaveable { mutableIntStateOf(0) }
    return remember(count) {
        Counter(
            count = count,
            onClick = { count++ },
        )
    }
}

@Composable
@Preview(showBackground = true)
fun CounterView2Preview() {
    CounterView2()
}

