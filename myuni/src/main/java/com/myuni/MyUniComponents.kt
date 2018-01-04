package com.myuni

import com.myuni.agenda.AgendaComponent
import com.myuni.agenda.AgendaModule
import com.myuni.historico.HistoricoComponent
import com.myuni.historico.HistoricoModule
import com.myuni.sessao.SessaoComponent
import com.myuni.sessao.SessaoModule
import dagger.Component
import javax.inject.Singleton

/**
 *   Copyright {2017} {Rômulo Eduardo G. Moraes}
 **/
@Component
@Singleton
interface MyUniComponents {

    fun buildHistoricoComponent(module: HistoricoModule): HistoricoComponent

    fun buildSessaoComponent(module: SessaoModule): SessaoComponent

    fun buildAgendaComponent(module: AgendaModule): AgendaComponent
}