import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner entra = new Scanner(System.in);
        int A = entra.nextInt();
        int B = 0;
        
        try{
            calcular(A,B);
        } catch (ArithmeticException e){
            System.out.println("Ocorreu o erro: " + e.getMessage());
        }
    }

    public static void calcular(int A, int B) {
        System.out.println(A / B);
    }
}