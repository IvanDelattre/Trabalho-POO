package com.carlosribeiro.service;

import com.carlosribeiro.dao.LivroDAO;
import com.carlosribeiro.exception.EntidadeNaoEncontradaException;
import com.carlosribeiro.model.Livro;
import com.carlosribeiro.util.FabricaDeDaos;

import java.util.List;

public class LivroService{

    private final LivroDAO livroDAO = FabricaDeDaos.getDAO(LivroDAO.class);

    //Livro não possui regras de negócio ;
    public Livro incluir(Livro livro){
        return livroDAO.incluir(livro) ;
    }

    public  Livro alterarIsbn(Livro livro , String isbn){
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
    }

    public Livro remover(int id ){
        Livro livro = livroDAO.remover(id) ;
        if( livro == null){
            throw new EntidadeNaoEncontradaException("Livro insexistente");
        }
        livroDAO.recuperarPorId(id);
        return livro ;
    }

    public List<Livro> recuperarTodos(){
        return livroDAO.recuperarTodos();

    }

    public Livro recuperarPorId(int id){
        Livro livro = livroDAO.recuperarPorId(id) ;
        if( livro == null){
            throw new EntidadeNaoEncontradaException( "Livro inexistente" ) ;
        }
        return livro ;
    }


}
