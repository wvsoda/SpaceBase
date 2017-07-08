package Entities;

import java.awt.Graphics;
import java.awt.Polygon;


public abstract class Entity {
	
	protected int xCoord, yCoord, height, width;
	protected double angle;
	protected String image;
	protected Polygon bounds;
	protected boolean onScreen;
	
	public Entity(int x, int y, int h, int w, double angel, String img){
		xCoord = x;
		yCoord = y;
		height = h;
		width = w;
		angle = angel;
		image = img;
		int[] xs = {x,x+w,x+w,x};
		int[] ys = {y,y,y+h,y+h};
		bounds = new Polygon(xs,ys,4);
	}
	
	public Entity(int x, int y, int h, int w){
		xCoord = x;
		yCoord = y;
		height = h;
		width = w;
		angle = 0;
		image = "";
		int[] xs = {x,x+w,x+w,x};
		int[] ys = {y,y,y+h,y+h};
		bounds = new Polygon(xs,ys,4);
	}
	
	
	public abstract void draw(Graphics g);
	
	public void moveTo (int newX, int newY, double newAngle){
		bounds.translate(newX-xCoord, newY-yCoord);
		xCoord = newX;
		yCoord = newY;
		angle = newAngle;
	}
	
	public void resize(int newH, int newW){
		height = newH;
		width = newW;
	}
	
	public void changeOnScreen(boolean bool){
		onScreen = bool;
	}
	
	public boolean isOnScreen(){
		return onScreen;
	}
	
	public Polygon returnBounds(){
		return bounds;
	}
	
	public int getX(){
		return xCoord;
	}
	
	public int getY(){
		return yCoord;
	}
	
	public boolean checkBounds(int xClick, int yClick){
		if(bounds.contains(xClick, yClick)){
			whenClicked(xClick, yClick);
			return true;
		}
		return false;
	}
	
	protected void setBounds(Polygon x){
		bounds = x;
	}
	
	public abstract void whenClicked(int x, int y);
	
	//public void whenHovered(){}
	}