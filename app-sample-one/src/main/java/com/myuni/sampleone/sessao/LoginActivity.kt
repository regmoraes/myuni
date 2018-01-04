package com.myuni.sampleone.sessao

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import com.myuni.sampleone.CustomApp
import com.myuni.sampleone.R
import com.myuni.sampleone.historico.HistoricoActivity
import com.myuni.sessao.CredencialAcesso
import com.myuni.sessao.SessaoContract
import javax.inject.Inject

class LoginActivity : AppCompatActivity(), SessaoContract.View {

    //Inicialização do layout
    private val cpf by lazy { findViewById<EditText>(R.id.editText_cpf) }
    private val senha by lazy { findViewById<EditText>(R.id.editText_senha) }
    private val entrar by lazy { findViewById<Button>(R.id.button_entrar) }

    //Variável que receberá a implementação do Presenter do componente de sessão.
    private lateinit var sessaoPresenter: SessaoContract.Presenter

    //Variável que receberá a implementação da interface Model.
    @Inject lateinit var sessaoModel: SessaoContract.Model

    override fun onCreate(savedInstanceState: Bundle?) {

        //Injeta a implementação da interface Model na variável sessaoModel.
        (application as CustomApp).inject(this)

        //Inicialização do componente de sessão via classe CustomApp.
        sessaoPresenter = (application as CustomApp).buildSessaoComponent(sessaoModel)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sessao)

        // Associa a View ao componente de sessão
        sessaoPresenter.attachView(this)
    }

    override fun onResume(){
        super.onResume()

        // Atribui um listener que irá chamar o método de login do componente de sessão.
        entrar.setOnClickListener {

            val credencialAcesso = CredencialAcesso( cpf.text.toString(), senha.text.toString())

            sessaoPresenter.login(credencialAcesso)
        }
    }

    override fun acessoGranted() {

        //Redireciona o usuário para a tela de histórico.
        startActivity(Intent(this, HistoricoActivity::class.java))
    }


    override fun acessoBlocked() {

        //Exibe um alerta informando que houve erro ao realizar login.
        AlertDialog.Builder(this)
                .setTitle("Atenção")
                .setMessage("Usuário ou senha incorretos.")
                .setPositiveButton("Ok", null)
                .show()
    }
}
