package com.myuni.transporte

import com.myuni.sessao.SessaoContract
import com.myuni.sessao.SessaoPresenter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 *   Copyright {2017} {Rômulo Eduardo G. Moraes}
 **/
@Module
class TransporteModule(private val model: SessaoContract.Model) {

    @Provides
    fun providesModel(): SessaoContract.Model {

        return model
    }

    @Provides
    fun providesPresenter(model: SessaoContract.Model): SessaoContract.Presenter {

        return SessaoPresenter(model)
    }
}