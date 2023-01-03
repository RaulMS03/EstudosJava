import java.util.Scanner;

public class Palavras {
    public static void main(String[] args) {
        Scanner entra = new Scanner(System.in);

        try { //tenta executar o codigo com um possivel erro
            String A = entra.nextLine();
            A.trim();
            
            escreverCaracter(A);
        } catch(NullPointerException e) { // captura o erro e executa
            System.out.println("Ocorreu um erro: " + e.getMessage());
        } finally { // finaliza o codigo
            System.out.println("FIM :)");
            entra.close();
        }
    }

    public static String escreverCaracter(String A) { //metodo criado pra contar palavras
        int palavra = (A.split(" ", -1).length); //pega a quantidade de espaços em branco
        System.out.println((palavra) + " palavras");
       
        if (palavra <= 10) {
            return A;
        } else {
            throw new NullPointerException("A frase deve conter até 10 palavras. Tente novamente:)");
        } // lança o erro
    }
    
}
