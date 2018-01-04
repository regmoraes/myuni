package com.myuni.sampleone.plano

import com.myuni.agenda.AgendaContract
import com.myuni.agenda.Evento
import io.reactivex.Observable
import org.joda.time.LocalDateTime

class PlanoRepository : AgendaContract.Model {

    override fun loadEventos(dataInicio: LocalDateTime, dataFim: LocalDateTime): Observable<List<Evento>> {

        return Observable.just(arrayListOf(Evento("Aula SO", LocalDateTime.now(), LocalDateTime.now(), null)))
    }
}