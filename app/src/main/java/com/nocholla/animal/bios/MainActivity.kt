package com.nocholla.animal.bios

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cheetah = cheetahId
        val lion = lionId

        cheetah.setOnClickListener(this)
        lion.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        when(v!!.id) {

            cheetahId.id -> {
                Log.d("String", "Hello")
                Toast.makeText(this, "Cheetah", Toast.LENGTH_LONG).show()
            }

            lionId.id -> {
                Toast.makeText(this, "Lion", Toast.LENGTH_LONG).show()
                Log.d("String", "Hello")
            }

        }
    }

}
