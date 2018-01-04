package com.myuni.sampleone.historico

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.myuni.sampleone.R

class HistoricoListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    val disciplina: TextView = itemView.findViewById<TextView>(R.id.textView_disciplina)
    val periodo: TextView = itemView.findViewById<TextView>(R.id.textView_periodo)
    val nota: TextView = itemView.findViewById<TextView>(R.id.textView_nota)
    val situacao: TextView = itemView.findViewById<TextView>(R.id.textView_situacao)
}