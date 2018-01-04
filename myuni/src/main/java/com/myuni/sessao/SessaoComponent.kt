package com.myuni.sessao

import dagger.Subcomponent

/**
 *   Copyright {2017} {Rômulo Eduardo G. Moraes}
 **/
@Subcomponent(modules = [(SessaoModule::class)])
interface SessaoComponent {

    fun presenter(): SessaoContract.Presenter
}