package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingMorph extends Polymorph{

	Random r = new Random();
	
	public MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		x = x+r.nextInt(10)-5;
		y = y+r.nextInt(10)-5;
		if(x>PolymorphWindow.WIDTH || x<0) {
			x = 0;
		}
		if(y>PolymorphWindow.HEIGHT || y<0) {
			y = 0;
		}
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.CYAN);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

}
