package com.myuni.sampleone

import com.myuni.MyUni
import com.myuni.sampleone.historico.HistoricoActivity
import com.myuni.sampleone.sessao.LoginActivity

/**
 *   Copyright {2017} {Rômulo Eduardo G. Moraes}
 **/
class CustomApp : MyUni() {

    private lateinit var customComponents: CustomAppComponent

    override fun onCreate() {
        super.onCreate()

        customComponents = DaggerCustomAppComponent.builder().build()
    }

    fun inject(loginActivity: LoginActivity){

        customComponents.inject(loginActivity)
    }

    fun inject(historicoActivity: HistoricoActivity){

        customComponents.inject(historicoActivity)
    }
}