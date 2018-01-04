package com.myuni.historico

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 *   Copyright {2017} {Rômulo Eduardo G. Moraes}
 **/
class HistoricoPresenter(private val model: HistoricoContract.Model): HistoricoContract.Presenter {

    lateinit var view: HistoricoContract.View

    override fun attachView(view: HistoricoContract.View) {

        this.view = view
    }

    override fun loadHistorico() {

        model.loadHistorico()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe { historico -> view.showHistorico(historico) }
    }

    override fun loadCr() {

        model.loadCr()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe { cr -> view.showCr(cr) }
    }
}