import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();
        
        if(x == 0.0 && y == 0.0)
            System.out.println("Origem");
        else if(x != 0.0 && y == 0.0)
            System.out.println("Eixo X");
        else if(y != 0.0 && x == 0.0)
            System.out.println("Eixo Y");
        else if(x > 0 && y > 0)
            System.out.println("Q1");
        else if(x < 0 && y > 0)
            System.out.println("Q2");
        else if(x < 0 && y < 0)
            System.out.println("Q3");
        else if(x > 0 && y < 0) 
            System.out.println("Q4");

        sc.close();
    }
 
}