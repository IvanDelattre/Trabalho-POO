package com.carlosribeiro.model;

import com.carlosribeiro.util.Id;

public class Livro {
    //todo colocar relaçõpes no código
    @Id
    int id;
    private String isbn ;
    private String titulo;
    private  String descricao;
    private double preco ;


    public Livro(String isbn , String titulo , String descricao , double preco){
        this.isbn = isbn;
        this.titulo = titulo;
        this.descricao = descricao;
        this.preco = preco;
    }


    @Override
    public String toString() {
        return "Livro: " +
                "id=" + id +
                ", isbn=" + isbn +
                " , titulo=" + titulo +
                " , descricao=" + descricao +
                " , preco=" + preco ;
    }

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }





    public void setId(int id) {
        this.id = id;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object obj) {
        String objIsbn = ((Livro)obj).getIsbn();
        return objIsbn.equals(this.getIsbn());
    }
}
