package Entities;

import java.awt.Graphics;

import Thread.GUIPane;
import importing.*;

public class Ship extends Entity {
	protected static GUIPane frame;

	public Ship(int x, int y, int h, int w, double angel){
		super(x, y, h, w, angel, "sundevil.png");
	}

	@Override
	public void tickAction() {

		
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(ImportManager.ship, xCoord, yCoord, height, width, null);
	}

	@Override
	public void checkBounds(int x, int y) {
		
	}

}
