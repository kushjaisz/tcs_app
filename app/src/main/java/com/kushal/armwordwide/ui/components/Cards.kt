package com.kushal.armwordwide.ui.components

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kushal.armwordwide.R

@Composable
fun CategoryCard(
    modifier: Modifier = Modifier,
    title: String,
    imagePainter: Painter,
    onClick: () -> Unit
) {
    Image(
        painter = imagePainter,
        contentDescription = null,
        contentScale = ContentScale.FillBounds,
        modifier = modifier
    )

}

@Composable
fun CategoryCard2(
    modifier: Modifier = Modifier,
    title: String,
    imagePainter: Painter,
    onClick: () -> Unit
) {
    Card(
        modifier = modifier
            .width(181.dp)
            .height(200.dp)
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF141414)
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {

        Column (modifier= Modifier.padding(16.dp)){      Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(140.dp)
                .clip(RoundedCornerShape(6.dp))
        )
        {
            Image(
                painter = imagePainter,
                contentDescription = title,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(140.dp)
                    .height(140.dp)
            )


        }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(2.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            )
            {
                Text(
                    text = title,
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                )
                Icon(
                    imageVector = Icons.Filled.ArrowForward,
                    contentDescription = "Go to $title",
                    tint = Color.White,
                    modifier = Modifier.size(20.dp)
                )
            } }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewCategoryCardHorizontal() {
    MaterialTheme {
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(2.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                CategoryCard2(
                    title = "Filmmakers",
                    imagePainter = painterResource(id = R.drawable.container_2),
                    onClick = {  },
                    modifier = Modifier.width(160.dp)
                )
            }
            item {
                CategoryCard2(
                    title = "Musicians",
                    imagePainter = painterResource(id = R.drawable.container_1
                    ),
                    onClick = {  },
                    modifier = Modifier.width(160.dp)
                )
            }
            item {
                CategoryCard2(
                    title = "Artists",
                    imagePainter = painterResource(id = R.drawable.container_2),
                    onClick = { },
                    modifier = Modifier.width(160.dp)
                )
            }
        }
    }
}


@Composable
fun DeviceSupportCard(
    modifier: Modifier = Modifier,
    imagePainter: Painter,
    title: String,
    description: String,
    onClick: () -> Unit = {}
) {
    val cardShape = RoundedCornerShape(8.dp)

    Card(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clickable { onClick() },
        shape = cardShape,
        colors = CardDefaults.cardColors(containerColor = Color(0xFF141414)),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        border = BorderStroke(1.dp, Color(0xFF232323))
    ) {
        BoxWithConstraints(
            modifier = Modifier
                .fillMaxWidth()
                .clip(cardShape)
        ) {
            val density = LocalDensity.current
            val wPx = with(density) { maxWidth.toPx().coerceAtLeast(1f) }
            val hPx = with(density) { maxHeight.toPx().coerceAtLeast(1f) }

            val highlightBrush = Brush.linearGradient(
                colors = listOf(
                    Color(0x11FCC23B),
                    Color.Transparent
                ),
                start = Offset(x = wPx * 0.8f, y = 0f),
                end = Offset(x = wPx * 0.2f, y = hPx * 0.6f)
            )


            Box(
                modifier = Modifier
                    .matchParentSize()
                    .background(highlightBrush)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.Top
            ) {
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color(0xFF111111)),
                    contentAlignment = Alignment.Center
                )
                {
                    Image(
                        painter = imagePainter,
                        contentDescription = title,
                        contentScale = ContentScale.Crop,
                    )

                }

                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = title,
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold
                )

            }
            Column (    modifier = Modifier
                .fillMaxWidth()
                .padding(top = 60.dp, start = 16.dp, end = 16.dp, bottom = 16.dp),){
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = description,
                    color = Color.White.copy(alpha = 0.7f),
                    style = MaterialTheme.typography.bodyMedium
                )
            }


        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF000000)
