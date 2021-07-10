package com.example.app17_listarusuarios

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters

@Database(entities = arrayOf(Usuario::class), version = 1)
@TypeConverters(Converter::class)
abstract class AppDatabase:RoomDatabase() {
    abstract fun usuarioDao():UsuarioDAO
}