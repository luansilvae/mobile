package com.luan.app09_listatarefas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.rvTarefas)

        val lista = mutableListOf<Task>(
            Task(title="Tarefa 1", content="Concluir até sábado 10/07"),
            Task(title="Tarefa 2", content="Concluir até 12/07"),
            Task(title="Tarefa 3", content="Concluir até 15/07"),
            Task(title="Tarefa 4", content="Concluir até 18/07"),
            Task(title="Tarefa 5", content="Concluir até 20/07"),
            Task(title="Tarefa 6", content="Concluir até 01/08"),
        )

        rv.adapter = TarefaAdapter(lista)

        rv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
    }
}