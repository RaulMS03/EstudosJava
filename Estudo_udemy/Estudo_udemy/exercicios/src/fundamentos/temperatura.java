package fundamentos;
import java.util.Scanner;

public class temperatura {
	
	public static void main(String[] args) {
		// (ºF - 32) * 5/9 = ºC
		Scanner entra = new Scanner(System.in);
		
		int faren = entra.nextInt();
		final int AJUSTE = 32;
		final double FATOR = 5.0/9.0; // se dividir por 2 inteiros, da 0.
		double celcio = (faren - AJUSTE) * FATOR;
		
		System.out.println("O resultado é " + celcio + "ºC");
	}
}
