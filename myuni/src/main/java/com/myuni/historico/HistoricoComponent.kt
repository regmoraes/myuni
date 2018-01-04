package com.myuni.historico

import dagger.Subcomponent

/**
 *   Copyright {2017} {Rômulo Eduardo G. Moraes}
 **/
@Subcomponent(modules = [(HistoricoModule::class)])
interface HistoricoComponent {

    fun presenter(): HistoricoContract.Presenter
}