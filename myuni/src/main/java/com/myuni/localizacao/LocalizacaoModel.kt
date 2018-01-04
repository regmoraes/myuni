package com.myuni.localizacao

import io.reactivex.Observable

/**
 *   Copyright {2017} {Rômulo Eduardo G. Moraes}
 **/
interface LocalizacaoModel {

    fun loadLocalizacoes(pontoAtual: Localizacao): Observable<List<Localizacao>>
}