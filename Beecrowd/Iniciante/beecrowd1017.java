import java.util.Scanner;

public class Main {
    public static void main (String[]args) {
        Scanner entra = new Scanner(System.in);
        double A = entra.nextDouble();
        double B = entra.nextDouble();
        var calculo = (B/12*A);

        System.out.printf("%.3f\n", calculo);
    }
}