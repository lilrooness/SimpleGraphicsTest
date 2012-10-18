import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.imageio.ImageIO;


public class ImageBank {
	private HashMap<String ,Image> images;
	
	public ImageBank(){
		images = new HashMap<String, Image>();
	}
	
	public void loadImage(String key, String filename){
		try {
			Image img = ImageIO.read(new File(filename));
			images.put(key, img);
		} catch (IOException e) {
			System.out.println("could not load image file " + filename);
			e.printStackTrace();
		}
	}
	
	public Image getImage(String key){
		return images.get(key);
	}
}
