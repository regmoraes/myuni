package com.myuni.sampleone.plano

import com.myuni.agenda.Evento
import com.myuni.localizacao.Localizacao
import org.joda.time.LocalDateTime

/**
 *   Copyright {2017} {Rômulo Eduardo G. Moraes}
 **/
class Aula(nome: String,
           dataInicio: LocalDateTime,
           dataFim: LocalDateTime,
           localizacao: Localizacao): Evento(nome,dataInicio, dataFim, localizacao)