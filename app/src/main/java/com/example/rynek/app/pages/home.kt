package com.example.rynek.app.pages

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun Home() {
    Box(modifier = Modifier) {
        Text(text = "This is home screen!")
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Preview() {
    Home()
}