package br.com.senac.entity;

import java.util.Date;

public class SuperHeroi {
    private int id;
    private String nome;
    private String apelido;
    private String superPoder;
    private String fraqueza;
    private String historiaOrigem;
    private Date primeiraAparicao;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getApelido() {
        return apelido;
    }
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    public String getSuperPoder() {
        return superPoder;
    }
    public void setSuperPoder(String superPoder) {
        this.superPoder = superPoder;
    }
    public String getFraqueza() {
        return fraqueza;
    }
    public void setFraqueza(String fraqueza) {
        this.fraqueza = fraqueza;
    }
    public String getHistoriaOrigem() {
        return historiaOrigem;
    }
    public void setHistoriaOrigem(String historiaOrigem) {
        this.historiaOrigem = historiaOrigem;
    }
    public Date getPrimeiraAparicao() {
        return primeiraAparicao;
    }
    public void setPrimeiraAparicao(Date primeiraAparicao) {
        this.primeiraAparicao = primeiraAparicao;
    }
}
