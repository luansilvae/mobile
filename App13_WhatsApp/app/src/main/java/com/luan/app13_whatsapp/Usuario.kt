package com.luan.app13_whatsapp

import android.graphics.drawable.Drawable

data class Usuario(
    var foto: Drawable?=null,
    var nome: String,
    var conversa: String,
)