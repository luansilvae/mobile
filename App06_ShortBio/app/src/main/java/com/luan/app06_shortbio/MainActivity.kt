package com.luan.app06_shortbio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    private lateinit var btnSobre: Button
    private lateinit var btnFormacao: Button
    private lateinit var btnExperiencia: Button
    private lateinit var btnObjetivo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSobre = findViewById(R.id.btnSobre)
        btnFormacao = findViewById(R.id.btnFormacao)
        btnExperiencia = findViewById(R.id.btnExperiencia)
        btnObjetivo = findViewById(R.id.btnObjetivo)

        btnSobre.setOnClickListener() {
            val sobreIntent = Intent(this@MainActivity, SobreActivity::class.java)

            startActivity(sobreIntent)
        }

        btnFormacao.setOnClickListener() {
            val formacaoIntent = Intent(this@MainActivity, FormacaoActivity::class.java)

            startActivity(formacaoIntent)
        }

        btnExperiencia.setOnClickListener() {
            val experienciaIntent = Intent(this@MainActivity, ExperienciaActivity::class.java)

            startActivity(experienciaIntent)
        }

        btnObjetivo.setOnClickListener() {
            val objetivoIntent = Intent(this@MainActivity, ObjetivoActivity::class.java)

            startActivity(objetivoIntent)
        }


    }
}