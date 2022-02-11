package com.controller.machines;


public interface IMaquina {

    void movimentarEixo(double eixo, double valor, double avanco);

    void rotacaoArvore(int rotacao);

    void Refrigeracao();

    void trocarFerramenta(int ferramenta);

    void chamadaPontoTroca();

    void definirZeroPeca();

}
