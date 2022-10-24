package com.moaimar.pmdm.ut01.ex06.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.moaimar.pmdm.R
import com.moaimar.pmdm.ut01.ex06.domain.Cat

class Ut01Ex06Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ut01ex06)
        setupView()
    }

    private fun setupView(){
        val input_name = findViewById<EditText>(R.id.input_name)
        val input_surname = findViewById<EditText>(R.id.input_surname)
        val actionSave = findViewById<Button>(R.id.actionSave)

        actionSave.setOnClickListener {
            val cat= Cat(
                input_name.text.toString(),
                input_surname.text.toString()
            )
            Log.d("@dev","$cat")
       }

    }
}