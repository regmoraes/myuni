package com.myuni.sessao

import com.myuni.commons.BasePresenter
import io.reactivex.Observable

/**
 *   Copyright {2017} {Rômulo Eduardo G. Moraes}
 **/
interface SessaoContract {

    interface View {

        fun acessoGranted()

        fun acessoBlocked()
    }

    interface Presenter: BasePresenter<View> {

        fun login(credencialAcesso: CredencialAcesso)
    }

    interface Model {

        fun validateCredenciais(credencialAcesso: CredencialAcesso): Observable<Boolean>
    }
}