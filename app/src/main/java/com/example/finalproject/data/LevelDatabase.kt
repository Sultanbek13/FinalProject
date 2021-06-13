package com.example.finalproject.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.finalproject.data.dao.LevelDao
import com.example.finalproject.data.model.Level
import com.example.finalproject.data.model.Question

@Database(entities = [Level::class, Question::class], version = 1)
abstract class LevelDatabase : RoomDatabase() {
    companion object {
        private lateinit var INSTANCE: LevelDatabase

        fun getInstance(context: Context): LevelDatabase =
            Room.databaseBuilder(
                context,
                LevelDatabase::class.java, "IqProject.db"
            )
                    .createFromAsset("IqProject.db")
                    .allowMainThreadQueries()
                    .build()
    }

    abstract fun LevelDao(): LevelDao

}