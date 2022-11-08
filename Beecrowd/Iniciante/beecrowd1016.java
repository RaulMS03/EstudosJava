import java.util.Scanner;

public class Main {
    public static void main (String[]args) {
        Scanner entra = new Scanner(System.in);
        int X = entra.nextInt();
        int Y = X * 2;
        
        System.out.println(Y + " minutos");
    }
}