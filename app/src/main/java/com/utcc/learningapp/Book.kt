package com.utcc.learningapp

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Book : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_book, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val headingNews: TextView = view.findViewById(R.id.heading)
        val mainNews: TextView = view.findViewById(R.id.news)
        val imageNews: ImageView = view.findViewById(R.id.image_heading)

        val bundle: Bundle? = arguments
        val heading = bundle!!.getString("heading")
        val imageId = bundle.getInt("imageId")
        val news = bundle.getString("news")

        headingNews.text = heading
        mainNews.text = news
        imageNews.setImageResource(imageId)
    }

}