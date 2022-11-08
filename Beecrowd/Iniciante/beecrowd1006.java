import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner entra = new Scanner(System.in);
        double A = entra.nextDouble();
        double B = entra.nextDouble();
        double C = entra.nextDouble();
        double x = 2;
        double y = 3;
        double z = 5;

        System.out.printf("MEDIA = %.1f\n", (((A * x) + (B * 3) + (C * 5))/10));
    }
}