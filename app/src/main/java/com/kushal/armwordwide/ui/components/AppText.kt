package com.kushal.armwordwide.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Composable
fun CustomText(
    text: String,
    color: Color,
    style: androidx.compose.ui.text.TextStyle,
    topPadding: Dp = 0.dp,
    modifier: Modifier = Modifier
) {
    Text(
        text = text,
        color = color,
        style = style,
        modifier = modifier
            .padding(top = topPadding)
            .then(modifier)
    )
}


