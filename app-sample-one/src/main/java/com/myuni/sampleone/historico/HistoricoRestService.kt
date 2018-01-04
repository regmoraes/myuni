package com.myuni.sampleone.historico

import com.myuni.historico.Historico
import io.reactivex.Observable

class HistoricoRestService {

    fun loadHistorico(): Observable<Historico> {


        val historicoItens: List<Historico.Item> =
                arrayListOf(
                        Historico.Item("Engenharia de Software", "2016.2", 8.5f, "Aprovado"),
                        Historico.Item("Engenharia de Software", "2016.1", 4.5f, "Reprovado"),
                        Historico.Item("Estruturas de Dados", "2016.1", 9.5f, "Aprovado"),
                        Historico.Item("Arquitetura de Sistemas", "2016.1", 9.0f, "Aprovado"))

        return Observable.just(Historico(7.2,"Ciência da Computação", "Inscrito", historicoItens))
    }

    fun loadCr(): Observable<Float> {

        return Observable.just(7.2f)
    }
}