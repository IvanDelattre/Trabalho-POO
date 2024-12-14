package com.carlosribeiro.dao.impl;

import com.carlosribeiro.dao.ClienteDAO;
import com.carlosribeiro.model.Cliente;
import com.carlosribeiro.model.ListaDeObjetos;
import com.carlosribeiro.model.Pedido;

import java.util.List;
import java.util.Map;

public class DAOClienteImpl extends DAOGenericoImpl<Cliente> implements ClienteDAO {
    @Override
    public ListaDeObjetos<Pedido> getPedidos() {
        return null;
    }

    @Override
    public int getContador() {
        return 0;
    }

    @Override
    public void setContador(int contador) {

    }

    @Override
    public Map<Integer, Cliente> getMap() {
        return Map.of();
    }

    @Override
    public void setMap(Map<Integer, Cliente> map) {

    }

    @Override
    public Cliente incluir(Cliente obj) {
        return null;
    }

    @Override
    public Cliente alterar(Cliente obj) {
        return null;
    }

    @Override
    public Cliente remover(Integer id) {
        return null;
    }

    @Override
    public Cliente recuperarPorId(Integer id) {
        return null;
    }

    @Override
    public List<Cliente> recuperarTodos() {
        return List.of();
    }
}
