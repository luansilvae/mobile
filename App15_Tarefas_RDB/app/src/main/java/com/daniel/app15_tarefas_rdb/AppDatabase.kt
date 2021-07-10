package com.daniel.app15_tarefas_rdb

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Tarefa::class), version = 1)
abstract class AppDatabase:RoomDatabase() {
    abstract fun tarefaDao():TarefaDAO
}