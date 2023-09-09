package com.example.rynek



import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.rynek.app.pages.About
import com.example.rynek.app.pages.Directories
import com.example.rynek.app.pages.Downloads
import com.example.rynek.app.pages.Home


val items = listOf<String>("Home", "Downloads", "Directories", "About")
val icons = listOf<Int>(R.drawable.baseline_home_24,R.drawable.download_icon, R.drawable.baseline_library_books_24, R.drawable.baseline_info_24)


@Composable
fun Navbar(navController : NavHostController){
    var selectedItem by remember {
        mutableIntStateOf(0)

    }

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    NavigationBar(modifier = Modifier) {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = { Icon(painterResource(id = icons[index]), contentDescription = item) },
                label = { Text(item) },
                selected = currentRoute == item,
                onClick = {
                    selectedItem = index
                    navController.navigate(item) {
                        launchSingleTop = true
                    }
                }
            )
        }
    }
}

@Composable
fun NavController(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "Home") {
        composable("Home") {
            Home()
        }

        composable("Downloads") {
            Downloads()
        }

        composable("Directories") {
            Directories()
        }

        composable("About") {
            About()
        }
    }
}


