package com.company.model;


public class Corrida{

    private double Distancia;
    private double PremioEmDolares;
    private String nome;
    private Integer QuantidadeDeVeiculosPermitidos;
    private Integer ListaDeVeiculos;

    public void adicionarCarro(Integer velocidade, Double aceleracao, String AnguloDeVirada, String placa){

    }
    public void adicionarMoto(Integer velocidade, Double aceleracao, String AngulaDeVirada, String placa){

    }

    public void socorrerCarro(String placa){

    }

    public void socorrerMoto(String placa){

    }

    public double getDistancia() {
        return Distancia;
    }

    public void setDistancia(double distancia) {
        Distancia = distancia;
    }

    public double getPremioEmDolares() {
        return PremioEmDolares;
    }

    public void setPremioEmDolares(double premioEmDolares) {
        PremioEmDolares = premioEmDolares;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeDeVeiculosPermitidos() {
        return QuantidadeDeVeiculosPermitidos;
    }

    public void setQuantidadeDeVeiculosPermitidos(Integer quantidadeDeVeiculosPermitidos) {
        QuantidadeDeVeiculosPermitidos = quantidadeDeVeiculosPermitidos;
    }

    public Integer getListaDeVeiculos() {
        return ListaDeVeiculos;
    }

    public void setListaDeVeiculos(Integer listaDeVeiculos) {
        ListaDeVeiculos = listaDeVeiculos;
    }





}

