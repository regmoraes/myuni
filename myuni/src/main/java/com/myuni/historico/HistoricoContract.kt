package com.myuni.historico

import com.myuni.commons.BasePresenter
import com.myuni.commons.BaseView
import io.reactivex.Observable

/**
 *   Copyright {2017} {Rômulo Eduardo G. Moraes}
 **/
interface HistoricoContract {

    interface View {

        fun showHistorico(historico: Historico)

        fun showCr(cr: Float)
    }

    interface Presenter: BasePresenter<View> {

        fun loadHistorico()

        fun loadCr()
    }

    interface Model {

        fun loadHistorico(): Observable<Historico>

        fun loadCr(): Observable<Float>
    }
}