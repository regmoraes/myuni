package com.myuni.sampleone.sessao

import com.myuni.sessao.SessaoContract
import dagger.Module
import dagger.Provides


@Module
class CustomSessaoModule {

    @Provides
    fun providesRestService(): LoginRestService {

        return LoginRestService()
    }

    @Provides
    fun providesSessaoRepository(loginRestService: LoginRestService): SessaoContract.Model {

        return LoginValidator(loginRestService)
    }
}