package com.kushal.armwordwide.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.kushal.armwordwide.R


@Composable
fun CustomBottomBar(navController: NavController) {
    var selectedItem by remember { mutableStateOf(0) }

    val items = listOf(
        NavItem("", R.drawable.home,R.drawable.union ,"home"),
        NavItem("Movie", R.drawable.video_camera,R.drawable.video_camera_solid ,"movie"),
        NavItem("Artist Directory", R.drawable.vector,R.drawable.users_solid, "artist"),
        NavItem("", R.drawable.bars_3,R.drawable.bars_3, "menu")
    )

    NavigationBar(
        containerColor = Color(0xFF1E1E1E),
        modifier = Modifier
            .fillMaxWidth()
                ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            items.forEachIndexed { index, item ->
                val isSelected = selectedItem == index

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .clickable {
                            selectedItem = index
                            navController.navigate(item.route) {
                                popUpTo(navController.graph.startDestinationId) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                ) {

                    Image(
                        painter = painterResource(id = if (isSelected) item.selectedIconRes else item.iconRes),
                        contentDescription = item.label,
                        modifier = Modifier.size(30.dp),
                        colorFilter = if (isSelected) ColorFilter.tint(Color(0xFFFCC23B)) else null

                    )
                    if (isSelected && item.label.isNotEmpty()) {
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(
                            text = item.label,
                            color = Color(0xFFFCC23B),
                            style = MaterialTheme.typography.labelMedium,
                            fontSize = 12.sp,
                            maxLines = 1,
                            softWrap = false
                        )
                    }
                }
            }
        }
    }
}

data class NavItem(
    val label: String,
    val iconRes: Int,
    val selectedIconRes: Int,
    val route: String
)