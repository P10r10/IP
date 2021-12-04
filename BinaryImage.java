class BinaryImage {
	
	private boolean[][] data; // @binaryimage
	
	/**
	 * Creates a binary image from the given image file (GIF, JPG, PNG).
	 * The pixels of the original image will be converted to
	 * black/white according to their luminance value.
	 */
	BinaryImage(String path) {
		this.data = ImageUtil.readBinaryImage(path);
	}
	
	/**
	 * Creates a black binary image with the given dimension in pixels.
	 */
	BinaryImage(int width, int height) {
		data = new boolean[height][width];
	}
	
	BinaryImage(Rectangle rec) {
		data = new boolean[rec.height][rec.width];
	}
	
	Rectangle rectangleSizeOfImage(){
		Rectangle res = new Rectangle(getHeight(), getWidth());
		return res;
	}
	
	boolean isWhite(Point p){
		return !isBlack(p.getY(), p.getX());
	}
	
	void paint(Point p, boolean white){
		if(white)
			setWhite(p.getX(), p.getY());
		else
			setBlack(p.getX(), p.getY());
	}
	
	int getCount(boolean white){
		int count = 0;
		for (int i = 0; i < data.length; i++)
			for (int j = 0; j < data[i].length; j++)
				if (white == data[i][j])
					count++;
		return count;
	}
	
	Point[] getPoints(boolean white){
		Point[] res = new Point[getCount(white)];
		int idx = 0;
		for (int lin = 0; lin < data.length; lin++)
			for (int col = 0; col < data[lin].length; col++)
				if (white == data[lin][col])
					res[idx++] = new Point(col, lin); 
		return res;
	}
	
	void invert(){
		for (int lin = 0; lin < data.length; lin++)
			for (int col = 0; col < data[lin].length; col++)
				if (isBlack(col, lin))
					setWhite(col, lin);
				else
					setBlack(col, lin); 
	}
	
	void fillRectangle(Point p, Rectangle r){
		for (int lin = p.getY(); lin < p.getY() + r.height; lin++)
			for (int col = p.getX(); col < p.getX() + r.width; col++)
				setWhite(col, lin);
	}
	
	void contour(Point p, Rectangle r){
		for (int lin = p.getY(); lin < p.getY() + r.height; lin++)
			for (int col = p.getX(); col < p.getX() + r.width; col++)
				if(lin == p.getY() || col == p.getX()
				|| lin == p.getY() + r.height - 1 || col == p.getX() + r.width - 1)
					setWhite(col, lin);
	}
	
	void changeSize(Rectangle r){
		BinaryImage res = new BinaryImage(r.width, r.height);
		for (int lin = 0; lin < data.length && lin < r.height; lin++)
			for (int col = 0; col < data[lin].length && col < r.width; col++)
				if (isBlack(col, lin))
					res.setBlack(col, lin);
				else
					res.setWhite(col, lin);
		data = res.data;
	}
	/**
	 * Image width in pixels,
	 */
	int getWidth() {
		return data[0].length;
	}
	
	/**
	 * Image height in pixels,
	 */
	int getHeight() {
		return data.length;
	}
	
	/**
	 * Is pixel at (x, y) black?
	 */
	boolean isBlack(int x, int y) {
		validatePosition(x, y);
		return !data[y][x];
	}
	
	/**
	 * Sets the pixel at (x, y) to white.
	 */
	void setWhite(int x, int y) {
		validatePosition(x, y);
		data[y][x] = true;
	}
	
	/**
	 * Sets the pixel at (x, y) to black.
	 */
	void setBlack(int x, int y) {
		validatePosition(x, y);
		data[y][x] = false;
	}
	
	/**
	 * Is (x, y) a valid pixel position in this image?
	 */
	boolean validPosition(int x, int y) {
		return 
			x >= 0 && x < getWidth() &&
			y >= 0 && y < getHeight();
	}
	
	void validatePosition(int x, int y) {
		if(!validPosition(x, y))
			throw new IllegalArgumentException(
					"invalid point " + x + ", " + y + 
					": matrix dimension is " + getWidth() + " x " + getHeight());
	}
}