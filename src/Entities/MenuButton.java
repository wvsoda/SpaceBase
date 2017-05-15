package Entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class MenuButton extends Entity{
	String option;
	public MenuButton(int topX, int topY, String opt) {
		super(topX, topY, 50, 162);
		option = opt;
		System.out.println("may ass");
	}

	@Override
	public void tickAction(Object b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.CYAN);
		g.fillRect(xCoord, yCoord, width, height);
		g.setColor(Color.BLACK);
		g.drawString(option, xCoord+width/2, yCoord+height/2);
		g.drawString("\n"+xCoord+" "+yCoord, 100, 100);
		
	}

	@Override
	public void whenClicked(int x, int y) {
		System.out.println(option + "clicked");
		
	}

}
