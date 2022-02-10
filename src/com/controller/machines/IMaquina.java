package com.controller.machines;

import java.math.BigDecimal;

public interface IMaquina {

    void movimentarEixoX(BigDecimal valor, double avanco);

    void movimentarEixoX(BigDecimal valor);

    void movimentarEixoY(BigDecimal valor, double avanco);

    void movimentarEixoY(BigDecimal valor);

    void movimentarEixoZ(BigDecimal valor, double avanco);

    void movimentarEixoZ(BigDecimal valor);

    void rotacaoArvore(int rotacao);

    void Refrigeracao();

    void trocarFerramenta(int ferramenta);

    void chamadaPontoTroca();

    void definirZeroPeca();

}
