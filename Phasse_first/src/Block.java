import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;


public class Block extends City_Object{
	int [] block_coordinate = {100 , 100 , 500 , 500 , 700 , 700 , 500 ,500};
	public Block(int x, int y , Color color, Object_ID id,
			
			Conservator conservator1) {
		super(x, y,w ,h, color, id, conservator1);
	
		// TODO Auto-generated constructor stub
	}

	public Block( Color color, Object_ID id,Conservator conservator) {
		super( color, id, conservator);
		}
	@Override
	protected void draw(Graphics g) {
		g.setColor(color);
		for(int i =0 ; i< block_coordinate.length ; i+= 4){
			int x1 = block_coordinate[i];
			int x2 = block_coordinate[i+1];
			int x3 = block_coordinate[i+2];
			int x4 = block_coordinate[i+3];
			g.fillRect(x1 , x2 , x3, x4);
		}


		
		
	}

	@Override
	protected void tick() {
		
		
	}

	@Override
	protected Rectangle getBounds() {
		
		return null;
	}



}


