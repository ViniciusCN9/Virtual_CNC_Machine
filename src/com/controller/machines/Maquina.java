package com.controller.machines;

import java.math.BigDecimal;

public abstract class Maquina implements IMaquina {

    BigDecimal posicaoXRelativo = new BigDecimal(0);
    BigDecimal posicaoYRelativo = new BigDecimal(0);
    BigDecimal posicaoZRelativo = new BigDecimal(0);
    BigDecimal posicaoXAbsoluto;
    BigDecimal posicaoYAbsoluto;
    BigDecimal posicaoZAbsoluto;

    int rotacaoAtual = 0;
    boolean estadoRefrigeracao = false;


    int ferramentaAtual = 0;

    public int getRotacaoAtual() {
        return this.rotacaoAtual;
    }

    public int getFerramentaAtual() {
        return this.ferramentaAtual;
    }

    @Override
    public void rotacaoArvore(int rotacao) {
        this.rotacaoAtual = rotacao;
        System.out.println("Rotação atual: " + this.rotacaoAtual);
    }

    @Override
    public void Refrigeracao() {
        if (!this.estadoRefrigeracao) {
            this.estadoRefrigeracao = true;
            System.out.println("Refrigeração ligada!");
        } else {
            this.estadoRefrigeracao = false;
            System.out.println("Refrigeração desligada!");
        }
    }

    @Override
    public void trocarFerramenta(int ferramenta) {
        this.ferramentaAtual = ferramenta;
        System.out.println("Ferramenta atual: " + this.ferramentaAtual);
    }

    @Override
    public void movimentarEixoX(BigDecimal valor) {
        this.posicaoXAbsoluto = this.posicaoXAbsoluto.add(valor);
    }

    @Override
    public void movimentarEixoY(BigDecimal valor) {
        this.posicaoYAbsoluto = this.posicaoYAbsoluto.add(valor);
    }

    public void movimentarEixoZ(BigDecimal valor) {
        this.posicaoZAbsoluto = this.posicaoZAbsoluto.add(valor);
    }

    @Override
    public void chamadaPontoTroca() {

    }

    @Override
    public void definirZeroPeca() {
        this.posicaoXRelativo = this.posicaoXAbsoluto;
        this.posicaoYRelativo = this.posicaoYAbsoluto;
        this.posicaoZRelativo = this.posicaoZAbsoluto;
    }
}
