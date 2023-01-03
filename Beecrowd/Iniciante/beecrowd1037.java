import java.util.Scanner;

public class Main {
    public static void main (String[]args) {
        Scanner entra = new Scanner(System.in);

        double a = entra.nextDouble();
        
        if (a >= 0 && a <= 25.0) {
            System.out.println("Intervalo [0,25]");
        } else if (a > 25.0 && a <= 50.0) {
            System.out.println("Intervalo (25,50]");
        } else if (a > 50.0 && a <= 75.0) {
            System.out.println("Intervalo (50,75]");
        } else if (a > 75.0 && a <= 100.0) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
    }
}
