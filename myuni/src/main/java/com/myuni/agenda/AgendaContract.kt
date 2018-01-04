package com.myuni.agenda

import com.myuni.commons.BasePresenter
import com.myuni.commons.BaseView
import io.reactivex.Observable
import org.joda.time.LocalDateTime

/**
 *   Copyright {2017} {Rômulo Eduardo G. Moraes}
 **/
interface AgendaContract {

    interface View: BaseView {

        fun showEventos(eventos: List<Evento>)
    }

    interface Presenter: BasePresenter<View> {

        fun loadEventos(dataInicio: LocalDateTime, dataFim: LocalDateTime)
    }

    interface Model {

        fun loadEventos(dataInicio: LocalDateTime, dataFim: LocalDateTime): Observable<List<Evento>>

    }
}