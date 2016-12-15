import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;


public class Start_Point extends JFrame implements Runnable{
	//fields 
	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	public static Dimension getScreenSize() {
		return screenSize;
	}
	public static int getW() {
		return W;
	}

	public static int getH() { 
		return H;
	}

	public Thread getThread() {
		return thread;
	}

	public boolean isRuuning_flag() {
		return ruuning_flag;
	}

	public Conservator getConservator() {
		return conservator;
	}

	public Key_handler getKeyHandler() {
		return keyHandler;
	}

	private static final int W = (int) screenSize.getWidth(); 
	private static final int H = (int)screenSize.getHeight();
	private Thread thread ;
	private boolean ruuning_flag = false ;
	private Conservator conservator ;
	private Key_handler keyHandler ;
	//Constructor
	public Start_Point(){
		makeFrame();
		conservator = new Conservator();
		keyHandler = new Key_handler(conservator);
		addKeyListener(keyHandler);
		conservator.add_game_object();
		start();
	}//end constructor
	//methods
	
	public void makeFrame(){
		setTitle("Fream Work");
		pack();
		setBounds(0, 0, W, H);;
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		requestFocus();
		//w = 1920
		//h = 1080
	}
	public synchronized void start() {
		thread = new Thread(this);
		thread.start();
		ruuning_flag = true ;
	}//end start
	public synchronized void stop(){
		try{
			thread.join();
			ruuning_flag = false ;
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}//end stop
	public void tick(){
		conservator.tick();
	}//end tick
	
	@Override
	public void run() {
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0 ;
		long timer = System.currentTimeMillis();
		int frames = 0 ;
		while(ruuning_flag){
			long now = System.nanoTime();
			delta += (now - lastTime) / ns ;

			lastTime = now;
			while(delta >= 1){
				tick();
				delta-- ;
			}
			if(ruuning_flag)
				draw();
			frames ++;
			
			if(System.currentTimeMillis() - timer > 1000){
				timer += 1000;
				frames = 0;
			}
		}
		stop();
	}
	private void draw() {
		BufferStrategy bs = getBufferStrategy();
		if( bs == null){
			this.createBufferStrategy(3);
			return ;
		}
		Graphics g = bs.getDrawGraphics();
		

		g.setColor(Color.black);
		g.fillRect(0,0,W, H);
		
		conservator.draw(g);
		//alive.draw(g);
		
		g.dispose();
		bs.show();
	}

	public static void main(String [] arg){
		new Start_Point();
	}
}
