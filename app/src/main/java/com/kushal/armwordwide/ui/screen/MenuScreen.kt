package com.kushal.armwordwide.ui.screen
import android.R.attr.onClick
import android.util.Log
import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kushal.armwordwide.ui.components.PrimaryAppButton
import com.kushal.armwordwide.ui.components.PrimaryAppButton2
import com.kushal.armwordwide.ui.components.SecondaryAppButtonOutlined
import com.kushal.armwordwide.ui.theme.RedAccent
import com.kushal.armwordwide.R

private val DarkBackground = Color(0xFF141414)

@Composable
fun MenuPage() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(DarkBackground)
            .padding(24.dp)
            ,
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.TopEnd
            ) {
                IconButton(onClick = { /* TODO: Handle close action */ }) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = "Close",
                        tint = Color.White
                    )
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, bottom = 24.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            )
            {
                PrimaryAppButton2(
                    onClick = {
                        Log.d("Button", "Clicked!")
                    },
                    modifier = Modifier
                        .weight(1f)
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Sign Up")
                }

                SecondaryAppButtonOutlined(
                    onClick = {
                        Log.d("Button", "Clicked!")
                    },
                    modifier = Modifier
                        .weight(1f)
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Login")
                }
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight().padding(top = 20.dp)
                    .clickable(onClick = {  }),
                shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF1A1A1A)
                ),
            ){
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                        .padding(horizontal = 16.dp)
                )
                {
                    MenuItem(icon = R.drawable.persons, text = "Name of the Profile")
                    Divider(color = Color.Black, thickness = 1.dp)

                    MenuItem(icon = R.drawable.list_plus, text = "Watchlist / Favourites")
                    Divider(color = Color.Black, thickness = 1.dp)

                    MenuItem(icon = R.drawable.download, text = "Downloads")
                    Divider(color = Color.Black, thickness = 1.dp)

                    MenuItem(icon = R.drawable.subscribtion, text = "Buy Subscription / Plan")
                    Divider(color = Color.Black, thickness = 1.dp)

                    MenuItem(icon = R.drawable.envelope, text = "Contact Us")
                    Divider(color = Color.Black, thickness = 1.dp)

                    MenuItem(icon = R.drawable.logout, text = "Logout", color = RedAccent
                    )
                }
            }


        }
    }
}

@Composable
fun MenuItem(
    @DrawableRes icon: Int,
    text: String,
    color: Color = Color.White
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = null,
            tint = color
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = text,
            color = color,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Preview
@Composable
fun MenuPagePreview() {
    MenuPage()
}

@Preview
@Composable
fun MenuScreen() {
    MenuPage()
}
