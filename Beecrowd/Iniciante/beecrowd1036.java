import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner entra = new Scanner(System.in);

        double a = entra.nextDouble();
        double b = entra.nextDouble();
        double c = entra.nextDouble();
        
        double delta = b*b - (4 * a *c);

        double x1 = ((- b) + (Math.sqrt(delta))) / (2 * a);
        double x2 = ((- b) - (Math.sqrt(delta))) / (2 * a);

        if (delta < 0 || a == 0) {
            System.out.println("Impossivel calcular"); 
        } else {
            System.out.printf("R1 = %.5f\n", x1); 
            System.out.printf("R2 = %.5f\n", x2); 
        }
    } 
}
