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
	}
	
	
	public abstract void tickAction(Object b);
	
	public abstract void draw(Graphics g);
	
	public void moveTo (int newX, int newY, double newAngle){
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
	}