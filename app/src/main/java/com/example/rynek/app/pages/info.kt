package com.example.rynek.app.pages

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun About() {
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(10.dp)
    ) {
        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Box(modifier = Modifier) {
                // TODO: Get a way to access the mipmap resources
               // Icon(painter = , contentDescription = "app icon")
            }
            
            Box(modifier = Modifier.padding(10.dp)) {
                Text(text = "Rynek")
            }
            
            Text(text = "Made with love")
            Text(text = "By developers, for developers")
            
            // TODO: Get the app version number programmatically
            Box() {
                Text(text = "Version 1.0")
            }
            

            




        }
    }

}
