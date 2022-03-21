package com.example.sunshine.ui.weather

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import com.example.sunshine.models.CardState
import com.example.sunshine.models.OpenWeatherImpl.OpenWeatherAPIIconKey
import com.example.sunshine.models.WeatherModel
import com.example.sunshine.ui.theme.Blue034
import com.example.sunshine.ui.utils.OpenWeatherIconMapper

@OptIn(ExperimentalAnimationApi::class, androidx.compose.material.ExperimentalMaterialApi::class)
@Composable
fun WeatherCard(model: WeatherModel) {
    Surface(modifier = Modifier.fillMaxWidth(),
    onClick = {
        model.cardState.value = if (model.cardState.value == CardState.Collapsed) CardState.Expanded else CardState.Collapsed
    }) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 4.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            IconTitle(model)
            CardTemperature()
        }
    }
}


@Composable
fun IconTitle(model: WeatherModel) {
    Row() {
        WeatherIcon(model.icon)
        Spacer(modifier = Modifier.width(4.dp))
        WeatherTitle(model)
    }
}

@Composable
fun CardTemperature() {
    Row(horizontalArrangement = Arrangement.End) {
        Column {
            TopDegreeText()
            TextHorizontalSpace()
            HiddenText("0".toDegreeString())
        }
    }
}

@Composable
fun TopDegreeText() {
    Text("7".toDegreeString())
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun WeatherTitle(model: WeatherModel) {
    val cardState by rememberSaveable() {
       model.cardState
    }
    Column() {
        Text(model.day)
        TextHorizontalSpace()
        Text(model.weather)
        CardContentSeparation()
        AnimatedVisibility(visible = cardState == CardState.Expanded) {
           Column() {
               HiddenCardValues(model)
               CardContentSeparation()
           }
        }
    } 
}

@Composable
fun HiddenCardValues(model: WeatherModel) {
    Column {
        HiddenText(text = model.humidity)
        TextHorizontalSpace()
        HiddenText(text = model.pressure)
        TextHorizontalSpace()
        HiddenText(text = model.wind)
    }
}

@Composable
fun HiddenText(text: String) {
    Text(text)
}

@Composable
fun TextHorizontalSpace() {
    Spacer(modifier = Modifier.height(4.dp))
}

@Composable
fun WeatherIcon(icon: OpenWeatherAPIIconKey) {
    Box(modifier = Modifier.size(32.dp)) {
        Icon(
            painter = painterResource(id = OpenWeatherIconMapper.getIcon(icon)),
            contentDescription = "An icon with three horizontal strokes.",
            tint = Blue034
        )
    }
}

@Composable
private fun CardContentSeparation() {
    Spacer(modifier = Modifier.height(8.dp))
}

@Preview 
@Composable
fun PreviewWeatherCard() {
    WeatherCard(model = WeatherModel())
}

fun String.toDegreeString(): String {
    return this + "\u00B0"
}