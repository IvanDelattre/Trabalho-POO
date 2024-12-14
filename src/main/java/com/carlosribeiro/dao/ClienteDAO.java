package com.carlosribeiro.dao;

import com.carlosribeiro.model.Cliente;
import com.carlosribeiro.model.Pedido;
import com.carlosribeiro.model.ListaDeObjetos;

public interface ClienteDAO extends DAOGenerico<Cliente>{
    public ListaDeObjetos<Pedido> getPedidos();
}
