package com.carlosribeiro.dao.impl;

import com.carlosribeiro.dao.DAOFatura;
import com.carlosribeiro.model.Fatura;
import com.carlosribeiro.model.ItemFaturado;
import com.carlosribeiro.model.ListaDeObjetos;

import java.util.Map;

public class DAOFaturaImpl extends DAOGenericoImpl<Fatura> implements DAOFatura {
    @Override
    public ListaDeObjetos<ItemFaturado> getItensFaturados() {
        return null;
    }

    @Override
    public void setMap(Map<Integer, Fatura> map) {

    }

    @Override
    public Fatura incluir(Fatura obj) {
        return null;
    }

    @Override
    public Fatura alterar(Fatura obj) {
        return null;
    }
}
