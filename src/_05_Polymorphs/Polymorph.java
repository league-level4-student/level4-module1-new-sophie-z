package _05_Polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    protected int x;
    protected int y;
    private int height;
    private int width;
    
    public int getX(){
		return x;
    }
    public int getY(){
		return y;
    }
    public int getHeight(){
		return height;
    }
    public int getWidth(){
		return width;
    }
    public void setX() {
    	this.x = x;
    }
    public void setY() {
    	this.y = y;
    }
    public void setHeight() {
    	this.height = height;
    }
    public void setWidth() {
    	this.width = width;
    }
    
    public Polymorph(int x, int y, int width, int height){
   	 this.x = x;
   	 this.y = y;
   	 this.height = height;
   	 this.width = width;
    }
    
    public abstract void update();
    
    public abstract void draw(Graphics g);
}
