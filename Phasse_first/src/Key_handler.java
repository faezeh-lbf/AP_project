import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * descire what key_hadler does.
 * aida gh
 * https://google.com
 */
public class Key_handler extends KeyAdapter{
	private Conservator conservator  ;

	public Key_handler(Conservator conservator){
		this.conservator = conservator ;
	}

	public void keyPressed(KeyEvent e){
		int key_pressed = e.getKeyCode();
		for(int i = 0 ; i < conservator.object.size() ; i ++){
			//DETECT ONe OF THE OBJECT SELECTED
		}
	}

	public void keyReleased(KeyEvent e){
		int key_released = e.getKeyCode();
		for(int i = 0 ; i< conservator.object.size() ; i ++){
			//detect one of the object released
		}
	}
}
