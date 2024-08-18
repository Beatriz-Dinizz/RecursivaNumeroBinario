package view;

import controller.NumeroBinario;

public class Principal {

	public static void main(String[] args) {
		int n = 25;
		
		if(n < 0 || n > 2000) {
			System.out.println("Número inválido! Digite um número entre 0 e 2000.");
			return;
		}
		
		String numeroBinario = NumeroBinario.converterNumeroParaBinario(n);
		System.out.println("O número " + n + " em binário é: " + numeroBinario);
	}
}
