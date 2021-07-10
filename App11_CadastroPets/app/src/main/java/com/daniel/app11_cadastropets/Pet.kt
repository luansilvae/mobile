package com.daniel.app11_cadastropets

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import java.util.*

data class Pet(
    var foto: Bitmap?=null,
    var nome: String,
    var cor: String,
    var especie: Especie,
    var sexo: Sexo,
    var vacinado: Boolean
)
