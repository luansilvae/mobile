package com.luan.app16_listacompras

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Compra::class), version = 1)
abstract class AppDatabase:RoomDatabase() {
    abstract fun compraDao():CompraDAO
}