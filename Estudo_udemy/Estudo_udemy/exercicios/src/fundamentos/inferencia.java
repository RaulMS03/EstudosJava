package fundamentos;

public class inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		double d; // variavel declarada
		d = 123.65; // variavel inicializada
		System.out.println(d); // variavel usada
		
		/*	
		 * Exemplo abaixo nao funciona pois var deve ser 
		 * declarada e inicializada na mesma linha.
		 * 
		 * var e;
		 * e = 123.65;
		*/
	}
}
