package com.myuni.localizacao

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 *   Copyright {2017} {Rômulo Eduardo G. Moraes}
 **/
class LocalizacaoPresenter(private val model: LocalizacaoModel) {

    lateinit var view: LocalizacaoView

    fun loadLocalizacoes(pontoAtual: Localizacao) {

        model.loadLocalizacoes(pontoAtual)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { localizacoes ->

                    view.showPontosProximos(localizacoes)
                }
    }
}