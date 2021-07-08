package com.luan.app09_listatarefas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TarefaAdapter(var listaTarefa: MutableList<Task>):RecyclerView.Adapter<TarefaAdapter.ItemViewHolder>() {

    class ItemViewHolder(view: View): RecyclerView.ViewHolder(view){
        val txtTitle: TextView = view.findViewById(R.id.txtTitle)
        val txtContent: TextView = view.findViewById(R.id.txtContent)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_tarefa, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.txtTitle.text = listaTarefa[position].title
        holder.txtContent.text = listaTarefa[position].content
    }

    override fun getItemCount(): Int {
        return listaTarefa.size
    }
}