import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner entra = new Scanner(System.in);
        int A = entra.nextInt();
        int B = entra.nextInt();
        double C = entra.nextDouble();

        int x = entra.nextInt();
        int y = entra.nextInt();
        double z = entra.nextDouble();

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", ((B * C) + (y * z)));
    }
}