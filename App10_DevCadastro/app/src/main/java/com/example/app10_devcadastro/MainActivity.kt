package com.example.app10_devcadastro

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    lateinit var usuarioAdapter: UsuarioAdapter
    lateinit var btnIncluir: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("Lista de Devs")

        val rv = findViewById<RecyclerView>(R.id.rvUsuarios)
        usuarioAdapter = UsuarioAdapter(lista, this)
        btnIncluir = findViewById(R.id.btnIncluir)

        rv.adapter = usuarioAdapter

        btnIncluir.setOnClickListener() {
            val intent = Intent(this, CadastroActivity::class.java)
            startActivity(intent)
        }
        rv.layoutManager = LinearLayoutManager(this)
    }
    companion object {
        val lista = mutableListOf<Dev>()
    }
    override fun onResume() {
        super.onResume()
        usuarioAdapter.notifyDataSetChanged()
    }
}