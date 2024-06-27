package com.example.farm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.arcgismaps.ApiKey
import com.arcgismaps.ArcGISEnvironment
import com.example.farm.screens.MainScreen
import com.example.farm.ui.theme.FarmTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setApiKey()

        setContent {
            FarmTheme {
                MainScreen()
            }
        }

    }

    private fun setApiKey() {

        ArcGISEnvironment.apiKey = ApiKey.create("YOUR_ACCESS_TOKEN")

    }

}