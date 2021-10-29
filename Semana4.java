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

	static double mean(int[] v){
		return (double)sum(v) / v.length; 
	}
	
	static int[] copy(int[] v, int n){
		int[] cpy = new int[n];
		int i = 0;
		while (i < cpy.length && i < v.length){
			cpy[i] = v[i];
			i++;
		}
		while (i < cpy.length){
			cpy[i] = 0;
			i++;
		}
		return cpy; 
	}
	
	static int[] copyV2(int[] v){
		return copy(v, v.length);
	}
	
	static boolean exists(int n, int[] v){
		int i = 0;
		while(i < v.length){
			if (n == v[i])
				return true;
			i++;
		}
		return false;
	}
	
	static int count(int n, int[] v){
		int i = 0;
		int count = 0;
		while(i < v.length){
			if (n == v[i])
				count++;
			i++;
		}
		return count;
	}
	
	static int max(int[] v){
		int i = 0;
		int max = v[0];
		while(i < v.length){
			if (max < v[i])
				max = v[i];
			i++;
		}
		return max;
	}
	
	static int[] subArray(int a, int b, int[] v){
		int[] sub = new int[b - a + 1];
		int i = 0;
		while(a <= b)
			sub[i++] = v[a++];
		return sub;
	}
	
	static int[] firstHalf(int[] v, boolean include){
		int size = v.length / 2;
		if (include && v.length % 2 != 0)
			size++;
		int[] half = new int[size];
		int i = 0;
		while(i < size)
			half[i] = v[i++];
		return half;
	}
	
	static int[] secondHalf(int[] v, boolean include){
		int size = v.length / 2;
		if (include && v.length % 2 != 0)
			size++;
		int[] half = new int[size];
		int i = 0;
		int j = v.length - size;
		while(j < v.length)
			half[i++] = v[j++];
		return half;
	}
	
	static int[] merge(int[] v1, int[] v2){
		int[] merged = new int[v1.length + v2.length];
		int i = 0;
		int j = 0;
		while (i < v1.length)
			merged[i] = v1[i++];
		while (j < v2.length)
			merged[i++] = v2[j++];
		return merged;
	}
	
	static int[] invert(int[] v){
		int[] inv = new int[v.length];
		int i = 0;
		while (i < v.length){
			inv[v.length - i - 1] = v[i];
			i++;
		}
		return inv;
	}
	
	static int randomFromVec(int[] v){
		return v[(int)(Math.random() * v.length)];
	}
	
	static int[] duplicateEveryElement(int[] v){
		int[] dup = new int[v.length * 2];
		int i = 0;
		while (i < v.length){
			dup[2 * i] = v[i];
			dup[2 * i + 1] = v[i];
			i++;
		}
		return dup;
	}
	
	static int[] duplicateInverted(int[] v){
		int[] dup = new int[v.length * 2];
		int i = 0;
		while (i < v.length){
			dup[i] = v[i];
			dup[2 * v.length - i - 1] = v[i];
			i++;
		}
		return dup;
	}
	
	static int[] copyWithoutMiddleElement(int[] v){
		int size = v.length;
		int i = 0;
		int j;
		if (v.length % 2 != 0)
			size--;
		int[] res = new int[size];
		while (i < size / 2)
			res[i] = v[i++];
		i = size - 1;
		j = v.length - 1;
		while (i >= size / 2)
			res[i--] = v[j--];
		return res;
	}
	
	static int fibonacci(int n){
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}
	static int[] fibonacciSequence(int n){
		int[] v = new int[n];
		int i = 0;
		while (i < n)
			v[i] = fibonacci(i++);
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
		//int[] v = {1, 2, 3, 4, 5, 6, 7};
		displayVector(fibonacciSequence(17));
		//System.out.print(fibonacci(15));
	}
}