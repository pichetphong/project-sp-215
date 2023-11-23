package com.utcc.learningapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction

class Setting : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_setting, container, false)

        val btnProfile = view.findViewById<Button>(R.id.btnProfile)
        val btnFeedback = view.findViewById<Button>(R.id.btnFeedback)
        val btnLogoutSetting = view.findViewById<Button>(R.id.btnLogoutSettingPage)

        btnProfile.setOnClickListener {
            val fragmentProfile = Profile()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frame_container, fragmentProfile)
            transaction.commit()
        }

        btnFeedback.setOnClickListener {
            val fragmentFeedback = Feedback()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frame_container, fragmentFeedback)
            transaction.commit()
        }

        btnLogoutSetting.setOnClickListener {
            val intent = Intent(requireActivity(), MainActivity::class.java)
            startActivity(intent)
        }
        return view
    }

}