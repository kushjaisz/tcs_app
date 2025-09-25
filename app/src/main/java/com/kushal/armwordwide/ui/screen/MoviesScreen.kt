package com.kushal.armwordwide.ui.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kushal.armwordwide.R
import com.kushal.armwordwide.ui.components.ButtonWithLeadingIcon
import com.kushal.armwordwide.ui.components.CategoryCard
import com.kushal.armwordwide.ui.components.CategoryCard2
import com.kushal.armwordwide.ui.components.CustomText
import com.kushal.armwordwide.ui.components.PrimaryAppButton
import com.kushal.armwordwide.ui.components.PromoCard
import com.kushal.armwordwide.ui.components.SearchBar
import com.kushal.armwordwide.ui.theme.Dark0F
import com.kushal.armwordwide.ui.theme.LightGray99
import com.kushal.armwordwide.ui.theme.LightGrayB3
import com.kushal.armwordwide.ui.theme.White

@Composable
fun HomeHeaderSection(
    modifier: Modifier = Modifier,
    onSearch: (String) -> Unit,
    onPlayNowClick: () -> Unit
) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        Row (modifier = Modifier.padding(start = 16.dp, end = 16.dp)){
            SearchBar(onSearch = onSearch, color = Color.Gray.copy(alpha = 0.3f))
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(550.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.irfan),
                contentDescription = "Irfan Khan",
                contentScale = ContentScale.Fit,
                modifier = Modifier.fillMaxSize()
            )

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(Color.Transparent, Color.Black.copy(alpha = 0.6f)),
                            startY = 0.5f
                        )
                    )
            )

            Column(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
            ) {
                Text(
                    text = "THE CREATIVE NETWORK ORIGINALS",
                    color = White,
                    style = MaterialTheme.typography.bodySmall,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp)
                        .clickable { /* Handle More Details click */ }
                )
                Text(
                    text = "IRFAN KHAN",
                    color = Color.White,
                    style = MaterialTheme.typography.displayLarge,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp)
                        .clickable { /* Handle More Details click */ }
                )


                Spacer(modifier = Modifier.height(10.dp))
                ButtonWithLeadingIcon(
                    onClick = onPlayNowClick,
                    text = "Play Now",
                    icon = Icons.Default.PlayArrow,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "More Details",
                    color = Color.White,
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp)
                        .clickable { /* Handle More Details click */ }
                )
            }
        }
    }
}


@Composable
fun NewReleaseSection(){

    Column {
        CustomText(
            text = "New Release",
            color = White,
            style = MaterialTheme.typography.titleLarge,
            topPadding = 16.dp,
            modifier = Modifier.padding(start = 8.dp)
        )

        MaterialTheme {
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card),
                        onClick = { /* Handle click */ },
                    )
                }
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_34),
                        onClick = { /* Handle click */ },
                    )
                }
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_28),
                        onClick = { /* Handle click */ },
                    )
                }
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_29),
                        onClick = { /* Handle click */ },
                    )
                }
            }
        }

    }

}
@Composable
fun Documentaries(){

    Column {
        CustomText(
            text = "Documentaries",
            color = White,
            style = MaterialTheme.typography.titleLarge,
            topPadding = 16.dp,
            modifier = Modifier.padding(start = 8.dp)
        )

        MaterialTheme {
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_12),
                        onClick = {  },
                        modifier = Modifier.width(153.dp).height(185.dp)
                    )
                }
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card11),
                        onClick = {  },
                        modifier = Modifier.width(153.dp).height(185.dp)
                    )
                }
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_12),
                        onClick = { },
                        modifier = Modifier.width(153.dp).height(185.dp)
                    )
                }
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card11),
                        onClick = {  },
                        modifier = Modifier.width(153.dp).height(185.dp)
                    )
                }
            }
        }

    }

}
@Composable
fun TrendingNow(){

    Column {
        CustomText(
            text = "Trending Now",
            color = White,
            style = MaterialTheme.typography.titleLarge,
            topPadding = 16.dp,
            modifier = Modifier.padding(start = 8.dp)
        )

        MaterialTheme {
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_14),
                        onClick = {  },
                        modifier = Modifier.width(110.dp).height(171.dp)

                    )
                }
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_15),
                        onClick = {  },
                        modifier = Modifier.width(110.dp).height(171.dp)

                    )
                }
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_16),
                        onClick = { },
                        modifier = Modifier.width(110.dp).height(171.dp)

                    )
                }
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_17),
                        onClick = { },
                        modifier = Modifier.width(110.dp).height(171.dp)

                    )
                }
            }
        }

    }

}

