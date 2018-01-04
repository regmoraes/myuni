package com.myuni.agenda

import com.myuni.localizacao.Localizacao
import org.joda.time.LocalDate
import org.joda.time.LocalDateTime

/**
 *   Copyright {2017} {Rômulo Eduardo G. Moraes}
 **/
open class Evento(var nome: String,
                  var dataInicio: LocalDateTime,
                  var dataFim: LocalDateTime,
                  var localizacao: Localizacao?)