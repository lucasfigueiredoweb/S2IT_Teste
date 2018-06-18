package br.com.S2it.teste.questao8;

public class InteiroC {

	public static int NumeroC(String a, String b) {
		// Verifica se A ou B s�o nulos
		if (a == null || b == null) {
			return 0;
		}

		// Inicializa C
		String c = "";
		// Verifica e retorna o maior n�mero entre A e B
		int tamanhoMax = Math.max(a.length(), b.length());
		// Itera de 0 at� o maior n�mero verificado
		for (int i = 0; i <= tamanhoMax; i++) {
			// Verifica se i � menor que o tamanho de A
			if (i < a.length()) {
				// Concatena C com o caractere de A na posi��o i
				c += a.charAt(i);
			}
			// Verifica se i � menor que o tamanho de B
			if (i < b.length()) {
				// Concatena C com o caractere de B na posi��o i
				c += b.charAt(i);
			}
		}

		// Verifica se o tamanho de C � maior que 1.000.000
		// Se for, retorna -1
		// Se n�o for, retorna o valor em inteiro de C
		return Integer.valueOf(c.toString()) > 1000000 ? -1 : Integer.valueOf(c.toString());
	}

}
