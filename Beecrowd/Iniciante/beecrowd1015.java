import java.util.Scanner;

public class Main {
    public static void main (String[]args) {
        Scanner entra = new Scanner(System.in);
        double x1 = entra.nextDouble();
        double y1 = entra.nextDouble();
        double x2 = entra.nextDouble();
        double y2 = entra.nextDouble();
        var Distancia = Math.pow((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1), 0.5);

        System.out.printf("%.4f\n", Distancia);
    }
}