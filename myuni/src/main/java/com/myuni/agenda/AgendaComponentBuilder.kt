package com.myuni.agenda

/**
 *   Copyright {2017} {Rômulo Eduardo G. Moraes}
 **/

// Interface contendo o método que cria e retorna o componente de agenda.
interface AgendaComponentBuilder {

    fun buildAgendaComponent(model: AgendaContract.Model): AgendaContract.Presenter
}