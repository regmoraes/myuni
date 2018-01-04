package com.myuni.agenda

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import org.joda.time.LocalDateTime

/**
 *   Copyright {2017} {Rômulo Eduardo G. Moraes}
 **/

// Ao instanciar o Presenter é necessário que o usuário forneça
// uma implementação da interface Model
class AgendaPresenter(private val model: AgendaContract.Model): AgendaContract.Presenter {

    // Referência a implementação da interface View criada pelo desenvolvedor
    lateinit var view: AgendaContract.View

    // Associa a implementação da View a esse Presenter
    override fun attachView(view: AgendaContract.View) {

        this.view = view
    }

    // Implementação do método de obter eventos da interface Presenter
    override fun loadEventos(dataInicio: LocalDateTime, dataFim: LocalDateTime) {

        // Carrega os eventos a partir do Model fornecido pelo desenvolvedor.
        // O código é executado de maneira assíncrona e em seguida os eventos
        // retornados são enviados para serem exibidos pela implementação da View fornecida
        model.loadEventos(dataInicio, dataFim)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe({ eventos -> view.showEventos(eventos) })
    }
}