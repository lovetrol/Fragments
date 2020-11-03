package com.example.myapplication.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.Comunicator
import com.example.myapplication.R
import kotlinx.android.synthetic.main.fragment_a.*
import kotlinx.android.synthetic.main.fragment_a.view.*


class FragmentA : Fragment() {

    private lateinit var comunicator: Comunicator

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val viewView = inflater.inflate(R.layout.fragment_a, container, false)

        comunicator = activity as Comunicator

        viewView.sendBtn.setOnClickListener(){
            comunicator.passDataCom(view?.messageInput?.text.toString())
        }

        return viewView

    }


}