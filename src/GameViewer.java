import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;


public class GameViewer extends JPanel implements Runnable{
	BufferedImage buffer;
	Graphics2D buffg2D;
	Game game;
	
	public GameViewer(int width, int height){
		this.setSize(width, height);
		this.setFocusable(true);
		game = new Game();
		buffer = new BufferedImage(800, 800, BufferedImage.TYPE_INT_ARGB);
		buffg2D = (Graphics2D) buffer.getGraphics();
	}
	
	@Override
	public void run() {
		repaint();
	}
	
	@Override
	public void paint(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		game.tick(buffg2D);
		g2d.drawImage(buffer, 0, 0, this);
	}
}
