package Entities;

import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;

public class ShipModule extends Entity{

	ArrayList<MovableResource> resources;
	String moduleType;
	int relX, relY;
	
	public ShipModule(Polygon b, String modType) {
		super(0,0,0,0, 0.0, "");
		moduleType = modType;
		bounds = b;
	}

	@Override
	public void tickAction(Object b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {}

	@Override
	public void whenClicked(int x, int y) {
		System.out.print(moduleType);
		
	}

}
