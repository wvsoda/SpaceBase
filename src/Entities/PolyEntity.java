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
	public abstract void tickAction(Object b);

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(ImportManager.getImage(image), xCoord, yCoord, height, width, null);
	}
	
}
