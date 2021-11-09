import java.util.Scanner;

public class Semana3{
	static boolean isPrime(int n){
		int i = 2;

		if (n <= 1)
			return false;
		while (i < n){
			if (n % i == 0)
				return false;
			i++;
		}
		return true;
	}

	static int largerDifferenceBetweenPrimes(int n){
		int dif = 0;
		int i = 3;//só vamos testar a partir do primo 3
		int lowPrime = 2;

		while (i <= n){
			if (isPrime(i)){
				if (dif < i - lowPrime)
					dif = i - lowPrime;
				lowPrime = i;
			}
			i++;
		}
		return dif;
	}

	static int fibonacci(int n){
		if (n == 0 || n == 1)
			return n;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 0;
		System.out.println("First 100 prime numbers:\n");

		while(i <= 100){
			if(isPrime(i))
				System.out.print(i + " ");
			i++;
		}
		System.out.println("\n\nInsert a positive integer: ");
		int a = input.nextInt();
		System.out.print("\nThe largest difference between primes until "
						 + a + " is ");
		System.out.println(largerDifferenceBetweenPrimes(a) + ".");
		System.out.println("\n\nInsert a positive integer: ");
		int b = input.nextInt();
		System.out.println("The fibonacci of " + b + " is " +
			fibonacci(b));
	}
}