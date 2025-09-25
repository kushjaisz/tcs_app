package com.kushal.armwordwide.ui.components

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kushal.armwordwide.R // Assuming you have an R.java file with resources

@Preview
@Composable
fun HomeLayoutPreview() {
    val sampleImageResources = listOf(
        R.drawable.image_1,
        R.drawable.image_3,
        R.drawable.image_2,
        R.drawable.image_9,
        R.drawable.image_8,
        R.drawable.image_12,
        R.drawable.image_10,
        R.drawable.image_11,
        R.drawable.image_9,
        R.drawable.image_1,
        R.drawable.image_2,
        R.drawable.image_3,
        R.drawable.image_4,
        R.drawable.image_5,
        R.drawable.image_6,

        )
    MaterialTheme {
        ImageLayout(
            title = "The Creative Network",
            description = "The Creative India is the best streaming experience for watching your favorite movies and shows on demand, anytime, anywhere.",
            buttonText = "Explore Now",
            onButtonClick = { /* Handle button click */ },
            imageResources = sampleImageResources
        )
    }
}

@Composable
fun ImageLayout(
    title: String,
    description: String,
    buttonText: String,
    onButtonClick: () -> Unit,
    imageResources: List<Int>
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF131313)),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        item {
            ImageHearder(imageResources)
        }

        item {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                contentAlignment = Alignment.TopCenter
            )
            {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = description,
                        textAlign = TextAlign.Center,
                        color = Color.White.copy(alpha = 0.7f),
                        style = MaterialTheme.typography.bodyLarge,
                        modifier = Modifier.padding(12.dp)
                    )
                    PrimaryAppButton(
                        onClick = {
                            Log.d("Button", "Clicked!")
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 16.dp)
                    ) {
                        Text(text = buttonText)
                    }

                    Text(
                        text = "Explore our wide variety of categories",
                        textAlign = TextAlign.Start,
                        color = Color.White,
                        style = MaterialTheme.typography.headlineSmall,
                        modifier = Modifier.padding(top = 16.dp, start = 8.dp, end = 8.dp)
                    )

                    PreviewCategoryCardHorizontal()

                    Text(
                        text = "We Provide you streaming experience across various devices.",
                        textAlign = TextAlign.Start,
                        color = Color.White,
                        style = MaterialTheme.typography.headlineSmall,
                        modifier = Modifier.padding(top = 16.dp, start = 8.dp, end = 8.dp)
                    )

                    Text(
                        text = "With The Creative India, you can enjoy your favorite movies and TV shows anytime, anywhere.",
                        textAlign = TextAlign.Left,
                        color = Color.White.copy(alpha = 0.7f),
                        style = MaterialTheme.typography.bodyLarge,
                        modifier = Modifier.padding(12.dp)
                    )

                    DeviceSupportCardPreview()


                    Text(
                        text = "Choose the plan that's right for you",
                        textAlign = TextAlign.Start,
                        color = Color.White,
                        style = MaterialTheme.typography.headlineSmall,
                        modifier = Modifier.padding(top = 16.dp, start = 8.dp, end = 8.dp)
                    )

                    Text(
                        text = "Join The Creative Network and select from our flexible subscription options tailored to suit your viewing preferences. Get ready for non-stop entertainment!",
                        textAlign = TextAlign.Left,
                        color = Color.White.copy(alpha = 0.7f),
                        style = MaterialTheme.typography.bodyLarge,
                        modifier = Modifier.padding(12.dp)
                    )

                    PlanCardPreview()
                    Spacer(modifier = Modifier.height(16.dp))
                    PromoCard(
                        imageRes = R.drawable.image_13,
                        onClick = {}
                    )
                }
            }
        }
    }}

