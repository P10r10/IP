class TesteUm {
/*	static int sum(int[][] m) {
        int sum = 0;
        for(int i = 0; i != m.length; i++) {
            for(int j = 0; j != m[i].length; j++) {
                sum += m[i][j];
            }
        }
        return sum;
    }
	static void displayMatrix(int[][] m){
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[i].length; j++)
				System.out.print(m[i][j] + " ");
			System.out.println();
		}
	}
	static void displayVector(int[] v){
		for(int i = 0; i < v.length; i++)
			System.out.print(v[i] + " ");
		System.out.println();
	}
	
	static BinaryImage f(BinaryImage img) {

	    BinaryImage result = new BinaryImage(img.getWidth(), img.getHeight());

	    for(int x = 0; x != img.getWidth(); x++) {

	        for(int y = 0; y != img.getHeight(); y++) {

	            if(img.isBlack(x, y)) {

	                result.setBlack(img.getWidth() -1 - x, y);

	            } else {

	                result.setWhite(img.getWidth() -1 - x, y);

	            }

	        }

	    }

	    return result;

	}
	static BinaryImage f2(BinaryImage img) {

	    BinaryImage result = new BinaryImage(img.getWidth(), img.getHeight());

	    for(int x = 0; x != img.getWidth(); x++) {

	        for(int y = 0; y != img.getHeight(); y++) {

	            if(img.isBlack(x, y)) {

	                result.setBlack(x, y);

	            } else {

	                result.setWhite(x, y);

	            }

	        }

	    }

	    return result;

	}
	static BinaryImage f3(BinaryImage img) {

	    BinaryImage result = new BinaryImage(img.getWidth(), img.getHeight());

	    for(int x = 0; x != img.getWidth(); x++) {

	        for(int y = 0; y != img.getHeight(); y++) {

	            if(img.isBlack(img.getWidth() -1 - x, y)) {

	                result.setBlack(x, y);

	            } else {

	                result.setWhite(x, y);

	            }

	        }

	    }

	    return result;

	}
	static BinaryImage f4(BinaryImage img) {

	    BinaryImage result = new BinaryImage(img.getWidth(), img.getHeight());

	    for(int x = 0; x != img.getWidth(); x++) {

	        for(int y = 0; y != img.getHeight(); y++) {

	            if(img.isBlack(img.getWidth() -1 - x, y)) {

	                result.setBlack(img.getWidth() -1 - x, y);

	            } else {

	                result.setWhite(img.getWidth() -1 - x, y);

	            }

	        }

	    }

	    return result;
	}
	 public static void main(String[] args){
		 BinaryImage img = new BinaryImage(100, 100);
		 f(img);

	}*/
}