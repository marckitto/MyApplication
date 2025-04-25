package com.example.seuapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FormularioViewModel : ViewModel() {

    private val _formStatus = MutableLiveData<String>()
    val formStatus: LiveData<String> get() = _formStatus

    fun submitForm(data: TrapDataModel) {
        // Lógica para processar os dados do formulário
        _formStatus.value = "Formulário enviado com sucesso!"
    }
}