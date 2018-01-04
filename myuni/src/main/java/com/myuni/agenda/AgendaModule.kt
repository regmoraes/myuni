package com.myuni.agenda

import dagger.Module
import dagger.Provides

/**
 *   Copyright {2017} {Rômulo Eduardo G. Moraes}
 **/

// Módulo contendo métodos que fornecem as implementações necessárias
// para o correto funcionamento do componente de agenda.
@Module
class AgendaModule(private val model: AgendaContract.Model) {

    // Fornece uma implementação do Model.
    // Essa implementação deve ser fornecida pelo desenvolvedor durante a criação desse módulo.
    @Provides
    fun providesModel(): AgendaContract.Model {

        return model
    }

    // Fornece uma implementação do Presenter.
    // Essa implementação é fornecida pelo próprio framework.
    @Provides
    fun providesPresenter(model: AgendaContract.Model): AgendaContract.Presenter {

        return AgendaPresenter(model)
    }
}