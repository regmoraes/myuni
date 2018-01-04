package com.myuni.sampleone.sessao

import com.myuni.sessao.CredencialAcesso
import io.reactivex.Observable

class LoginRestService {

    companion object {

        val HTTP_STATUS_OK = 200
        val HTTP_STATUS_FORBIDDEN = 401
    }

    fun login(credencialAcesso: CredencialAcesso): Observable<Int> {

        return if(credencialAcesso.login == "123456" && credencialAcesso.senha == "123456")
            Observable.just(HTTP_STATUS_OK)
        else
            Observable.just(HTTP_STATUS_FORBIDDEN)
    }
}