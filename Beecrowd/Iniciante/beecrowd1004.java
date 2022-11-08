import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner entra = new Scanner(System.in);
        int A = entra.nextInt();
        int B = entra.nextInt();

        System.out.printf("PROD = %d\n", (A * B));
    }
}