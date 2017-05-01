package Entities;

import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;

public class Menu extends PolyEntity {
	boolean opened;
	public Menu(int x, int y, int w, int h,
			ArrayList<Entity> coms) {
		super(x, y, h, w, 0, "menu", coms);
		opened = false;
		int[] xs = {x,x,x+w,x+w};
		int[] ys = {y,y+h,y+h,y};
		bounds = new Polygon(xs,ys,4);
	}

	@Override
	public void tickAction(Object b) {

	}
	
	@Override
	public void whenClicked(int x, int y) {
		System.out.println("foik");

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
