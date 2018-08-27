package br.ufpb.estrutura;

public class FilaEncadeada implements OperacoesFila {

    private No inicioFila;
    private No finalFila;
    private int tamFila;
    private int senha;

    public FilaEncadeada () {
        senha = 0;
        tamFila = 0;
        inicioFila = null;
        finalFila = null;
    }

    @Override
    public boolean filaVazia() {
        if (tamFila == 0) return true;
        else return false;
    }

    @Override
    public void inserir() {
        senha ++;
        No novo = new No(senha);
        if (filaVazia()) {
            inicioFila = novo;
            finalFila = novo;
        }else {
            finalFila.setProximo(novo);
            finalFila = novo;
        }
        tamFila++;

    }

    @Override
    public void remover() {
        if (filaVazia()) {
            System.out.println("A fila está vazia");
        } else if (inicioFila == finalFila){
            inicioFila = null;
            tamFila--;
        } else {
            No aux = inicioFila;
            aux = inicioFila.getProximo();
            inicioFila = aux;
            tamFila--;
        }

    }

    @Override
    public void imprimir() {
        No aux = inicioFila;
        if (filaVazia()) System.out.println("A fila está vazia");
        else {
            for (int i = 0; i < tamFila; i++) {
                System.out.println("Senha: " + aux.getValor());
                aux = aux.getProximo();
            }
        }
    }

    @Override
    public void tamanhoFila() {
        System.out.println("A fila tem " + tamFila + " senhas");
    }
}
