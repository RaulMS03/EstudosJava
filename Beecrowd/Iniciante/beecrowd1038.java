import java.util.Scanner;

public class Main {
    public static void main (String[]args) {
        Scanner entra = new Scanner(System.in);
    
        int a = entra.nextInt();
        int b = entra.nextInt();
        
        double c = b * 4.00;
        double d = b * 4.50;
        double e = b * 5.00;
        double f = b * 2.00;
        double g = b * 1.50;
        
        if (a == 1) {
            System.out.println("Total: R$ " + c + "0");
        } else if (a == 2) {
            System.out.println("Total: R$ " + d + "0");
        } else if (a == 3) {
            System.out.println("Total: R$ " + e + "0");
        } else if (a == 4) {
            System.out.println("Total: R$ " + f + "0");
        } else if (a == 5) {
            System.out.println("Total: R$ " + g + "0");
        } 
    }
} 
