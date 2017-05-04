package Entities;

import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;
import Entities.Button;

public class ShipModule extends Entity implements MenuSpawnable{

	ArrayList<Entity> resources;
	String moduleType;
	int relX, relY;
	boolean menuOpened;
	
	public ShipModule(Polygon b, String modType, int topX, int topY) {
		super(topX,topY,0,0, 0.0, "");
		moduleType = modType;
		bounds = b;
		resources = new ArrayList<Entity>();
		menuOpened = false;
		
		Button dd = new Button(25,30,30,100,"","Option 1");
		Button fd = new Button(25,90,30,100,"","Option 2");
		Button gd = new Button(25,150,30,100,"","Option 3");
		resources.add(dd);
		resources.add(fd);
		resources.add(gd);
	}

	@Override
	public void tickAction(Object b) {
		
	}

	@Override
	public void draw(Graphics g) {

	}

	@Override
	public void whenClicked(int x, int y) {
		System.out.print(moduleType);
		menuOpened = true;
	}
	

	@Override 
	public Menu spawnMenu() {
		if(menuOpened)
			return new Menu(xCoord+200, yCoord-50, 150,210, resources,"blank");
		return null;
	}

}
