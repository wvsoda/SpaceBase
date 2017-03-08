package Entities;

import java.awt.Graphics;
import java.awt.Image;

import Thread.GUIPane;
import java.awt.Polygon;
import importing.*;

public class TestingPolygon extends Entity{

	private Polygon poly;
	int oldX, oldY;
	private Image img;
	
	public TestingPolygon(int x, int y, int h, int w, double angel, String img, int xCoords[], int yCoords[]) {
		super(x, y, h, w, angel, img);
		poly = new Polygon(xCoords, yCoords, xCoords.length);
		
	}

	@Override
	public void tickAction() {
		// TODO Auto-generated method stub
		
	}
	
	private void whenClicked(int x, int y){
		System.out.println("clicked at " + x + ", " + y);
		if (image == "red.png"){
			image = "blue.png";
		}else{
			image = "red.png";
		}
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		if (oldX != xCoord && oldY != yCoord){
			int moveX = xCoord - oldX;
			int moveY = yCoord - oldY;
			poly.translate(moveX, moveY);
			oldX = xCoord;
			oldY = yCoord;
		}
		if(image == "red.png"){
			img = ImportManager.red;
		}else{
			img = ImportManager.blue;
		}
		g.drawImage(img, xCoord, yCoord, height, width, null);
		g.drawPolygon(poly);
	}
	
	public void checkBounds(int xClick, int yClick){
		if (poly.contains(xClick, yClick)){
			whenClicked(xClick,yClick);
		}
	}

}
