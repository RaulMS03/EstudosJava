package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		double raio = 3.4; // var
		final double PI = 3.14159; // const
		
		double area = PI * raio *raio;
		System.out.println("Área = " + area + "m².");
		
		raio = 10;
		area = PI * raio *raio;
		System.out.println("Área = " + area + "m².");
	}
}
