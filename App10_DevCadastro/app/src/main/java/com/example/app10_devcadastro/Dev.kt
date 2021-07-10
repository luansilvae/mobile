package com.example.app10_devcadastro

import android.graphics.Bitmap

data class Dev(
    var foto: Bitmap?=null,
    var nome: String,
    var email: String,
    var especialidade: Especialidade,
    var nivel: Nivel,
    var empregado: Boolean
)