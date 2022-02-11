package com.controller.machines;


public class Torno extends Maquina {

    private double posicaoXMaquina;
    private double posicaoYMaquina;


    public Torno(double posicaoXMaquina, double posicaoYMaquina, int nFerramentas) {
        this.posicaoXMaquina = posicaoXMaquina;
        this.posicaoYMaquina = posicaoYMaquina;
        this.posicaoXAbsoluto = posicaoXMaquina;
        this.posicaoYAbsoluto = posicaoYMaquina;
        this.nFerramentas = nFerramentas;
    }

    public double getPosicaoXMaquina() {
        return posicaoXMaquina;
    }

    public double getPosicaoYMaquina() {
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

}
