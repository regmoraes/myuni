package com.myuni.sampleone.historico

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.widget.TextView
import com.myuni.historico.Historico
import com.myuni.historico.HistoricoContract
import com.myuni.sampleone.CustomApp
import com.myuni.sampleone.R
import javax.inject.Inject

class HistoricoActivity : AppCompatActivity(), HistoricoContract.View {

    // Inicialização do layout
    private val toolbar by lazy { findViewById<Toolbar>(R.id.toolbar) }
    private val historicoList by lazy { findViewById<RecyclerView>(R.id.recyclerView_historico) }
    private val historicoListAdapter by lazy { HistoricoListAdapter() }
    private val cr by lazy { findViewById<TextView>(R.id.textView_cr ) }

    //Varíavel que recebeŕa a implementação da interface Presenter do componente de hist́orico.
    private lateinit var historicoPresenter : HistoricoContract.Presenter

    @Inject lateinit var historicoModel : HistoricoContract.Model

    override fun onCreate(savedInstanceState: Bundle?) {

        /*
            Injeta a implementa ̧c~ao da interface Model na vari ́avel historicoModel.
            Esse m ́etodo  ́e espec ́ıfico da aplica ̧c~ao, que  ́e representada pela classe CustomApp, que  ́e uma subclasse da classe MyUni.
        */
        (application as CustomApp). inject(this)

        /*
            Inicialização do componente de hist ́orico via classe CustomApp.
            Note que para criar o componente,  ́e necess ́ario fornecer uma implementação
            da interface Model, que nesse caso,  ́e o objeto historicoModel.
        */
        historicoPresenter = (application as CustomApp).buildHistoricoComponent(historicoModel)


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historico)

        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val itemDecoration: RecyclerView.ItemDecoration = DividerItemDecoration(this, layoutManager.orientation)

        historicoList.layoutManager = layoutManager
        historicoList.addItemDecoration(itemDecoration)
        historicoList.adapter = historicoListAdapter

        // Associa a View ao componente de hist́orico e solicita o carregamento do hist́orico e do CR.
        historicoPresenter.attachView(this)
        historicoPresenter.loadHistorico()
        historicoPresenter.loadCr()
    }

    override fun showHistorico(historico: Historico) {

        /*
            Atribui os itens de hist́orico ao ListAdapter que exibir ́a o hist́orico e notifica a Activity para realizar um refresh na lista.
        */
        historicoListAdapter.itensHistorico = historico.items
        historicoListAdapter.notifyDataSetChanged()
    }

    override fun showCr(cr: Float) {

        this.cr.text = cr.toString()
    }
}