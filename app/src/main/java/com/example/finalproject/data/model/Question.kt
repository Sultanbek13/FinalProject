package com.example.finalproject.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Questions")
data class Question(

    @PrimaryKey
    val Id : Int,

    @ColumnInfo(name = "Text")
    val Text : String?,

    @ColumnInfo(name = "A")
    val A : String?,

    @ColumnInfo(name = "B")
    val B : String?,

    @ColumnInfo(name = "C")
    val C : String?,

    @ColumnInfo(name = "D")
    val D : String?,

    @ColumnInfo(name = "Level_iq")
    val Level_iq : Int?,

    @ColumnInfo(name = "IqImage")
    val IqImage : String?,

    @ColumnInfo(name = "Score")
    val Score : Int?

)