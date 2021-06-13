package com.example.finalproject.ui.question

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.finalproject.R
import com.example.finalproject.data.LevelDatabase
import kotlinx.android.synthetic.main.activity_second.*

class QuestionActivity : AppCompatActivity() {

    private  var idCardView: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val dao = LevelDatabase.getInstance(this).LevelDao()
        val questions = dao.getQuestionsByLevel(1)
        val imageId = resources.getIdentifier(questions[0].IqImage, "question_kids1",
            this.packageName)
        question.setImageResource(R.drawable.question_kids1)
        idCardView = intent.getIntExtra("cardViewId", 0)

    }
}