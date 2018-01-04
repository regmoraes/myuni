package com.myuni.perfil

import com.myuni.localizacao.Localizacao
import org.joda.time.DateTime

/**
 *   Copyright {2017} {Rômulo Eduardo G. Moraes}
 **/
open class Perfil(var nome: String,
                  var dataInicio: DateTime,
                  var dataFim: DateTime,
                  var localizacao: Localizacao)