package com.example.proyectop1.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.proyectop1.model.SummaryCard

@Composable
fun SummarySection(cards: List<SummaryCard>) {

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        Card(
            modifier = Modifier
                .weight(1f)
                .height(160.dp),
            shape = RoundedCornerShape(20.dp)
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(cards[0].color),
                contentAlignment = Alignment.Center
            ) {

                Text("Actividad\nde la Semana")

            }
        }

        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            cards.drop(1).forEach { card ->

                Card(
                    shape = RoundedCornerShape(20.dp)
                ) {

                    Column(
                        modifier = Modifier
                            .background(card.color)
                            .padding(16.dp)
                    ) {

                        Text(card.title)
                        Text(card.amount)

                    }

                }

            }

        }

    }

}