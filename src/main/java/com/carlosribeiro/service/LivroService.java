package com.carlosribeiro.service;

import com.carlosribeiro.dao.ClienteDAO;
import com.carlosribeiro.dao.LivroDAO;
import com.carlosribeiro.exception.EmUsoException;
import com.carlosribeiro.exception.EntidadeNaoEncontradaException;
import com.carlosribeiro.model.*;
import com.carlosribeiro.util.FabricaDeDaos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LivroService{

    private final LivroDAO livroDAO = FabricaDeDaos.getDAO(LivroDAO.class);

    //Livro não possui regras de negócio ;
    public Livro incluir(Livro livro){
        return livroDAO.incluir(livro) ;
    }

    /*public  Livro alterarIsbn(Livro livro , String isbn){
       livro.setIsbn(isbn);
        return livro ;
    }

    public Livro alterarTitulo(Livro livro , String titulo){
        livro.setTitulo(titulo);
        return livro;
    }

    public Livro alterarDescricao(Livro livro , String descricao){
        livro.setDescricao(descricao);
        return livro ;
    }

    public Livro alterarPreco(Livro livro , double preco){
        livro.setPreco(preco);
        return livro ;
    }*/

    public Livro alterar(Livro livro){
        return livroDAO.alterar(livro) ;
    }

    public Livro remover(int id ) throws EmUsoException {

        Livro livro = livroDAO.recuperarPorId(id);
        if(livro != null){
            ClienteDAO dao = FabricaDeDaos.getDAO(ClienteDAO.class);
            Map mapc = dao.getMap();
            for(int i = 1; i<=mapc.size(); i++){
                Cliente cliente = (Cliente) mapc.get(i);
                for(Pedido pedido: cliente.getListaPedidos()){
                    for(ItemPedido item:pedido.getListaItemPedido()){
                        if(item.getLivro().getId() == id){
                            throw new EmUsoException("O livro está em uso pelo pedido nº "+ pedido.getNumPedido() );
                        }
                    }
                }
                for(Fatura fatura: cliente.getListaFaturas()){
                    for(ItemFaturado item:fatura.getItensFaturados()) {
                        if(item.getLivro().getId() == id){
                            throw new EmUsoException("O livro está em uso pela fatura nº "+ fatura.getNumFatura() );
                        }
                    }
                }
            }
            return livroDAO.remover(id);
        }
        throw new EntidadeNaoEncontradaException("Livro inexistente");
    }

    public List<Livro> recuperarTodos(){
        return livroDAO.recuperarTodos();

    }

    public Livro recuperarPorId(int id){
        Livro livro = livroDAO.recuperarPorId(id);
        if( livro == null){
            throw new EntidadeNaoEncontradaException( "Livro inexistente" ) ;
        }
        return livro ;
    }


}
