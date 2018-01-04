package com.myuni.agenda

import dagger.Subcomponent

/**
 *   Copyright {2017} {Rômulo Eduardo G. Moraes}
 **/

// Interface que define o componente de agenda
// Note que ele precisa de um módulo que forneça as implementações
// das interfaces fornecidas e requeridas pelo componente
@dagger.Subcomponent(modules = [(AgendaModule::class)])
interface AgendaComponent {

    // Método que fornece a implementação do Presenter do componente de agenda
    fun presenter(): AgendaContract.Presenter
}