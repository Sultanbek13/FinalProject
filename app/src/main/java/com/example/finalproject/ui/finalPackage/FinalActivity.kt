package com.example.finalproject.ui.finalPackage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.finalproject.R

class FinalActivity : AppCompatActivity() {

    var correctResult = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        correctResult = intent.getIntExtra("result",0)

    }
}