public class Semana4{

	static int[] naturals(int n){
		int i = 0;
		int[] v = new int[n];
		while (i < n){
			v[i] = i + 1;
			i++;
		}
		return v;
	}

	static int sum(int[] v) {
		int i = 0;
		int sum = 0;
		while (i < v.length){
			sum += v[i];
			i++;
		}
		return sum;	
	}

	static int[] randomDigits(int n){
		int i = 0;
		int[] v = new int[n];
		while (i < v.length){
			v[i] = (int)(Math.random() * 10);
			i++;
		}
		return v;
	}

	static void displayVector(int[] v){
		int i = 0;
		while (i < v.length){
			System.out.print(v[i] + " ");
			i++;
		}
	}
	public static void main(String[] args) {
		int[] v = naturals(4);
		int[] v2 = randomDigits(5);
		displayVector(v);
		System.out.println("and the sum is " + sum(v));
		System.out.print("Random vector is ");
		displayVector(v2);
	}
}