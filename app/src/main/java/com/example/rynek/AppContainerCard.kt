package com.example.rynek


import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage


class AppContainerCard(private val label: String) {
    @Composable
    fun SmallView() {
        Box(modifier = Modifier.background(color = androidx.compose.ui.graphics.Color.White).border(2.dp,
            androidx.compose.ui.graphics.Color.Black)) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Box(modifier = Modifier.padding(5.dp)){
                AsyncImage(modifier = Modifier.size(80.dp),
                    model = "https://cdn-icons-png.flaticon.com/512/1076/1076744.png",
                    contentDescription = null)}
                Text(text = label)
            }
        }
    }

    @Composable
    fun WideView() {
        Box(modifier = Modifier) {

        }
    }

}


@Preview
@Composable
fun SmallBox() {
    Box(modifier = Modifier.background(color = androidx.compose.ui.graphics.Color.White)) {
        Column {
            AsyncImage(modifier = Modifier,
            model = "https://icons8.com/icon/L8u73GfZ6PD4/opacity",
                contentDescription = null)

            Text(text = "Hello")

        }
    }
}

