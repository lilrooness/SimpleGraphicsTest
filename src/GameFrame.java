import javax.swing.JFrame;


public class GameFrame {
	private JFrame frame;
	private GameViewer gameView;
	private Thread gameThread;
	
	public GameFrame(){
		gameView = new GameViewer(800, 800);
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.add(gameView);
		frame.setVisible(true);
		gameThread = new Thread(gameView);
		gameThread.start();
	}
}
