public class Images {
	
	static ColorImage posterize(ColorImage img, Color dark, Color light){
		ColorImage res = new ColorImage(img.getWidth(), img.getHeight());
		for (int i = 0; i < img.getHeight(); i++)
			for (int j = 0; j < img.getWidth(); j++)
				if (img.getColor(j, i).getLuminance() < 128)
					res.setColor(j, i, dark);
				else
					res.setColor(j, i, light);
		return res;
	}
	
	static ColorImage popArt(ColorImage img){
		ColorImage res = new ColorImage(img.getWidth() * 2, img.getHeight() * 2);
		Color darkGreen = new Color(0, 204, 102);
		Color lightGreen = new Color(0, 102, 51);
		Color darkBlue = new Color(0, 153, 153);
		Color lightBlue = new Color(0, 204, 204);
		Color darkRed = new Color(175, 0, 0);
		Color lightRed = new Color(250, 0, 0);
		Color lightPurple = new Color(205, 0, 205);
		Color darkPurple = new Color(102, 0, 102);
		res.pasteImage(0, 0, posterize(img, darkBlue, lightBlue));
		res.pasteImage(0, img.getHeight(), posterize(img, darkRed, lightRed));
		img.reflectImage();
		res.pasteImage(img.getWidth(), 0, posterize(img, lightGreen, darkGreen));
		res.pasteImage(img.getWidth(), img.getHeight(), posterize(img, darkPurple, lightPurple));
		return res;
	}
	
	static ColorImage[] quarterImage(ColorImage img){
		ColorImage[] res = new ColorImage[4];
		res[0] = img.selection(0, 0, img.getWidth() / 2, img.getHeight() / 2);
		res[1] = img.selection(0, img.getHeight() / 2, img.getWidth() / 2, img.getHeight());
		res[2] = img.selection(img.getWidth() / 2, 0, img.getWidth(), img.getHeight() / 2);
		res[3] = img.selection(img.getWidth() / 2, img.getHeight() / 2, img.getWidth(), img.getHeight());
		return res;
	}
	
	static ColorImage horizontalMerge(ColorImage left, ColorImage right){
		ColorImage res = new ColorImage(left.getWidth() + right.getWidth(), left.getHeight());
		res.pasteImage(0, 0, left);
		res.pasteImage(left.getWidth(), 0, right);
		return res;
	}
}