import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner entra = new Scanner(System.in);
        String A = entra.nextLine();
        double B = entra.nextDouble();
        double C = entra.nextDouble();

        System.out.printf("TOTAL = R$ %.2f\n", ((C * 0.15) + B));
    }
}