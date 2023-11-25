package com.example.designnavigation.data_model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.UUID

@Parcelize
data class Item(
    val id: UUID = UUID.randomUUID(),
    val image: MutableList<String>,
    val title: Int,
    val rate: Int,
    val sold: Int,
    val price: Int
) : Parcelable
