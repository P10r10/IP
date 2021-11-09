public class Semana6{

//Trabalho prévio
//Defina funções sobre matrizes de inteiros que permitam:
//A. Criar uma matriz retangular com números inteiros de 0 a 9 aleatórios,
//dado o número de linhas e número de colunas.

	static int[][] randomMatrix(int lines, int columns){
		int[][] m = new int[lines][columns];
		for(int i = 0; i < m.length; i++)
			for(int j = 0; j < m[i].length; j++)
				m[i][j] = (int)(Math.random() * 10);
		return m;
	}

//B. Criar uma matriz quadrada com números inteiros de 0 a 9 aleatórios, dado
//apenas um inteiro correspondente ao número de linhas/colunas.

	static int[][] squareMatrix(int n){
		return randomMatrix(n, n);
	}

//C. Obter o somatório de todos os elementos de uma matriz dada como argumento.

	static int sumMatrix(int[][] m){
		int sum = 0;
		for(int i = 0; i < m.length; i++)
			for(int j = 0; j < m[i].length; j++)
				sum += m[i][j];
		return sum;
	}

//D. Saber o número de elementos de uma matriz dada como argumento. Recorde que
//as linhas de uma matriz (vetores) não têm necessariamente o mesmo comprimento.

	static int numElementsMatrix(int[][] m){
		int count = 0;
		for(int i = 0; i < m.length; i++)
			for(int j = 0; j < m[i].length; j++)
				count += 1;
		return count;
	}


//AUX
	static void displayMatrix(int[][] m){
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[i].length; j++)
				System.out.print(m[i][j] + " ");
			System.out.println();
		}
	}

	public static void main(String[] args){
		int[][] matrix = {{11, 2, 33, 1, 3},
					      {4, 6},
					      {707, 8, 29, 66}};
		displayMatrix(squareMatrix(3));
		System.out.println(numElementsMatrix(matrix));
	}
}