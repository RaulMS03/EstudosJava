import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner entra = new Scanner(System.in);

        int numeros [];
        numeros = new int [10];
        int i;
        int soma = 0;

        for (i = 0; i < 10 ;i++) {
            numeros [i] = entra.nextInt();
            
            if (numeros[i] % 2 == 1){
                soma = soma + numeros[i];
            }
        }

        System.out.println("a soma dos valores impares é :" + soma);
    }
}