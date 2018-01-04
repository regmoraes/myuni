package com.myuni.historico

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 *   Copyright {2017} {Rômulo Eduardo G. Moraes}
 **/
@Module
class HistoricoModule(private val model: HistoricoContract.Model) {

    @Provides
    fun providesModel(): HistoricoContract.Model {

        return model
    }

    @Provides
    fun providesPresenter(model: HistoricoContract.Model): HistoricoContract.Presenter {

        return HistoricoPresenter(model)
    }
}