import java.util.Scanner;

public class Main {
    public static void main (String[]args) {
        Scanner entra = new Scanner(System.in);
        int A = entra.nextInt();
        int B = entra.nextInt();
        int C = entra.nextInt();
        var MaiorAB = Math.max(A , B);
        var Maior = Math.max(MaiorAB, C);

        System.out.printf("%d eh o maior\n", Maior);
    }
}