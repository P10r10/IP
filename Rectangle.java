/*Desenvolva uma classe para representar ret�ngulos em termos
da sua largura e altura. Os objetos ret�ngulo dever�o ser
imut�veis, significando que uma vez criados as suas dimens�es
j� n�o podem ser alteradas. No seguinte c�digo foi utilizada
a primitiva final para indicar que ambos os atributos n�o podem
ser alterados ap�s a primeira atribui��o de valor. As linhas a
it�lico definem um m�dodo construtor.*/

class Rectangle {

	final int width;
	final int height;
	
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

/*Defina um m�todo construtor adicional que cria um quadrado,
dado apenas um par�metro para a dimens�o do lado. Aqui pode
ser utilizada a primitiva this para que a execu��o deste
construtor corresponda a uma invoca��o do outro.*/
	
	Rectangle(int side) {
		this(side, side);
	}

/*Defina fun��es que permitam obter a seguinte informa��o sobre
o ret�ngulo: a) �rea b) per�metro c) comprimento da diagonal
d) se o ret�ngulo � um quadrado*/
	
	int area(){
		return width * height;
	}
	
	int perimeter(){
		return width * 2 + height * 2;
	}
	
	double diagonal(){	
		return Math.sqrt(width * width + height * height);
	}
	
	boolean isSquare(){
		return (width == height);
	}
	
/*Defina fun��es que permitam obter um novo objeto ret�ngulo:
a) escalando o ret�ngulo dado um fator, por exemplo, escalar um 
ret�ngulo 4x5 por 2 daria origem a um novo ret�ngulo 8x10.  Caso 
o fator seja igual a 1, dever� ser devolvido o pr�prio ret�ngulo (this).*/
	
	Rectangle scale(int factor){
		if (factor == 1)
			return this;
		Rectangle res = new Rectangle(width * factor, height * factor);
		return res;
	}
	
/*b) somando outro retangulo, por exemplo, o ret�ngulo 3x4 somado com os
 valores 4 e 5 daria origem a um ret�ngulo 7x9.*/

	Rectangle sum(int width, int height){
		Rectangle res = new Rectangle(this.width + width, this.height + height);
		return res;
	}
	
/*Defina uma fun��o que dado um ret�ngulo r, indica se o ret�ngulo que
invoca a fun��o � maior em termos de �rea que r.*/
	
	boolean isBigger(Rectangle r){
		return (this.area() > r.area());
	}

/*Defina uma fun��o est�tica (static) que dados dois ret�ngulos,
devolve o ret�ngulo que tem a �rea maior. Caso os ret�ngulos tenham �reas
iguais dever� ser devolvido o primeiro.*/

	static Rectangle max(Rectangle a, Rectangle b){
		if (a.area() < b.area())
			return b;
		return a;
	}
}





















