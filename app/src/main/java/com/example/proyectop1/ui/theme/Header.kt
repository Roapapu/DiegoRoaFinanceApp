package com.example.proyectop1.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.Modifier
import com.example.proyectop1.model.User

@Composable
fun Header(user: User) {

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Column {
            Text(
                text = "Hola ${user.name}",
                style = MaterialTheme.typography.titleLarge
            )

            Text(
                text = "Bienvenido",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Gray
            )
        }

        IconButton(onClick = {}) {
            Icon(Icons.Default.Menu, contentDescription = "Menu")
        }
    }
}