package com.myuni.localizacao

/**
 *   Copyright {2017} {Rômulo Eduardo G. Moraes}
 **/
interface LocalizacaoView {

    fun showPontosProximos(localizacoes: List<Localizacao>)

    fun navigate(localizacoes: List<Localizacao>)
}