import java.util.Scanner;

public class Main { 
    public static void main(String[]args){
        Scanner entra = new Scanner(System.in);

        int numeros [];
        numeros = new int [15];
        int i;

        int mult [];
        mult = new int [15];

        for (i = 0; i < 15; i++){
            System.out.println("digite a posição do vetor: " + i);
            numeros[i] = entra.nextInt();
        }

        for (i = 0; i < 15; i++){
            mult [i] = (numeros[i]*3);
            System.out.println("resultado da multiplicão: " + mult[i]);
        }
    }
}