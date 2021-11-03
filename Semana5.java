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
//sequence('c', 3) -> {'c', 'd', 'e'}

	static void displayVector(char[] v){
		for (int i = 0; i < v.length; i++)
			System.out.print(v[i] + " ");
		System.out.println();
	}
	public static void main(String[] args){
		char[] vec = charVector('s', 10);
		char[] vec2 = {'a','b','b','a'};
		displayVector(vec);
		fill('A', vec);
		displayVector(vec2);
		replace('b', 'x', vec2);
		displayVector(vec2);
	}

}