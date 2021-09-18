package io.github.jisungbin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.github.jisungbin.compose.multifab.FabIcon
import io.github.jisungbin.compose.multifab.FabOption
import io.github.jisungbin.compose.multifab.MultiFabItem
import io.github.jisungbin.compose.multifab.MultiFloatingActionButton

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(PaddingValues(30.dp)),
                contentAlignment = Alignment.BottomEnd
            ) {
                MultiFloatingActionButton(
                    fabIcon = FabIcon(iconRes = R.drawable.ic_round_add_24, iconRotate = 45f),
                    fabOption = FabOption(
                        iconTint = Color.White,
                        showLabels = true
                    ),
                    items = listOf(
                        MultiFabItem(
                            id = 1,
                            iconRes = R.drawable.ic_round_add_24,
                            label = "AAAA"
                        ),
                        MultiFabItem(
                            id = 2,
                            iconRes = R.drawable.ic_round_add_24,
                            label = "BBBB"
                        ),
                        MultiFabItem(
                            id = 3,
                            iconRes = R.drawable.ic_round_add_24,
                            label = "CCCC"
                        )
                    ),
                    onFabItemClicked = { println(it) }
                )
            }
        }
    }
}
