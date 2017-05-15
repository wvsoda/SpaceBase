package Entities;

import java.awt.Graphics;
import java.awt.Polygon;

public class Button extends Entity{

	String buttonText;
	int textX;
	int textY;
	private boolean clicked;
	
	public Button(int x, int y, int h, int w, String img, String text) {
		super(x, y, h, w, 0, img);
		buttonText = text;
		clicked = false;
	}

	@Override
	public void tickAction(Object b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		textX = (width/2)+xCoord - (buttonText.length()*3);
		textY = (height/2)+yCoord;
		int[] polyx = {xCoord,xCoord+width,xCoord+width,xCoord};
		int[] polyy = {yCoord,yCoord,yCoord+height,yCoord+height};
		bounds = new Polygon(polyx,polyy, polyx.length);
		
		g.drawString(buttonText, textX, textY);
		g.drawPolygon(bounds);
		
	}

	@Override
	public void whenClicked(int x, int y) {
		System.out.println("Button clicked: "+buttonText);
		clicked = true;
		
	}
	
	public boolean isClicked(){
		return clicked;
	}

}
