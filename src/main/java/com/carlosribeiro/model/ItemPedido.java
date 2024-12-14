package com.carlosribeiro.model;

import com.carlosribeiro.util.Id;

public class ItemPedido {

    //todo colocar relaçõpes no código

    private Livro livro;
    private int qtdPedida;
    private double precoCobrado ;


    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

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

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof ItemPedido){
            if(this.getLivro().getId() == ((ItemPedido) obj).getLivro().getId()){
                return true;
            }
        }
        return false;
    }
}
