package com.example.rynek.app.pages

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun Directories() {

    val data = getReposList()

    Box(modifier = Modifier) {
        LazyColumn(modifier = Modifier.fillMaxWidth()) {
            data.forEach {
                item {
                    Box(modifier = Modifier.padding(10.dp)) {
                     Text(text = it)
                    }
                }

            }
        }
    }


}

fun getReposList(): List<String> {
//    Todo: get the list from the public list
    return listOf(
        "Alex/Pokedex",
        "Hello/World",
        "Machine/Learning",
        "Machine/Learning",
        "Machine/Learning",
        "Machine/Learning",
        "Machine/Learning",
        "Machine/Learning",
        "Machine/Learning",
        "Machine/Learning",
        "Machine/Learning",
        "Machine/Learning",
        "Machine/Learning",
        "Machine/Learning",
        "Machine/Learning",
        "Machine/Learning",
        "Machine/Learning",
        "Machine/Learning",
        "Machine/Learning",
        "Machine/Learning",
        "Machine/Learning",
        "Machine/Learning",
        "Machine/Learning",
        "Machine/Learning",
        "Machine/Learning",
        "Machine/Learning",
        "Machine/Learning",
        "Machine/Learning",
        "Machine/Learning",
        "Machine/Learning",
        "Machine/Learning",
        "Test"
    )

}