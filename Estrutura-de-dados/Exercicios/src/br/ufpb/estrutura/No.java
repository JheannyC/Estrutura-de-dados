package br.ufpb.estrutura;

public class No {
    private int valor;
    private No proximo;

    public No(int valor) {
        this.valor = valor;
        proximo = null;

    }

    public int getValor() {
        return valor;
    }

    public No getProximo() {
        return proximo;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
