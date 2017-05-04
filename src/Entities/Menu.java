package Entities;

import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;

public class Menu extends PolyEntity {
	boolean opened;
	boolean componentsTranslated;
	public Menu(int x, int y, int w, int h, ArrayList<Entity> coms, String img) {
		super(x, y, h, w, 0, img, coms);
		if (!componentsTranslated){
			for (Entity e : components){
				e.xCoord = e.xCoord + x;
				System.out.println("xCoord after fixing"+e.xCoord);
				e.yCoord = e.yCoord + y;
			}
		componentsTranslated = true;
		}
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
		System.out.println("Menu Clicked");
		for (Entity e : components){
			e.checkBounds(x, y);
		}

	}
	
	public boolean isOpened(){
		return opened;
	}
	
	public void open(){
		opened = true;
	}
	
	public void close(){
		opened = false;
		for (Entity e : components){
			e.xCoord = e.xCoord - xCoord;
			System.out.println("xCoord after closing "+e.xCoord);
			e.yCoord = e.yCoord - yCoord;
		}
	}

}
