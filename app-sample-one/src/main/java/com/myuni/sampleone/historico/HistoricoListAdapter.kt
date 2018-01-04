package com.myuni.sampleone.historico

import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.myuni.historico.Historico
import com.myuni.sampleone.R

class HistoricoListAdapter : RecyclerView.Adapter<HistoricoListViewHolder>(){

    var itensHistorico: List<Historico.Item> = emptyList()

    override fun onCreateViewHolder(viewGroup: ViewGroup?, viewType: Int): HistoricoListViewHolder {

        val view = LayoutInflater.from(viewGroup?.context).inflate(R.layout.historico_item, viewGroup, false)

        return HistoricoListViewHolder(view)
    }

    override fun onBindViewHolder(holderListItem: HistoricoListViewHolder?, position: Int) {

        holderListItem?.disciplina?.text = itensHistorico[position].disciplina
        holderListItem?.periodo?.text = itensHistorico[position].periodo
        holderListItem?.nota?.text = itensHistorico[position].nota.toString()
        holderListItem?.situacao?.text = itensHistorico[position].situacao

        if(itensHistorico[position].situacao == "Aprovado")
            holderListItem?.situacao?.setTextColor(Color.GREEN)
        else
            holderListItem?.situacao?.setTextColor(Color.RED)
    }

    override fun getItemCount(): Int = itensHistorico.size
}