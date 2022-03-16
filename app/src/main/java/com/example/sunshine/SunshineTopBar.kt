package com.example.sunshine

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SunshineTopBar() {
    val SunshineBoldOpenSansFamily = FontFamily(
        Font(R.font.opensans_extra_bold),
    )

    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 8.dp, horizontal = 4.dp),
    horizontalArrangement = Arrangement.Start) {
        Icon(painter = painterResource(id = R.drawable.ic_menu),
            contentDescription = "An icon with three horizontal strokes.")

        Spacer(modifier = Modifier
            .fillMaxHeight()
            .width(8.dp))

        Text("Sunshine",
            fontFamily = SunshineBoldOpenSansFamily,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 18.sp,

        )
    }
}

@Preview
@Composable
fun PreviewSunshineTopBar() {
    SunshineTopBar()
}
