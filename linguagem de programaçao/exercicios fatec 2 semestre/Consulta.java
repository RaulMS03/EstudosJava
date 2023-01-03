import java.util.Scanner;

public class Consulta {
  public static void main(String[]args) {
     Scanner entra = new Scanner(System.in);
     System.out.println("Insira a Idade: ");

        /* aqui se apresenta o inicio do nosso sistema de relatório de pediatria, 
        o responsável da criança poderá preencher a ficha da mesma tendo de base parâmetros como Idade, 
        SPeso e Altura */

        /* TRATAMENTO EXCEÇÃO DE IDADE */
        try{ 
        /* o try executa o codigo com potencial de erro */

            int A = entra.nextInt();
            System.out.printf("%d ano(s). \n" , A);
            
            calcularIdade(A);
        } catch (ArithmeticException e){ 
            /* se der erro, tratamos com o catch informando o usuário */

            System.out.println("Ocorreu um erro: Idade não correspondida com o tipo de consulta. Recomendamos uma consulta adequada a idade.");
        } finally { 
            /* finaliza o tratamento */

            System.out.println("Continuar?");
        }

        /* TRATAMENTO DE EXCEÇÃO DE PESO E ALTURA */
        System.out.println("Insira o peso e altura: ");

        try {
            int B = entra.nextInt();
            int C = entra.nextInt();
            System.out.printf("%d kilos. \n" , B);
            System.out.printf("%d cm. \n" , C);
            
            calcularPeso(B);
            calcularAltura(C);

            System.out.println("Tudo certo para sua consulta:)");
        } catch (ArithmeticException e){ 
            System.out.println("Ocorreu um erro: Peso ou Altura incorretos. Insira novamente os dados.");
        } finally { 
            entra.close();
        }
    }

    /* A idade inserida deve ser menor que 12 anos para uso da ala pediatrica, se não, a exceção será tratada no catch por erro aritmético */

    /* MÉTODO DE CAPTURA IDADE */
    public static void calcularIdade(int A) { 
        if (A > 12) {
            throw new ArithmeticException("O valor inserido não pode ser maior que 12.");
        }
    }

    /* a idade e o peso inseridos deverão ser maiores que zero, caso ocorra alguma exceção, será tratada no catch também como erro aritmético */

    /* MÉTODO DE CAPTURA DO PESO  */
    public static int calcularPeso(int B) {
        if (B > 0) {
           return B;
        }  else {
            throw new ArithmeticException("O peso deve ser maior que 0.");
        } 
    }
    /* MÉTODO DE CAPTURA DE ALTURA */
    public static int calcularAltura(int C) {
        if (C > 0) {
            return C;
        } else {
            throw new ArithmeticException("A altura deve ser maior que 0.");
        }
    }
}