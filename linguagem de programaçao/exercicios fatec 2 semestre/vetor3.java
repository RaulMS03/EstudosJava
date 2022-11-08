import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner entra = new Scanner(System.in);

        int numeros [];
        numeros = new int [10];
        int i;
        int maior = -1000;

        for (i = 0; i < 10; i++) {
            numeros [i] = entra.nextInt();

            if (maior < numeros[i]){
                maior = numeros[i];
            }
        }

        System.out.println("O maior valor é: " + maior);
    }
}