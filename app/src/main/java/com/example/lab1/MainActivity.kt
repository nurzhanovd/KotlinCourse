package com.example.lab1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUI()
    }

    fun initUI() {

        addButton.setOnClickListener {
            result.text = ((getFirstValue() ?: 0) + (getSecondValue() ?: 0)).toString()
        }

        subButton.setOnClickListener {
            result.text = ((getFirstValue() ?: 0) - (getSecondValue() ?: 0)).toString()
        }

        mulButton.setOnClickListener {
            result.text = ((getFirstValue() ?: 0) * (getSecondValue() ?: 0)).toString()
        }

        divButton.setOnClickListener {
            result.text = ((getFirstValue() ?: 0) / (getSecondValue() ?: 0)).toString()
        }

        clear.setOnClickListener {
            first_number.text.clear()
            second_number.text.clear()
            result.text = ""
        }

    }

    private fun getFirstValue(): Int? = first_number.text.toString().toIntOrNull()


    private fun getSecondValue(): Int? = second_number.text.toString().toIntOrNull()

}
