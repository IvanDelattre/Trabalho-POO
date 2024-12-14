package com.carlosribeiro.service;

import com.carlosribeiro.dao.ClienteDAO;
import com.carlosribeiro.exception.EntidadeNaoEncontradaException;
import com.carlosribeiro.model.Cliente;
import com.carlosribeiro.model.Fatura;
import com.carlosribeiro.model.Livro;
import com.carlosribeiro.model.Pedido;
import com.carlosribeiro.util.FabricaDeDaos;

import java.util.List;

public class ClienteService {

    private final ClienteDAO clienteDAO = FabricaDeDaos.getDAO(ClienteDAO.class) ;

    public Cliente incluir(Cliente cliente){
        return clienteDAO.incluir(cliente) ;
    }


    public Cliente alterar(Cliente cliente){
        return clienteDAO.alterar(cliente) ;
    }

    public Cliente remover(int id){
        Cliente cliente = clienteDAO.recuperarPorId(id)  ;

        if( cliente == null){
            throw new EntidadeNaoEncontradaException("Cliente insexistente");
        }
        if ( cliente.getListaPedidos().isEmpty() && cliente.getListaFaturas().isEmpty()  ) {
            return clienteDAO.remover(id);
        }
        return null;
    }

    public List<Cliente> recuperarTodos(){
        return clienteDAO.recuperarTodos();

    }

    public Cliente recuperarPorId(int id){
        Cliente cliente = clienteDAO.recuperarPorId(id) ;
        if( cliente == null){
            throw new EntidadeNaoEncontradaException( "Livro inexistente" ) ;
        }
        return cliente ;
    }

    public void adicionarFatura(Cliente cliente, Fatura fatura){
        if(cliente.getListaFaturas().size()>=3){
            fatura.setValorTotalDesconto((fatura.getValorTotal()*5)/100);
        }
        cliente.getListaFaturas().add(fatura);
    }

    public void adicionarPedido(Cliente cliente, Pedido pedido){
        cliente.getListaPedidos().add(pedido);
    }
}
