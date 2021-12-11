/* Desenvolva uma classe IntSet para representar conjuntos
 * de inteiros com determinada capacidade (cardinalidade
 * máxima).*/
class IntSet {
	private int[] vector;
	private int next;
	
/* Deverá ser possível criar um conjunto vazio,
 * dada uma capacidade.*/	
	IntSet(int capacity){
		vector = new int[capacity];
		next = 0;
	}
	
/* Deverá ser possível também criar um conjunto fornecendo
 * os seus elementos num vetor de inteiros.*/ 
	IntSet(int[] elems){
		vector = elems;
		next = vector.length;
	}
/*1.Saber a sua capacidade.*/	
	int getSize(){
		return vector.length;
	}
	
/*2.Saber a sua cardinalidade (número de elementos).*/
	int getNbElements(){
		return next;
	}
	
/*3.Verificar se é um conjunto vazio.*/
	boolean isEmpty(){
		return next == 0;
	}

/*4.Verificar se o conjunto está cheio (número de
 * elementos é igual à capacidade).*/
	boolean isFull(){
		return next == getSize();
	}

/*5.Verificar se determinado número existe no conjunto.*/
	boolean isInSet(int nb){
		for (int i = 0; i < next; i++)
			if (vector[i] == nb)
				return true;
		return false;
	}
	
/*6.Obter os elementos do conjunto*/
	int[] getElements(){
		return vector;
	}
	
/*7.Adicionar um número ao conjunto. Atenção: num conjunto
 *  não existem números repetidos.*/
	void addElement(int nb){
		if (isFull())
			throw new IllegalStateException("Set is full!");
		if (isInSet(nb))
			throw new IllegalArgumentException("Number already in set!");
		vector[next++] = nb;
	}
	
/*8.Remover um elemento do conjunto, caso exista.*/
	void removeElement(int nb){
		if (isEmpty())
			throw new IllegalStateException("Set is empty!");
		if (!isInSet(nb))
			throw new IllegalArgumentException("Number not in set!");
		for (int i = 0; i < next; i++)
			if (vector[i] == nb){
				vector[i] = vector[next - 1];
				next--;
			}
	}
	
/*9.Dobrar a capacidade do conjunto.*/
	void doubleCapacity(){
		int[] res = new int[2 * getSize()];
		for (int i = 0; i < next; i++)
			res[i] = vector[i];
		vector = res;
	}
	
/*10.Obter um novo conjunto que resulta da união com um conjunto dado*/
	IntSet union(IntSet set){
		IntSet res = new IntSet(getSize() + set.getSize());
		for (int i = 0; i < next; i++)
			res.addElement(vector[i]);
		for (int i = 0; i < set.next; i++)
			if (!isInSet(set.vector[i]))
				res.addElement(set.vector[i]);
		return res;
	}

/*11.Obter um novo conjunto que resulta da interseção com um conjunto dado.*/
	IntSet intersection(IntSet set){
		IntSet res = new IntSet(Math.max(getSize(), set.getSize()));
		for (int i = 0; i < next; i++)
			if (set.isInSet(vector[i]))
				res.addElement(vector[i]);
		return res;
	}
	
	
	
	
		
}