package com.company.model;

public class Veiculo {

    private Integer velocidade;
    private Double aceleração;
    private String AnguloDeVirada;
    private String Patente;
    private Double Peso;
    private Integer Rodas;
    private String placa;

    public void removerVeiculo(Veiculo){

    }

    public void removeVeiculoComPlaca(String placa){
      this.placa = placa;
    }


    public Integer getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }

    public double getAceleração() {
        return aceleração;
    }

    public void setAceleração(double aceleração) {
        this.aceleração = aceleração;
    }

    public String getAnguloDeVirada() {
        return AnguloDeVirada;
    }

    public void setAnguloDeVirada(String anguloDeVirada) {
        AnguloDeVirada = anguloDeVirada;
    }

    public String getPatente() {
        return Patente;
    }

    public void setPatente(String patente) {
        Patente = patente;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public Integer getRodas() {
        return Rodas;
    }

    public void setRodas(Integer rodas) {
        Rodas = rodas;
    }

    public Integer getPlaca() {
        return placa;
    }

    public void setPlaca(Integer placa) {
        this.placa = placa;
    }


}

