package com.controller.machines;


public class Fresa extends Maquina {

    private double posicaoXMaquina;
    private double posicaoYMaquina;
    private double posicaoZMaquina;


    public Fresa(double posicaoXMaquina, double posicaoYMaquina, double posicaoZMaquina, int nFerramentas) {
        this.posicaoXMaquina = posicaoXMaquina;
        this.posicaoYMaquina = posicaoYMaquina;
        this.posicaoZMaquina = posicaoZMaquina;
        this.posicaoXAbsoluto = posicaoXMaquina;
        this.posicaoYAbsoluto = posicaoYMaquina;
        this.posicaoZAbsoluto = posicaoZMaquina;
        this.nFerramentas = nFerramentas;

    }

    public double getPosicaoXMaquina() {
        return posicaoXMaquina;
    }

    public double getPosicaoYMaquina() {
        return posicaoYMaquina;
    }

    public double getPosicaoZMaquina() {
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
        movimentarEixoX(this.posicaoXAbsoluto, this.posicaoXMaquina);
        movimentarEixoY(this.posicaoYAbsoluto, this.posicaoYMaquina);
        movimentarEixoZ(this.posicaoYAbsoluto, this.posicaoZMaquina);
    }
}

