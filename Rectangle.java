/*Desenvolva uma classe para representar retângulos em termos
da sua largura e altura. Os objetos retângulo deverão ser
imutáveis, significando que uma vez criados as suas dimensões
já não podem ser alteradas. No seguinte código foi utilizada
a primitiva final para indicar que ambos os atributos não podem
ser alterados após a primeira atribuição de valor. As linhas a
itálico definem um médodo construtor.*/

class Rectangle {

	final int width;
	final int height;
	
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

/*Defina um método construtor adicional que cria um quadrado,
dado apenas um parâmetro para a dimensão do lado. Aqui pode
ser utilizada a primitiva this para que a execução deste
construtor corresponda a uma invocação do outro.*/
	
	Rectangle(int side) {
		this(side, side);
	}

/*Defina funções que permitam obter a seguinte informação sobre
o retângulo: a) área b) perímetro c) comprimento da diagonal
d) se o retângulo é um quadrado*/
	
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
	
/*Defina funções que permitam obter um novo objeto retângulo:
a) escalando o retângulo dado um fator, por exemplo, escalar um 
retângulo 4x5 por 2 daria origem a um novo retângulo 8x10.  Caso 
o fator seja igual a 1, deverá ser devolvido o próprio retângulo (this).*/
	
	Rectangle scale(int factor){
		if (factor == 1)
			return this;
		Rectangle res = new Rectangle(width * factor, height * factor);
		return res;
	}
	
/*b) somando outro retangulo, por exemplo, o retângulo 3x4 somado com os
 valores 4 e 5 daria origem a um retângulo 7x9.*/

	Rectangle sum(int width, int height){
		Rectangle res = new Rectangle(this.width + width, this.height + height);
		return res;
	}
	
/*Defina uma função que dado um retângulo r, indica se o retângulo que
invoca a função é maior em termos de área que r.*/
	
	boolean isBigger(Rectangle r){
		return (this.area() > r.area());
	}

/*Defina uma função estática (static) que dados dois retângulos,
devolve o retângulo que tem a área maior. Caso os retângulos tenham áreas
iguais deverá ser devolvido o primeiro.*/

	static Rectangle max(Rectangle a, Rectangle b){
		if (a.area() < b.area())
			return b;
		return a;
	}
}





















