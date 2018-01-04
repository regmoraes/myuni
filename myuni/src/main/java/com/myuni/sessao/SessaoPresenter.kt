package com.myuni.sessao

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 *   Copyright {2017} {Rômulo Eduardo G. Moraes}
 **/
class SessaoPresenter(private val model: SessaoContract.Model): SessaoContract.Presenter {

    lateinit var view: SessaoContract.View

    override fun attachView(view: SessaoContract.View) {

        this.view = view
    }

    override fun login(credencialAcesso: CredencialAcesso) {

        model.validateCredenciais(credencialAcesso)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe { credenciaisValidas ->

                    if(credenciaisValidas)
                        view.acessoGranted()
                    else
                        view.acessoBlocked()
                }
    }
}