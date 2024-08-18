package controller;

public class NumeroBinario {

	public NumeroBinario() {
		super();
	}
	
	public static String converterNumeroParaBinario(int n) {
		// Condição de parada: quando o número for 0, significa que a conversão foi finalizada.
		if(n == 0) {
			return "";
		} else {
			// Relação de chamada dos passos: utiliza n % 2 para obter o bit menos significativo do número
			// e concatena com o resultado da função recursiva, que continua a conversão do número dividido por 2.
			
			return converterNumeroParaBinario(n / 2) + String.valueOf(n % 2);
		}
	}
}
