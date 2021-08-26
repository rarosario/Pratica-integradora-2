package com.company.model;

public class Carro extends Veiculo{
    private final double peso = 1000;
    private final Integer rodas = 4;

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public Integer getRodas() {
        return rodas;
    }
}
