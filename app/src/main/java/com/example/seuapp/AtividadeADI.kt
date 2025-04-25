package com.example.seuapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AtividadeADI : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_atividade_adi)

        // Exemplo de exibição de mensagem
        Toast.makeText(this, "Bem-vindo à Atividade ADI!", Toast.LENGTH_SHORT).show()
    }
}