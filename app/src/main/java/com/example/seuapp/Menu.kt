package com.example.seuapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        // Exemplo de como exibir uma mensagem ao abrir o menu
        Toast.makeText(this, "Bem-vindo ao menu!", Toast.LENGTH_SHORT).show()
    }
}