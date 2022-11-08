import java.util.Scanner;

public class Main {
    public static void main (String[]args) {
        Scanner entra = new Scanner(System.in);
        int X = entra.nextInt();
        double Y = entra.nextDouble();

        System.out.printf("%.3f km/l\n", (X/Y));
    }
}