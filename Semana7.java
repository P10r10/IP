public class Semana7{
	
//A. Construir uma cor aleatoria
	
	static Color randomColor(){
		Color c = new Color((int)(Math.random() * 256),
							(int)(Math.random() * 256),
							(int)(Math.random() * 256));
		return c;
	}

//C Construir um vetor de cores aleatórias dado um comprimento
	
	static void testRandomColor(){
		Color c = randomColor();
		System.out.print("red= " + c.getR() + " green= " + c.getG()
						 + " blue= " + c.getB());
	}
	
	static Color[] randomColorArray(int length){
		Color[] v = new Color[length];
		for(int i = 0; i < v.length; i++)
			v[i] = randomColor();
		return v;
	}   

	static Color inverted(Color color){
		Color c = new Color(255 - color.getR(),
							255 - color.getG(),
							255 - color.getB());
		return c;
	}
	
	static Color changeBrightness(Color color, int delta){
		Color c = new Color(Math.max(Math.min(color.getR() + delta, 255), 0),
							Math.max(Math.min(color.getG() + delta, 255), 0),
							Math.max(Math.min(color.getB() + delta, 255), 0));
		return c;
	}
	
	static BinaryImage aleatorio(int w, int h){
		BinaryImage img = new BinaryImage(w, h);
		System.out.println(img.getWidth() + " " + img.getHeight());
		for (int i = 0; i < h; i++)
			for (int j = 0; j < w; j++)
				if (Math.random() < 0.5)
					img.setWhite(j, i);
		return img;
	}
	
	static void paintSquare(BinaryImage img, int x, int y, int side){
		for (int i = y; i < y+side; i++)
			for (int j = x; j < x+side; j++)
				img.setWhite(j, i);
	}
	
	static void teste(){
		BinaryImage img = aleatorio(200, 100);
		paintSquare(img, 100, 50, 25);
	}
}