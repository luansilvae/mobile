package com.daniel.app11_cadastropets

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.*

class CadastroActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    lateinit var especie: Especie
    lateinit var sexo: Sexo
    lateinit var spnSexo: Spinner
    lateinit var edtNome: EditText
    lateinit var edtCor: EditText
    lateinit var btnSalvar: Button
    lateinit var imvFoto: ImageView
    var fotoTirada: Bitmap?=null
    lateinit var swtVacinado: Switch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        edtNome = findViewById(R.id.edtNome)
        edtCor = findViewById(R.id.edtCor)
        spnSexo = findViewById(R.id.spnSexo)
        btnSalvar = findViewById(R.id.btnSalvar)
        imvFoto = findViewById(R.id.imvFoto)
        swtVacinado = findViewById(R.id.swtVacinado)

        imvFoto.setOnClickListener(){
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            if (intent.resolveActivity(packageManager) != null)
                startActivityForResult(intent, RC_CAMERA)
        }

        ArrayAdapter.createFromResource(this, R.array.opcoes_spinner, android.R.layout.simple_spinner_item).also { arrayAdapter ->
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spnSexo.adapter = arrayAdapter
        }

        spnSexo.onItemSelectedListener = this

        btnSalvar.setOnClickListener(){
            val pet = Pet(fotoTirada, edtNome.text.toString(), edtCor.text.toString(), especie, sexo, swtVacinado.isChecked)
            MainActivity.lista.add(pet)
            finish()
        }
    }

    fun OnEspecieClick(view: View){
        if (view is RadioButton){
            var checked = view.isChecked

            when (view.id){
                R.id.rdbCachorro -> { if (checked) {especie = Especie.CACHORRO}}
                R.id.rdbGato -> { if (checked) {especie = Especie.GATO}}
                R.id.rdbMacaco -> { if (checked) {especie = Especie.MACACO}}
            }
        }
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        when (p2){
            0 -> {sexo = Sexo.MACHO}
            1 -> {sexo = Sexo.FEMEA}
        }
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        TODO("Not yet implemented")
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if ((resultCode == RESULT_OK) && (requestCode == RC_CAMERA)){
            fotoTirada = data?.extras?.get("data") as Bitmap
            imvFoto.setImageBitmap(fotoTirada)
        }
    }

    companion object{
        const val RC_CAMERA  = 12345
        const val RC_GALERIA = 67890
    }
}