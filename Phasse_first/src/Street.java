import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
public class Street extends City_Object{
	public Street(int x, int y, Color color, Object_ID id,
			Conservator conservator) {
		super(x, y, color, id, conservator);
	}
	@Override
	protected void draw(Graphics g) {
		g.setColor(color);
		g.fillRect(100,100, 10, 10 );
	}
	@Override
	protected void tick() {
		// TODO Auto-generated method stub
	}
	@Override
	protected Rectangle getBounds() {
		return null;
	}

}
