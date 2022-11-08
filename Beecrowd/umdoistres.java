import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);

        int quantidade = sc.nextInt();
        String numeros = "";

        String palavras[] = new String[quantidade+1];
        for(int i = 0; i < palavras.length; i++){
            palavras[i] = sc.nextLine();

            if(palavras[i].length() != 0){
                if(palavras[i].length() == 5)
                    numeros += "3\n";
                else{
                    char primeiraLetra = palavras[i].charAt(0);
                    char segundaLetra = palavras[i].charAt(1);
                    char terceiraLetra = palavras[i].charAt(2);
                    if(primeiraLetra == 't' && segundaLetra == 'w')
                        numeros += "2\n";
                    else if(segundaLetra == 'w' && terceiraLetra == 'o')
                        numeros += "2\n";
                    else if(primeiraLetra == 't' && terceiraLetra == 'o')
                        numeros += "2\n";


                    else if(primeiraLetra == 'o' && segundaLetra == 'n')
                        numeros += "1\n";
                    else if(primeiraLetra == 'o' && terceiraLetra == 'e')
                        numeros += "1\n";
                    else if(segundaLetra == 'n' && terceiraLetra == 'e')
                        numeros += "1\n";

                }
            }
        }

        System.out.print(numeros);

        sc.close();
    }
 
}