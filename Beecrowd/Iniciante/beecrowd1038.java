import java.util.Scanner;

public class Main {
    public static void main (String[]args) {
        Scanner entra = new Scanner(System.in);

        int a = entra.nextInt();
        int b = entra.nextInt();
        int c = a * b;

        if (a == 1) {
            
        } else if (a == 2) {

        } else if (a == 3) {

        } else if (a == 4) {

        } else if (a == 5) {

        }

        System.out.printf("Total: R$ %.2f", c);
    }

    public double lanche(double d, double e, double f, double g, double h) {
        int a = 0;

        d = 4.00;
        e = 4.50;
        f = 5.00;
        g = 2.00;
        h = 1.50;
    
        if (a == d) {
            return 1;
        } else if (a == e) {
            return 2;
        } else if (a == f){
            return 3;
        } else if (a == g) {
            return 4;
        } else if (a == h) {
            return 5;
        }
        return 0;
    }
} 
