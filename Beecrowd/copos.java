import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  
        String moeda = sc.next();  

        for (int i=0; i<N; i++) {
            int t = sc.nextInt();  
            if (t == 1) {
            if (moeda.equals("A")) moeda = "B";
            else if (moeda.equals("B")) moeda = "A";
            }
            else if (t == 2) {
            if (moeda.equals("B")) moeda = "C";
            else if (moeda.equals("C")) moeda = "B";
            }
            else {
            if (moeda.equals("A")) moeda = "C";
            else if (moeda.equals("C")) moeda = "A";
            }
        }
        System.out.println(moeda);
    }
}
