import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        double[][] M = new double[12][12];
        double soma = 0;
        int col = M.length - 1;
        // variavel para a soma das diagonais 
        int cont = 0;
        String O = "";
        double sd = 0;
        Scanner sc = new Scanner(System.in);

        O = sc.nextLine();

        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M.length ; j++){
                M[i][j] = sc.nextDouble();
            }
        }

        // soma a segunda diagonal
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M.length; j++){
                if(j >= M.length - i){
                    sd += M[i][j];
                    cont++;
                }
            }
        }

        if(O.equals("S")) {
            System.out.printf("%.1f\n", sd);
        }else if(O.equals("M")) {
            sd /= cont;
            System.out.printf("%.1f\n", sd);
        }

    }
}