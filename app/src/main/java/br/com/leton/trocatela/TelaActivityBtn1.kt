package br.com.leton.trocatela

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TelaActivityBtn1 : AppCompatActivity() {

    private lateinit var btnVoltar: Button
    private lateinit var btnTela2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_btn1)

        btnVoltar = findViewById(R.id.btn_pagina_inicial)
        btnTela2 = findViewById(R.id.btn_activy2)

        btnVoltar.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

        btnTela2.setOnClickListener {
            val i = Intent(this, TelaActivityBtn2::class.java)
            startActivity(i)
        }

    }


}