package com.example.finalproject.data.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.finalproject.data.model.Level
import com.example.finalproject.data.model.Question

@Dao
interface LevelDao {

    @Query("SELECT * FROM Levels")
    fun getAllLevel() : List<Level>

    @Query("SELECT * FROM Questions WHERE Level_iq=:id")
    fun getQuestionsByLevel(id: Int) : Question

}