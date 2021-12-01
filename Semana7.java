public class Semana7{
	
//A. Construir uma cor aleatoria
	
	static Color randomColor(){
		Color c = new Color((int)(Math.random() * 256),
							(int)(Math.random() * 256),
							(int)(Math.random() * 256));
		return c;
	}
//B. Construir um vector de cores aleatórias dado um comprimento
	
	static Color[] randomColorArray(int length){
		Color[] v = new Color[length];
		for(int i = 0; i < v.length; i++)
			v[i] = randomColor();
		return v;
	}   
//C. Dada uma cor, obter a cor inversa (255 - R, 255 - G, 255 - B)
	static Color inverted(Color color){
		Color c = new Color(255 - color.getR(),
							255 - color.getG(),
							255 - color.getB());
		return c;
	}
//D. Dada uma cor, obter uma cor mais clara/escura, dependendo de um
//acréscimo (delta) (positivo - mais clara; negativo - mais escura).
//Deve ter-se atenção para os valores se manterem válidos.
	
	static Color changeBrightness(Color color, int delta){
		Color c = new Color(Math.max(Math.min(color.getR() + delta, 255), 0),
							Math.max(Math.min(color.getG() + delta, 255), 0),
							Math.max(Math.min(color.getB() + delta, 255), 0));
		return c;
	}
//A. Criar uma imagem aleatória dada uma dimensão. A probabilidade
//de um píxel ser branco ou preto deverá ser equivalente
	static BinaryImage aleatorio(int w, int h){
		BinaryImage img = new BinaryImage(w, h);
		System.out.println(img.getWidth() + " " + img.getHeight());
		for (int i = 0; i < h; i++)
			for (int j = 0; j < w; j++)
				if (Math.random() < 0.5)
					img.setWhite(j, i);
		return img;
	}
//B. Preencher um quadrado branco fornecendo o ponto do canto superior
//esquerdo (x, y) e o comprimento de lado (side) do quadrado.
	
	static void paintSquare(BinaryImage img, int x, int y, int side){
		for (int i = y; i < y + side; i++)
			for (int j = x; j < x + side; j++)
				img.setWhite(j,i);
	}
//C. Desenhar um contorno a preto nos píxeis limite da imagem.
	static void contour(BinaryImage img){
		for (int i = 0; i < img.getHeight(); i++)
			for (int j = 0; j < img.getWidth(); j++)
				if (j == 0 || i == 0 ||
				j == img.getWidth() - 1 || i == img.getHeight() - 1)
					img.setBlack(j,i);
	}
//D. Criar uma imagem binária que forme um tabuleiro de xadrez,
//indicando o número de pixels de cada posição. Note que há uma
//linha de um píxel em torno do tabuleiro
	static BinaryImage createChessBoard(int squareSize){
		BinaryImage img = new BinaryImage(squareSize * 8, squareSize * 8);
		for (int i = 0; i < 8; i++)
			for (int j = 0; j < 4; j++)
				paintSquare(img, (i % 2 * squareSize) + j * 2 *
				squareSize, i * squareSize, squareSize);
		contour(img);
		return img;
	}
//E. Inverter uma imagem binária, de forma a que cada pixel branco
//passe a preto, e vice-versa. Desenvolva duas versões, um procedimento
//(que transforma a imagem) e uma função (que cria uma imagem nova e deixa
//a existente inalterada).
	static void invertImage(BinaryImage img){
		for (int i = 0; i < img.getHeight(); i++)
			for (int j = 0; j < img.getWidth(); j++)
				if(img.isBlack(j, i))
					img.setWhite(j, i);
				else
					img.setBlack(j, i);
	}
	static BinaryImage invertImage2(BinaryImage img){
		BinaryImage res = new BinaryImage(img.getWidth(), img.getHeight());
		for (int i = 0; i < img.getHeight(); i++)
			for (int j = 0; j < img.getWidth(); j++)
				if(img.isBlack(j, i))
					res.setWhite(j, i);
				else
					img.setBlack(j, i);
		return res;
	}

//F. Criar uma imagem escalada por um fator (p.e., fator 2 duplica o tamanho da imagem).
	/************/

	static BinaryImage scale(BinaryImage img, int x){
		BinaryImage res = new BinaryImage(img.getWidth() * x, img.getHeight() * x);
		for (int i = 0; i < res.getHeight(); i++)
			for (int j = 0; j < res.getWidth(); j++)
				if(img.isBlack(j / x, i / x))
					res.setBlack(j, i);
				else
					res.setWhite(j, i);
		return res;
	}

//G. Criar uma imagem binária através da sobreposição de duas imagens binárias,
//sendo que: se um pixel é branco em ambas as imagens, será branco na nova imagem;
//se um pixel é preto numa das imagens, será preto na nova imagem.
	/************/

	static BinaryImage merge(BinaryImage small_Img, BinaryImage big_Img){
		for (int i = 0; i < small_Img.getHeight(); i++)
			for (int j = 0; j < small_Img.getWidth(); j++)
				if(!small_Img.isBlack(j, i) && !big_Img.isBlack(j, i))
					big_Img.setWhite(j, i);
				else
					big_Img.setBlack(j, i);
		return big_Img;
	}

//H. Pintar um círculo de pontos aleatórios numa imagem dada, dados o centro
//do círculo e o raio.
	/************/
//do círculo e o raio. (x - h)^2 + (y - k)^2 = r^2

	static void randomCircle(BinaryImage img, int k, int h, int radius){
		for (int y = 0; y < img.getHeight(); y++)
			for (int x = 0; x < img.getWidth(); x++)
				if(Math.sqrt(Math.pow(x - h, 2) + Math.pow(y - k, 2)) <= radius &&
					Math.random() < 0.5)
						img.setWhite(y, x);
	}

//AUXILIARY FUNCTIONS

@@ -137,14 +163,10 @@ static void displayImg(BinaryImage img){
//MAIN FOR TESTING PURPOSES

	public static void main(String[] args){
		//BinaryImage img = new BinaryImage(30, 30);
		BinaryImage img = createChessBoard(4);
		//BinaryImage img = aleatorio(150, 30);
		//paintSquare(img, 10, 1, 4);
		//contour(img);
		//displayImg(invertImage2(img));
		BinaryImage img = new BinaryImage(50, 50);
		randomCircle(img, 25, 25, 10);
		displayImg(img);
		System.out.println("////////////////////////////////////////");
		displayImg(invertImage2(img));
		//displayImg(createChessBoard(15));
		//displayImg(img2);
	}
} 