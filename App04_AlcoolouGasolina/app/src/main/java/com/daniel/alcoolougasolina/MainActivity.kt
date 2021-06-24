package com.daniel.alcoolougasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun CalcularAlcool(view: View) {
        var resultadoCalculo : String = ""
        var valorAlcool = findViewById(R.id.Alcool) as EditText
        var valorGas = findViewById(R.id.Gasolina) as EditText
        var resultado = findViewById(R.id.resultado) as TextView;
       try {


        var a : Float =  valorAlcool.text.toString().toFloat()
        var g : Float =  valorGas.text.toString().toFloat()
        var r : Float = (a/g)

        if (r > 0.7){
            resultadoCalculo = "Utilize Gasolina!"
        }   else{
            resultadoCalculo = "Utilize Alcool!"
        }

        resultado.setText(resultadoCalculo);
       }
       catch (e: Exception){

           resultado.setText("Sem dados ")

       }
    }
}