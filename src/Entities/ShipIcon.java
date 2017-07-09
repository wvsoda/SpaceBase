package Entities;

import java.awt.Graphics;

import importing.ImportManager;

public class ShipIcon extends Entity {

	public ShipIcon(int x, int y, int h, int w, double angel) {
		super(x, y, h, w, angel, "travelShip");
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(ImportManager.getImage(image), xCoord, yCoord,width,height, null);

	}

	@Override
	public void whenClicked(int x, int y) {
		// TODO Auto-generated method stub

	}

}
