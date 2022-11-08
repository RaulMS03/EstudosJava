import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

        int N, TR=0, TS=0, TC=0, quant;
        char tipo;

        Scanner input = new Scanner(System.in);
        N = input.nextInt();

        for (int i = 0; i < N; i++)
        {
            quant = input.nextInt();
            tipo = input.next().charAt(0);

            if (tipo == 'C') TC += quant;
            if (tipo == 'R') TR += quant;
            if (tipo == 'S') TS += quant;
        }
        int TOTAL = TC + TS + TR;
        System.out.printf("Total: %d cobaias\n", TOTAL);
        System.out.printf("Total de coelhos: %d\n", TC);
        System.out.printf("Total de ratos: %d\n", TR);
        System.out.printf("Total de sapos: %d\n", TS);
        System.out.printf("Percentual de coelhos: %.2f %%\n", ((double)TC/TOTAL*100));
        System.out.printf("Percentual de ratos: %.2f %%\n", ((double)TR/TOTAL*100));
        System.out.printf("Percentual de sapos: %.2f %%\n", ((double)TS/TOTAL*100));
    } 
}