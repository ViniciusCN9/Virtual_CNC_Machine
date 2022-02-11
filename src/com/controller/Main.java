package com.controller;

import com.controller.machines.Fresa;
import com.controller.machines.Maquina;
import com.controller.machines.Torno;

public class Main {

    public static void main(String[] args) {

        Maquina fresa = new Fresa(1000d, 1000d, 500d, 15);
        Maquina torno = new Torno(500d, 300d, 8);

        // Implementar movimento dos eixos; definir metodo para avanço rapido e avanço programado

        torno.movimentarEixoX(200d, 10d);
        torno.movimentarEixoX(300d, 10d);

    }
}
