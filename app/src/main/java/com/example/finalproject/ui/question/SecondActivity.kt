package com.example.finalproject.ui.question

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.finalproject.R

class SecondActivity : AppCompatActivity() {

    private  var idCardView: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        idCardView = intent.getIntExtra("cardViewId", 0)

    }
}