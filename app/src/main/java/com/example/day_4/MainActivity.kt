package com.example.day_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val seekbar = findViewById<SeekBar>(R.id.seekBar)
        val tv = findViewById<TextView>(R.id.tv)
        var start = 0
        var end = 0
        seekbar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {

                if(p1 in 40..45)
                tv.text = p1.toString()
                else
                    tv.text = ""
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                start = seekbar.progress
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                end = seekbar.progress
                Toast.makeText(this@MainActivity,"Changes made is ${end - start}",Toast.LENGTH_SHORT).show()

            }

        })


    }
}