@Composable
fun DeviceSupportCardPreview() {
    Column(modifier = Modifier.padding(2.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        DeviceSupportCard(
            imagePainter =    painterResource(id = R.drawable.mobile),
            title = "Smartphones",
            description = "The Creative India is optimized for both Android and iOS smartphones. Download our app from the Google Play Store or the Apple App Store"
        )
        DeviceSupportCard(
            imagePainter =    painterResource(id = R.drawable.tablet),
            title = "Tablet",
            description = "The Creative India is optimized for both Android and iOS smartphones. Download our app from the Google Play Store or the Apple App Store"
        )
        DeviceSupportCard(
            imagePainter =    painterResource(id = R.drawable.tv),
            title = "Smart TV",
            description = "The Creative India is optimized for both Android and iOS smartphones. Download our app from the Google Play Store or the Apple App Store"
        )
        DeviceSupportCard(
            imagePainter =    painterResource(id = R.drawable.laptop),
            title = "Laptops",
            description = "The Creative India is optimized for both Android and iOS smartphones. Download our app from the Google Play Store or the Apple App Store"
        )

    }
}

@Composable
fun PlanCard(
    modifier: Modifier = Modifier,
    imagePainter: Painter,
    title: String,
    price: String,
    description: String,
    onClick: () -> Unit = {}
) {
    val cardShape = RoundedCornerShape(8.dp)

    Card(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clickable { onClick() },
        shape = cardShape,
        colors = CardDefaults.cardColors(containerColor = Color(0xFF111111)),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        border = BorderStroke(1.dp, Color(0xFF232323))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = title,
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = description,
                color = Color(0xFF999999).copy(alpha = 0.7f),
                style = MaterialTheme.typography.bodyMedium
            )
            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = modifier.fillMaxWidth(),
                verticalAlignment = Alignment.Bottom
            ) {
                Text(
                    text = price,
                    color = Color.White,
                    style = MaterialTheme.typography.headlineMedium
                )

                Text(
                    text = "/year",
                    color = Color(0xFF999999),
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                SecondaryAppButtonOutlined(
                    contentColor = Color.Gray,
                    minHeight = 40.dp,
                    onClick = {
                        Log.d("Button", "Clicked!")
                    },
                    border = Color.Gray,
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = "Start Free Trial",
                        maxLines = 1,
                        fontSize = 11.sp,
                        softWrap = false,
                        overflow = TextOverflow.Clip
                    )
                }
                PrimaryAppButton2(
                    onClick = {
                        Log.d("Button", "Clicked!")
                    },
                    modifier = Modifier.weight(1f)
                )
                {
                    Text(
                        text = "Choose Plan",
                        maxLines = 1,
                        fontSize = 13.sp,
                        softWrap = false,
                        overflow = TextOverflow.Clip
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF1A1A1A)
@Composable
fun PlanCardPreview() {
    Column(modifier = Modifier.padding(2.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {

        PlanCard(
            imagePainter =    painterResource(id = R.drawable.laptop),
            title = "Basic Plan",
            description = "Enjoy an extensive library of movies and shows, featuring a range of content, including recently released titles.",
            price = "$99.99"
        )
        PlanCard(
            imagePainter =    painterResource(id = R.drawable.laptop),
            title = "Standard Plan",
            description = "Access to a wider selection of movies and shows, including most new releases and exclusive content",
            price = "$199.99"
        )
        PlanCard(
            imagePainter =    painterResource(id = R.drawable.laptop),
            title = "Premium Plan",
            description = "Access to a widest selection of movies and shows, including all new releases and Offline Viewing,",
            price = "$299.99"
        )
    }
}


@Composable
fun PromoCard(
    modifier: Modifier = Modifier,
    imageRes: Int,
    onClick: () -> Unit
) {
    Card(
        modifier = modifier
            .padding(2.dp)
            .fillMaxWidth()
            .aspectRatio(1f)
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(1.dp, Color(0xFF262626)),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF141414)
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            // Background Image
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(8.dp))
            )

            // Bottom Gradient
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(Color.Transparent, Color.Black)
                        )
                    )
                    .align(Alignment.BottomCenter)
            )

            // Text content
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.TopCenter)
                    .padding(top = 55.dp, start = 16.dp, end = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Start your free trial today!",
                    color = Color.White,
                    style = MaterialTheme.typography.headlineMedium,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(50.dp))
                Text(
                    text = "This is a clear and concise call to action that encourages users to sign up for a free trial of The Creative Network.",
                    color = Color(0xFF999999),
                    style = MaterialTheme.typography.bodySmall,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(top = 15.dp)
                )
            }

            // Button at bottom
            PrimaryAppButton2(
                onClick = { Log.d("Button", "Clicked!") },
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 50.dp)
            ) {
                Text(
                    text = "Start a Free Trial",
                    maxLines = 1,
                    fontSize = 13.sp,
                    softWrap = false,
                    overflow = TextOverflow.Clip
                )
            }
        }
    }
}

