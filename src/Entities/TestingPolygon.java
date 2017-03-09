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
	private String prevImg;
	private int option = 0;
	
	public TestingPolygon(int x, int y, int h, int w, double angel, String img, int xCoords[], int yCoords[], int opt) {
		super(x, y, h, w, angel, img);
		poly = new Polygon(xCoords, yCoords, xCoords.length);
		option = opt;
	}

	@Override
	public void tickAction() {
		// TODO Auto-generated method stub
		
	}
	
	private void whenClicked(int x, int y){
		System.out.println("clicked at " + x + ", " + y);
		if (image != "blue.png"){
			prevImg = image;
			image = "blue.png";
		}else{
			image = prevImg;
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
		if(image != "blue.png"){
			img = ImportManager.blue;
		}else{
			img = null;
		}
		g.drawImage(img, xCoord, yCoord, height, width, null);
		g.drawPolygon(poly);
		
		
		switch(option){
		case 0:
			break;
		case 1:
			if (image != "blue.png"){
				g.drawString("Pilot: Nir, Engineer: Deavon", 50, 400);
			}
			break;
		case 2:
			if (image != "blue.png"){
				g.drawString("Storage: 16 purple unicorn meat, 6 measly rations", 50, 425);
			}
			break;
		case 3:
			if (image != "blue.png"){
				g.drawString("Fuel: 666 / 1000", 50, 450);
			}
			break;
		default:
			System.out.println("hurp derp");
		}
	}
	
	public void checkBounds(int xClick, int yClick){
		if (poly.contains(xClick, yClick)){
			whenClicked(xClick,yClick);
		}
	}

}
