package br.com.S2it.teste.questao9;

public class BinaryTree {

	Integer valor;
	BinaryTree left;
	BinaryTree right;

	// Inicializa arvore apenas com valor
	public BinaryTree(int valor) {
		this.valor = valor;
		this.left = null;
		this.right = null;
	}

	// Insere valor na Tree e calcula soma dos nós Sucessores
	public int InserirValorNaTree(int valorParam) {
		// Inicializa soma com 0
		int soma = 0;
		// Salva valor da tree
		int valorTree = valor;

		// Verifica se o valor do nó enviado é menor que o da Tree
		if (valorParam < valorTree) {
			// Verifica se o nó esquerdo é nulo
			if (this.left == null) {
				// Inicializa Arvore esquerda com o valor enviado
				left = new BinaryTree(valorParam);
			}
			// Insere o valor Ta tree da esquerda
			left.InserirValorNaTree(valorParam);

			// Valor do nó passado enviado é maior que o da Tree
		} else {
			// Verifica se o nó direito é nulo
			if (right == null) {
				// Inicializa Arvore direita com o valor enviado
				right = new BinaryTree(valorParam);
			}
			// Insere o valor Ta tree da direita
			right.InserirValorNaTree(valorParam);

		}
		// Itera sobre a Tree somando seus sucessores
		while (valor != null) {
			if (valorParam < valor) {
				soma += valor;
				valor = getLeft().getValor();
			} else if (valorParam > valor)
				valor = getRight().getValor();
			else
				break;
		}

		return soma;

	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public BinaryTree getLeft() {
		return left;
	}

	public void setLeft(BinaryTree left) {
		this.left = left;
	}

	public BinaryTree getRight() {
		return right;
	}

	public void setRight(BinaryTree right) {
		this.right = right;
	}

}
