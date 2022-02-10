package com.controller;

import com.controller.machines.Fresa;
import com.controller.machines.Maquina;
import com.controller.machines.Torno;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Maquina fresa = new Fresa(new BigDecimal(1000), new BigDecimal(1000), new BigDecimal(500), 15);
        Maquina torno = new Torno(new BigDecimal(500), new BigDecimal(300), 8);

        // Implementar movimento dos eixos; definir metodo para avanço rapido e avanço programado

    }
}
