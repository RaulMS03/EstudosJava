import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {

        int X;

        Scanner input = new Scanner(System.in);
        X = input.nextInt();

        if(X % 2 == 0) //par
            X++;

        for (int i = 0; i < 6; i++, X += 2)
            System.out.printf("%d\n", X); 
    }
 
}