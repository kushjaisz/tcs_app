package com.kushal.armwordwide.ui.screen

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kushal.armwordwide.R
import com.kushal.armwordwide.ui.components.CustomDropdown
import com.kushal.armwordwide.ui.components.CustomText
import com.kushal.armwordwide.ui.components.SearchBar
import com.kushal.armwordwide.ui.components.TransparentButton


@Preview(showBackground = true)
@Composable
fun ArtistDirectoryScreen() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.layer_bg),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.matchParentSize()
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 18.dp, vertical = 24.dp)
        ) {
            var searchQuery by remember { mutableStateOf(TextFieldValue("")) }


            LazyColumn(
                modifier = Modifier.weight(1f),
            ) {
                item {
                    SearchBar(
                        onSearch = { query ->
                            Log.d("SearchBar", "User typed: $query")
                        },
                        color = Color.Black.copy(alpha = 0.8f)
                    )
                }

                item { Spacer(modifier = Modifier.padding(top = 12.dp)) }



                item { CustomDropdown("Select Country", listOf("India", "USA", "UK", "Canada")) }
                item { CustomDropdown("Select State", listOf("Delhi", "Haryana", "Uttar Pradesh")) }
                item { CustomDropdown("Select City", listOf("Delhi", "Gurgaon", "Lucknow")) }
                item { CustomDropdown("Select Industry", listOf("Fashion", "Gaming", "Tech")) }
                item { CustomDropdown("Select Category", listOf("Make Up", "Design", "Development")) }
                item { CustomDropdown("Select Organization", listOf("Public Sector", "Private")) }
                item {  Row(
                    modifier = Modifier.fillMaxWidth().padding(top =15.dp),
                    horizontalArrangement = Arrangement.End

                ) {
                    TransparentButton(onClick = { /* action */ }) {
                        Text("Search", color = Color.Black)
                    }
                } }
            }





            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Bottom
            )
            {
                CustomText(
                    text = "the\ncreative\nnetwork",
                    color = Color.White.copy(alpha = 0.7f),
                    style = MaterialTheme.typography.headlineLarge
                )

                Column(
                    modifier = Modifier.padding(bottom = 16.dp),
                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.spacedBy(2.dp)
                ) {
                    CustomText(
                        text = "Artwork by",
                        color = Color.White,
                        topPadding = 0.dp,


                        style = MaterialTheme.typography.labelSmall
                    )
                    CustomText(
                        text = "@dopaminefactory",
                        color = Color.White,
                        style = MaterialTheme.typography.titleSmall
                    )
                }
            }
        }
    }
}

