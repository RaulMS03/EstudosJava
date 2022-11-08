import java.util.Scanner;

public class Main {
    public static void main (String[]args) {
        Scanner entra = new Scanner(System.in);
        int A = entra.nextInt();
        int B = entra.nextInt();
        double C = entra.nextDouble();

        System.out.printf("NUMBER = %d\n", A);
        System.out.printf("SALARY = U$%.2f\n", (B * C));
    }
}