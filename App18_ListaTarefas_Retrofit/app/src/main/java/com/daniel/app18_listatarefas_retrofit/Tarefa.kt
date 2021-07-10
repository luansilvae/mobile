package com.daniel.app18_listatarefas_retrofit

import com.google.gson.annotations.SerializedName

data class Tarefa (
    @SerializedName("id") var id: Int = 0,
    @SerializedName("nome") val nome: String
)