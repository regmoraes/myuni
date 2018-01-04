package com.myuni.sampleone.historico

import com.myuni.historico.HistoricoContract
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class CustomHistoricoModule {

    @Provides
    fun providesRestService(): HistoricoRestService {

        return HistoricoRestService()
    }

    @Provides
    fun providesHistoricoModel(historicoRestService: HistoricoRestService): HistoricoContract.Model {

        return HistoricoRepository(historicoRestService)
    }
}