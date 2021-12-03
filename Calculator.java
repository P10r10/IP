/*Definicao de uma classe calculadora*/

class Calculator {
    int value;

    void plus(int n) {
        value += n;
    }

    void minus(int n) {
        value -= n;
    }

    void times(int n) {
    	int tmp = 0;
    	for (int i = 0; i < n; i++)
    		tmp += value;
    	value = tmp;
    }

    void divide(int n) {
    	int count = 0;
    	while (value >= n){
    		count++;
    		value -= n;
    	}
    	value = count;
    }

     void modulus(int n) {
    	while (value >= n)
    		value -= n;
    }

    void power(int n) {
    	int tmp = 1;
    	for (int i = 0; i < n; i++)
        	tmp *= value;
        value = tmp;
	}

	void reset() {
        value = 0;
    }
}