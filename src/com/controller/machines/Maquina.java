package com.controller.machines;


public abstract class Maquina implements IMaquina {

    // DADOS TNMG - VC = 130 metro/min  | F = 0.20 mm/revolução

    protected double posicaoXRelativo = 0d;
    protected double posicaoYRelativo = 0d;
    protected double posicaoZRelativo = 0d;
    protected double posicaoXAbsoluto;
    protected double posicaoYAbsoluto;
    protected double posicaoZAbsoluto;

    protected int nFerramentas;
    protected int ferramentaAtual = 0;

    protected int rotacaoAtual = 0;
    protected boolean estadoRefrigeracao = false;

    private double AVANCO_RAPIDO = 500; // 500 mm/s ou 30 metro/min

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
        if (ferramenta > this.ferramentaAtual) {
            for (int i = this.ferramentaAtual; i < ferramenta; i++) {
                System.out.println("Ferramenta atual: " + i);
            }
        }
        if (ferramenta < this.ferramentaAtual) {
            for (int i = this.ferramentaAtual; i > ferramenta; i--) {
                System.out.println("Ferramenta atual: " + i);
            }
        }
        this.ferramentaAtual = ferramenta;
        System.out.println("Ferramenta atual: " + this.ferramentaAtual);
    }

    public void movimentarEixoX(double valor, double avanco) {
        movimentarEixo(this.posicaoXAbsoluto, valor, avanco);
    }


    public void movimentarEixoY(double valor, double avanco) {
        movimentarEixo(this.posicaoYAbsoluto, valor, avanco);
    }

    public void movimentarEixoZ(double valor, double avanco) {
        movimentarEixo(this.posicaoZAbsoluto, valor, avanco);
    }

    public void chamadaPontoTroca() {}

    @Override
    public void definirZeroPeca() {
        this.posicaoXRelativo = this.posicaoXAbsoluto;
        this.posicaoYRelativo = this.posicaoYAbsoluto;
        this.posicaoZRelativo = this.posicaoZAbsoluto;
    }

    @Override
    public void movimentarEixo(double eixo, double valor, double avanco) {
        if (valor < eixo) {
            for (double i = eixo; i > valor; i--) {
                eixo = i;
                System.out.println(eixo);
            }
        }
        if (valor > eixo) {
            for (double i = eixo; i < valor; i++) {
                eixo = i;
                System.out.println(eixo);
            }
        }
        eixo = valor;
        System.out.println(eixo);
    }
}
