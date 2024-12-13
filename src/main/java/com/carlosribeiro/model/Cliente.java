package com.carlosribeiro.model;

import com.carlosribeiro.util.Id;

public class Cliente {
    //todo colocar relaçõpes no código
    @Id
    int id ;
    private String cpf;
    private String nome;
    private String email;
    private String Telefone;

    public Cliente(String cpf, String nome, String email, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        Telefone = telefone;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }





    public int getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return Telefone;
    }
}
