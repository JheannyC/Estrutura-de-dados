import java.util.ArrayList;
import java.util.Scanner;
public class Bits {
    private static ArrayList<String> bits;
    public static void main(String[] args) {

        bits = new ArrayList<>(); //Array de strings que vai armazenar os bits;

        int numBits,cont;
        cont = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Digite a quantidade de bits: ");
        numBits = Integer.parseInt(num.nextLine()); // numero de bits solicitado pelo usuário;
        combinaBits("", numBits); // chamada da função recursiva para fazer o backtrack;
        for(String numero : bits){ // para cada "número" dentro do array de bits:
            System.out.println(numero); //imprima o número;
            cont++;
        }
        System.out.println("Quantidade de combinações: " + cont);
    }
    private static void combinaBits(String numero, int restante) {
        if(restante == 0) { // se for 0, irá apenas exibir o número 0, não tem nada para mostrar;
            bits.add(numero);
        }
        else {
            //a cada quantidade de bits que o usuário inserir, recursivamente as strings irão sendo adicionadas ao array de bits
            //de acordo com a sequência abaixo e sempre irá decrementar, quando zerar, não há mais nada para add;
            combinaBits(numero + "0 ", restante - 1);
            combinaBits(numero + "1 ", restante - 1);
            //Aqui ele realiza o backtracking;
        }
    }
}