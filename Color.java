/**
 * Represents RGB colors.
 * RGB values are stored in a 3-position array, with values in the interval [0, 255].
 * rgb[0] - Red
 * rgb[1] - Green
 * rgb[2] - Blue
 */
class Color {
	
	static final Color WHITE = new Color(255, 255, 255);
	static final Color BLACK = new Color(0, 0, 0);
	static final Color RED = new Color(255, 0, 0);
	static final Color GREEN = new Color(0, 255, 0);
	static final Color BLUE = new Color(0, 0, 255);
	static final Color LIGHTGREEN = new Color(0, 128, 0);

	private final int[] rgb; // @color

	/**
	 * Creates an RGB color. Provided values have to 
	 * be in the interval [0, 255]
	 */
	Color(int r, int g, int b) {
		if(!valid(r) || !valid(g) || !valid(b))
			throw new IllegalArgumentException("invalid RGB values: " + r + ", " + g + ", " + b);
		
		this.rgb = new int[] {r, g, b};
	}
	
	static Color inverted(Color color){
		int r = color.getR();
		int g = color.getG();
		int b = color.getB();
		Color c = new Color(255 - r, 255 - g, 255 - b);
		return c;
	}

	static Color AdjustBrightness(Color color, int val){//corrigir assinatura USAR THIS retirar static
		//int r = color.getR() + val;
	//	int g = color.getG() + val;
	//	int b = color.getB() + val;
		//if (valid(r) && valid(g) && valid(b))
		//	Color c = new Color(r, g, b);
	//	return color(r + value, g + value, b + value);//REVER ESTA
		return color;
	}
	
	Boolean isSameColor(Color color){
		return(this.getR() == color.getR() &&
				this.getG() == color.getG() &&
				this.getB() == color.getB());
	}
	/**
	 * Red value [0, 255]
	 */
	int getR() {
		return rgb[0];
	}

	/**
	 * Green value [0, 255]
	 */
	int getG() {
		return rgb[1];
	}

	/**
	 * Blue value [0, 255]
	 */
	int getB() {
		return rgb[2];
	}

	/**
	 * Obtains the luminance in the interval [0, 255].
	 */
	int getLuminance() {
		return (int) Math.round(rgb[0]*.21 + rgb[1]*.71 + rgb[2]*.08);
	}

	static boolean valid(int value) {
		return value >= 0 && value <= 255;
	}

}
