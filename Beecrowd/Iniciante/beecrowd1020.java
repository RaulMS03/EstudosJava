import java.util.Scanner;

public class Main {
    public static void main (String[]args) {
        Scanner entra = new Scanner(System.in);
        int N = entra.nextInt();
        int N1 = 0, N2 = 0, N3 = 0;

        while (N >= 365) {
            N1 = N / 365;
            N = N % 365;
            continue;
        }

        while (N >= 30) { 
            N2 = N / 30;
            N = N % 30;
            continue;
        }

        while (N >= 1) {
            N3 = N / 1;
            N = N % 1;
            break;
        }

        System.out.printf("%d ano(s)\n", N1);
        System.out.printf("%d mes(es)\n", N2);
        System.out.printf("%d dia(s)\n", N3);
    }
}