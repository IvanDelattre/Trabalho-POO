package com.carlosribeiro.model;

import java.util.Date;

public class Fatura {

    //todo colocar relaçõpes no código
    private int numFatura;
    private Date dataEmissao;
    private Date dataCancelamento;
    private ListaDeObjetos<ItemFaturado> itensFaturados;
    private double valorTotal;
    private double valorTotalDesconto;

    public Fatura( Date dataEmissao, Date dataCancelamento, ListaDeObjetos<ItemFaturado> itens) {
        this.dataEmissao = dataEmissao;
        this.dataCancelamento = dataCancelamento;
        this.itensFaturados = itens;
        valorTotal = 0;
        for(ItemFaturado item:itensFaturados){
            valorTotal+=item.getLivro().getPreco();
        }
    }

    public int getNumFatura() {
        return numFatura;
    }

    public void setNumFatura(int numFatura) {
        this.numFatura = numFatura;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Date getDataCancelamento() {
        return dataCancelamento;
    }

    public void setDataCancelamento(Date dataCancelamento) {
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
