package com.example.gs_mobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ListagemDados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listagem_dados)

        val botaoIrParaInsercaoDados = findViewById<Button>(R.id.button4)


        botaoIrParaInsercaoDados.setOnClickListener {

            val intent = Intent(this, InsercaoDados::class.java)
            startActivity(intent)
        }

        val botaoIrParaEdicaoDados = findViewById<Button>(R.id.button5)


        botaoIrParaEdicaoDados.setOnClickListener {

            val intent = Intent(this, EdicaoDados::class.java)
            startActivity(intent)
        }


        val botaoIrParaExclusaoDados = findViewById<Button>(R.id.button6)


        botaoIrParaExclusaoDados.setOnClickListener {

            val intent = Intent(this, ExclusaoDados::class.java)
            startActivity(intent)
        }
    }
}