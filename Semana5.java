public class Semana5{

//Trabalho prévio A
//criar um vector de tamanho n preenchido com determinado carácter

	static char[] charVector(char c, int n) {
		char[] v = new char[n];
		for(int i = 0; i < n; i++)
			v[i] = c;
		return v;
	}

//Trabalho prévio B
//definir um procedimento para preencher todo o vector com determinado
//carácter

	static void fill(char c, char[] v){
		for(int i = 0; i < v.length; i++)
			v[i] = c;
	}

//Trabalho prévio C
//Definir um procedimento para substituir todas as ocorrências de
//determinado carácter por outro.

	static void replace(char a, char b, char[] v){
		for(int i = 0; i < v.length; i++)
			if (v[i] == a)
				v[i] = b;
	}

//Exercício A
//Defina uma função para criar um vector com os caracteres consecutivos
//a partir de um carácter dado como argumento, de comprimento n.

	static char[] sequence(char c, int n){
		char[] v = new char[n];
		for (int i = 0; i < n; i++)
			v[i] = (char)(c + i);
		return v;
	}

//Exercício B
//Defina procedimentos sobre vetores que permitam:
//Substituir a primeira ocorrência de determinado carácter por outro

	static void replaceFirstAwithB(char a, char b, char[] v){
		for(int i = 0; i < v.length; i++)
			if (v[i] == a){
				v[i] = b;
				return;
			}
	}
	
//Substituir a última ocorrência de determinado carácter por outro

	static void replaceLastAwithB(char a, char b, char[] v){
		for(int i = v.length - 1; i >= 0; i--)
			if (v[i] == a){
				v[i] = b;
				return;
			}
	}
	
//Rodar os seus elementos para a esquerda (o primeiro elemento
//passa a último)

	static void shiftLeft(char[] v){
		char tmp = v[0];
		for (int i = 0; i < v.length - 1; i++)
			v[i] = v[i + 1];
		v[v.length - 1] = tmp;
	}
	
//Rodar os seus elementos para a direita (o último elemento passa
//a primeiro)

	static void shiftRight(char[] v){
		char tmp = v[v.length - 1];
		for (int i = v.length - 1; i > 0; i--)
			v[i] = v[i - 1];
		v[0] = tmp;
	}
	
//Trocar os valores de duas posições do vector

	static void swap(int a, int b, char[] v){
		char tmp = v[a];
		v[a] = v[b];
		v[b] = tmp;
	}

//Inverter a ordem dos seus elementos
	static void invert(char[] v){
		for (int i = 0; i < v.length / 2; i++)
			swap(i, v.length - 1 - i, v);
	}

//Exercício C
//Algoritmo de baralhação. Implemente um procedimento de baralhação
//para vetores de carateres com o algoritmo de Fisher-Yates. Neste
//contexto é útil definir uma função auxiliar para obter um número
//inteiro aleatório entre zero e um dado número máximo (inclusive),
//bem como a utilização do procedimento definido anteriormente que
//troca duas posições do vetor.

	static int randomIndex(int n){
		return (int)(Math.random() * (n + 1));
	}

	static void FisherYates(char[] v){
		for (int i = 0; i < v.length - 1; i++)
			swap(i, randomIndex(i), v);
	}

//Exercício D
//Algoritmo de ordenação. Implemente um procedimento de ordenação
//(crescente) para vetores de carateres, através do algoritmo Bubble Sort.

	static int bubble(int[] v){
		for (int i = 0; i < v.length; i++)
			if (v[i] > v[i + 1])
				swap(i, i + 1, v)
				//TERMINAR
	
	}



	static void displayVector(char[] v){
		for (int i = 0; i < v.length; i++)
			System.out.print(v[i] + " ");
		System.out.println();
	}
	public static void main(String[] args){
		char[] vec = charVector('s', 10);
		char[] vec2 = {'a','b','c', 'd','e'};
		displayVector(vec2);
		FisherYates(vec2);
		displayVector(vec2);
	}

}