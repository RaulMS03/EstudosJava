import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

        int N;
        
        Scanner input = new Scanner(System.in);
        N = input.nextInt();

        for (int i = 0; i < N; i++)
            System.out.printf("%d %d %d PUM\n", i*4+1, i*4+2, i*4+3);
    } 
}