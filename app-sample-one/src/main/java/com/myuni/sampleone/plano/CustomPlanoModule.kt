package com.myuni.sampleone.plano

import com.myuni.agenda.AgendaContract
import dagger.Module
import dagger.Provides


@Module
class CustomPlanoModule {

    @Provides
    fun providesPlanoRepository(): AgendaContract.Model {

        return PlanoRepository()
    }
}