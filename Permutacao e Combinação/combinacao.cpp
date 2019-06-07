#include <iostream>
using namespace std;

void comb (int vetor[], int vetorBool[], int i, int tamVetor) {
    if (i == tamVetor) {
        for (int j = 0; j < tamVetor; j++) {
            if (vetorBool[j] == 1){
                cout << vetor[j] << " ";
            }
        }
        cout << endl;
    } else {
        vetorBool[i] = true;
        comb (vetor, vetorBool, i+1, tamVetor);
        vetorBool[i] = false;
       comb (vetor, vetorBool, i+1, tamVetor);
    }
}


int main(int argc, char *argv[]) {
    int v[] = {0,1};
    int tam_v = sizeof(v)/ sizeof(int);
    int v_bool[tam_v];

    for (int i = 0; i < tam_v; i++) {
        v_bool[i] = false;
    }
    comb(v, v_bool, 0, tam_v);

}