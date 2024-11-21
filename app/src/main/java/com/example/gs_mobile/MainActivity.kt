package com.example.gs_mobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val botaoIrParaListagemDados = findViewById<Button>(R.id.button)


        botaoIrParaListagemDados.setOnClickListener {

            val intent = Intent(this, ListagemDados::class.java)
            startActivity(intent)
        }


        val botaoIrParaListagemDados2 = findViewById<Button>(R.id.button2)


        botaoIrParaListagemDados2.setOnClickListener {

            val intent = Intent(this, ListagemDados::class.java)
            startActivity(intent)
        }
    }
}
