import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner entra = new Scanner(System.in);
        double A = entra.nextDouble();
        double B = entra.nextDouble();
        double x = 3.5;
        double y = 7.5;

        System.out.printf("MEDIA = %.5f\n", (((A * x) + (B * y))/11));
    }
}