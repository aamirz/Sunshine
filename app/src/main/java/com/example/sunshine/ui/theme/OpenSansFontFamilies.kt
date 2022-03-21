package com.example.sunshine.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import com.example.sunshine.R

@Composable
fun openSansRegular(): FontFamily {
    return FontFamily(
       Font(R.font.opensans_regular),
   )
}

@Composable
fun openSansBold(): FontFamily {
    return FontFamily(
        Font(R.font.open_sans_bold)
    )
}

@Composable
fun openSansExtraBold(): FontFamily {
    return FontFamily(
        Font(R.font.opensans_extra_bold)
    )
}

