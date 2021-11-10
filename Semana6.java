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

//Desenvolva funções auxiliares sobre matrizes de inteiros que permitam:
//A. Obter todos os elementos da matriz num vetor.
	static int[] unroll(int[][] m){
		int[] v = new int[m.length * m[0].length];
		int v_idx = 0;
		for(int i = 0; i < m.length; i++)
			for(int j = 0; j < m[i].length; j++)
				v[v_idx++] = m[i][j];
		return v;
	}//rever
	
//B. Criar uma matriz, dados um vetor com valores, um número de linhas,
//e um número de colunas.

	static int[][] matrixFrom(int[] v, int lines, int columns){
		int[][] m = new int[lines][columns];
		int v_idx = 0;
		for(int i = 0; i < m.length; i++)
			for(int j = 0; j < m[i].length; j++)
				m[i][j] = v[v_idx++];
		return m;
	}//rever
	
//C. Verificar se uma matriz em Java (int[][]) é uma matriz de Álgebra
//válida (i.e. se todas as linhas têm o mesmo comprimento).
	
	static boolean isValidMatrix(int[][] m){
		for(int i = 1; i < m.length; i++)
			if(m[0].length != m[i].length)
				return false;
		return true;
	}

//D. Verificar se uma matriz em Java (int[][]) é uma matriz de Álgebra
//quadrada válida (i.e. se todas as linhas têm o mesmo comprimento e se
//o número de linhas corresponde ao número de colunas).
	
	static boolean isValidSquareMatrix(int[][] m){	
		return(isValidMatrix(m) && m.length == m[0].length);
	}

//E. Verificar se duas matrizes são iguais
	static boolean isEqualMatrix(int[][] ma, int[][] mb){
		for(int i = 0; i < ma.length; i++)
			for(int j = 0; j < ma[i].length; j++)
				if(ma[i][j] != mb[i][j])
					return false;
		return true;
	}
//F. Criar uma matriz identidade de tamanho n.

	static int[][] identity(int n){
		int[][] m = new int[n][n];
		for(int i = 0; i < n; i++)
			m[i][i] = 1;
		return m;
	}
	
//G. Multiplicar uma matriz por um escalar (modificando-a).

	static void multiplyByScalar(int[][] m, int s){
		for(int i = 0; i < m.length; i++)
			for(int j = 0; j < m[i].length; j++)
				m[i][j] *= s;
	}

//H. Efetuar a adição de duas matrizes, sendo que a primeira
//é modificada ficando com o resultado da adição.

	static void accumulate(int[][] m1, int[][] m2){
		for(int i = 0; i < m1.length; i++)
			for(int j = 0; j < m1[i].length; j++)
				m1[i][j] += m2[i][j];
	}

//I. Verificar se uma matriz é uma matriz identidade.

	static boolean isIdentity(int[][] m){
		return isEqualMatrix(identity(m.length), m); 
	}

//AUX
	static void displayMatrix(int[][] m){
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[i].length; j++)
				System.out.print(m[i][j] + " ");
			System.out.println();
		}
	}
	static void displayVector(int[] v){
		for(int i = 0; i < v.length; i++)
			System.out.print(v[i] + " ");
		System.out.println();
	}

	public static void main(String[] args){
		int[][] matrix_a = {{1, 2, 3, 4},
					      {4, 5, 6, 9},
					      {7, 8, 9, 4},
					      {1, 5, 4, 3}};
		int[][] matrix_b = identity(4);
		//int[] vector = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		System.out.print(isIdentity(matrix_a));
		//accumulate(matrix_a, matrix_b);
		//displayMatrix(matrix_b);
	}
}

