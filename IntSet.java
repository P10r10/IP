/* Desenvolva uma classe IntSet para representar conjuntos
 * de inteiros com determinada capacidade (cardinalidade
 * m�xima).*/
class IntSet {
	private int[] vector;
	private int next;
	
/* Dever� ser poss�vel criar um conjunto vazio,
 * dada uma capacidade.*/	
	IntSet(int capacity){
		vector = new int[capacity];
		next = 0;
	}
	
/* Dever� ser poss�vel tamb�m criar um conjunto fornecendo
 * os seus elementos num vetor de inteiros.*/ 
	IntSet(int[] elems){
		vector = elems;
		next = vector.length;
	}
/*1.Saber a sua capacidade.*/	
	int getSize(){
		return vector.length;
	}
	
/*2.Saber a sua cardinalidade (n�mero de elementos).*/
	int getNbElements(){
		return next;
	}
	
/*3.Verificar se � um conjunto vazio.*/
	boolean isEmpty(){
		return next == 0;
	}

/*4.Verificar se o conjunto est� cheio (n�mero de
 * elementos � igual � capacidade).*/
	boolean isFull(){
		return next == getSize();
	}

/*5.Verificar se determinado n�mero existe no conjunto.*/
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
	
/*7.Adicionar um n�mero ao conjunto. Aten��o: num conjunto
 *  n�o existem n�meros repetidos.*/
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
	
/*10.Obter um novo conjunto que resulta da uni�o com um conjunto dado*/
	IntSet union(IntSet set){
		IntSet res = new IntSet(getSize() + set.getSize());
		for (int i = 0; i < next; i++)
			res.addElement(vector[i]);
		for (int i = 0; i < set.next; i++)
			if (!isInSet(set.vector[i]))
				res.addElement(set.vector[i]);
		return res;
	}

/*11.Obter um novo conjunto que resulta da interse��o com um conjunto dado.*/
	IntSet intersection(IntSet set){
		IntSet res = new IntSet(Math.max(getSize(), set.getSize()));
		for (int i = 0; i < next; i++)
			if (set.isInSet(vector[i]))
				res.addElement(vector[i]);
		return res;
	}
	
	
	
	
		
}