package com.example.finalproject.ui.finalPackage

import android.content.Context
import android.content.Intent
import android.content.Intent.*
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import com.example.finalproject.MainActivity
import com.example.finalproject.R
import com.example.finalproject.ui.level.LevelFragment
import com.example.finalproject.ui.question.QuestionActivity
import kotlinx.android.synthetic.main.activity_final.*
import java.lang.reflect.Array.getInt

class FinalActivity : AppCompatActivity() {

    private var correctResult = 0
    lateinit var preferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        preferences = getSharedPreferences("MyShapePreferences", Context.MODE_PRIVATE)
        correctResult = intent.getIntExtra("result",0)

        var countIqKids = (correctResult/8.0) * 50

        score.text = "$countIqKids"
        preferences.edit().putInt("score", correctResult).apply()

        tryAgain.setOnClickListener{
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        var resultIq = countIqKids.toFloat()

        shareImage.setOnClickListener{
            val intent = Intent(ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(EXTRA_SUBJECT,getString(R.string.telegramm, resultIq))
            intent.putExtra(EXTRA_TEXT,resultIq)
            startActivity(Intent.createChooser(intent,getString(R.string.telegramm)))
        }
    }
}



