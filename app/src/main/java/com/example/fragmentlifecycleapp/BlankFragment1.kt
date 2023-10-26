package com.example.fragmentlifecycleapp

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast


class BlankFragment1 : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)

        Toast.makeText(context,"OnAttach is called",Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(context,"OnCreate is called",Toast.LENGTH_SHORT).show()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Toast.makeText(context,"OnCreateView is called",Toast.LENGTH_SHORT).show()
        return inflater.inflate(R.layout.fragment_blank1, container, false)

    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(context,"OnStart is called",Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(context,"OnResume is called",Toast.LENGTH_SHORT).show()
    }


    override fun onPause() {
        super.onPause()
        Toast.makeText(context,"OnPause is called",Toast.LENGTH_SHORT).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Toast.makeText(context,"OnDestroyView is called",Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(context,"OnDestroy is called",Toast.LENGTH_SHORT).show()
    }

    override fun onDetach() {
        super.onDetach()
        Toast.makeText(context,"OnDetach is called",Toast.LENGTH_SHORT).show()
    }



}