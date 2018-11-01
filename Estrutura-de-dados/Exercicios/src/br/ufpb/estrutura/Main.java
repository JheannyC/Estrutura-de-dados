import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String []  entradas;
        int graus;
        String cidades;
        boolean continuar = true;
        List<String> lista = new ArrayList<>();
        List<Integer>lista2 = new ArrayList<>();

        while (continuar) {
            String entrada = input.nextLine();
            entradas = entrada.split(" ");
            cidades = entradas[0];
            graus = Integer.parseInt(entradas[1]);
            lista.add(cidades);
            lista2.add(graus);
            if (cidades.equalsIgnoreCase("waterloo")) continuar = false;
        }
        int menor = retornaMenor(lista2);
        System.out.println(lista.get(menor));

    }
    private static int retornaMenor(List<Integer> lista) {
        int indice = -1;
        int menor = 0;
        for(int i = 0;i < lista.size()-1;i++)
            if(lista.get(i) < menor) {
                menor = lista.get(i);
                indice = i;
            }
        return indice;
    }
}