package com.myuni.sampleone.sessao

import com.myuni.sampleone.sessao.LoginRestService.Companion.HTTP_STATUS_OK
import com.myuni.sessao.CredencialAcesso
import com.myuni.sessao.SessaoContract
import io.reactivex.Observable
import javax.inject.Inject

class LoginValidator @Inject
constructor(private val loginRestService : LoginRestService ): SessaoContract.Model {
    
    override fun validateCredenciais(credencialAcesso: CredencialAcesso): Observable<Boolean> {
        
        /*
            Envia as credenciais de acesso para um servidor que ir ́a validar os dados e retornará
            true ou false dependendo do estado da validação.
        */
        return loginRestService.login(credencialAcesso).map { response -> response == HTTP_STATUS_OK } }
}
