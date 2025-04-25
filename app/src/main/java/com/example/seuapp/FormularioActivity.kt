package com.example.seuapp

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.seuapp.R.id.blockEditText

class FormularioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        // Configuração da Toolbar
        val backButton: ImageView = findViewById(R.id.backButton)
        backButton.setOnClickListener { finish() }

        // Configuração dos Spinners
        val visitStatusSpinner: Spinner = findViewById(R.id.visitStatusSpinner)
        val maintenanceSpinner: Spinner = findViewById(R.id.maintenanceSpinner)
        val larvaSpinner: Spinner = findViewById(R.id.larvaSpinner)
        val sampleSpinner: Spinner = findViewById(R.id.sampleSpinner)
        val propertyTypeSpinner: Spinner = findViewById(R.id.propertyTypeSpinner)

        setupSpinner(visitStatusSpinner, arrayOf("Trabalhado", "Não Trabalhado", "Em Progresso"))
        setupSpinner(maintenanceSpinner, arrayOf("Selecionar", "Sim", "Não"))
        setupSpinner(larvaSpinner, arrayOf("Selecionar", "Sim", "Não"))
        setupSpinner(sampleSpinner, arrayOf("Selecionar", "Sim", "Não"))
        setupSpinner(propertyTypeSpinner, arrayOf("Residencial", "Comercial", "Industrial", "Outro"))

        // Configuração dos campos de texto
        val blockEditText: EditText = findViewById(blockEditText)
        val cepEditText: EditText = findViewById(R.id.cepEditText)
        val streetEditText: EditText = findViewById(R.id.streetEditText)
        val houseNumberEditText: EditText = findViewById(R.id.houseNumberEditText)
        val establishmentEditText: EditText = findViewById(R.id.establishmentEditText)
        val complementEditText: EditText = findViewById(R.id.complementEditText)
        val sequentialEditText: EditText = findViewById(R.id.sequentialEditText)

        // Configuração do botão "Avançar"
        val submitButton: Button = findViewById(R.id.submitButton)
        submitButton.setOnClickListener {
            if (!validateField(blockEditText, "Por favor, insira o bloco") ||
                !validateField(cepEditText, "Por favor, insira o CEP") ||
                !validateField(streetEditText, "Por favor, insira a rua") ||
                !validateField(houseNumberEditText, "Por favor, insira o número da casa") ||
                !validateField(establishmentEditText, "Por favor, insira o estabelecimento") ||
                !validateField(complementEditText, "Por favor, insira o complemento") ||
                !validateField(sequentialEditText, "Por favor, insira o número sequencial")
            ) {
                return@setOnClickListener
            }

            showToast("Dados enviados com sucesso!")
        }
    }

    private fun setupSpinner(spinner: Spinner, options: Array<String>) {
        spinner.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            options
        )
    }

    private fun validateField(field: EditText, errorMessage: String): Boolean {
        if (field.text.toString().isEmpty()) {
            field.error = errorMessage
            return false
        }
        return true
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}