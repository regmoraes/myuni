package com.myuni.sampleone.historico

import com.myuni.historico.Historico
import com.myuni.historico.HistoricoContract
import io.reactivex.Observable
import javax.inject.Inject

class HistoricoRepository @Inject
constructor(private val restService: HistoricoRestService) : HistoricoContract.Model {

    override fun loadHistorico(): Observable<Historico> {

        return restService.loadHistorico()
    }

    override fun loadCr(): Observable<Float> {

        return restService.loadCr()
    }
}