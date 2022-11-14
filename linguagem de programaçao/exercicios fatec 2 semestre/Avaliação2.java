import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner entra = new Scanner(System.in);

        try{ //código que inclui comandos/invocações de métodos que podem gerar uma situação de exceção.
            int A = entra.nextInt();
            int B = 0;

            calcularDivisao(A,B);
        } catch (ArithmeticException e){ //bloco de tratamento para a situação de exceção
            System.out.println("Ocorreu o erro: " + e.getMessage());
        } finally { /*bloco de código que sempre será executado após  o bloco try, independentemente de sua conclusão
ter ocorrido normalmente ou ter sido interrompida*/
            System.out.println("FINALLY");
            entra.close();
        }
    }

    public static void calcularDivisao(int A, int B) { // metodo pro calculo 
        System.out.println(A / B);
    }
}