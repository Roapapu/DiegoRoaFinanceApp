package com.example.proyectop1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.proyectop1.ui.theme.HomeScreen
import com.example.proyectop1.ui.theme.ProyectoP1Theme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            ProyectoP1Theme {

                HomeScreen()

            }

        }

    }

}