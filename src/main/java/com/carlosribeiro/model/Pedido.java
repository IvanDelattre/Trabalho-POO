package com.carlosribeiro.model;

import com.carlosribeiro.util.FormattingObjects;
import com.carlosribeiro.util.Id;

import java.time.LocalDate;

public class Pedido {
    private int numPedido;
    private LocalDate dataEmissao;
    private LocalDate dataCancelamento = null;
    private String status;
    private ListaDeObjetos<ItemPedido> listaItemPedido ;

    public Pedido(String dataEmissao, String status, ListaDeObjetos<ItemPedido> listaItemPedido  ) {
        this.status = status;
        this.dataEmissao = FormattingObjects.stringToLocalDate(dataEmissao);
        this.listaItemPedido = listaItemPedido;
    }


    public int getNumPedido(){
        return this.numPedido ;
    }



}
