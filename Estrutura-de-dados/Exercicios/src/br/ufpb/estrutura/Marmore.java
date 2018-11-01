import java.util.Scanner;

public class Marmore {

    /**static Scanner input;
    public static int n,q;
    static String userInput;
    static String [] vectorUserInput;

    public static void main(String[] args) {

        int cont = 1;
        input = new Scanner(System.in);
        userInput = input.nextLine();
        vectorUserInput = userInput.split(" ");

        while (!userInput.equals("0 0")) {
            n = Integer.parseInt(vectorUserInput[0]);
            q = Integer.parseInt(vectorUserInput[1]);
            System.out.println("CASE# " + cont + ":");

            int[] marblesVector = new int[n];
            for (int i = 0; i < n; i++) {
                int marble = input.nextInt();
                marblesVector[i] = marble;
            }
            insertionSort(marblesVector);

            int[] marbleSearch = new int[q];
            for (int i = 0; i < q; i++) {
                int search = input.nextInt();
                marbleSearch[i] = (search);
            }

            for (int i = 0; i < marbleSearch.length; i++) {
                int index = binarySearch(marblesVector, 0, n, marbleSearch[i]);
                if (index == -1) {
                    System.out.println(marbleSearch[i] + " not found");
                } else
                    System.out.println(marbleSearch[i] + " found at " + (index+1));
            }
            cont++;
            input = new Scanner(System.in);
            userInput = input.nextLine();
            vectorUserInput = userInput.split(" ");
        }
    }

    private static int binarySearch(int vet[], int low, int high, int val) {
        if (high < low) return -1;
        int mid = low + ((high - low) / 2);
        if (vet[mid] > val) return binarySearch(vet, low, mid - 1, val);
        if (vet[mid] < val) return binarySearch(vet, mid + 1, high, val);
        if (vet[mid] == val) for (int i = mid; i >= 0; i--) {
            if (vet[i] == val) mid = i;
            else break;
        }
        return mid;
    }

    private static void insertionSort(int [] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int aux = vetor[i];
            int j = i;
            while ((j>0) && vetor[j-1] > aux) {
                vetor[j] = vetor[j-1];
                j--;
            }
            vetor[j] = aux;
        }
    }**/

}