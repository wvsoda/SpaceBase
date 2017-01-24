package Entities;

import java.awt.Polygon;
import Main.GameController;


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
	
	public abstract void tickAction();
	
	public void moveTo (int newX, int newY, double newAngle){
		xCoord = newX;
		yCoord = newY;
		angle = newAngle;
	}
	
	public void resize(int newH, int newW){
		height = newH;
		width = newW;
	}
	
	public void killSelf(){
		GameController.kill(this);
	}
	
}