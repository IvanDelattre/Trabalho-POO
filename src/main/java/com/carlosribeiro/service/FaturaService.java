package com.carlosribeiro.service;

import com.carlosribeiro.dao.DAOFatura;
import com.carlosribeiro.dao.LivroDAO;
import com.carlosribeiro.exception.EntidadeNaoEncontradaException;
import com.carlosribeiro.model.Fatura;
import com.carlosribeiro.model.ItemFaturado;
import com.carlosribeiro.model.Livro;
import com.carlosribeiro.util.FabricaDeDaos;

public class FaturaService {

    private final  DAOFatura faturaDAO = FabricaDeDaos.getDAO(DAOFatura.class) ;

    public Fatura remover(int id){
          Fatura fatura = faturaDAO.recuperarPorId(id);
          if(fatura != null){
              LivroDAO livroDao = FabricaDeDaos.getDAO(LivroDAO.class);
              for(ItemFaturado item: fatura.getItensFaturados()){
                  Livro livro = item.getLivro();
                  livro.setQtdEstoque(livro.getQtdEstoque()+item.getQtdFaturada());
                  livroDao.alterar(livro);
              }
              fatura.getItensFaturados().clear();
              return faturaDAO.remover(id);
          }
          throw new EntidadeNaoEncontradaException("A fatura não existe.");

    }



}
