package com.myuni

import android.app.Application
import com.myuni.agenda.AgendaComponentBuilder
import com.myuni.agenda.AgendaContract
import com.myuni.agenda.AgendaModule
import com.myuni.historico.HistoricoComponentBuilder
import com.myuni.historico.HistoricoContract
import com.myuni.historico.HistoricoModule
import com.myuni.sessao.SessaoComponentBuilder
import com.myuni.sessao.SessaoContract
import com.myuni.sessao.SessaoModule

/**
 *   Copyright {2017} {Rômulo Eduardo G. Moraes}
 **/

// Middleware responsável por fornecer os métodos para a utilização dos componentes do MyUni
// Para cada componente fornecido, o middleware deve implementar
// a interface Builder
open class MyUni : Application(), HistoricoComponentBuilder, SessaoComponentBuilder, AgendaComponentBuilder {

    lateinit var componentsBuilder: MyUniComponents

    // Cria um componente Dagger responsável por fornecer todos os outros componentes
    override fun onCreate() {
        super.onCreate()

        componentsBuilder = DaggerMyUniComponents.builder().build()
    }

    // Cria um componente de histórico e retorna sua interface Presenter.
    // Ao executar esse método é necessário que o desenvolvedor forneça
    // uma implementação da interface Model para o componente
    override fun buildHistoricoComponent(model: HistoricoContract.Model): HistoricoContract.Presenter {

        return componentsBuilder.buildHistoricoComponent(HistoricoModule(model)).presenter()
    }

    // Cria um componente Dagger responsável por fornecer todos os outros componentes
    override fun buildSessaoComponent(model: SessaoContract.Model): SessaoContract.Presenter {

        return componentsBuilder.buildSessaoComponent(SessaoModule(model)).presenter()
    }

    // Cria um componente Dagger responsável por fornecer todos os outros componentes
    override fun buildAgendaComponent(model: AgendaContract.Model): AgendaContract.Presenter {

        return componentsBuilder.buildAgendaComponent(AgendaModule(model)).presenter()
    }

    /*... */
}