import java.util.Scanner;

public class Main {
    public static void main (String[]args) {
        Scanner entra = new Scanner(System.in);
        double A = entra.nextDouble();
        double B = entra.nextDouble();
        double C = entra.nextDouble();
        double n = 3.14159;

        System.out.printf("TRIANGULO: %.3f\n", ((A * C)/2));
        System.out.printf("CIRCULO: %.3f\n", ((C * C) * n));
        System.out.printf("TRAPEZIO: %.3f\n", (((A + B) * C)/2));
        System.out.printf("QUADRADO: %.3f\n", (B * B));
        System.out.printf("RETANGULO: %.3f\n", (A * B));
    }
}