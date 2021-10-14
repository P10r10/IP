import java.util.Scanner;

public class Semana2{
	static int gcd(int maior, int menor){
		int temp;
		//transforma maior e menor nos seus absolutos
		if (maior < 0)
			maior = -maior;
		if (menor < 0)
			menor = -menor;
		//troca maior por menor caso necessário
		if (maior < menor){
			temp = maior;
			maior = menor;
			menor = temp;
		}
		//algoritmo gcd Euclides
		while (maior % menor != 0){
			temp =  maior % menor;
			maior = menor;
			menor = temp;
		}
		return menor;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insert two ints: ");
		int x = input.nextInt();
		int y = input.nextInt();
		System.out.println(gcd(x, y));
	}
}