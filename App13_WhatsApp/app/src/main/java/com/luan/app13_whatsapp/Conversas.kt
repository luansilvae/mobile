package com.luan.app13_whatsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.*

class Conversas : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_conversas, container, false)

        val rv = v.findViewById<RecyclerView>(R.id.rvUsuarios)

        val lista = mutableListOf<Usuario>(
            Usuario(nome = "Luan", conversa = "Luan: Bom noite"),
            Usuario(nome="Daniel", conversa = "Daniel: HAHAHA"),
            Usuario(nome = "Guilherme", conversa = "Guilherme: Boa noite !")
            )
        rv.adapter = UsuarioAdapter(lista)

        rv.layoutManager = LinearLayoutManager(context)

        return v
    }

}