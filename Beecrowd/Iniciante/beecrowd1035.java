import java.util.Scanner;

public class Main {
    public static void main (String[]args) {
        Scanner entra = new Scanner(System.in);

        int a = entra.nextInt();
        int b = entra.nextInt();
        int c = entra.nextInt();
        int d = entra.nextInt();
        
        int soma1 = c + d;
        int soma2 = a + b;

        if (b > c && d > a && soma1 > soma2 && soma1 > 0 && soma2 > 0 && a % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
