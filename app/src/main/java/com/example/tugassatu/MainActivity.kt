package com.example.tugassatu

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNama = findViewById<EditText>(R.id.etNama)
        val etNamaKedua = findViewById<EditText>(R.id.etNamaKedua)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val txtOverImage1 = findViewById<TextView>(R.id.txtOverImage1)
        val txtOverImage2 = findViewById<TextView>(R.id.txtOverImage2)

        btnSubmit.setOnClickListener {
            val nama1 = etNama.text.toString().trim()
            val nama2 = etNamaKedua.text.toString().trim()

            if (nama1.isNotEmpty() && nama2.isNotEmpty()) {
                val randomValue1 = Random.nextInt(0, 101)
                val randomValue2 = Random.nextInt(0, 101)

                txtOverImage1.text = getString(R.string.percentage_format, randomValue1)
                txtOverImage2.text = getString(R.string.percentage_format, randomValue2)

                txtOverImage1.visibility = View.VISIBLE
                txtOverImage2.visibility = View.VISIBLE
            }else {
                txtOverImage1.visibility = View.INVISIBLE
                txtOverImage2.visibility = View.INVISIBLE
            }
        }
    }
}