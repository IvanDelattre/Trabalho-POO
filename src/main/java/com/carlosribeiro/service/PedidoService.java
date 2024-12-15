package com.carlosribeiro.service;

import com.carlosribeiro.dao.PedidoDAO;
import com.carlosribeiro.exception.EntidadeNaoEncontradaException;
import com.carlosribeiro.model.Pedido;
import com.carlosribeiro.util.FabricaDeDaos;

public class PedidoService {

    PedidoDAO pedidoDAO = FabricaDeDaos.getDAO(PedidoDAO.class);

    public Pedido incluir(Pedido pedido){
        return pedidoDAO.incluir(pedido);
    }

    public Pedido remover(Integer idPedido){
        Pedido pedido = pedidoDAO.recuperarPorId(idPedido);
        if(pedido != null){

        }
        throw new EntidadeNaoEncontradaException("O pedido não existe.");
    }





}
