import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;
public class Conservator {
	LinkedList < City_Object > object = new LinkedList <>(); 

	public Conservator(){
		
	}
	public void add_object(City_Object object){
		this.object.add(object);
	}
	public void remove_object(City_Object object){
		this.object.remove(object);
	}

	public void tick() {
		for(int i = 0 ; i < this.object.size() ; i++){
			City_Object temp_object = this.object.get(i);
			temp_object.tick();
		}
	}
	public void draw(Graphics g) {
		for(int i = 0 ; i < this.object.size() ; i ++){
			City_Object temp_object = this.object.get(i);
			temp_object.draw(g);
		}
	}
	public void add_game_object(){

		add_object(new Block(0,0,Color.blue ,Object_ID.street,this));
	}
}



