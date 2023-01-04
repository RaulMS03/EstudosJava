package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		// Informações do funcionario
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23; // maximo até 127, minimo -128.
		short numeroDeVoos = 542; // maximo até 32767, minimo até -32768.
		int id = 56789; // maximo até 2147483647, minimo até -2147483648.
		long pontosAcumulados = 3_234_845_223L; // depois de 2147483647 é interessente usar o long.
		
		/* Atenção:
		 * L = literal longo pois passa do maximo de numeros comportados no int.
		 * Valor maximo pra um long 922_337_203_685_477_580.
		 * Valor minimo -9_223_372_036_854_775_808.
		 */
		
		// Tipos numéricos reais
		float salario = 11_445.44;
	}
}
