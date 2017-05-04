package Entities;

import importing.ImportManager;

import java.awt.Graphics;
import java.util.ArrayList;

public abstract class PolyEntity extends Entity {
	ArrayList<Entity> components;
	
	PolyEntity(int x, int y, int h, int w, double angel, String img, ArrayList<Entity> coms){
		super(x, y, h, w, angel, img);
		components = coms;
	}
	
	@Override
	public void moveTo(int newX, int newY, double newAngle){
		int deltaX = newX - xCoord, deltaY = newY - yCoord;
		super.moveTo(newX, newY, newAngle);
		translateComs(deltaX,deltaY);
	}
	
	protected void translateComs(int deltaX, int deltaY){
		for(Entity e : components){
			e.moveTo(e.xCoord + deltaX, e.yCoord + deltaY, 0);
		}
	}
	
	protected int smallest(int[] xs){
		int smallest = Integer.MAX_VALUE;
		for(int i : xs){
			if(i < smallest)
				smallest = i;
		}
		return smallest;
	}
	
	@Override
	public abstract void tickAction(Object b);

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(ImportManager.getImage(image), xCoord, yCoord, width, height, null);
		for(Entity e : components){
			e.draw(g);
		}
	}
	
}
