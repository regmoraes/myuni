package com.myuni.localizacao

import android.support.annotation.NonNull
import android.support.annotation.Nullable

/**
 *   Copyright {2017} {Rômulo Eduardo G. Moraes}
 **/
data class Localizacao(@Nullable var nome: String?,
                       @NonNull var latitude: Double,
                       @NonNull var longitude: Double)