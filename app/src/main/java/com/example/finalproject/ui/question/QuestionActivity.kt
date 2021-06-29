package com.example.finalproject.ui.question

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.finalproject.R
import com.example.finalproject.data.LevelDatabase
import com.example.finalproject.ui.finalPackage.FinalActivity
import kotlinx.android.synthetic.main.activity_second.*
import kotlin.random.Random

class QuestionActivity : AppCompatActivity() {


    lateinit var correctAnswer : String
    private var checkRightAnswer = 0

    companion object {
        const val LEVEL_COUNT = 24
    }

    private var step = 1
    private var set = mutableSetOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_second)

        setData(step)

        stepCount.text = "${step} / $LEVEL_COUNT"

    }

    override fun onResume() {
        super.onResume()
        setData(step)
    }

    fun onButtonClick(view: View) {

        if (view.tag == 1) {
            checkRightAnswer ++
        }

        stepCount.text = "${step + 1} / $LEVEL_COUNT"

        if (step < LEVEL_COUNT) {
            step++
            setData(step)

        } else {
            val intent = Intent(this, FinalActivity::class.java)
            intent.putExtra("result", checkRightAnswer)
            startActivity(intent)
        }
    }

    private fun setData(index: Int) {

        var number = intent.getIntExtra("cardViewId",1)

        if(number == 1) {

            val dao = LevelDatabase.getInstance(this).LevelDao()
            val question = dao.getQuestionsByLevel(index)

            val imageResource = resources.getIdentifier(question.IqImage, "drawable", packageName)
            ivQuestion.setImageResource(imageResource)

            val variantResourceA = resources.getIdentifier(question.A, "drawable", packageName)
            variantA.setImageResource(variantResourceA)

            val variantResourceB = resources.getIdentifier(question.B, "drawable", packageName)
            variantB.setImageResource(variantResourceB)

            val variantResourseC = resources.getIdentifier(question.C, "drawable", packageName)
            variantC.setImageResource(variantResourseC)

            val variantResourceD = resources.getIdentifier(question.D, "drawable", packageName)
            variantD.setImageResource(variantResourceD)

            correctAnswer = question.A!!

            when (Random.nextInt(1, 4)) {
                1 -> {

                    variantA.tag = 1
                    variantB.tag = 0
                    variantC.tag = 0
                    variantD.tag = 0

                    variantA.setImageResource(variantResourceA)
                    variantB.setImageResource(variantResourceB)
                    variantC.setImageResource(variantResourseC)
                    variantD.setImageResource(variantResourceD)
                }
                2 -> {

                    variantD.tag = 1
                    variantA.tag = 0
                    variantB.tag = 0
                    variantC.tag = 0

                    variantA.setImageResource(variantResourceB)
                    variantB.setImageResource(variantResourseC)
                    variantC.setImageResource(variantResourceD)
                    variantD.setImageResource(variantResourceA)
                }
                3 -> {

                    variantB.tag = 1
                    variantA.tag = 0
                    variantC.tag = 0
                    variantD.tag = 0

                    variantA.setImageResource(variantResourceD)
                    variantB.setImageResource(variantResourceA)
                    variantC.setImageResource(variantResourceB)
                    variantD.setImageResource(variantResourseC)

                }
                else -> {

                    variantC.tag = 1
                    variantA.tag = 0
                    variantB.tag = 0
                    variantD.tag = 0

                    variantA.setImageResource(variantResourceD)
                    variantB.setImageResource(variantResourceB)
                    variantC.setImageResource(variantResourceA)
                    variantD.setImageResource(variantResourseC)

                }
            }
        }
    }
}
