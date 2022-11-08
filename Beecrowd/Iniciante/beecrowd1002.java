import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner entra = new Scanner(System.in);
            double n = 3.14159;
            double raio = entra.nextDouble();

            System.out.printf("A=%.4f\n", ((raio * raio) * n));
    }
}