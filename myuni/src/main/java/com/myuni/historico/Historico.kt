package com.myuni.historico

/**
 *   Copyright {2017} {Rômulo Eduardo G. Moraes}
 **/
data class Historico(var cr: Double,
                     var curso: String,
                     var situacao: String,
                     var items: List<Item>){

    data class Item(var disciplina: String,
                    var periodo: String,
                    var nota: Float,
                    var situacao: String)
}