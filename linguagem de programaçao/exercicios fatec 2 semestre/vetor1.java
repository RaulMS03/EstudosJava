import java.util.Scanner; 

public class Main {
    public static void main (String[]args){
        Scanner entra = new Scanner(System.in);
        
        int [] numeros; 
        numeros = new int [20];
        int i;
        
        for (i = 0; i < 20; i++){
            System.out.println("Insira o valor da posição do vetor:" + i);
            numeros [i] = entra.nextInt();
        }
        
        for (i = 19; i >= 0;i--){
            System.out.println("Valor do Vetor" + numeros[i]);
        }
        
    }
}