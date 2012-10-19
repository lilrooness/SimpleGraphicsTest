import java.awt.Graphics2D;


public class Game {
	
	ImageBank imgBank;
	
	public Game(){
		imgBank = new ImageBank();
		imgBank.loadImage("background", "background.jpg");
		imgBank.loadImage("logo","logo.PNG");
	}
	
	/**
	 * Moves the game on one step and renders it to a graphics object
	 * @param g2d
	 * @return
	 */
	public void tick(Graphics2D g2d){
		g2d.drawImage(imgBank.getImage("background"), 0, 0, null);
		g2d.drawImage(imgBank.getImage("logo"), 250, 255, null);
	}
}
