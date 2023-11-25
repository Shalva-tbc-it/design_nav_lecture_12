package com.example.designnavigation.data_model

import java.util.UUID

data class Item(
    val id: UUID = UUID.randomUUID(),
    val image: String,
    val title: Int,
    val rate: Int,
    val sold: Int,
    val price: Int
)
