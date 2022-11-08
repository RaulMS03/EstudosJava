import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner entra = new Scanner(System.in);
        int N = entra.nextInt();
        int N1 = 0, N2 = 0, N3 = 0, N4 = 0, N5 = 0, N6 = 0, N7 = 0;
        
        System.out.printf("%d\n", N);
        
        while(N >= 100) {
            N1 = N / 100;
            N = N % 100;
            continue;
        }
        while (N >= 50) { 
            N2 = N / 50;
            N = N % 50;
            continue;
        }

        while (N >= 20) {
            N3 = N / 20;
            N = N % 20;
            continue;
        }

        while (N >= 10) {
            N4 = N / 10;
            N = N % 10;
            continue;
        }

        while (N >= 5) {
            N5 = N / 5;
            N = N % 5;
            continue;
        }

        while (N >= 2) {
            N6 = N / 2;
            N = N % 2;
            continue;
        }

        while (N == 1) {
            N7 = N / 1;
            N = N % 1;
            break;
        }

        System.out.printf("%d nota(s) de R$ 100,00\n", N1);
        System.out.printf("%d nota(s) de R$ 50,00\n", N2);
        System.out.printf("%d nota(s) de R$ 20,00\n", N3);
        System.out.printf("%d nota(s) de R$ 10,00\n", N4);
        System.out.printf("%d nota(s) de R$ 5,00\n", N5);
        System.out.printf("%d nota(s) de R$ 2,00\n", N6);
        System.out.printf("%d nota(s) de R$ 1,00\n", N7);
    }
}