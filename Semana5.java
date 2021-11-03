public class Semana5{

//Trabalho pr�vio A
//criar um vector de tamanho n preenchido com determinado car�cter

	static char[] charVector(char c, int n) {
		char[] v = new char[n];
		for(int i = 0; i < n; i++)
			v[i] = c;
		return v;
	}

//Trabalho pr�vio B
//definir um procedimento para preencher todo o vector com determinado
//car�cter

	static void fill(char c, char[] v){
		for(int i = 0; i < v.length; i++)
			v[i] = c;
	}

//Trabalho pr�vio C
//Definir um procedimento para substituir todas as ocorr�ncias de
//determinado car�cter por outro.

	static void replace(char a, char b, char[] v){
		for(int i = 0; i < v.length; i++)
			if (v[i] == a)
				v[i] = b;
	}

//Exerc�cio A
//Defina uma fun��o para criar um vector com os caracteres consecutivos
//a partir de um car�cter dado como argumento, de comprimento n.

	static char[] sequence(char c, int n){
		char[] v = new char[n];
		for (int i = 0; i < n; i++)
			v[i] = (char)(c + i);
		return v;
	}

//Exerc�cio B
//Defina procedimentos sobre vetores que permitam:
//Substituir a primeira ocorr�ncia de determinado car�cter por outro

	static void replaceFirstAwithB(char a, char b, char[] v){
		for(int i = 0; i < v.length; i++)
			if (v[i] == a){
				v[i] = b;
				return;
			}
	}
	
//Substituir a �ltima ocorr�ncia de determinado car�cter por outro

	static void replaceLastAwithB(char a, char b, char[] v){
		for(int i = v.length - 1; i >= 0; i--)
			if (v[i] == a){
				v[i] = b;
				return;
			}
	}
	
//Rodar os seus elementos para a esquerda (o primeiro elemento
//passa a �ltimo)

	static void shiftLeft(char[] v){
		char tmp = v[0];
		for (int i = 0; i < v.length - 1; i++)
			v[i] = v[i + 1];
		v[v.length - 1] = tmp;
	}
	
//Rodar os seus elementos para a direita (o �ltimo elemento passa
//a primeiro)

	static void shiftRight(char[] v){
		char tmp = v[v.length - 1];
		for (int i = v.length - 1; i > 0; i--)
			v[i] = v[i - 1];
		v[0] = tmp;
	}
	
//Trocar os valores de duas posi��es do vector

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

//Exerc�cio C
//Algoritmo de baralha��o. Implemente um procedimento de baralha��o
//para vetores de carateres com o algoritmo de Fisher-Yates. Neste
//contexto � �til definir uma fun��o auxiliar para obter um n�mero
//inteiro aleat�rio entre zero e um dado n�mero m�ximo (inclusive),
//bem como a utiliza��o do procedimento definido anteriormente que
//troca duas posi��es do vetor.

	static int randomIndex(int n){
		return (int)(Math.random() * (n + 1));
	}

	static void FisherYates(char[] v){
		for (int i = 0; i < v.length - 1; i++)
			swap(i, randomIndex(i), v);
	}

//Exerc�cio D
//Algoritmo de ordena��o. Implemente um procedimento de ordena��o
//(crescente) para vetores de carateres, atrav�s do algoritmo Bubble Sort.

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