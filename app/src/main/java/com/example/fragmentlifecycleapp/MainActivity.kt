package com.example.fragmentlifecycleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnFrag1 : Button = findViewById(R.id.frame1btn)
        val btnFrag2 : Button = findViewById(R.id.frame2btn)




        btnFrag1.setOnClickListener(){
            val frag1 : Fragment = BlankFragment1()


            val fragTransaction : FragmentTransaction =
                supportFragmentManager.beginTransaction()
            fragTransaction.replace(R.id.frame1,frag1).commit()

        }

        btnFrag2.setOnClickListener(){
            val frag2 : Fragment = BlankFragment2()
            val fragmentTransaction : FragmentTransaction =
                supportFragmentManager.beginTransaction()

            fragmentTransaction.replace(R.id.frame1,frag2).commit()
        }


    }
}