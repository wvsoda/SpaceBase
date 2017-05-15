package Entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;

public class Menu extends PolyEntity {
	boolean opened;
	public Menu(int x, int y, int w, int h,
			ArrayList<Entity> coms) {
		super(0,0, h, w, 0, "menu", coms);
		opened = false;
		int[] xs = {0,0,w,w};//{x,x,x+w,x+w};
		int[] ys = {0,h,h,0};//{y,y+h,y+h,y};
		bounds = new Polygon(xs,ys,4);
		moveTo(x, y, 0);
	}

	@Override
	public void tickAction(Object b) {

	}
	
	@Override
	public void whenClicked(int x, int y) {
		super.whenClicked(x, y);
		System.out.println("foik");

	}
	
	@Override
	public void draw(Graphics g){
		g.setColor(Color.WHITE);
		g.drawRect(xCoord, yCoord, width, height);
		super.draw(g);
	}
	
	public boolean isOpened(){
		return opened;
	}
	
	public void open(){
		opened = true;
	}
	
	public void close(){
		opened = false;
	}

}
