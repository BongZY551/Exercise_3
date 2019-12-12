package com.example.exercise3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var total = 0

        button.setOnClickListener(){
            total = getPremium().roundToInt()
            textView6.text = total.toString()
        }
        button2.setOnClickListener(){
            radButton.clearCheck()
            spinnerAge.setSelection(0)
            textView6.setText("")
            checkBox.setChecked(false)
        }
    }
    fun getPremium():Double{
        return when(spinnerAge.selectedItemPosition){
            0 -> 60.00
            1 -> 70.00 +
                    (if(radioButton.isChecked) 50.00 else 0.00) + (if(checkBox.isChecked) 100.00 else 0.00)
            2 -> 90.00 +
                    (if(radioButton.isChecked) 100.00 else 0.00) + (if(checkBox.isChecked) 150.00 else 0.00)
            3 -> 120.00 +
                    (if(radioButton.isChecked) 150.00 else 0.00) + (if(checkBox.isChecked) 200.00 else 0.00)
            4 -> 150.00 +
                    (if(radioButton.isChecked) 200.00 else 0.00) + (if(checkBox.isChecked) 250.00 else 0.00)
            else -> 150.00 +
                    (if(radioButton.isChecked) 200.00 else 0.00) + (if(checkBox.isChecked) 300.00 else 0.00)
        }
    }
}



