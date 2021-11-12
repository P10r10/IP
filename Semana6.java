public class Semana6{

//Trabalho prévio
//Defina funçőes sobre matrizes de inteiros que permitam:
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
//as linhas de uma matriz (vetores) năo tęm necessariamente o mesmo comprimento.

	static int numElementsMatrix(int[][] m){
		int count = 0;
		for(int i = 0; i < m.length; i++)
			for(int j = 0; j < m[i].length; j++)
				count += 1;
		return count;
	}

//Desenvolva funçőes auxiliares sobre matrizes de inteiros que permitam:
//A. Obter todos os elementos da matriz num vetor.
	
	static int[] unroll(int[][] m){
		int[] v = new int[numElementsMatrix(m)];
		int v_idx = 0;
		for(int i = 0; i < m.length; i++)
			for(int j = 0; j < m[i].length; j++)
				v[v_idx++] = m[i][j];
		return v;
	}
	
//B. Criar uma matriz, dados um vetor com valores, um número de linhas,
//e um número de colunas.

	static int[][] matrixFrom(int[] v, int lines, int columns){
		int[][] m = new int[lines][columns];
		for(int i = 0; i < m.length; i++)
			for(int j = 0; j < m[i].length; j++)
				m[i][j] = v[i * m[i].length + j];
		return m;
	}
	
//C. Verificar se uma matriz em Java (int[][]) é uma matriz de álgebra
//válida (i.e. se todas as linhas tęm o mesmo comprimento).
	
	static boolean isValidMatrix(int[][] m){
		for(int i = 1; i < m.length; i++)
			if(m[0].length != m[i].length)
				return false;
		return true;
	}

//D. Verificar se uma matriz em Java (int[][]) é uma matriz de álgebra
//quadrada válida (i.e. se todas as linhas tęm o mesmo comprimento e se
//o número de linhas corresponde ao número de colunas).
	
	static boolean isValidSquareMatrix(int[][] m){	
		return(isValidMatrix(m) && m.length == m[0].length);
	}

//E. Verificar se duas matrizes săo iguais
	
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

//H. Efetuar a adiçăo de duas matrizes, sendo que a primeira
//é modificada ficando com o resultado da adiçăo.

	static void accumulate(int[][] m1, int[][] m2){
		for(int i = 0; i < m1.length; i++)
			for(int j = 0; j < m1[i].length; j++)
				m1[i][j] += m2[i][j];
	}

//I. Verificar se uma matriz é uma matriz identidade.

	static boolean isIdentity(int[][] m){
		return isEqualMatrix(identity(m.length), m); 
	}

//J. Obter uma coluna da matriz como um vetor, dado o índice da coluna.
	
	static int[] getColumn(int[][] m, int idx){
		int[] v = new int[m.length];
		for(int i = 0; i < v.length; i++)
			v[i] = m[i][idx];
		return v;
	}

//K. Obter a matriz transposta de uma matriz.
	
	static int[][] transpose(int[][] m){
		int[][] t = new int[m[0].length][m.length];
		for(int i = 0; i < m[0].length; i++)
			t[i] = getColumn(m, i);
		return t;
	}

//L. Verificar se uma matriz é simétrica.
	
	static boolean isSimetric(int[][] m){
		return isEqualMatrix(m, transpose(m));
	}

//Exercício extra
//Defina uma função para multiplicar duas matrizes, assumindo que as
//mesmas têm dimensões válidas para tal operação.
	
	static int prodVectors(int[] a, int[] b){
		int sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i] * b[i];
		return sum;
	}

	static int[][] prodMatrix(int[][] a, int[][] b){
		int[][] res = new int[a.length][b[0].length];
		for(int i = 0; i < res.length; i++)
			for(int j = 0; j < res[i].length; j++)
				res[i][j] = prodVectors(getColumn(transpose(a), i), getColumn(b, j));
		return res;
	}
	
//AUXILIARY FUNCTIONS
	
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

//MAIN FOR TESTING PURPOSES
	
	public static void main(String[] args){
		int[][] matrix_a = {{1, 2, 3, 4},
					      {5, 6, 7, 8},
					      {9, 0, 1, 2},
					      {3, 4, 5, 6}};
		int[][] matrix_b = identity(4);
		int[][] matrix_c = {{1, 2},
					        {3, 4}};
		int[][] matrix_d = {{1, 2, -1, 10},
		        			{3, 4, 6, -13}};
		int[][] matrix_e = {{1, 9, 9},
							{9, 1, 9},
							{9, 9, 1}};
		int[] vector = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		int[] vector_a = {1, 2, 5};
		int[] vector_b = {3, 4, -1};
		System.out.print(prodVectors(vector_a, vector_b));
		accumulate(matrix_a, matrix_b);
		displayMatrix(matrix_c);
		System.out.println(isSimetric(matrix_e));
		displayMatrix(prodMatrix(matrix_d, matrix_a));
	}
}
