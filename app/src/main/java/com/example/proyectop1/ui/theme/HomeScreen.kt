package com.example.proyectop1.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import com.example.proyectop1.model.*
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeScreen() {

    val user = User("Diego", 280.99)

    val summaryCards = listOf(
        SummaryCard("Actividad", "", Color(0xFFD9E7E3)),
        SummaryCard("Ventas", "$280.99", Color(0xFFE6D7C9)),
        SummaryCard("Ganancias", "$280.99", Color(0xFFDAD3E8))
    )

    val transactions = listOf(
        Transaction("Walmart","Productos",45.99,"10:30 AM", Icons.Default.ShoppingCart),
        Transaction("Pemex","Gasolina",30.5,"12:15 PM", Icons.Default.ShoppingCart),
        Transaction("Starbucks","Cafe",5.75,"8:00 AM", Icons.Default.ShoppingCart),
        Transaction("Steren","Electronicos",120.0,"3:45 PM", Icons.Default.ShoppingCart),
        Transaction("Libreria","Libros",25.99,"2:00 PM", Icons.Default.ShoppingCart),
        Transaction("Restaurante","Cena",60.0,"7:30 PM", Icons.Default.ShoppingCart),
        Transaction("Netflix","Mensualidad",220.0,"7:30 PM", Icons.Default.ShoppingCart)

    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Header(user)

        Spacer(modifier = Modifier.height(20.dp))

        SummarySection(summaryCards)

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Text(
                text = "Transactions",
                style = MaterialTheme.typography.titleMedium
            )

            Text(
                text = "See All",
                color = Color.Gray
            )

        }

        Spacer(modifier = Modifier.height(10.dp))

        LazyColumn {

            items(transactions) { transaction ->

                TransactionItem(transaction)

            }

        }

    }

}
@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {

    ProyectoP1Theme {

        HomeScreen()

    }

}