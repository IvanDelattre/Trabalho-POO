package com.carlosribeiro.dao;

import com.carlosribeiro.model.Fatura;
import com.carlosribeiro.model.ItemFaturado;
import com.carlosribeiro.model.ListaDeObjetos;

public interface DAOFatura extends DAOGenerico<Fatura>{
    public ListaDeObjetos<ItemFaturado> getItensFaturados();

    public Fatura removerObj(Fatura f) ;


}
