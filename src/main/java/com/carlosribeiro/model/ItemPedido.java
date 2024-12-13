package com.carlosribeiro.model;

public class ItemPedido {

    //todo colocar relaçõpes no código

    private int qtdPedida;
    private double precoCobrado ;


    public ItemPedido(int qtdPedida , int precoCobrado){
        this.qtdPedida = qtdPedida;
        this.precoCobrado = precoCobrado ;
    }

    public void setQtdPedida(int qtdPedida) {
        this.qtdPedida = qtdPedida;
    }

    public void setPrecoCobrado(double precoCobrado) {
        this.precoCobrado = precoCobrado;
    }

    public int getQtdPedida() {
        return qtdPedida;
    }

    public double getPrecoCobrado() {
        return precoCobrado;
    }
}
