package com.example.gs_mobile


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class EdicaoDados : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edicao_dados)


        val botaoIrParaListagemDados = findViewById<Button>(R.id.button_register)


        botaoIrParaListagemDados.setOnClickListener {

            val intent = Intent(this, ListagemDados::class.java)
            startActivity(intent)
        }


    }
}