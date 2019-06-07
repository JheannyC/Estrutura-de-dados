#include <iostream>
using namespace std;

void troca (int vetor[], int i, int j) { //Essa função irá executar uma troca de posições;
    int aux = vetor[i];
    vetor[i] = vetor[j];
    vetor[j] = aux;
}

void permutacao(int *vetor, int inicio, int fim) {
    if (inicio == fim) { //Se os número do início for igual ao do final do vetor...
        for (int i = 0; i <= fim; i++) {
            cout << vetor[i] << " ";
        }
        cout << endl;

    }else { //Caso contrário
        for (int i = inicio; i <= fim; i++) {
            troca(vetor, inicio, i); //Troca a posição
            permutacao(vetor, inicio + 1, fim); //Faz uma chamada recursiva para verificar se o número é igual e se não for...
            troca(vetor, inicio, i); //Essa última troca realiza o backtracking;
        }
    }
}

int main(int argc, char *argv[]) {

    int n;
    cout << "Quantos números você deseja permutar?: " << endl;
    cin >> n;

    int v [n];
    for (int i = 0; i < n; i ++) {
        v[i] = i+1;
    }

    int tamanhoVetor = sizeof(v) / sizeof(int);
    cout << "\nPossibilidades de permutação dos números escolhidos: \n" << endl;
    permutacao(v, 0, tamanhoVetor - 1);
    return 0;
}