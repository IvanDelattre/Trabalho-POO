package com.carlosribeiro.model;

import com.carlosribeiro.util.FormattingObjects;
import com.carlosribeiro.util.Id;

import java.time.LocalDate;

public class Pedido {
    @Id
    private int numPedido;
    private LocalDate dataEmissao;
    private LocalDate dataCancelamento = null;
    private String status;
    private ListaDeObjetos<ItemPedido> listaItemPedido ;
    private Cliente cliente;

    public Pedido(String dataEmissao, String status, ListaDeObjetos<ItemPedido> listaItemPedido, Cliente cliente) {
        this.status = status;
        this.dataEmissao = FormattingObjects.stringToLocalDate(dataEmissao);
        this.listaItemPedido = listaItemPedido;
        this.cliente = cliente;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public LocalDate getDataCancelamento() {
        return dataCancelamento;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setListaItemPedido(ListaDeObjetos<ItemPedido> listaItemPedido) {
        this.listaItemPedido = listaItemPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumPedido(){
        return this.numPedido ;
    }

    public String getStatus() {
        return status;
    }

    public ListaDeObjetos<ItemPedido> getListaItemPedido() {
        return listaItemPedido;
    }

    public void setDataCancelamento(LocalDate dataCancelamento) {
        this.dataCancelamento = dataCancelamento;
    }

    @Override
    public boolean equals(Object o) {
        return ((Pedido) o).getNumPedido() == this.numPedido;
    }
}
