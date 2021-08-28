package com.corrida;

import com.corrida.model.*;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n");
        Corrida corrida = new Corrida(56d, 50000d, " Rali dos Sertões", 5);

        System.out.println("Corrida:" + corrida.getNome() + " -- Distancia da corria: " + corrida.getDistancia() + " -- Prêmio: " + corrida.getPremioEmDolares());
        System.out.println("\n");
        corrida.adicionarCarro(200, 10.0, 90, " ksd1234", " Onix");
        corrida.adicionarCarro(250, 15.0, 90, " ktg9876", " S10");
        corrida.adicionarMoto(150, 8.0, 90, " mht1234", " YBR");
        corrida.adicionarMoto(160, 9.0, 90, " pol1234", " BROS");

        corrida.adicionarMoto(180, 7.0, 80, "pol1236", " BROS");

        System.out.println("-------------Socorrendo Carro-------------");
        SocorristaCarro socorristaCarro = new SocorristaCarro();
        Object resgateCarro = corrida.resgatarVeiculo(" ksd1234");
        socorristaCarro.socorrer((Carro) resgateCarro);
        System.out.println("\n");

        System.out.println("-------------Socorrendo Moto-------------");
        SocorristaMoto socorristaMoto = new SocorristaMoto();
        Object resgateMoto = corrida.resgatarVeiculo(" mht1234");
        socorristaMoto.socorrer((Moto) resgateMoto);
        System.out.println("\n");

        corrida.removerVeiculo(" mht1234");
        System.out.println("-------------LISTA DE VEÍCULO RENOVADA APÓS REMOVER VEíCULO-------------");
        corrida.mostrarVeiculos();
        System.out.println("\n");

        System.out.println("-------------VEÍCULO VENCEDOR-------------");
        Veiculo vencedor = corrida.gerarCorrida();
        System.out.println("Veículo vencedor =>" + vencedor.getPatente() + " => Placa =" + vencedor.getPlaca());
    }
}
