package com.myuni.commons

/**
 *   Copyright {2017} {Rômulo Eduardo G. Moraes}
 **/
interface BasePresenter<in T> {

    fun attachView(view: T)
}