package com.controller.machines;

import java.math.BigDecimal;

public class Torno extends Maquina {

    BigDecimal posicaoXMaquina;
    BigDecimal posicaoYMaquina;

    int nFerramentas;

    public Torno(BigDecimal posicaoXMaquina, BigDecimal posicaoYMaquina, int nFerramentas) {
        this.posicaoXMaquina = posicaoXMaquina;
        this.posicaoYMaquina = posicaoYMaquina;
        this.nFerramentas = nFerramentas;
    }

    public BigDecimal getPosicaoXMaquina() {
        return posicaoXMaquina;
    }

    public BigDecimal getPosicaoYMaquina() {
        return posicaoYMaquina;
    }

    @Override
    public void trocarFerramenta(int ferramenta) {
        if (ferramenta > this.nFerramentas) {
            System.out.println("Número de ferramenta não encontrado");
        } else {
            super.trocarFerramenta(ferramenta);
        }
    }

    @Override
    public void chamadaPontoTroca() {
        this.posicaoXAbsoluto = this.posicaoXMaquina;
        this.posicaoYAbsoluto = this.posicaoYMaquina;
    }

}
