package com.myuni.historico

/**
 *   Copyright {2017} {Rômulo Eduardo G. Moraes}
 **/
interface HistoricoComponentBuilder {

    fun buildHistoricoComponent(model: HistoricoContract.Model): HistoricoContract.Presenter
}