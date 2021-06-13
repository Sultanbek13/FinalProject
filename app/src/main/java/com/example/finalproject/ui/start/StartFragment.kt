package com.example.finalproject.ui.start

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.finalproject.R
import com.example.finalproject.ui.level.LevelFragment
import kotlinx.android.synthetic.main.fragment_start.*

class StartFragment : Fragment(R.layout.fragment_start) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnStartFirstActivity.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, LevelFragment())
                .addToBackStack(LevelFragment::class.simpleName).commit()
        }

        btnClose.setOnClickListener {
            this.requireActivity().finish()
        }
    }
}
