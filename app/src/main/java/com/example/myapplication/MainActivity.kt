package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.Fragments.FragmentA
import com.example.myapplication.Fragments.FragmentB

class MainActivity : AppCompatActivity(), Comunicator  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentA = FragmentA()

        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragmentA).commit()

    }

    override fun passDataCom(editTextInput: String) {

        val bundle = Bundle()

        bundle.putString("message",  editTextInput)
        
        val transaction = this.supportFragmentManager.beginTransaction()
        val fragmentB = FragmentB()

        fragmentB.arguments = bundle

        transaction.replace(R.id.fragment_container, fragmentB)
        transaction.commit()

    }
}