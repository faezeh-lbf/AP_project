 import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;


public abstract class City_Object {
	//fields
	protected static int x , y ,w ,h;


	protected int step_x , step_y ;
	protected Color color ;
	protected Object_ID ID ;
	protected Conservator conservator ;
	
	//Constructor
	public City_Object( int x , int y , Color color ,Object_ID id ,Conservator conservator ){
		this.x = x ;
		this.y = y ;
		this.color = color ;
		this.conservator = conservator ;
		this.ID = id ;
	}//end constructor
	public City_Object(Color color , Object_ID id , Conservator conservator){
		this(x,y,w,h,color , id , conservator);

		this.color = color ;
		this.conservator = conservator ;
		this.ID = id ;
	}
	public City_Object(int x , int y ,int w , int h ,Color color ,Object_ID id ,Conservator conservator ){
		this.x = x ;
		this.y = y ;
		this.w = w ;
		this.h = h;
		this.color = color ;
		this.conservator = conservator ;
		this.ID = id ;
	}
	//methods
	protected int getX() {
		return x;
	}

	protected int getY() {
		return y;
	}

	protected int getStep_x() {
		return step_x;
		
	}

	protected int getStep_y() {
		return step_y;
	}

	protected Color getColor() {
		return color;
	}

	protected Object_ID getID() {
		return ID;
	}

	protected Conservator getConservator() {
		return conservator;
	}
	protected abstract void draw(Graphics g);
	protected abstract void tick();
	protected abstract Rectangle getBounds();
}
