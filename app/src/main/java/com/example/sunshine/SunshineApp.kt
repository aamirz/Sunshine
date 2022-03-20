package com.example.sunshine

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sunshine.models.OpenWeatherImpl.OpenWeatherAPIIconKey
import com.example.sunshine.ui.theme.Blue034
import com.example.sunshine.ui.theme.BlueGradientDark
import com.example.sunshine.ui.theme.BlueGradientLight
import com.example.sunshine.ui.theme.SunshineTheme

@Composable
fun SunshineApp() {
    val SunshineBoldOpenSansFamily = FontFamily(
        Font(R.font.opensans_extra_bold),
    )
 SunshineTheme {
  Scaffold(
   topBar = {
       TopAppBar(backgroundColor = MaterialTheme.colors.background, elevation = 0.dp) {
           Icon(painter = painterResource(id = R.drawable.ic_menu),
               contentDescription = "An icon with three horizontal strokes.")

           Spacer(modifier = Modifier
               .fillMaxHeight()
               .width(8.dp))

           Text("Sunshine",
               fontFamily = SunshineBoldOpenSansFamily,
               fontWeight = FontWeight.ExtraBold,
               fontSize = 18.sp,
               color = Blue034
               )
       }
   }
  ) {
       PageContent()
  }
 }
}

@Composable
fun PageContent() {
 Column(modifier = Modifier.fillMaxWidth(),
     horizontalAlignment = Alignment.CenterHorizontally) {
  TodayWeatherHeading()
  ForecastTitle()
  FutureWeatherList()
 }
}

data class WeatherModel(val day: String = "Saturday",
                        val weather: String = "Cloudy",
                        val icon: OpenWeatherAPIIconKey = OpenWeatherAPIIconKey(),
                        val humidity: String = "Humidity: 81%",
                        val pressure: String = "Pressure: 1017 hPa",
                        val wind: String = "Wind: 2 km/h NW",
                        val highTemperature: String = "70",
                        val lowTemperature: String = "56"
)

@Composable
fun FutureWeatherList() {
    val models = mutableListOf<WeatherModel>()
    for (i in 0 until 10) {
        models.add(WeatherModel())
    }

    LazyColumn(modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        items(models) { model ->
            WeatherCard(model)
        }
    }
}

@Composable
fun WeatherCard(model: WeatherModel) {
    Surface(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center) {
            Text("lol mom")
        }
    }
}

@Composable
fun ForecastTitle() {
    Text("10-Day Forecast")
}

@Composable
fun TodayWeatherHeading() {
    Row(modifier = Modifier.fillMaxWidth()
        .height(150.dp)
        .background(brush = Brush.horizontalGradient(
            colors = listOf(BlueGradientDark, BlueGradientLight),
            tileMode = TileMode.Repeated
        )),
        horizontalArrangement = Arrangement.Center) {
     TitleText()
        // subtitle
        // tempterature
        // feels like text
    }
}

@Composable
fun TitleText() {
    Text("Atlanta, GA",
    color = Color.White)
}
