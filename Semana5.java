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
//Definir um procedimento para substituir todas as ocorręncias de
//determinado carácter por outro.

	static void replace(char a, char b, char[] v){
		for(int i = 0; i < v.length; i++)
			if (v[i] == a)
				v[i] = b;
	}

//Exercício A
//Defina uma funçăo para criar um vector com os caracteres consecutivos
//a partir de um carácter dado como argumento, de comprimento n.

	static char[] sequence(char c, int n){
		char[] v = new char[n];
		for (int i = 0; i < n; i++)
			v[i] = (char)(c + i);
		return v;
	}

//Exercício B
//Defina procedimentos sobre vetores que permitam:
//Substituir a primeira ocorręncia de determinado carácter por outro

	static void replaceFirstAwithB(char a, char b, char[] v){
		for(int i = 0; i < v.length; i++)
			if (v[i] == a){
				v[i] = b;
				return;
			}
	}
	
//Substituir a última ocorręncia de determinado carácter por outro

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
	
//Trocar os valores de duas posiçőes do vector

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
//Algoritmo de baralhaçăo. Implemente um procedimento de baralhaçăo
//para vectores de carateres com o algoritmo de Fisher-Yates. Neste
//contexto é útil definir uma funçăo auxiliar para obter um número
//inteiro aleatório entre zero e um dado número máximo (inclusive),
//bem como a utilizaçăo do procedimento definido anteriormente que
//troca duas posiçőes do vetor.

	static int randomIndex(int n){
		return (int)(Math.random() * (n + 1));
	}

	static void FisherYates(char[] v){
		for (int i = v.length - 1; i > 0; i--)
			swap(i, randomIndex(v.length - 1), v);
	}

//Exercício D
//Algoritmo de ordenaçăo. Implemente um procedimento de ordenaçăo
//(crescente) para vectores de carateres, através do algoritmo Bubble Sort.

	static void bubble(char[] v){
		boolean swapped;
		do{
			swapped = false;
			for (int i = 0; i < v.length - 1; i++){
				if (v[i] > v[i + 1]){
					swap(i, i + 1, v);
					swapped = true;
				}
			}
		}while(swapped);
	}

//Exercícios extra // A // a
//Definir função que permita acrescentar um carácter ao final de um vector
//de caracteres, obtendo um vector novo.

	static char[] concatEnd(char[] v, char c){
		char[] res = new char[v.length + 1];
		for (int i = 0; i < v.length; i++)
			res[i] = v[i];
		res[res.length - 1] = c;
		return res;
	}

//Exercícios extra // A // b
//Acrescentar um carácter no início de um vector de caracteres, obtendo um
//vector novo

	static char[] concatBegin(char[] v, char c){
		char[] res = new char[v.length + 1];
		res[0] = c;
		for (int i = 0; i < v.length; i++)
			res[i + 1] = v[i];
		return res;
	}

//Exercícios extra // B
//Defina um procedimento que substitui o valor de uma posição aleatória do
//vector por um dado caráter c.

	static void replaceRandom(char a, char[] v){
		v[(int)(Math.random() * v.length)] = a;
	}

//Exercícios extra // C
//Defina um procedimento que "troca as metades" de um vetor de carateres.

	static void swapHalfs(char[] v){
		for (int i = 0; i < v.length / 2; i++)
			swap(i, v.length / 2 + i + v.length % 2, v);
	}

	public static void main(String[] args){
		char[] vec1 = {'a', 'b', 'c', 'd', 'e'};
		char[] vec2 = {'a', 'z', 'b', 'c', 'x', 'd', 'e', 'm'};
		char[] vec3 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
		System.out.println(vec3);
		swapHalfs(vec3);
		System.out.println(vec3);
	}

}