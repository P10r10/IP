public class ColorUtils {
	static final int MAX = 255;
	
	static Boolean contains(Color[] colors, Color c){
		for (int i = 0; i < colors.length; i++)
			if (colors[i].isSameColor(c))
				return true;
		return false;
	}
	
	Color brighter(ColorImage img, int val){
		Color res = new Color(0, 0, 0);
		for (int i = 0; i < img.getHeight(); i++)
			for (int j = 0; j < img.getWidth(); j++){
				Color tmp = img.getColor(j, i);
				tmp.adjustBrightness(val);
				img.setColor(j, i, tmp);
			}
		return res;
	}
	
/*	static void noise(ColorImage img, int value) {
        for(int x = 0; x != img.getWidth(); x++) {
            for(int y = 0; y != img.getHeight(); y++) {
                img.setColor(x, y, ColorUtils.brighter(img.getColor(x, y), (int)(Math.random()*2*value) - value));
            }
        }
    }*/
	

}