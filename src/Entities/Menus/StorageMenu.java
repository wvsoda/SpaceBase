package Entities.Menus;

import java.awt.Graphics;
import java.util.ArrayList;

import Entities.*;
import importing.ImportManager;

public class StorageMenu extends Menu {
	
	ArrayList<MovableResource> numbOfSlots;
	// THIS IS A COMPONENT OF A REGULAR MENU THAT HOUSES MOVABLE RESOURCES
	public StorageMenu(int x, int y,int h,int w, ArrayList<Entity> coms, String labe, Entity container){
		super(x, y, h, w, coms, labe, container);
		System.out.println("helppp");
		////TODO: need to make a thing to be able to change number of slots // component slots
		
		
		
	}

	@Override
	public void buttonClick(String action) {
		// TODO Auto-generated method stub
		
	}
	
	@Override     ///// TODO change the drawing so that it can use the full grid once there are more than 4 items
	public void draw(Graphics g){
		g.drawImage(ImportManager.getImage("grid"), xCoord, yCoord,width,height, null);
		int i = 0;
		for (Entity e : components){
			g.drawImage(ImportManager.getImage(((MovableResource)e).type()), xCoord + (i*40), yCoord, 40,40,null);
			g.drawString(String.valueOf(((MovableResource)e).amt()), xCoord + (i*40)+30, yCoord + 35);
			i++;
		}
	}

	@Override
	public void labelUpdate() {
		// TODO Auto-generated method stub
		
	}

}
