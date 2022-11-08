import java.util.Scanner;

public class Main {
    public static void main (String[]args) {
        Scanner entra = new Scanner(System.in);
        double X = entra.nextDouble();
        int X1 = 0, X2 = 0, X3 = 0, X4 = 0, X5 = 0, X6 = 0;
        double N1 = 0, N2 = 0, N3 = 0, N4 = 0, N5 = 0, N6 = 0;

        while (X >= 100) {
            X1 = (int)X / 100;
            X = X % 100;
            continue;
        }

        while (X >= 50) {
            X2 = (int)X / 50;
            X = X % 50;
            continue;
        }

        while (X >= 20) { 
            X3 = (int)X / 20;
            X = X % 20;
            continue;
        }

        while (X >= 10) {
            X4 = (int)X / 10;
            X = X % 10;
            continue;
        }

        while (X >= 5) {
            X5 = (int)X / 5;
            X = X % 5;
            continue;
        }

        while (X >= 2) {
            X6 = (int)X / 2;
            X = X % 2;
            continue;
        }

        while (X >= 1) {
            N1 = (int)X / 1;
            X  = X % 1;
            continue;
        }
        
        while (X >= 0.50) {
            N2 = X / 0.50;
            X  = X % 0.50;
            continue;
        }
        
        while (X >= 0.25) {
            N3 = X / 0.25;
            X  = X % 0.25;
            continue;
        }
        
        while (X >= 0.10) {
            N4 = X / 0.10;
            X  = X % 0.10;
            continue;
        }
        
        while (X >= 0.05) {
            N5 = X / 0.05;
            X  = X % 0.05;
            continue;
        }
        
        while (X >= 0.01) {
            N6 = X / 0.01;
            X  = X % 0.01;
            break;
        }
        
        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00\n", X1);
        System.out.printf("%d nota(s) de R$ 50.00\n", X2);
        System.out.printf("%d nota(s) de R$ 20.00\n", X3);
        System.out.printf("%d nota(s) de R$ 10.00\n", X4);
        System.out.printf("%d nota(s) de R$ 5.00\n", X5);
        System.out.printf("%d nota(s) de R$ 2.00\n", X6);
        System.out.println("MOEDAS:");
        System.out.printf("%.0f moeda(s) de R$ 1.00\n", N1);
        System.out.printf("%.0f moeda(s) de R$ 0.50\n", N2);
        System.out.printf("%.0f moeda(s) de R$ 0.25\n", N3);
        System.out.printf("%.0f moeda(s) de R$ 0.10\n", N4);
        System.out.printf("%.0f moeda(s) de R$ 0.05\n", N5);
        System.out.printf("%.0f moeda(s) de R$ 0.01\n", N6);
    }
}