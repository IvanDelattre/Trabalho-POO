package com.carlosribeiro.model;

public class ItemFaturado {
    //todo colocar relaçõpes no código
    private Livro livro;
    private int qtdFaturada;

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public ItemFaturado(int qtdFaturada, Livro livro ){
        this.qtdFaturada = qtdFaturada ;
        this.livro = livro;
    }

    public int getQtdFaturada() {
        return qtdFaturada;
    }

    public void setQtdFaturada(int qtdFaturada) {
        this.qtdFaturada = qtdFaturada;
    }

    @Override
    public boolean equals(Object obj) {
        return ((ItemFaturado)obj).getLivro().equals(this.livro);
    }
}
