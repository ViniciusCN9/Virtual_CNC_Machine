package com.controller.machines;

import java.math.BigDecimal;

public class Fresa extends Maquina {

    private BigDecimal posicaoXMaquina;
    private BigDecimal posicaoYMaquina;
    private BigDecimal posicaoZMaquina;


    public Fresa(BigDecimal posicaoXMaquina, BigDecimal posicaoYMaquina, BigDecimal posicaoZMaquina, int nFerramentas) {
        this.posicaoXMaquina = posicaoXMaquina;
        this.posicaoYMaquina = posicaoYMaquina;
        this.posicaoZMaquina = posicaoZMaquina;
        this.posicaoXAbsoluto = posicaoXMaquina;
        this.posicaoYAbsoluto = posicaoYMaquina;
        this.posicaoZAbsoluto = posicaoZMaquina;
        this.nFerramentas = nFerramentas;

    }

    public BigDecimal getPosicaoXMaquina() {
        return posicaoXMaquina;
    }

    public BigDecimal getPosicaoYMaquina() {
        return posicaoYMaquina;
    }

    public BigDecimal getPosicaoZMaquina() {
        return posicaoZMaquina;
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
        this.posicaoZAbsoluto = this.posicaoZMaquina;
    }
}

