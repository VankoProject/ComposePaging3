package com.kliachenko.composepaging3.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "beer"
)
data class BeerEntity(
    @PrimaryKey
    val id: Int,
    @ColumnInfo(name = "name")
    val name: String,
    @ColumnInfo(name = "tagLine")
    val tagLine: String,
    @ColumnInfo(name = "description")
    val description: String,
    @ColumnInfo(name = "first_brewed")
    val firstBrewed: String,
    @ColumnInfo(name = "image_url")
    val imageUrl: String?
)
