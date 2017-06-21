package Entities.Menus;

import java.awt.Color;
import Entities.*;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;

import javax.swing.JLabel;

import Entities.Entity;
import Entities.MenuButton;
import Entities.PolyEntity;
import Entities.ShipModule;
import importing.ImportManager;

public abstract class Menu extends PolyEntity {
	boolean opened;
	String label;
	Entity cont;
	public Menu(int x, int y, int w, int h,
			ArrayList<Entity> coms, String lab, Entity container) {
		super(0,0, h, w, 0, "button", coms);
		opened = false;
		int[] xs = {0,0,w,w};//{x,x,x+w,x+w};
		int[] ys = {0,h,h,0};//{y,y+h,y+h,y};
		bounds = new Polygon(xs,ys,4);
		moveTo(x, y, 0);
		label = lab;
		cont = container;
	}

	
	//@Override
	/*public void whenClicked(int x, int y) {
		super.whenClicked(x, y);
		/*if(((MenuButton)components.get(0)).clicked()){
			((ShipModule)cont).upgrade();
			//label = 
		}
	}
	*/
	@Override
	public void draw(Graphics g){
		g.setColor(Color.WHITE);
		g.drawRect(xCoord, yCoord, width, height);
		super.draw(g);
		labelUpdate();
		g.setColor(Color.BLACK);
		g.drawString(label, xCoord+15, yCoord+15);
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


	abstract public void buttonClick(String action);

	abstract public void labelUpdate();


}
