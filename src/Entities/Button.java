package Entities;

import importing.ImportManager;

import java.awt.Graphics;

public class Button extends Entity {

	public Button(int x, int y, int h, int w, double angel, String img) {
		super(x, y, h, w, angel, "blankimage");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tickAction(Object b) {
		System.out.println("butt");

	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(ImportManager.getImage(image), xCoord, yCoord, width, height, null);

	}

	@Override
	public void whenClicked(int x, int y) {
		// TODO Auto-generated method stub

	}

}
