package com.example.finalproject.ui.level

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.finalproject.R
import com.example.finalproject.ui.question.QuestionActivity
import kotlinx.android.synthetic.main.fragment_select_level.*

class LevelFragment : Fragment(R.layout.fragment_select_level) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnKids.setOnClickListener{
            val intent = Intent(requireActivity(), QuestionActivity::class.java)
            intent.putExtra("cardViewId", 1)
            startActivity(intent)
        }

        btnTeenegers.setOnClickListener{
            val intent = Intent(requireActivity(), QuestionActivity::class.java)
            intent.putExtra("cardViewId", 2)
            val toast = Toast.makeText(requireContext(),"Upps! This category is not filled",Toast.LENGTH_SHORT)
            toast.show()
        }

        btnYouth.setOnClickListener{
            val intent = Intent(requireActivity(), QuestionActivity::class.java)
            intent.putExtra("cardViewId", 3)
            val toast = Toast.makeText(requireContext(),"Upps! This category is not filled",Toast.LENGTH_SHORT)
            toast.show()
        }

        btnOldMan.setOnClickListener {
            val intent = Intent(requireActivity(), QuestionActivity::class.java)
            intent.putExtra("cardViewId", 4)
            val toast = Toast.makeText(requireContext(),"Upps! This category is not filled",Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}