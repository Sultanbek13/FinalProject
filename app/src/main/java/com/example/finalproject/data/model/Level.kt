package com.example.finalproject.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Levels")
data class Level(
    @PrimaryKey val Id : Int,

    @ColumnInfo(name = "Name")
    val name : String,

    @ColumnInfo(name = "Age")
    val age : String
)