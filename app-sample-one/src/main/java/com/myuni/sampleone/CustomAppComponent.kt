package com.myuni.sampleone

import com.myuni.sampleone.historico.CustomHistoricoModule
import com.myuni.sampleone.historico.HistoricoActivity
import com.myuni.sampleone.plano.CustomPlanoModule
import com.myuni.sampleone.plano.PlanoEstudosActivity
import com.myuni.sampleone.sessao.CustomSessaoModule
import com.myuni.sampleone.sessao.LoginActivity
import dagger.Component

/**
 *   Copyright {2017} {Rômulo Eduardo G. Moraes}
 **/
@Component(modules = [CustomHistoricoModule::class, CustomSessaoModule::class, CustomPlanoModule::class])
interface CustomAppComponent {

    fun inject(loginActivity: LoginActivity)

    fun inject(historicoActivity: HistoricoActivity)

    fun inject(planoEstudosActivity: PlanoEstudosActivity)
}