@Composable
fun RecommendedMovie(){

    Column {
        CustomText(
            text = "Recommended",
            color = White,
            style = MaterialTheme.typography.titleLarge,
            topPadding = 16.dp,
            modifier = Modifier.padding(start = 8.dp)
        )

        MaterialTheme {
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_18),
                        onClick = {  },
                        modifier = Modifier.width(110.dp).height(171.dp)

                    )
                }
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_19),
                        onClick = {  },
                        modifier = Modifier.width(110.dp).height(171.dp)

                    )
                }
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_1),
                        onClick = { },
                        modifier = Modifier.width(110.dp).height(171.dp)

                    )
                }
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_14),
                        onClick = { },
                        modifier = Modifier.width(110.dp).height(171.dp)

                    )
                }
            }
        }

    }

}
@Composable
fun Filmmakers(){

    Column {
        CustomText(
            text = "Filmmakers",
            color = White,
            style = MaterialTheme.typography.titleLarge,
            topPadding = 16.dp,
            modifier = Modifier.padding(start = 8.dp)
        )

        MaterialTheme {
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_4),
                        onClick = {  },
                        modifier = Modifier.width(110.dp).height(171.dp)

                    )
                }
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_20),
                        onClick = {  },
                        modifier = Modifier.width(110.dp).height(171.dp)

                    )
                }
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_21),
                        onClick = { },
                        modifier = Modifier.width(110.dp).height(171.dp)

                    )
                }
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_18),
                        onClick = { },
                        modifier = Modifier.width(110.dp).height(171.dp)

                    )
                }
            }
        }

    }

}
@Composable
fun Musicians(){

    Column {
        CustomText(
            text = "Musicians",
            color = White,
            style = MaterialTheme.typography.titleLarge,
            topPadding = 16.dp,
            modifier = Modifier.padding(start = 8.dp)
        )

        MaterialTheme {
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_23),
                        onClick = {  },
                        modifier = Modifier.width(110.dp).height(171.dp)

                    )
                }
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_13),
                        onClick = {  },
                        modifier = Modifier.width(110.dp).height(171.dp)

                    )
                }
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_29),
                        onClick = { },
                        modifier = Modifier.width(110.dp).height(171.dp)

                    )
                }
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_26),
                        onClick = { },
                        modifier = Modifier.width(110.dp).height(171.dp)

                    )
                }
            }
        }

    }

}
@Composable
fun Artist(){

    Column {
        CustomText(
            text = "Artist",
            color = White,
            style = MaterialTheme.typography.titleLarge,
            topPadding = 16.dp,
            modifier = Modifier.padding(start = 8.dp)
        )

        MaterialTheme {
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_5),
                        onClick = {  },
                        modifier = Modifier.width(110.dp).height(171.dp)

                    )
                }
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_13),
                        onClick = {  },
                        modifier = Modifier.width(110.dp).height(171.dp)

                    )
                }
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_29),
                        onClick = { },
                        modifier = Modifier.width(110.dp).height(171.dp)

                    )
                }
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_26),
                        onClick = { },
                        modifier = Modifier.width(110.dp).height(171.dp)

                    )
                }
            }
        }

    }

}
@Composable
fun Podcasts(){

    Column {
        CustomText(
            text = "Podcasts",
            color = White,
            style = MaterialTheme.typography.titleLarge,
            topPadding = 16.dp,
            modifier = Modifier.padding(start = 8.dp)
        )

        MaterialTheme {
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_6),
                        onClick = {  },
                        modifier = Modifier.width(110.dp).height(171.dp)

                    )
                }
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_30),
                        onClick = {  },
                        modifier = Modifier.width(110.dp).height(171.dp)

                    )
                }
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_31),
                        onClick = { },
                        modifier = Modifier.width(110.dp).height(171.dp)

                    )
                }
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_5),
                        onClick = { },
                        modifier = Modifier.width(110.dp).height(171.dp)

                    )
                }
            }
        }

    }

}
@Composable
fun FromIndia(){

    Column {
        CustomText(
            text = "From India",
            color = White,
            style = MaterialTheme.typography.titleLarge,
            topPadding = 16.dp,
            modifier = Modifier.padding(start = 8.dp)
        )

        MaterialTheme {
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_32),
                        onClick = {  },
                        modifier = Modifier.width(110.dp).height(171.dp)

                    )
                }
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_33),
                        onClick = {  },
                        modifier = Modifier.width(110.dp).height(171.dp)

                    )
                }
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_7),
                        onClick = { },
                        modifier = Modifier.width(110.dp).height(171.dp)

                    )
                }
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_1),
                        onClick = { },
                        modifier = Modifier.width(110.dp).height(171.dp)

                    )
                }
            }
        }

    }

}
@Composable
fun FromGreece(){

    Column {
        CustomText(
            text = "From Greece",
            color = White,
            style = MaterialTheme.typography.titleLarge,
            topPadding = 16.dp,
            modifier = Modifier.padding(start = 8.dp)
        )

        MaterialTheme {
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_8),
                        onClick = {  },
                        modifier = Modifier.width(110.dp).height(171.dp)

                    )
                }
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_9),
                        onClick = {  },
                        modifier = Modifier.width(110.dp).height(171.dp)

                    )
                }
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_10),
                        onClick = { },
                        modifier = Modifier.width(110.dp).height(171.dp)

                    )
                }
                item {
                    CategoryCard(
                        title = "",
                        imagePainter = painterResource(id = R.drawable.card_29),
                        onClick = { },
                        modifier = Modifier.width(110.dp).height(171.dp)

                    )
                }
            }
        }

    }

}



@Composable
fun PreviewHomeHeaderSection() {
    MaterialTheme {
        HomeHeaderSection(onSearch = {}, onPlayNowClick = {})
    }
}
@Preview(showBackground = true)
@Composable fun MovieScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF050608))
    ) {
        item {
        PreviewHomeHeaderSection()
    }
        item { NewReleaseSection() }
        item { Documentaries() }
        item { TrendingNow() }
        item { RecommendedMovie() }
        item { Filmmakers() }
        item { Musicians() }
        item { Artist() }
        item { Podcasts() }
        item { FromIndia() }
        item { FromGreece() }
        item { Spacer(modifier = Modifier.height(16.dp)) }
        item { PromoCard(
            imageRes = R.drawable.image_13,
            onClick = {}
        ) }
    }}
