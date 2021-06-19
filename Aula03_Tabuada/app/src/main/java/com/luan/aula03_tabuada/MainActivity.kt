package com.luan.aula03_tabuada

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun CalcularTabuada(view: View) {
        var resultadoTabuada : String = ""
        var valor = findViewById(R.id.inputNumber) as EditText
        var i : Int =  valor.text.toString().toInt()
        var j : Int =  1

        while (j <= 10){
            resultadoTabuada += "${i} x ${j} = ${i * j} \n"
            j++
        }

        var tabuada = findViewById(R.id.tabuada) as TextView;
        tabuada.setText(resultadoTabuada);
    }
}