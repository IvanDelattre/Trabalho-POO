package com.carlosribeiro.model;

import com.carlosribeiro.util.Id;

import java.time.LocalDate;
import java.util.Date;

public class Fatura {

    //todo colocar relaçõpes no código
    @Id
    private int numFatura;
    private LocalDate dataEmissao;
    private LocalDate dataCancelamento;
    private ListaDeObjetos<ItemFaturado> itensFaturados;
    private double valorTotal;
    private double valorTotalDesconto;
    private Pedido pedido;

    public Fatura( LocalDate dataEmissao, ListaDeObjetos<ItemFaturado> itens, Pedido pedido) {
        this.dataEmissao = dataEmissao;
        this.itensFaturados = itens;
        valorTotal = 0;
        this.pedido = pedido;
        for(ItemFaturado item:itensFaturados){
            valorTotal+=item.getLivro().getPreco();
        }
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public int getNumFatura() {
        return numFatura;
    }

    public void setNumFatura(int numFatura) {
        this.numFatura = numFatura;
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

    public void setDataCancelamento(LocalDate dataCancelamento) {
        this.dataCancelamento = dataCancelamento;
    }

    public ListaDeObjetos<ItemFaturado> getItensFaturados() {
        return itensFaturados;
    }

    public void setItensFaturados(ListaDeObjetos<ItemFaturado> itensFaturados) {
        this.itensFaturados = itensFaturados;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorTotalDesconto() {
        return valorTotalDesconto;
    }

    public void setValorTotalDesconto(double valorTotalDesconto) {
        this.valorTotalDesconto = valorTotalDesconto;
    }
}
