import java.util.Scanner;

public class Main {
    public static void main (String[]args) {
        Scanner entra = new Scanner(System.in);
        int N = entra.nextInt();
        int N1 = 0, N2 = 0, N3 = 0;

        while (N >= 3600){
            N3  = N / 3600;
            N = N % 3600;
            continue;
        }

        while (N >= 60){
            N2  = N / 60;
            N = N % 60;
            continue;
        }

        while (N >= 1) {
            N1  = N / 1;
            N = N % 1;
            break;
        }

        System.out.printf("%d:%d:%d\n", N3, N2, N1);
    }
}