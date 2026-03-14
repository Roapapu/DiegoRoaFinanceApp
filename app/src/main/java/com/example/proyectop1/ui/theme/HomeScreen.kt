package com.example.proyectop1.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.Color
import com.example.proyectop1.model.*

@Composable
fun HomeScreen() {

    val user = User("Juan", 280.99)

    val summaryCards = listOf(
        SummaryCard("Actividad", "", Color(0xFFD9E7E3)),
        SummaryCard("Ventas", "$280.99", Color(0xFFE6D7C9)),
        SummaryCard("Ganancias", "$280.99", Color(0xFFDAD3E8))
    )

    val transactions = listOf(
        Transaction("Supermarket","Groceries",45.99,"10:30 AM", Icons.Default.ShoppingCart),
        Transaction("Gas Station","Fuel",-30.5,"12:15 PM", Icons.Default.ShoppingCart),
        Transaction("Coffee Shop","Food & Drinks",5.75,"8:00 AM", Icons.Default.ShoppingCart),
        Transaction("Electronics Store","Electronics",120.0,"3:45 PM", Icons.Default.ShoppingCart),
        Transaction("Bookstore","Books",25.99,"2:00 PM", Icons.Default.ShoppingCart),
        Transaction("Restaurant","Dining",60.0,"7:30 PM", Icons.Default.ShoppingCart)
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

        LazyColumn {

            items(transactions) { transaction ->

                TransactionItem(transaction)

            }

        }

    }

}