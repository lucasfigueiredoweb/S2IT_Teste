package br.com.S2it.teste.questao8;

public class InteiroC {

	public static int NumeroC(String a, String b) {
		// Verifica se A ou B são nulos
		if (a == null || b == null) {
			return 0;
		}

		// Inicializa C
		String c = "";
		// Verifica e retorna o maior número entre A e B
		int tamanhoMax = Math.max(a.length(), b.length());
		// Itera de 0 até o maior número verificado
		for (int i = 0; i <= tamanhoMax; i++) {
			// Verifica se i é menor que o tamanho de A
			if (i < a.length()) {
				// Concatena C com o caractere de A na posição i
				c += a.charAt(i);
			}
			// Verifica se i é menor que o tamanho de B
			if (i < b.length()) {
				// Concatena C com o caractere de B na posição i
				c += b.charAt(i);
			}
		}

		// Verifica se o tamanho de C é maior que 1.000.000
		// Se for, retorna -1
		// Se não for, retorna o valor em inteiro de C
		return Integer.valueOf(c.toString()) > 1000000 ? -1 : Integer.valueOf(c.toString());
	}

}
