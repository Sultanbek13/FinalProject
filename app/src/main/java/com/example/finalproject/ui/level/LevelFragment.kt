package com.example.finalproject.ui.level

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.finalproject.R
import com.example.finalproject.ui.question.SecondActivity
import kotlinx.android.synthetic.main.fragment_select_level.*

class LevelFragment : Fragment(R.layout.fragment_select_level) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnKids.setOnClickListener{
            val intent = Intent(requireActivity(), SecondActivity::class.java)
            //todo cardViewlardin idlari jiberiw kk
            intent.putExtra("cardViewId", 1)
            startActivity(intent)
            requireActivity().finish()
        }

        btnTeenegers.setOnClickListener{
            val intent = Intent(requireActivity(), SecondActivity::class.java)
            //todo cardViewlardin idlari jiberiw kk
            intent.putExtra("cardViewId", 2)
            startActivity(intent)
            requireActivity().finish()
        }

        btnYouth.setOnClickListener{
            val intent = Intent(requireActivity(), SecondActivity::class.java)
            //todo cardViewlardin idlari jiberiw kk
            intent.putExtra("cardViewId", 3)
            startActivity(intent)
            requireActivity().finish()
        }

        btnOldMan.setOnClickListener{
            val intent = Intent(requireActivity(), SecondActivity::class.java)
            //todo cardViewlardin idlari jiberiw kk
            intent.putExtra("cardViewId", 4)
            startActivity(intent)
            requireActivity().finish()
        }

    }


}