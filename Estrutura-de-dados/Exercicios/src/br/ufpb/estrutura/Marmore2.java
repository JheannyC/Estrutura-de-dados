import java.util.Scanner;

public class Marmore2{

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String [] entrada;
        int n, q, cont;
        boolean condition = true;
        entrada = input.nextLine().split(" ");
        n = Integer.parseInt(entrada[0]);
        q = Integer.parseInt(entrada[1]);

        cont = 1;
        while (condition) {
           if (n == 0 && q == 0) {
               break;
           }
            System.out.println("CASE# "+cont+":");
           cont++;

           int [] vetor = new int[n];
           for (int i = 0; i < n; i++) {
                   int marble = (input.nextInt());
                   vetor[i] = marble;
           }

           for (int j=0; j<q; j++) {
                   System.out.println("Pesquisar: ");
                   int pesquisa = input.nextInt();


           }

        }

    }




    }