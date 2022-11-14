package com.example.android.architecture.blueprints.foonkiemonkey.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.android.architecture.blueprints.foonkiemonkey.R

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)

val Title1FontStyle = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 30.sp,
        textAlign = TextAlign.Center,
        color = TextBlack,
)

val Title2FontStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = 18.sp,
    textAlign = TextAlign.Center,
    color = TextWhite,
)

val ContentFontStyle = TextStyle(
    fontWeight = FontWeight.Light,
    fontSize = 12.sp,
    textAlign = TextAlign.Start,
    color = TextBlack,
)

val GetInTouchButtonText = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = 15.22.sp,
    textAlign = TextAlign.Center,
    color = ButtonText,
)




val DmSerifDisplay = FontFamily(
    Font(R.font.dm_serif_display)
)

val Rubik = FontFamily(
    Font(R.font.rubik)
)