package com.myuni.sessao

/**
 *   Copyright {2017} {Rômulo Eduardo G. Moraes}
 **/
interface SessaoComponentBuilder {

    fun buildSessaoComponent(model: SessaoContract.Model): SessaoContract.Presenter
}